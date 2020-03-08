package figuras;

public abstract class Figura {

	// CAMPOS
	protected String color;
	protected float area;

	// CONSTRUCTORES
	public Figura() {
		setColor("rojo");
	}

	public Figura(String color) {
		this.setColor(color);
	}

	public abstract float calcularArea();
	
	// METODOS DE CLASE
	@Override
	public String toString() {
		return "Figura: " + " / Color: " + color;
	}

	// GETTER Y SETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getArea() {
		return calcularArea();
	}	
}
