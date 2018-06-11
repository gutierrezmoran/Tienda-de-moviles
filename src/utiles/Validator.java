package utiles;

import java.util.regex.Pattern;

public class Validator {

	public static boolean isNumber(String string) {
		boolean retorno = true;
		try {
			Double.parseDouble(string);
			char charAt = string.charAt(string.length() - 1);
			if (charAt == 'f' || charAt == 'd')
				retorno = false;
		} catch (NumberFormatException e) {
			retorno = false;
		}
		return retorno;
	}

	public static boolean isIDCliente(String cliente) {
		return !cliente.isEmpty() && isInteger(cliente);
	}

	public static boolean isPhone(String string) {
		// TODO este vale return Pattern.matches("[6-7-9]\\d{8}", string);
		return true;
	}

	public static boolean isInteger(String string) {
		return Pattern.matches("\\d{" + String.valueOf(string.length()) + "}", string);
	}

	public static boolean validateSimulator(String megas, String minutos) {
		return !megas.isEmpty() && !minutos.isEmpty() && isInteger(megas) && isInteger(minutos);
	}

	public static boolean isPath(String path) {
		// TODO comprobar la ruta
		return true;
	}
}
