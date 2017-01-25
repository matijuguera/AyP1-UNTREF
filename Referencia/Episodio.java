class Episodio {
	private int numeroDeEpisodio;
	private String nombre;
	private Actor[] actores;
	
	public Episodio(int numeroDeEpisodio,String nombre,Actor[] actores){
		this.numeroDeEpisodio = numeroDeEpisodio;
		this.nombre = nombre;
		this.actores = actores;
	}
	public int getNumero(){
		return this.numeroDeEpisodio;
	}
	public String getNombre(){
		return this.nombre;
	}
	public Actor[] getActores(){
		return this.actores;
	}
	
}
