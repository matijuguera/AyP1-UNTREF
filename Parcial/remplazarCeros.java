import java.util.Arrays;


class remplazarCeros {
	/*
	 * pre: valido solo para matricez mayores o iguales a 2x2
	 * post:
	 */
	public void reemplazarCeros(double[][] valores){
		for(int i=0;i<valores.length;i++){
			for(int j=0;j<valores[i].length;j++){
				if(valores[i][j] == 0){
					if(j==0){  //lado izquierda
						valores[i][j] =valores[i][j+1];
					}else if(j == valores[0].length-1){ // lado derecho
						valores[i][j] =valores[i][j-1];
					}else{
						valores[i][j] = (valores[i][j+1] + valores[i][j-1])/2;
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(valores));
	}
}
