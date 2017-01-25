
class Matriz {
	private int[][] matriz;
	
	public Matriz(int filas,int columnas){
		if(filas == 0 || columnas == 0){
			throw new Error ("La dimensión de una matriz no puede ser nula");
		 }	   
		this.matriz = new int[filas][columnas];
	}
	
	public int getValorEnPosicion(int i,int j){
		return this.matriz[i][j];
	}
	public void setValorEnPosicion(int i,int j, int valor){
		this.matriz[i][j] = valor;
	}
	public int getColumnas(){
		return this.matriz[matriz.length].length;
	}
	public int getFilas(){
		return this.matriz.length;
	}
	


	public Matriz sumarMatriz(Matriz matrizDos){
		if(this.matriz.length != matrizDos.getFilas() && this.matriz[matriz.length-1].length != matrizDos.getColumnas()){
			throw new Error("las matrices a sumar tienen que ser de la misma dimension");
		}
		Matriz matrizResultante = new Matriz(matriz.length,matriz[matriz.length-1].length);
		for(int i=0;i<this.matriz.length;i++){
			for(int j=0;j<this.matriz[i].length;j++){
				matrizResultante.setValorEnPosicion(i, j,matriz[i][j] + matrizDos.getValorEnPosicion(i, j));
			}
		}
		return matrizResultante;
		
	}
	public Matriz restarMatriz(Matriz matrizDos){
		if(this.matriz.length != matrizDos.getFilas() && this.matriz[matriz.length-1].length != matrizDos.getColumnas()){
			throw new Error("las matrices a sumar tienen que ser de la misma dimension");
		}
		Matriz matrizResultante = new Matriz(matriz.length,matriz[matriz.length-1].length);
		for(int i=0;i<this.matriz.length;i++){
			for(int j=0;j<this.matriz[i].length;j++){
				matrizResultante.setValorEnPosicion(i, j,matriz[i][j] - matrizDos.getValorEnPosicion(i, j));
			}
		}
		return matrizResultante;
		
	}
	public Matriz multiplicarPorEscalar(int escalar){
		Matriz matrizResultante = new Matriz(matriz.length,matriz[matriz.length-1].length);
		for(int i=0;i<this.matriz.length;i++){
			for(int j=0;j<this.matriz[i].length;j++){
				matrizResultante.setValorEnPosicion(i, j,matriz[i][j] * escalar);
			}
		}
		return matrizResultante;
	}
	public boolean esDiagonal(){
		int i = 0;
		int j = 0;
		boolean booleano = true;
		while(i<matriz.length && booleano){
			while(j<matriz.length && booleano){
				if(i == j && matriz[i][j] != 1){
					booleano = false;	
				}else if(matriz[i][j] != 0){
					booleano = false;
				}
				j++;
			}
			i++;
			j=0;
		}
		return booleano;
	}
	public boolean triangularSuperior(){
		int i = 0;
		int j = 0;
		boolean booleano = true;
		while(i<matriz.length && booleano){
			while(j<matriz.length && booleano){
				}if(j>i && matriz[i][j] != 0){
					booleano = false;
				}else if(matriz[i][j] == 0){
					booleano = false;
				j++;
			}
			i++;
			j=0;
		}
		return booleano;
	}
	public boolean triangularInferior(){
		int i = 0;
		int j = 0;
		boolean booleano = true;
		while(i<matriz.length && booleano){
			while(j<matriz.length && booleano){
				}if(j<i && matriz[i][j] != 0){
					booleano = false;
				}else if(matriz[i][j] == 0){
					booleano = false;
				j++;
			}
			i++;
			j=0;
		}
		return booleano;
	}
	
	
}
