
class Pascal {
	 private int[][] triangulo;
	   
	    public Pascal(int cantidadFilas){
	        this.triangulo = new int[cantidadFilas][];
	        for(int i=0; i<cantidadFilas; i++){
	            this.triangulo[i] = new int[i+1];
	        }
	        armarTrianguloPascal();
	    }
	   
	    private void armarTrianguloPascal(){
	        int contadorColumnas = 0;
	        for(int i=0; i<this.triangulo.length; i++){
	            contadorColumnas++;
	            for(int j=0; j<contadorColumnas; j++){
	                if( j == 0 || j == (contadorColumnas-1) ){
	                    triangulo[i][j] = 1;
	                } else {
	                    triangulo[i][j] = triangulo[i-1][j-1]+triangulo[i-1][j];
	                }
	            }
	        }
	        mostrarTrianguloPascal();
	    }
	 
	    private void mostrarTrianguloPascal() {
	        for(int i=0; i < this.triangulo.length; i++){
	            for(int j=0; j < this.triangulo[i].length; j++){
	                System.out.print(" "+this.triangulo[i][j]+" ");
	            }
	            System.out.print("\n"); // es lo mismo a System.out.println("");
	        }
	    }
	    
}
