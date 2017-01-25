
class VerificadorDeOrden {
	private boolean estaOrdenado;
	private int i;
	
	public boolean verificarOrdenDeMenorAMayor(int[] array){
		this.i=0;
		this.estaOrdenado=false;
		while(array[i] < array[i+1] && i<array.length-2){
			this.estaOrdenado = true;
			i++;
			if(array[i] > array[i+1]){
				this.estaOrdenado = false;
			}
		}
		return estaOrdenado;
	}
}







