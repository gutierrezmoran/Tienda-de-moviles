package modelo.data;

import java.util.ArrayList;
import modelo.acceso.AlmacenIndice;
import utiles.CreadorElementos;

public class Datos {

	private AlmacenIndice<Peticion, String> almacenPeticiones;

	public Datos() {
		this.almacenPeticiones = new AlmacenIndice<>("peticiones.index", "peticiones.data");
		CreadorElementos.main(null);
	}

	public boolean grabarPeticion(Peticion peticion) {
		return this.almacenPeticiones.grabar(peticion, String.valueOf(getPeticiones().size() + 1));
	}

	public ArrayList<Peticion> getPeticiones() {
		return this.almacenPeticiones.getCollection();
	}
}
