package ejercicio1;

public class Circulo {
	// Atributos
	float radio, area;
	String color;

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
		float resultado = (float) (Math.PI * radio * radio);
		return resultado;
	}
}
