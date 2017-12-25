package ejercicio4;

public class Circulo {
	// Atributos
	private float radio;
	private float area;
	private String color;

	public Circulo() {
			this.radio = 1;
			this.area = calcularArea();
			color = "rojo";
		}

	public Circulo(float radio) {			
			this.radio = radio;
			this.area = calcularArea();
			color = "rojo";
		}

	private float calcularArea() {
		float resultado = (float) (Math.PI * radio*radio);
		return resultado;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circulo: " + color + "/ radio:" + radio + "/ area:" + area;
	}
		
}
