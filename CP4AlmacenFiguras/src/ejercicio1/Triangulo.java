package ejercicio1;

public class Triangulo {

	// Atributos
	float base, altura, area;
	String color;

	public Triangulo() {
		this.base = 1;
		this.altura = 2;
		this.area = calcularArea();
		color = "rojo";
	}

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		this.area = calcularArea();
		color = "rojo";
	}

	private float calcularArea() {
		float resultado = base * altura / 2;
		return resultado;
	}
}
