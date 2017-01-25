
class Examen {
	private int puntos;
	private int puntosCorregidos;
	private int puntajeTotal;
	/**
	* @param = No puede haber menos de 1 punto
	*
	**/
	public Examen(int puntos){
		if(puntos<1){
			throw new Error("Ingresar al menos 1 punto");
		}this.puntos = puntos;
		
	}
	public double calcularNota(){
		return this.puntajeTotal/10;
	
	}
	public void corregirPunto(int porcentajeDeUnPunto){
		if(porcentajeDeUnPunto>(100/this.puntos)){
			throw new Error("El porcentaje debe ser menor o igual a "+(100/this.puntos));
		}else if(puntosCorregidos>=puntos){
			throw new Error("Ya correguiste todos los puntos");
		}
			puntajeTotal += porcentajeDeUnPunto;
			puntosCorregidos++;
	}
	
	
	public int contarPuntos(){
		return puntos;
	}

}



