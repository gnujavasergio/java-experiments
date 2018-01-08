package figuras;

public class Cuadrado extends Rectangulo {

	private int lado;

	// CONSTRUCTORES
	public Cuadrado() {
		super(1, 1);
		super.area = calcularArea();
	}

	public Cuadrado(int lado, String color) {
		super(lado, lado);
		super.area = calcularArea();
	}

	@Override
	public String toString() {
		return "Cuadrado " + super.getColor() + " / Lado: " + lado + " / área: " + getArea();
	}

	// GETTER Y SETTERS
	public float getLado() {
		return super.getBase();
	}

	public void setLado(float lado) {
		super.setBase(lado);
		super.setAltura(lado);
	}
}
