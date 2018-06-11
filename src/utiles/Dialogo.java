package utiles;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dialogo {

	public static void callJDialog(JFrame padre, String mensaje, String titulo, int tipo){
		JOptionPane.showMessageDialog(padre, mensaje, titulo,
				tipo);
	}
	//tipos
	
	public static void main(String[] args) {
		//Algunos tipos disponibles
//		JOptionPane.ERROR_MESSAGE;
//		JOptionPane.CANCEL_OPTION;
//		JOptionPane.INFORMATION_MESSAGE;
		JFrame ventana=new JFrame();
		ventana.setSize(300, 300);
		ventana.setVisible(true);
		Dialogo.callJDialog(ventana, "ejemplo", "info", JOptionPane.INFORMATION_MESSAGE);
	}
}
