package modelo.acceso;

import utiles.Validator;

public class AlmacenIndividual<T> {
	String path;

	public AlmacenIndividual(String path) {
		assert existe(path);
		this.path = path;
	}

	private boolean existe(String path2) {
		return Validator.isPath(path);
	}

	public T obtener() {
		return new DAO<T>().leer(path);

	}

	public boolean grabar(T t) {
		return new DAO<T>().grabar(path, t);
	}
}
