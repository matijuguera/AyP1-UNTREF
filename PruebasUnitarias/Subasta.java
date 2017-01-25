class Subasta {
	private String articulo;
	private float precioBase;
	private float ofertaGanadora;
	private boolean subastaAbierta;
	
	
	public Subasta(String articulo,float precioBase){
		if(precioBase <= 0){
			throw new Error("Ingresa un precio mayor a 0");
		}
		subastaAbierta = true;
		this.articulo = articulo;
		this.precioBase = precioBase;
		ofertaGanadora = 0;
	}
	public String obtenerArticulo(){
		return this.articulo;
	}
	public void ofertar(float oferta){
		if( subastaAbierta==false ){
			throw new Error("la subasta se cerro");
		}else if(oferta < precioBase){
			throw new Error("la oferta es menor al precio base");
		}else if(oferta < ofertaGanadora){
			throw new Error("la oferta es menor a la oferta que va ganando");
			
		}
		this.ofertaGanadora = oferta; 
	}
	public float obtenerOfertaGanadora(){
		return ofertaGanadora;
		
	}
	public void cerrar(){
		subastaAbierta = false;
	}
}
