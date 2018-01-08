package ejercicio1and2.animal;

public class Gato implements Animal {
	public static final String PESCADO = "Pescado";

	private String nombre;

	public Gato() {
		this.nombre = "Missi";
	}

	public Gato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String hablar() {
		return "miau miau";
	}

	@Override
	public String darDeComer(String alimento) {
		if (alimento.equals(PESCADO)) {
			return "Ñan Ñan";
		} else {
			return "No me gusta";
		}
	}

	@Override
	public String toString() {
		return "Soy un gato y me llaman: " + nombre;
	}
}