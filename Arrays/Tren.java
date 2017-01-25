class Tren {
	private String codigo;
	Vagon[] vagones;
	private Vagon vagon;
	private int cargaTotal;
	private int cargasSuperioresAlPromedio;
	
	public Tren(String codigo,int[] capacidadesDeCarga){
		vagones = new Vagon[capacidadesDeCarga.length];
		this.codigo = codigo;
		for(int i=1;i<=vagones.length-1;i++){
			this.vagon = new Vagon(i,capacidadesDeCarga[i-1]);
			this.vagones[i] = this.vagon;
		}
	}
	public int numeroDeVagones(){
		return vagones.length;
	}
	public String obtenerCodigo(){
		return this.codigo;
	}
	public Vagon obtenerVagon(int numero){
		if(numero < 1 || numero > vagones.length-1){
		throw new Error("el vagon esta comprendido entre 1 y" + (vagones.length-1));	
		}
		
		return this.vagones[numero];
	}
	public int obtenerCargaTotal(){
		cargaTotal = 0;
		for(int i=1;i<=vagones.length-1;i++){
			cargaTotal +=  vagones[i].obtenerCarga();
		}
		return cargaTotal;
	}
	public int contarVagonesConCargaSuperiorAlPromedio(){
		cargasSuperioresAlPromedio=0;

		for(int i=0;i<=vagones.length-1;i++){
			if(vagones[i+1].obtenerCarga() > (cargaTotal/(vagones.length-1)) ){
				cargasSuperioresAlPromedio++;
			}
		}
		return cargasSuperioresAlPromedio;
	}

}
