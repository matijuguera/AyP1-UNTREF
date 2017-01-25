class EslabonDos {
	private int numero;
	private double longitud;

	public EslabonDos(int numero, double longitud){
		this.numero = numero;
		this.longitud = longitud;
	}
	public int obtenerNumero(){
		return this.numero;
	}
	public double obtenerLongitud(){
		return this.longitud;
	}
	public void cambiarLongitud(double longitud){
		this.longitud = longitud;
	}
}
