class Actor {
	private String nombreDelActor;
	private String nombreDelPersonaje;
	
	public Actor(String nombreDelPersonaje,String nombreDelActor){
		this.nombreDelActor = nombreDelActor;
		this.nombreDelPersonaje = nombreDelPersonaje;
	}
	public String getNombreReal(){
		return this.nombreDelActor;
	}
	public String getNombreFiccion(){
		return this.nombreDelPersonaje;
	}
}
