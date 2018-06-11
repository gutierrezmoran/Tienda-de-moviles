package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import control.logica.Logica;

public class LogicaTest {
	Logica instancia;

	@Before
	public void setUp() throws Exception {
		instancia = new Logica();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testObtenerMejorTarifa() {
		int[] minutos = { 11, 50, 0, 101, 101, 1000, 8000, 35000 };
		int[] megas = { 11, 1000, 900, 1001, 1001, 4001, 1001, 1001 };
		String[] contiene = { "asilo", "asilo", "womad", "obrero", "obrero", "funcionario", "facha", "infinita" };
		for (int i = 0; i < contiene.length; i++) {
			System.out.println("probando " + minutos[i] + " " + megas[i] + " " + contiene[i]);
			assertTrue(instancia.obtenerMejor(minutos[i], megas[i]).getNombre().contains(contiene[i]));
		}
	}

}
