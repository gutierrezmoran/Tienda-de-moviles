package control.accion;

import java.util.ArrayList;
import control.eventos.ParaUI;
import modelo.data.Movil;
import modelo.data.Peticion;
import modelo.data.Tarifa;
import utiles.Validator;

public class SimuladorController {

	ParaUI paraUI;

	public SimuladorController() {
		super();
	}

	private void insertarItems(ArrayList<Movil> moviles, ParaUI paraUI) {
		paraUI.getMoviles().removeAllItems();
		for (int i = 0; i < moviles.size(); i++) {
			paraUI.getMoviles().addItem(moviles.get(i));
		}
	}
	
	private Tarifa obtenerMejorTarifa(ParaUI paraUI) {
		int megas = Integer.parseInt(paraUI.getMegas().getText());
		int minutos = Integer.parseInt(paraUI.getMinutos().getText());
		return paraUI.obtenerMejor(minutos, megas);
	}

	public void simular(ParaUI paraUI) {
		if (Validator.validateSimulator(paraUI.getMegas().getText(), paraUI.getMinutos().getText())) {

			paraUI.getCaracteristicas().setText(paraUI.obtenerCondiciones(obtenerMejorTarifa(paraUI)).toString());
			insertarItems(paraUI.obtener(obtenerMejorTarifa(paraUI)), paraUI);

			paraUI.getBotonPedir().setEnabled(true);
			paraUI.getMegas().setEnabled(false);
			paraUI.getMinutos().setEnabled(false);
		} else {
			paraUI.getMensajeSimulador().setText("¡Error!");
		}
	}

	public boolean almacenar(ParaUI paraUI) {
		
		System.out.println(paraUI.getMoviles().getSelectedIndex());
		if(Validator.isPhone(paraUI.getContacto().getText())) {
			if(paraUI.guardaPeticion(obtenerMejorTarifa(paraUI), paraUI.getMoviles().getSelectedIndex(), paraUI.getContacto().getText())) {
				paraUI.obtenerPeticiones();

				paraUI.getBotonPedir().setEnabled(false);
				paraUI.getMegas().setEnabled(true);
				paraUI.getMinutos().setEnabled(true);
				paraUI.getMensajeSimulador().setText("¡Peticion almacenada!");
				return true;
			}
		}
		paraUI.getMensajeSimulador().setText("¡Error!");
		return false;
	}

}
