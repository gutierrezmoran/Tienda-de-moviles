package control.logica;

import java.util.ArrayList;
import java.util.Collection;

import control.eventos.ParaUI;
import modelo.data.Datos;
import modelo.data.Movil;
import modelo.data.Peticion;
import modelo.data.Tarifa;
import utiles.CreadorElementos;

public class Logica {

	private Datos datos;
	
	public Logica() {
		super();
		this.datos = new Datos();
	}
	
	private boolean superaMinutosYMegas(int minutos, int megas, Tarifa tarifa) {
		return tarifa.getMinutos() > minutos && tarifa.getMegas() > megas;
	}
	
	private boolean isMejorTarifa(Tarifa tarifaActual, int megasMejorTarifa) {
		return tarifaActual.getMegas() < megasMejorTarifa;
	}

	/**
	 * Si se le pasa una cantidad de minutos y megas retorna la tarifa más adecuada. Esta
	 * es aquella que supere tanto en minutos como en megas a la cantidad introducida por 
	 * parametros. La tarifa se seleccionara por la más ceraca en megas siendo la caracteristica
	 * de minutos secundaria (aunque siempre debe superar el parametro correspondiente
	 * 
	 * Se te entrega el junit asociado para saber si has hecho bien el ejercicio
	 * @param minutos
	 * @param megas
	 * @return
	 */
	public Tarifa obtenerMejor(int minutos, int megas) {
		Tarifa mejorTarifa = null;

		for (Tarifa tarifa : CreadorElementos.crearTarifas()) {
			if(superaMinutosYMegas(minutos, megas, tarifa)) {
				if(mejorTarifa == null) {
					mejorTarifa = tarifa;
				}
				
				if(isMejorTarifa(tarifa, mejorTarifa.getMegas())) {
					mejorTarifa = tarifa;
				}
			}
		}
		
		return mejorTarifa;
	}

	/**
	 * Este metodo retorna un string que resume las caracteristicas de la tarifa 
	 * tales como su nombre, minutos, megas y precio
	 * @param tarifa
	 * @return
	 */
	public String obtenerCondiciones(Tarifa tarifa) {
		return "Tarifa: " + tarifa.getNombre() + "\nMinutos: " + tarifa.getMinutos() + "\nMegas: " + tarifa.getMegas() + "\nPrecio: " + tarifa.getPrecio();
	};

	/**
	 * Retorna el conjunto de moviles asociados a una tarifa
	 * @param tarifa
	 * @return
	 */
	public ArrayList<Movil> obtener(Tarifa tarifa) {
		return tarifa.getMoviles();
	}
	
	/**
	 * Con los datos de una tarifa, un valor numerico que hace referencia al movil seleccionado, 
	 * de entre los disponibles para esa tarifa y un numero de contacto. Almacena un objeto de tipo Peticion
	 * @param tarifa
	 * @param selectedItem
	 * @param contacto
	 * @return
	 */
	public boolean guardaPeticion(Tarifa tarifa, int selectedItem, String contacto) {
		Peticion peticion = new Peticion(tarifa.getId(), tarifa, contacto);
		peticion.setModelo(tarifa.getMoviles().get(selectedItem));

		return this.datos.grabarPeticion(peticion);
	}

	public Collection<Peticion> obtenerTodas(){
		return this.datos.getPeticiones();
	}
}
