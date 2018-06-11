package vista.paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Peticiones extends JPanel {

	private JTable peticiones;

	public Peticiones() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeticionesRecogidas = new JLabel("PETICIONES RECOGIDAS");
		lblPeticionesRecogidas.setOpaque(true);
		lblPeticionesRecogidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeticionesRecogidas.setForeground(Color.WHITE);
		lblPeticionesRecogidas.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPeticionesRecogidas.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblPeticionesRecogidas.setBackground(Color.DARK_GRAY);
		add(lblPeticionesRecogidas, BorderLayout.NORTH);
		
		crearTabla();
	}
	
	public void crearTabla() {
		String columnas[] = {"ID", "Tarifa", "Modelo", "Cliente"};
		peticiones = new JTable(new DefaultTableModel(null, columnas));
		
		JScrollPane scrollPane = new JScrollPane(peticiones);
		add(scrollPane, BorderLayout.CENTER);
	}

	public JTable getPeticiones() {
		return peticiones;
	}

}
