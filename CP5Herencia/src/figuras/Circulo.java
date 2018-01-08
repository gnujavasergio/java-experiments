package figuras;

public class Circulo extends Figura {

	// CAMPOS
	private float radio;


	// CONSTRUCTORES
	public Circulo() {
		super();
		radio = 1;
		super.area = calcularArea();
	}

	public Circulo(float radio, String color) {
		super(color);
		this.radio = radio;
		super.area = calcularArea();
	}

	// OTROS METODOS DE LA CLASE
	@Override
	public float calcularArea() {
		float resultado = (float) (Math.PI * radio * radio);
		return resultado;
	}

	@Override
	public String toString() {
		return "Circulo " + super.getColor() + " / Radio: " + radio + " / área: " + getArea();
	}

	// GETTER Y SETTERS
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

}
