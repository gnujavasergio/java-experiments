import java.util.ArrayList;

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
			System.out.println(
					"Repetición de la palabra \"" + palabra + "\": " + repeticionesDePalabra(DONQUIJOTE, palabra));
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
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Año: " + year);

		/**
		 * Ejercicio 5
		 * 
		 */
		double[][] matriz = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13 } };

		System.out.println("--------- Ejercicio 5 --------");
		mostrarNumeros(matriz);

		/**
		 * Ejercicio 6
		 */
		System.out.println("--------- Ejercicio 6 --------");
		int[][] numMatriz = { { 1, 12, 3, 4 }, { 5, 16 }, { 7, 15, 9, 10, 7, 0 }, { -1 } };
		System.out.println("Numero Mayor: " + devolverMayor(numMatriz));

		/**
		 * Ejercicio 7
		 */
		System.out.println("--------- Ejercicio 7 --------");
		String buscar = "Bilbao";
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Madrid");
		lista.add("Valencia");
		lista.add("Barcelona");
		lista.add("Sevilla");
		lista.add("Bilbao");
		lista.add("Valencia");
		lista.add("Bilbao");
		lista.add("Bilbao");
		int cantidad = sacarDeLaCaja(lista, buscar);
		if ( cantidad != 0	) {
			System.out.println("Se borraron " + cantidad + " de la palabra " + buscar);
			System.out.println("Bilbao Borrado");
		} else {
			System.out.println("Bilbao no encontrado");
		}
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

	/**
	 * Mostrar en pantalla todos los numeros de un array multidimencional
	 */
	public static void mostrarNumeros(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(" " + array[i][j]);
			}
		}
	}

	/**
	 * Metodo para sacar en numero mayour de una matriz
	 */
	public static int devolverMayor(int[][] array) {
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > mayor) {
					mayor = array[i][j];
				}
			}
		}
		return mayor;
	}

	
	/*public static boolean sacarDeLaCaja(ArrayList<String> caja, String buscar) {
		boolean value = false;
		if (!caja.isEmpty()) {
			if (caja.contains(buscar)) {
				caja.remove(caja.indexOf(buscar));
				value = true;
			}
		}
		return value;
	}*/
	
	public static int sacarDeLaCaja(ArrayList<String> caja, String buscar) {
		int cantidad = 0;
		if (!caja.isEmpty()) {
			while(caja.contains(buscar)){			
				caja.remove(caja.indexOf(buscar));
				cantidad++;
			}
		}
		return cantidad;
	}

}
