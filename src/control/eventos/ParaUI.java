package control.eventos;

import java.util.ArrayList;
import java.util.Collection;
import control.accion.PeticionController;
import control.accion.SimuladorController;
import control.logica.Logica;
import modelo.data.Movil;
import modelo.data.Peticion;
import modelo.data.Tarifa;
import vista.UI;

public class ParaUI extends UI {

	private Logica logica;
	private PeticionController peticionController;
	private SimuladorController simuladorController;
	
	public ParaUI() {
		this.logica = new Logica();
		this.peticionController = new PeticionController();
		this.simuladorController = new SimuladorController();
		getBotonValidar().addActionListener(e -> simular());
		getBotonPedir().addActionListener(e -> almacenar());
		obtenerPeticiones();
	}

	public Tarifa obtenerMejor(int minutos, int megas) {
		return logica.obtenerMejor(minutos, megas);
	}

	public ArrayList<Movil> obtener(Tarifa tarifa) {
		return logica.obtener(tarifa);
	}

	public void simular() {
		simuladorController.simular(this);
	}
	
	public boolean almacenar() {
		return simuladorController.almacenar(this);
	}

	public String obtenerCondiciones(Tarifa tarifa) {
		return logica.obtenerCondiciones(tarifa);
	}

	public void obtenerPeticiones() {
		peticionController.obtenerPeticiones(this);
	}

	public Collection<Peticion> obtenerTodas() {
		return logica.obtenerTodas();
	}

	public boolean guardaPeticion(Tarifa tarifa, int selectedItem, String contacto) {
		return logica.guardaPeticion(tarifa, selectedItem, contacto);
	}

}
