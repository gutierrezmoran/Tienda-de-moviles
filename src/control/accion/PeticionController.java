package control.accion;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import control.eventos.ParaUI;
import modelo.data.Peticion;

public class PeticionController {

	ParaUI paraUI;
	
	public PeticionController() {
		super();
	}
	
	private Object[] introducirPeticion(Peticion peticion) {
		Object[] retorno = {peticion.getId(), peticion.getTarifa().getNombre(), peticion.getModelo(), peticion.getCliente()};
		return retorno;
	}

	/**
	 * Este metodo rellena la rejilla del panel de peticiones con las
	 * peticiones que se encuentra almacendas
	 */
	public void obtenerPeticiones(ParaUI paraUI) {
		ArrayList<Peticion> peticiones = (ArrayList<Peticion>) paraUI.obtenerTodas();

		for (int i = 0; i < peticiones.size(); i++) {
			((DefaultTableModel) paraUI.getPeticiones().getModel()).addRow(introducirPeticion(peticiones.get(i)));
		}
	}
	
}
