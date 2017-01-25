

class Seleccion {
	private int minimo;
	private int auxiliar;
	
	public void ordenar(int[] array){
		for(int i=0;i<array.length-1;i++){
			this.minimo = i;
			for(int j=i+1;j<array.length;j++){
				if(array[j] < array[minimo]){
					this.minimo = j;
				}
			}
			this.auxiliar = array[i];
			array[i] = array[minimo];
			array[minimo] = this.auxiliar;
			
		}
	
	}
}
