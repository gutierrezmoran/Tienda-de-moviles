package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import vista.paneles.Peticiones;
import vista.paneles.Simulaciones;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.BorderLayout;

public class UI extends JFrame {

	private JPanel contentPane;
	private Simulaciones simulaciones;
	private Peticiones peticiones;

	public UI() {
		this.simulaciones = new Simulaciones();
		this.peticiones = new Peticiones();
		crearUI();
	}

	private void crearUI() {
		setMinimumSize(new Dimension(900, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnContrato = new JMenu("Contrato");
		menuBar.add(mnContrato);

		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		JMenu mnAcciones = new JMenu("Acciones");
		menuBar.add(mnAcciones);

		JMenuItem itemSimulaciones = new JMenuItem("Simulaciones");
		itemSimulaciones.addActionListener(e -> {
			contentPane.removeAll();
			contentPane.add(this.simulaciones, BorderLayout.CENTER);
			this.contentPane.updateUI();
		});
		mnAcciones.add(itemSimulaciones);

		JMenuItem itemPeticiones = new JMenuItem("Peticiones");
		itemPeticiones.addActionListener(e -> {
			contentPane.removeAll();
			contentPane.add(this.peticiones, BorderLayout.CENTER);
			this.contentPane.updateUI();
		});
		mnAcciones.add(itemPeticiones);

		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	public JTextField getMinutos() {
		return simulaciones.getMinutos();
	}

	public JTextField getMegas() {
		return simulaciones.getMegas();
	}

	public JTextArea getCaracteristicas() {
		return simulaciones.getCaracteristicas();
	}

	public JComboBox getMoviles() {
		return simulaciones.getMoviles();
	}

	public JTextField getContacto() {
		return simulaciones.getContacto();
	}

	public JButton getBotonValidar() {
		return simulaciones.getBotonValidar();
	}

	public JButton getBotonPedir() {
		return simulaciones.getBotonPedir();
	}

	public JTable getPeticiones() {
		return peticiones.getPeticiones();
	}

	public JLabel getMensajeSimulador() {
		return simulaciones.getMensajeSimulador();
	}

	public void crearTabla() {
		peticiones.crearTabla();
	}

}
