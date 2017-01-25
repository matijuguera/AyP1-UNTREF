
class Vagon {
	private int numero;
	private int capacidadDeCarga;
	private int carga;
	
	public Vagon(int numero, int capacidadDeCarga){
		this.numero = numero;
		this.capacidadDeCarga = capacidadDeCarga;
		this.carga = 0;
	}
	public int obtenerNumero(){
		return this.numero;
	}
	public int obtenerCarga(){
		return this.carga;
	}
	public int cambiarCarga(int carga){
		if(carga>this.capacidadDeCarga){
			throw new Error("la carga supera a la capacidad de carga por" +(capacidadDeCarga-carga));
		}
		this.carga = carga;
		return carga;
	}
	public int obtenerCapacidadDeCarga(){
		return this.capacidadDeCarga;
	}

}
