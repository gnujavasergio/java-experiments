import java.util.Iterator;

public class Main {

	private final static String DONQUIJOTE = "En un lugar de la Mancha, de cuyo nombre "
			+ "no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los "
			+ "de lanza en astillero adarga antigua, rocín flaco y galgo corredor. "
			+ "Una olla de algo más vaca que carnero, salpicón las más noches, duelos"
			+ " y quebrantos los sábados, lantejas los viernes, algún palomino de "
			+ "añadidura los domingos, consumían las tres partes de su hacienda."
			+ " El resto della concluían sayo de velarte, calzas de velludo para "
			+ "las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana "
			+ "se honraba con su vellorí de lo más fino.";
	
	final static String FECHA_NACIMIENTO = "22-03-2012";

	public static void main(String[] args) {
		/**
		 * Ejercicio 1
		 */
		System.out.println("--------- Ejercicio 1 --------");
		System.out.println("Cantidad de Caracteres: " + cantidadDeCaracteres(DONQUIJOTE));

		/**
		 * EJercicio 2
		 */
		System.out.println("--------- Ejercicio 2 --------");
		int[] numeros = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		/**
		 * Ampliacion Ejercicio 2
		 */
		System.out.println("--------- Ampliación Ejercicio 2 --------");
		for (String frase : devolverFrases(DONQUIJOTE)) {
			System.out.println(frase.trim());
		}

		/**
		 * EJercicio 3
		 */
		System.out.println("--------- Ejercicio 3 --------");
		String[] palabras = new String[] { "de", "Mancha" };
		for (String palabra : palabras) {
			System.out.println("Repetición de la palabra \"" + palabra + "\": " + repeticionesDePalabra(DONQUIJOTE, palabra));
		}
		
		/**
		 * Ejercicio 4
		 * 
		 */
				
		System.out.println("--------- Ejercicio 4 --------");
		String[] fechaNacimiento = FECHA_NACIMIENTO.split("-");		
		int dia = Integer.parseInt(fechaNacimiento[0]);
		int mes = Integer.parseInt(fechaNacimiento[1]);
		int year = Integer.parseInt(fechaNacimiento[2]);
	}

	/**
	 * Obtener Total de Caracteres
	 */
	public static int cantidadDeCaracteres(String texto) {
		return texto.length();
	}

	/**
	 * Obtener array de frases
	 */
	public static String[] devolverFrases(String texto) {
		return texto.split("[.]");
	}

	/**
	 * Repeticion de Palabra
	 */
	public static int repeticionesDePalabra(String texto, String p) {
		String[] palabras = texto.split(" ");
		int cantidad = 0;
		for (String palabra : palabras) {
			if (palabra.equals(p)) {
				cantidad++;
			}
		}
		return cantidad;
	}

}
