public class Factura {

	private String codigo;
	private String cliente;
	private int descuento;
	private double importe;
	
	//CONSTRUCTORES
	public Factura(String codigo, String cliente, double importe) {
		this.codigo = codigo;
		this.setCliente(cliente);
		this.setImporte(importe);
		setDescuento(0);
	}
	
	//METODOS CLASE
	public String toString(){
		return "Num. factura: " + codigo + " / Cliente: " + cliente + 
				" / Descuento: " + descuento + " % / Importe: " + importe + " euros";
	}
	

	// GETTER Y SETTERS
	public String getCodigo() {
		return codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

}
