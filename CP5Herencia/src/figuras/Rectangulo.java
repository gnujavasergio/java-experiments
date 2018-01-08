package figuras;

public class Rectangulo extends Figura {

	// CAMPOS
	protected float base;
	protected float altura;

	// CONSTRUCTORES
	public Rectangulo() {
		super();
		this.base = 1;
		this.altura = 2;
		area = calcularArea();

	}

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	// OTROS METODOS DE LA CLASE
	@Override
	public float calcularArea() {
		float resultado = base * altura;
		return resultado;
	}

	@Override
	public String toString() {
		return "Rectángulo " + super.getColor() + " / Base: " + base + " / Altura: " + altura + " / área: " + getArea();
	}

	// GETTER Y SETTERS
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


}
