
import java.util.Locale;
import java.util.Scanner;

public class Operadores {

	public static final int SALIR = 0;
	public static final int NUMERICA = 1;
	public static final int LOGICA = 2;
	public static final int ASIGNACION = 3;
	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		int operacion;
		boolean salir = false;
		while (!salir) {
			System.out.println("Elige el tipo de operación que quieres hacer");
			System.out.println(" 1 - Numerica / 2 - Logicas / 3 - Asignación");
			operacion = entrada.nextInt();
			switch (operacion) {
			case NUMERICA:
				System.out.println("1 - Numérica");
				// EJERCICIO 1
				// RELLENAR
				float a = 6.0f;
				int b = 0;
				float suma = a + b;
				System.out.println("Suma: " + suma);

				float resta = a - b;
				System.out.println("Resta: " + resta);

				float multiplicacion = a * b;
				System.out.println("Multiplicación: " + multiplicacion);

				if (b != 0) {
					float division = a / b;
					System.out.println("División: " + division);

					float residuo = a % b;
					System.out.println("Resto: " + residuo);
				}

				float resultado = a++;
				System.out.println("Incrementar a: " + a);
				System.out.println("Incrementar a: " + resultado);
				// la variable resultado se quedo con el valor de a antes de que
				// la variable a incremente su valor
				//
				resultado = ++b;
				System.out.println("Incrementar b: " + b);
				System.out.println("Incrementar b: " + resultado);
				// La variable resultado es igual que la variable b con el
				// incremento realizado
				// --
				// No tocar las estructura, no borrar los break ni los cases
				break;
			case LOGICA:
				System.out.println("2 - Logicas");
				// EJERCICIO 2
				// RELLENAR
				int c = 5;
				int d = 7;
				boolean resultado2 = false;
				resultado2 = c < d;
				System.out.println("c es menor que d: " + resultado2);

				resultado2 = c > d;
				System.out.println("d es mayor que d: " + resultado2);

				resultado2 = c <= d;
				System.out.println("c es menor igual que d: " + resultado2);

				resultado2 = c >= d;
				System.out.println("c es mayor igual que d: " + resultado2);

				resultado2 = c == d;
				System.out.println("c es igual a d: " + resultado2);

				resultado2 = c != d;
				System.out.println("c es distinto de d: " + resultado2);

				resultado2 = c > d || c < d;
				System.out.println("c es mayor que d o c es menor que d: " + resultado2);

				resultado2 = 2 * c > d && c < d;
				System.out.println("2*c es mayor que d y c es menor que d: " + resultado2);
				// --
				break;
			case ASIGNACION:
				System.out.println("3 - Asignación");
				// EJERCICIO 3
				int e = 4;
				int f = 5;
				int resultado3 = 0;
				resultado3 += e * f;
				System.out.println("Suma: " + resultado3);

				resultado3 = 0;
				resultado3 &= (int) 5.0;
				System.out.println("AND: " + resultado3);
				//Porque es 
				// --
				break;
			case SALIR:
				System.out.println("Bye Bye");
				salir = true;
				break;
			default:
				System.out.println("No se selecciono ninguna operación");
			}
		}
		System.exit(1);
	}

}
