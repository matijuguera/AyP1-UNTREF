
class Ticket {
	double importe;
	int cantidad;
	double precioUnitario;
	double precioTotal;
	double porcentaje;
	boolean ticketAbierto;
	Ticket(){
		importe = 0;
		ticketAbierto = true;
	}
	public void agregarItem(int cantidad, double precioUnitario){
		if(cantidad<=0 && precioUnitario<=0){
			throw new Error("Ingresar precios mayores a 0");
		}
		else if(ticketAbierto != true){
			throw new Error("El ticket se cerro");
		}

		this.cantidad += cantidad;
		this.precioTotal = cantidad * precioUnitario;
		importe += precioTotal;
	}
	public void aplicarDescuento(double porcentaje){
		this.porcentaje = porcentaje;
		importe = importe - ((porcentaje * importe)/100);
	}
	public double calcularSubtotal(){
		return importe;
	}
	public double calcularTotal(){
		ticketAbierto = false;
		return importe;
		
	}
	public int contarProductos(){
		return cantidad;
	}

}
