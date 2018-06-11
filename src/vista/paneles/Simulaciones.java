package vista.paneles;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Simulaciones extends JPanel {

	private JTextField minutos;
	private JTextField megas;
	private JTextArea caracteristicas;
	private JComboBox moviles;
	private JTextField contacto;
	private JButton botonValidar;
	private JButton botonPedir;
	private JLabel mensajeSimulador;

	public Simulaciones() {
		setBackground(SystemColor.controlHighlight);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblSimuladorContrato = new JLabel("SIMULADOR CONTRATO");
		lblSimuladorContrato.setOpaque(true);
		lblSimuladorContrato.setForeground(Color.WHITE);
		lblSimuladorContrato.setBackground(Color.DARK_GRAY);
		lblSimuladorContrato.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblSimuladorContrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimuladorContrato.setFont(new Font("Tahoma", Font.BOLD, 25));
		add(lblSimuladorContrato, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setOpaque(false);
		panel.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new BorderLayout(0, 0));
		
		mensajeSimulador = new JLabel("");
		panelBotones.add(mensajeSimulador, BorderLayout.NORTH);
		mensajeSimulador.setBorder(new EmptyBorder(5, 0, 5, 0));
		mensajeSimulador.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeSimulador.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JPanel panel_1 = new JPanel();
		panelBotones.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		botonValidar = new JButton("Validar");
		panel_1.add(botonValidar);
		botonValidar.setFocusPainted(false);
		botonValidar.setBackground(Color.WHITE);
		botonValidar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonValidar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonValidar.setBorder(new EmptyBorder(8, 0, 8, 0));
		
		botonPedir = new JButton("Pedir");
		panel_1.add(botonPedir);
		botonPedir.setEnabled(false);
		botonPedir.setFocusPainted(false);
		botonPedir.setBackground(Color.WHITE);
		botonPedir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonPedir.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonPedir.setBorder(new EmptyBorder(8, 0, 8, 0));
		
		JPanel panelCampos = new JPanel();
		panelCampos.setOpaque(false);
		panel.add(panelCampos, BorderLayout.CENTER);
		panelCampos.setLayout(new BorderLayout(0, 0));
		
		JPanel panelMinutosMegas = new JPanel();
		panelMinutosMegas.setOpaque(false);
		panelMinutosMegas.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCampos.add(panelMinutosMegas, BorderLayout.NORTH);
		panelMinutosMegas.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblMinutos = new JLabel("Minutos");
		lblMinutos.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelMinutosMegas.add(lblMinutos);
		
		JLabel lblMegas = new JLabel("Megas");
		lblMegas.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelMinutosMegas.add(lblMegas);
		
		minutos = new JTextField();
		panelMinutosMegas.add(minutos);
		minutos.setColumns(10);
		
		megas = new JTextField();
		panelMinutosMegas.add(megas);
		megas.setColumns(10);
		
		caracteristicas = new JTextArea();
		caracteristicas.setEditable(false);
		caracteristicas.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelCampos.add(caracteristicas, BorderLayout.CENTER);
		
		JPanel panelMovilTelefono = new JPanel();
		panelMovilTelefono.setOpaque(false);
		panelMovilTelefono.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCampos.add(panelMovilTelefono, BorderLayout.SOUTH);
		panelMovilTelefono.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("M\u00F3viles");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelMovilTelefono.add(lblNewLabel);
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelMovilTelefono.add(lblContacto);
		
		moviles = new JComboBox();
		panelMovilTelefono.add(moviles);
		
		contacto = new JTextField();
		panelMovilTelefono.add(contacto);
		contacto.setColumns(10);

	}

	public JTextField getMinutos() {
		return minutos;
	}

	public JTextField getMegas() {
		return megas;
	}

	public JTextArea getCaracteristicas() {
		return caracteristicas;
	}

	public JComboBox getMoviles() {
		return moviles;
	}

	public JTextField getContacto() {
		return contacto;
	}

	public JButton getBotonValidar() {
		return botonValidar;
	}

	public JButton getBotonPedir() {
		return botonPedir;
	}

	public JLabel getMensajeSimulador() {
		return mensajeSimulador;
	}

}
