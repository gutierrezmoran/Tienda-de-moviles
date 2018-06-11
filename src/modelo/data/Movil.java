package modelo.data;

import java.io.Serializable;

public class Movil implements Serializable{
	private String marca;
	private String nombre;

	public Movil(String marca, String nombre) {
		super();
		this.marca = marca;
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return getMarca()+" "+getNombre();
	}
}
