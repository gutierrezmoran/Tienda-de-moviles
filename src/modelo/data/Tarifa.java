package modelo.data;

import java.io.Serializable;
import java.util.ArrayList;

public class Tarifa implements Serializable {

	private int id;
	private String nombre;
	private int minutos;
	private int megas;
	private float precio;
	private ArrayList<Movil> moviles;

	public Tarifa(int id, String nombre, int minutos, int megas, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.minutos = minutos;
		this.megas = megas;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ArrayList<Movil> getMoviles() {
		return moviles;
	}

	public void setMoviles(ArrayList<Movil> moviles) {
		this.moviles = moviles;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getMegas() {
		return megas;
	}

}
