package modelo.acceso;

import java.util.ArrayList;
import java.util.TreeMap;

import modelo.data.Peticion;

public class AlmacenIndice<T, K> {
	private String pathIndice;
	private String pathDatos;
	private TreeMap<K, Integer> indice;
	DAO<Object> dao;

	public AlmacenIndice(String pathIndice, String pathDatos) {
		super();
		this.pathIndice = pathIndice;
		this.pathDatos = pathDatos;
		assert validate();
		this.indice = new TreeMap<>();
		dao = new DAO<>();
	}

	private boolean validate() {
		return this.pathIndice != null && this.pathDatos != null;
	}

	public T obtener(K k) {
		cargarIndice();
		T retorno = null;
		Integer posicion = indice.get(k);
		if (posicion != null) {
			retorno = (T) dao.leer(pathDatos, posicion);
		}
		return retorno;
	}

	private void cargarIndice() {
		try {
			indice = (TreeMap<K, Integer>) dao.leer(pathIndice);
		} catch (NullPointerException e) {
			if (indice == null) {
				indice = new TreeMap<>();
			}
			dao.grabar(pathIndice, indice);
		}finally {
			indice = (TreeMap<K, Integer>) dao.leer(pathIndice);
		}

	}

	/**
	 * Almacen el elemnto de clase T con Clave K, hay que pasarla
	 * 
	 * @param t
	 *            el objeto a grabar
	 * @param k
	 *            la propiedad clave o indice del objeto t
	 * @return true si ha almacenado y false en caso contrario
	 */
	public boolean grabar(T t, K k) {
		boolean retorno = false;
		Integer value = indice.size();
		if (indice.put(k, value) == null) {
			// si se almacena bien en el archivo de datos
			if (dao.grabar(pathDatos, t, true)) {
				retorno = true;
				dao.grabar(pathIndice, indice);
			} else {
				// Si no se graba bien actualizamos el indice con la version
				// grabada
				indice = (TreeMap<K, Integer>) dao.leer(pathIndice);
			}
		}
		return retorno;
	}

	public TreeMap<K, Integer> getIndice() {
		cargarIndice();
		return indice;
	}

	public ArrayList<T> getCollection(){
		ArrayList<Peticion> peticiones = new ArrayList<>();

		for (int i = 0; i < getIndice().size(); i++) {
			peticiones.add((Peticion) this.dao.leer(this.pathDatos, i));
			System.out.println(peticiones.get(i));
		}
		
		return (ArrayList<T>) peticiones;
	}
	
}
