package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

import ejercicio3.animal.Animal;
import ejercicio3.animal.Gato;
import ejercicio3.animal.Perro;
import ejercicio3.animal.Tigre;

public class Main {

	public static final int PERRO = 1;
	public static final int GATO = 2;
	public static final int TIGRE = 3;
	public static final int SALIR = 4;
	public static final int CARNE = 5;
	public static final int PESCADO = 6;
	public static final int BASURA = 7;

	private static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	private static int operacion;

	public static void main(String[] args) {

		boolean salir = false;

		Perro perro = new Perro();
		Gato gato = new Gato();
		Tigre tigre = new Tigre();

		while (!salir) {
			System.out.println("\nElige el tipo de animal: ");
			System.out.println("1 - Perro");
			System.out.println("2 - Gato");
			System.out.println("3 - Tigre");
			System.out.println("4 - Salir");

			operacion = entrada.nextInt();

			switch (operacion) {
			case PERRO:
				System.out.println(perro.toString());
				System.out.println(perro.hablar());
				System.out.print("El perro nace " + perro.nacer());
				System.out.println(darDeComer(perro));
				break;
			case GATO:
				System.out.println(gato.toString());
				System.out.println(gato.hablar());
				System.out.print("El gato nace " + gato.nacer());
				System.out.println(gato.aranar());
				System.out.println(darDeComer(gato));
				break;
			case TIGRE:
				System.out.println(tigre.toString());
				System.out.println(tigre.hablar());
				System.out.print("El tigre nace " + tigre.nacer());
				System.out.println(tigre.aranar());
				System.out.println(darDeComer(tigre));
				break;
			case SALIR:
				System.out.println("Bye bye");
				salir = true;
				break;
			default:
				System.out.println("Seleccione otra operación");
			}

		}

	}

	public static String darDeComer(Animal animal) {

		String alimento = "";
		System.out.println("\n¿Que le damos de comer?: ");
		System.out.println("5 - Carne");
		System.out.println("6 - Pescado");
		System.out.println("7 - Basura");
		operacion = entrada.nextInt();
		switch (operacion) {
		case CARNE:
			alimento = Tigre.TIGRE;
			break;
		case PESCADO:
			alimento = Gato.PESCADO;
			break;
		case BASURA:
			alimento = Perro.BASURA;
			break;

		default:
			System.out.println("Seleccione otra operación");
		}
		return animal.darDeComer(alimento);
	}
}