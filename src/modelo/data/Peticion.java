package modelo.data;

import java.io.Serializable;
import java.util.Vector;

public class Peticion implements Serializable {
	private long id;
	private Tarifa tarifa;
	private Movil modelo;
	private String cliente;

	public Peticion(long id, Tarifa tarifa, String cliente) {
		super();
		this.id = id;
		this.tarifa = tarifa;
		this.cliente = cliente;
	}

	public Movil getModelo() {
		return modelo;
	}

	public void setModelo(Movil modelo) {
		this.modelo = modelo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public Vector toVector() {
		Vector<String> vector = new Vector<>();
		vector.add(String.valueOf(id));
		vector.add(tarifa.getNombre());
		if (modelo != null)
			vector.add(modelo.getNombre() + modelo.getMarca());
		else {
			vector.add("sin terminal");
		}
		vector.add(cliente);
		return vector;
	}
}
