
class esCuadradaSimetrica {
	private boolean booleano;
	private double[][] matrizTranspuesta;
	private int i;
	private int j;
	public boolean promediarFilas(double[][] matriz){
		i=0;
		j=0;
		this.matrizTranspuesta = new double[matriz.length][matriz.length];
		getCuadrada(matriz);
		setMatrizTranspuesta(matriz);
		CompareMatrices(matriz);
		return booleano;
	}
	private void CompareMatrices(double[][] matriz) {
		while(i<matriz.length && booleano){
			while(j<matriz[i].length){
				if(matriz[i][j] != this.matrizTranspuesta[i][j]){
					this.booleano = false;
				}
				j++;
			}
			i++;
			j=0;
		}
	}
	private void setMatrizTranspuesta(double[][] matriz) {
		for(int i=0;i<matriz.length && booleano;i++){
			for(int j=0;j<matriz[i].length;j++){
				this.matrizTranspuesta[i][j] = matriz[j][i];
			}
		}
	}
	private void getCuadrada(double[][] matriz) {
		if(matriz.length == matriz[matriz.length-1].length){
			this.booleano = true;
		}else{
			this.booleano = false;
		}
	}

}
