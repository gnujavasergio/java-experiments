import java.util.Locale;
import java.util.Scanner;

public class NumeroAleatorio {

	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	
	public static void main(String arg[]){
		int numero;
		int respuesta;
		boolean correcto = false;
		
		System.out.println("Generando número");
		
		numero = (int) (Math.random() * 100);
		System.out.println(numero);
		System.out.println("¿Serás capaz de averiguarlo?");
		
		respuesta = entrada.nextInt();
		
		while(true){			
			if(numero == respuesta) {
				correcto = true;
			}
			if(correcto){
				break;
			}
			System.out.println("¿El numero no es correcto. Intentalo nuevamente?");
			respuesta = entrada.nextInt();
		}
		
		System.out.println("Correcto!! Acertaste");
	}
}
