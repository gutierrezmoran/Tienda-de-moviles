package utiles;

import java.util.ArrayList;
import modelo.acceso.AlmacenIndividual;
import modelo.data.Movil;
import modelo.data.Tarifa;

public class CreadorElementos {
	
	public static void main(String[] args) {
		ArrayList<Tarifa> crearTarifas = crearTarifas();
		String pathTarifas = "tarifas.dat";
		AlmacenIndividual<ArrayList<Tarifa>> almacenTarifas = new AlmacenIndividual<>(pathTarifas);
		almacenTarifas.grabar(crearTarifas);
		System.out.println("Se acabo");
	}

	public static ArrayList<Tarifa> crearTarifas() {
		ArrayList<Tarifa> tarifas = new ArrayList<>();
		tarifas.add(new Tarifa(0, "womad", 0, 1000, 5));
		tarifas.add(new Tarifa(1, "instituto", 100, 2000, 10));
		tarifas.add(new Tarifa(2, "pacha", 1000, 10000, 30));
		tarifas.add(new Tarifa(3, "asilo", 200, 1000, 15));
		tarifas.add(new Tarifa(4, "obrero", 200, 2000, 20));
		tarifas.add(new Tarifa(5, "funcionario", 1000, 5000, 40));
		tarifas.add(new Tarifa(6, "facha", 10000, 20000, 100));
		tarifas.add(new Tarifa(7, "infinita", 65535, 65535, 200));

		ArrayList<Movil> pobres = new ArrayList<>();
		pobres.add(new Movil("no", " solicita"));
		pobres.add(new Movil("alcatel", "sosete"));
		pobres.add(new Movil("braun", "botonaco"));
		pobres.add(new Movil("Purina", "plastimax"));
		ArrayList<Movil> mediano = new ArrayList<>();
		mediano.add(new Movil("no", " solicita"));
		mediano.add(new Movil("citroen", "amiguete"));
		mediano.add(new Movil("Segovia", "planito"));
		mediano.add(new Movil("Amancio", "pasote"));
		ArrayList<Movil> ricos = new ArrayList<>();
		ricos.add(new Movil("no", " solicita"));
		ricos.add(new Movil("MoeChando", "pantallaca"));
		ricos.add(new Movil("Esfaroski", "diamantino"));
		ricos.add(new Movil("Audi", "A80"));

		tarifas.get(0).setMoviles(pobres);
		tarifas.get(1).setMoviles(mediano);
		tarifas.get(2).setMoviles(ricos);
		tarifas.get(3).setMoviles(pobres);
		tarifas.get(4).setMoviles(mediano);
		tarifas.get(5).setMoviles(ricos);
		tarifas.get(6).setMoviles(ricos);
		tarifas.get(7).setMoviles(mediano);

		return tarifas;
	}

}
