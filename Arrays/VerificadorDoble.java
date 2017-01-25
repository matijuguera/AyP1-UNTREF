class VerificadorDoble {

	private int posicion;
	
	public int determinarSiCadaElementoEsElDobleDelAnterior(int[] vector){
		/*			vector[0]=1;
		            vector[1]=2;
		            vector[2]=4;
		            vector[3]=5; 
		 */
		posicion = 0;
			while(vector[posicion] == (vector[posicion+1])/2 && posicion < vector.length-2){
				posicion++;//++  //+++
			}
			if(posicion != vector.length-1){
				return posicion+1;
			}
			return posicion;
		
	}
}	

	
		//vector[5] vector de 4 elementos. vector.length devuelve 5. }
