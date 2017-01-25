
class Montacargas {
	private int kgSoportados;
	private int kgTotales;
	private int kgPromedio;
	private int kgCompletados;

	
	
	/*
	 * pre: No se pueden ingresar kg menores o iguales a 0 
	 * post: crea un montacarga con la cantidad maxima de kg que oporta
	 */
	public Montacargas(int kgSoportados){
		if(kgSoportados<=0){
			throw new Error("ingresar kg mayor o igual a 0");
		}
		this.kgSoportados = kgSoportados;
	}
	public void cargar(int kgIndicados){
		if((kgIndicados+kgTotales)>kgSoportados){
			throw new Error("Superaste el peso que soporta el montacarga");
		}
		this.kgTotales += kgIndicados;
	}
	public void descargar(){
		if(kgTotales != 0){
			kgCompletados++;
			this.kgPromedio += this.kgTotales;
			this.kgTotales = 0;
		}else{
			System.out.println("Deber cargar algo primero, para poder descargarlos");
		}


		
	}
	public int obtenerCarga(){
		return kgTotales;
	}
	public double obtenerCargaPromedio(){
		return this.kgPromedio/kgCompletados;
	}
	

}
