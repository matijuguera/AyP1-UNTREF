class BuscadorSecuencial {
	private int i;
	private int posicion;
	private boolean noEncontro;
	public int buscar(int[] vector, int buscado){
		this.posicion = -1;
		this.i = 0;
		this.noEncontro = true;
		while( this.noEncontro && (i < vector.length)){
			if(buscado == vector[i]){
				this.posicion = i;
				this.noEncontro = false;
			}
			i++;
		}
		return this.posicion;
		
	}

}
