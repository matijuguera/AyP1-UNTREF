
class Eslabon {
	private int numero;
	private double longitud;
	
	public Eslabon(int numero, double longitud){
		this.numero = numero;
		this.longitud = longitud;
		
	}
	public int obtenerNumero(){
		return numero;
	}
	public double obtenerLongitud(){
		return longitud;
	}
	public void cambiarLongitud(double longitud){
		this.longitud = longitud;

	}

}
