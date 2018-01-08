package ejercicio1and2.animal;

public class Perro implements Animal {

	public static final String BASURA = "Basura";
	private String nombre;

	public Perro() {
		this.nombre = "Chucho";
	}

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String hablar() {
		return "Guau guau";
	}

	@Override
	public String darDeComer(String alimento) {
		return "Ñan Ñan";
	}

	@Override
	public String toString() {
		return "Soy un perro y me llaman: " + nombre;
	}

}
