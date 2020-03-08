import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Clase encargada de la entrada y salida del teclado
	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	// Listas
	static ArrayList<String> clientes = new ArrayList<String>();
	static ArrayList<Factura> facturas = new ArrayList<Factura>();

	public static void main(String[] args) {

		int operacion;
		int respuesta;
		String nombre;
		boolean salir = false;

		GestionFacturas gf = new GestionFacturas();

		gf.cargarClientes(clientes);
		gf.cargarFacturas(facturas);

		System.out.println("Sistema de control de Facturas");

		while (!salir) {
			System.out.println("Elige el tipo de operación que quieres hacer: ");
			System.out.println(
					" 1 - Crear factura / 2 - Crear cliente / 3 - Consultar facturas / 4 - Ver clientes / 5 - Liquidar facturas cliente / 6 - Salir");
			// Permite capturar lo que se escribe por teclado y lo deja en la
			// variable operaci�n.
			operacion = entrada.nextInt();

			switch (operacion) {
			// CREAR FACTURA
			case 1:
				String id = facturas.size() + "-2012"; // Lo creamos
														// autom�ticamente
				String cliente = "";
				double importe;
				int descuento = 10;

				System.out.println("Selecciona un cliente (escribe solo su codigo): \n");
				gf.mostrarClientes(clientes);
				respuesta = entrada.nextInt();
				cliente = clientes.get(respuesta);

				System.out.println("Introduce el importe: (Con punto si introduces decimales)");
				importe = entrada.nextDouble();

				Factura fac = gf.crearFactura(facturas, id, cliente, importe, descuento);

				System.out.println("Factura creada:");
				System.out.println(fac.toString());
				System.out.println();

				break;
			// CREAR CLIENTE
			case 2:

				System.out.println("Introduce el nombre");
				entrada.nextLine(); // Limpiamos bufer
				nombre = entrada.nextLine();

				int cod = gf.crearCliente(clientes, nombre);
				System.out.println("Cliente creado: " + cod);
				System.out.println();

				break;
			// CONSULTAR FACTURAS
			case 3:

				gf.mostrarFacturas(facturas);
				System.out.println();

				break;
			// MOSTRAR CLIENTES
			case 4:
				gf.mostrarClientes(clientes);
				System.out.println();
				break;

			// SUMAR FACTURAS CLIENTE
			case 5:

				System.out.println("Selecciona un cliente (escribe solo su codigo): \n");
				gf.mostrarClientes(clientes);
				respuesta = entrada.nextInt();
				cliente = clientes.get(respuesta);

				double total = gf.sumarFacturasCliente(facturas, cliente);

				System.out.println("Cliente: " + cliente + " / Total: " + total + " euros");

				System.out.println();

				break;

			case 6:
				System.out.println("Bye Bye \n");
				salir = true;
				break;
			default:
				System.out.println("Incorrecto \n");
			}
		}
	}
}
