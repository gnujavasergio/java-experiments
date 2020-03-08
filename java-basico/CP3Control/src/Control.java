import java.util.Locale;
import java.util.Scanner;

public class Control {

	public static final int SI = 1;
	public static final int NO = 2;

	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		int llueve;
		int paraguas;
		int mes;

		System.out.println("EJERCICIO 1");
		System.out.println("¿Esta lloviendo?");
		System.out.println("1 - Si / 2 - No");
		// Permite capturar lo que se escibe por teclado
		llueve = entrada.nextInt();

		System.out.println("¿Tienes una paraguas?: ");
		System.out.println("1 - Si / 2 - No");
		paraguas = entrada.nextInt();

		if (llueve == SI && paraguas == SI) {
			System.out.println("Coge el paraguas");
		} else if (llueve == SI && paraguas == NO) {
			System.out.println("Compra Paraguas");
		} else {
			System.out.println("Vamos a la Playa");
		}

		System.out.println("EJERCICIO 2");
		System.out.println("Selecciona un mes: ");
		System.out.println("1 - Enero / 2 - Febrero / 3 - Marzo / 4 - Abril / 5 - Mayo / 6 - Junio / 7 - Julio "
				+ " / 8 - Agosto / 9 - Septiembre / 10 - Octubre / 11 - Noviembre / 12 - Diciembre");
		mes = entrada.nextInt();

		// switch (mes) {
		// case 1:
		// System.out.println("31 días");
		// break;
		// case 2:
		// System.out.println("28 días");
		// break;
		// case 3:
		// System.out.println("31 días");
		// break;
		// case 4:
		// System.out.println("30 días");
		// break;
		// case 5:
		// System.out.println("31 días");
		// break;
		// case 6:
		// System.out.println("30 días");
		// break;
		// case 7:
		// System.out.println("31 días");
		// break;
		// case 8:
		// System.out.println("31 días");
		// break;
		// case 9:
		// System.out.println("30 días");
		// break;
		// case 10:
		// System.out.println("31 días");
		// break;
		// case 11:
		// System.out.println("30 días");
		// break;
		// case 12:
		// System.out.println("31 días");
		// break;
		// default:
		// System.out.println("No se seleccino ningun mes valido");
		// break;
		// }

		System.out.println("AMPLIACIÓN EJERCICIO 2");
		switch (mes) {
		case 2:
			System.out.println("28 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 días");
			break;
		default:
			System.out.println("31 días");
			break;
		}
		/**
		 * EJERCICIO 3
		 */
		System.out.println("EJERCICIO 3");
		int num1 = 5;
		int num2 = 3;
		int resultado = 0;
		int i = 0;
		for (; i < num2; i++) {
			resultado += num1;
		}

		System.out.println("FOR: El resultado es: " + resultado);

		i = 0;
		resultado = 0;
		while (i < num2) {
			resultado += num1;
			i++;
		}
		System.out.println("WHILE: El resultado es: " + resultado);
		
		
		System.out.println("EJERCICIO 4");
		int salir = 0;
		do{
			System.out.println("Quieres salir del bucle: Introduzca un numero");
			salir = entrada.nextInt();			
		} while(salir == 1);
		
		System.out.println("Usted logro salir de bucle");		
		
	}

}
