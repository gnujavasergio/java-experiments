package ejercicio4;

public class Rectangulo {

	//Atributos
	private float base;
	private float altura;
	private float area;
	private String color;

	public Rectangulo() {
		this.base = 1;
		this.altura = 2;
		this.area = calcularArea();
		color = "rojo";
	}

	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		this.area = calcularArea();
		color = "rojo";
	}

	private float calcularArea() {
		float resultado = base * altura / 2;
		return resultado;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
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

	
}
