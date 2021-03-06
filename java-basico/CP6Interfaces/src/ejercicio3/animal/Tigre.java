package ejercicio3.animal;

public class Tigre implements Mamifero, Felino {

	public static final String TIGRE = "Carne";
	private String nombre;

	public Tigre() {
		this.nombre = "Chucho";
	}

	public Tigre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String hablar() {
		return "Guau guau";
	}

	@Override
	public String darDeComer(String alimento) {
		if (alimento.equals(TIGRE)) {
			return "Ñan Ñan";
		} else {
			return "No me gusta";
		}
	}

	@Override
	public String toString() {
		return "Soy un perro y me llaman: " + nombre;
	}

	@Override
	public String aranar() {
		return "Tener cuidado puede arañar";
	}

	@Override
	public String nacer() {
		return "en la bosque";
	}
}
