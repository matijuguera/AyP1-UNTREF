
class Cerradura {
	int claveDeApertura;
	int cantidadDeFallosConsecutivosQueLaBloquean;
	boolean estaAbierta;
	int cantidadErrada;
	int aperturasExitosas;
	int aperturasFallidas;

	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean){
		cantidadErrada = 0;
		estaAbierta = false;
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(int clave){
		if(estaAbierta){
			throw new Error("La cerradura ya esta abierta!");
		}
		if(cantidadErrada <= cantidadDeFallosConsecutivosQueLaBloquean && clave == claveDeApertura){
		estaAbierta = true;
		aperturasExitosas++;
		}else{
		System.out.println("Ingresaste mal la clave o se bloqueo la cerradura");	
		aperturasFallidas++;
		cantidadErrada++;
		}
		return clave == claveDeApertura && cantidadErrada <= cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public void cerrar(){
		estaAbierta = false;
	}

	public boolean estaAbierta(){
		return estaAbierta;
	}

	public boolean estaCerrada(){
		return !estaAbierta;
	}

	public boolean fueBloqueada(){
		return cantidadErrada >= cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public int contarAperturasExitosas(){
		return aperturasExitosas;

	}
	public int contarAperturasFallidas(){
		return aperturasFallidas;
		
	}
}
