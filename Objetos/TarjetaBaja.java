
class TarjetaBaja {
	double saldoInicial;
	int viajesColectivo;
	int viajesTotales;
	int viajesSubte;
	public TarjetaBaja(double saldoInicial){
		this.saldoInicial = saldoInicial;
	}
	public double obtenerSaldo(){
		return saldoInicial;
	}
	public void cargar(double monto){
		saldoInicial += monto;
	}
	public void pagarViajeEnColectivo(){
		saldoInicial -= 1.25;
		viajesColectivo++;
		viajesTotales++;
	}
	public void pagarViajeSubte(){
		saldoInicial -= 2.50;
		viajesSubte++;
		viajesTotales++;
	}
	public int contarViajes(){
		return viajesTotales;
		
	}
	public int contarViajesEnColectivo(){
		return viajesColectivo;
	}
	public int contarViajesEnSubte(){
		return viajesSubte;
	}
	
	
}
