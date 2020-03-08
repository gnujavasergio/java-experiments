import java.util.ArrayList;


public class GestionFacturas {
	
	//CONSTRUCTOR
	public GestionFacturas() {}
	
	//CARGAR DATOS
	public void cargarClientes(ArrayList<String> lista) {
		lista.add("Manuel Contilla Lopez");
		lista.add("Jorge Casacuberta García");
		lista.add("Maria Jose Agustó Martinez");
		lista.add("Pedro Bravo Bravo");
		lista.add("Rafael Delgado Romero");
	}

	public void cargarFacturas(ArrayList<Factura> lista) {
		lista.add(new Factura("0-2012", "Manuel Contilla Lopez", 102.5));
		lista.add(new Factura("1-2012", "Maria Jose Agustó Martinez", 56.5));
		lista.add(new Factura("2-2012", "Maria Jose Agustó Martinez", 82));
		lista.add(new Factura("3-2012", "Pedro Bravo Bravo", 10.6));
		lista.add(new Factura("4-2012", "Pedro Bravo Bravo", 45.5));
		lista.add(new Factura("5-2012", "Manuel Contilla Lopez", 32.1));
		lista.add(new Factura("6-2012", "Manuel Contilla Lopez", 67.0));
		lista.add(new Factura("7-2012", "Jorge Casacuberta García", 70.5));
		lista.add(new Factura("8-2012", "Pedro Bravo Bravo", 12.3));
	}
	
	
	//CREAR CLIENTES Y FACTURAS
	public Factura crearFactura(ArrayList<Factura> facturas, String id,
			String cliente, double importe, int descuento) {

		Factura fac = new Factura(id, cliente, importe);
		fac.setDescuento(descuento);
		facturas.add(fac);
		return fac;
	}
	
	public int crearCliente(ArrayList<String> lista, String cliente) {
		lista.add(cliente);
		return lista.indexOf(cliente);
	}
	
	//MÉTODOS ÚTILES
	
	public void mostrarClientes(ArrayList<String> clientes) {

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("Cod.cliente: " + i + " / Nombre: "
					+ clientes.get(i));
		}
	}

	public void mostrarFacturas(ArrayList<Factura> facturas) {

		for (int i = 0; i < facturas.size(); i++) {
			System.out.println(facturas.get(i).toString());
		}
	}

	public void mostrarFacturasCliente(ArrayList<Factura> facturas,	String cliente) {

		for (int i = 0; i < facturas.size(); i++) {

			if (facturas.get(i).getCliente().equals(cliente)) {
				System.out.println(facturas.get(i).toString());
			}
		}
	}

	public double sumarFacturasCliente(ArrayList<Factura> facturas, String cliente) {
		double total = 0;

		for (int i = 0; i < facturas.size(); i++) {

			if (facturas.get(i).getCliente().equals(cliente)) {
				total += facturas.get(i).getImporte();
			}
		}
		return total;
	}

	
}
