
class Insercion {
	private int auxiliar;
	
	public void ordenar(int[] array){
		for(int i=1;i<array.length;i++){ 
			this.auxiliar = array[i];
			int j=i-1;
			while(j>=0 && array[j] > this.auxiliar){
				array[j+1]=array[j];
				array[j] = this.auxiliar;
				j--;
			}
		}
	}

}
