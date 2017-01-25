
class esCuadradaSimetricaV2 {
	private boolean booleano;
	private int i;
	private int j;
	public boolean promediarFilas(double[][] matriz){
		i=0;
		j=0;
		if(matriz.length == matriz[matriz.length-1].length){
			this.booleano = true;
		}else{
			this.booleano = false;
		}
		while(i<matriz.length && booleano){
			while(j<matriz[i].length){
				if(matriz[i][j] != matriz[j][i]){
					this.booleano = false;
				}
				j++;
			}
			i++;
			j=0;
		}
		return booleano;
	}

}
