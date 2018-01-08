package ejercicio3.animal;

public class Perro implements Mamifero {

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
	public String nacer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Soy un perro y me llaman: " + nombre;
	}

}
