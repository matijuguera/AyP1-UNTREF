
class ListaDePrecios {
	private float[] listaDePrecios;
	private float promedio;
	private int contador;
	private float maximo;

	public ListaDePrecios(int cantidadDeArticulos){
		this.listaDePrecios = new float[cantidadDeArticulos];
	}
	public void cargarValorDeUnArticulo(int numero,float precio){
		this.listaDePrecios[numero-1] = precio;
		
	}
	public float getPrecio(int numero){
		return this.listaDePrecios[numero-1];
	}
	public float getPrecioPromedio(){
		this.promedio = 0;
		this.contador = 0;
		for(int i=0;i<this.listaDePrecios.length;i++){
			if(this.listaDePrecios[i] != 0){
				this.promedio += this.listaDePrecios[i];
				contador++;
			}
		}
		return this.promedio/contador;
	}
	public float getMaximo(){
		this.maximo = 0;
		for(int i=0;i<this.listaDePrecios.length-1;i++){
			if(this.listaDePrecios[i] > this.maximo){
				this.maximo = this.listaDePrecios[i];
			}
		}
		return this.maximo;
	}
	public int contarPreciosEntre(int numero1,int numero2){ //3/7 y 7/3
		this.contador = 0;
		if(numero1 < numero2){
		for(int i=numero1;i<numero2-1;i++){
			if(this.listaDePrecios[i] != 0){
				this.contador++;
			}
		}
		}else if(numero1 > numero2){
			return contarPreciosEntre(numero2,numero1);
		}else{ //en el caso que sean los 2 iguales
			this.contador = 0;
		}
		return this.contador;
	}
	
	

}
