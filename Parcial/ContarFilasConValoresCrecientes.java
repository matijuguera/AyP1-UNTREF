
class ContarFilasConValoresCrecientes {
	public int contarFilasConValoresCrecientes(double[][] matriz){
		int contador = 0;
		int j = 0;
		for(int i=0;i<matriz.length;i++){
			boolean pasoLaFila = true;
			while(j<matriz[i].length-1 && pasoLaFila){
				if(matriz[i][j] < matriz[i][j+1]){
					pasoLaFila = true;
				}else{
					pasoLaFila = false;
				}
				j++;
			}
			if(pasoLaFila){
				contador++;
			}
			j=0;
		}
		return contador;
	}
}
