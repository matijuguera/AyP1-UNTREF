class Serie {

	
	private String nombre;
	private String genero;
	private Actor[] actoresLost;
	private Episodio[] episodiosLost;

	public Serie(String nombre, String genero, Actor[] actoresLost,Episodio[] episodiosLost) {
		this.nombre = nombre;
		this.genero = genero;
		this.actoresLost = actoresLost;
		this.episodiosLost = episodiosLost;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getGenero() {
		return this.genero;
	}

	public Actor[] getActores() {
		return this.actoresLost;
	}

	public Episodio[] getEpisodios() {
		return this.episodiosLost;
	}
	

}
