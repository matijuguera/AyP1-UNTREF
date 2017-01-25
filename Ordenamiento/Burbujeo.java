
import java.util.Arrays;

class Burbujeo {
	private int auxiliar;
	public void ordenar(int[] array){
		for(int i=0;i< array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(array[j+1] < array[j]){
					this.auxiliar = array[j+1];
					array[j+1] = array[j];
					array[j] = this.auxiliar;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
