
class TrianguloDePascal {
	private int[][] enteros;
	
	public TrianguloDePascal(int cantidadDeFilas){
		this.enteros = new int[cantidadDeFilas][];
		for(int i=0;i<cantidadDeFilas;i++){
			this.enteros[i] = new int[i+1];
		}
		for(int j=0;j<enteros.length;j++){
			for(int k=0;k<enteros[j].length;k++){
				if(k == 0|| k == (enteros[j].length-1)){
					this.enteros[j][k] = 1;
				}else{
					this.enteros[j][k] = this.enteros[j-1][k-1] + this.enteros[j-1][k];
				}
			}
		}
		mostrarTrianguloPascal();
		
	}
    private void mostrarTrianguloPascal() {
        for(int i=0; i < this.enteros.length; i++){
            for(int j=0; j < this.enteros[i].length; j++){
                System.out.print(" "+this.enteros[i][j]+" ");
            }
            System.out.print("\n"); // es lo mismo a System.out.println("");
        }
    }

}
