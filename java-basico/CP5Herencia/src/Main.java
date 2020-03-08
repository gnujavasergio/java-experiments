
import java.util.Locale;
import java.util.Scanner;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.Rectangulo;
import figuras.Triangulo;

public class Main {

	// Clase encargada de la entrada y salida del teclado
	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {

		int operacion;
		boolean salir = false;

		// CREAR OBJETOS
		// RELLENAR

		// Esto no se puede hacer porque la clase figura es una clase Abstracta
		// Figura figura = new Figura();
		// figura.getColor();

		Rectangulo rec = new Rectangulo();
		Triangulo tri = new Triangulo();
		Cuadrado cua = new Cuadrado();
		Circulo cir = new Circulo();

		while (!salir) {
			System.out.println("\nElige el tipo de figura que quieres consultar: ");
			System.out.println(
					" 1 - Rectángulo / 2 - Círculo / 3 - Triángulo / 4 - Cuadrado / 5 - Comparar" + " / 6 - Salir");
			// Permite capturar lo que se escribe por teclado y lo deja en la
			// variable operaci�n.
			operacion = entrada.nextInt();

			switch (operacion) {
			case 1:

				System.out.println(rec.toString());
				break;

			case 2:
				System.out.println(cir.toString());
				break;

			case 3:
				System.out.println(tri.toString());
				break;

			case 4:
				System.out.println(cua.toString());
				break;

			case 5:

				if (compararAreaFigura(rec, tri)) {
					System.out.println("El rectangulo es mas grande que el triángulo");
				} else {
					System.out.println("El triángulo es más grande que el rectángulo");
				}

				break;
			case 6:
				System.out.println("Bye bye");
				salir = true;
				break;
			default:
				System.out.println("Seleccione otra operación");

			}
		}

	}

	public static boolean compararAreaFigura(Figura figura1, Figura figura2) {
		return figura1.getArea() > figura2.getArea();
	}

	public static boolean compararFiguraConLimite(Figura figura, int lim) {
		return figura.getArea() > lim;
	}

}