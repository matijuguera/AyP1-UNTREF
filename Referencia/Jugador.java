class Jugador {
	private String nombre;
	private String nombreDeJuego;
	private Juego juego;
	private Juego JuegoAnterior;
	
	public Jugador(String nombre){
		this.nombre = nombre;
	}
	public void setJuego(Juego juego){
		juego.ingresarJugador(this);
		nombreDeJuego = juego.getNombre();
	}
	public String getNombreJuego(){
		return nombreDeJuego;
	}
	public String getNombreJugador(){
		return this.nombre;
	}
	public void jugar(Juego juego) {
		if(this.juego == null){
		this.juego = juego;
		juego.ingresarJugador(this);
		nombreDeJuego = juego.getNombre();
		JuegoAnterior = juego;
		}else{
			JuegoAnterior.deleteJugador(this);
			this.juego = juego;
			juego.ingresarJugador(this);
			nombreDeJuego = juego.getNombre();
		}
	}
	public Juego getJuego() {
		return this.juego;
	}
}
