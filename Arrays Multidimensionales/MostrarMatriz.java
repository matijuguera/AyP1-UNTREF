
class MostrarMatriz {
	public void mostrar(int[][] a) {
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.print("\n"); // es lo mismo a System.out.println("");
        }
    }
}
