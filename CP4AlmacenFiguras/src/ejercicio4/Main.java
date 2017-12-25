package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static final int RECTANGULO = 1;
	public static final int CIRUCLO = 2;
	public static final int TRIANGULO = 3;
	public static final int COMPARAR = 4;

	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {

		int operacion;
		boolean salir = false;

		Rectangulo rectangulo = new Rectangulo();

		Circulo circulo = new Circulo();

		Triangulo triangulo = new Triangulo();

		while (!salir) {
			System.out.println("Elige el tipo de figura que quieres consultar: ");
			System.out.println("1 - Rectángulo");
			System.out.println("2 - Círculo");
			System.out.println("3 - Triángulo");
			System.out.println("4 - Comparar");

			operacion = entrada.nextInt();

			switch (operacion) {
			case RECTANGULO:
				rectangulo.toString();
				break;
			case CIRUCLO:
				circulo.toString();
				break;
			case TRIANGULO:
				triangulo.toString();
				break;
			case COMPARAR:
				if (compararRectanguloTriangulo(rectangulo, triangulo)) {
					System.out.println("El Rectangulo tiene una área mayor");
				} else {
					System.out.println("El Triangulo tiene una área mayor");
				}
				if (compararRectanguloConLimite(rectangulo, 5)) {
					System.out.println("El Rectangulo es mayor al limite 5");
				} else {
					System.out.println("El Rectangulo es menor al limite 5");
				}
				break;
			}

		}

	}

	public static boolean compararRectanguloTriangulo(Rectangulo rectangulo, Triangulo triangulo) {
		rectangulo.setAltura(4);
		rectangulo.setBase(5);
		return rectangulo.getArea() > triangulo.getArea();
	}

	public static boolean compararRectanguloConLimite(Rectangulo rectangulo, int limite) {		
		System.out.println("Variable limite fuera del metodo = " + limite);
		limite = limite + 2;
		System.out.println("Variable limite en el metodo = " + limite);		
		return rectangulo.getArea() > limite;
	}
}