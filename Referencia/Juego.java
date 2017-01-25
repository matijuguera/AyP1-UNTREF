class Juego {
	private String nombre;
	private Jugador[] cantidad;
	private int numero;
	private int contador;
	
	public Juego(String nombre,int cantidad){
		this.numero = 0;
		this.nombre = nombre;
		this.cantidad = new Jugador[cantidad];
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getCantidadDeJugadores(){
		return cantidad.length;
	}
	public void ingresarJugador(Jugador jugador){
		if(numero > cantidad.length-1){
			throw new Error("ya alcanzaste el numero maximo de jugadores");
		}
		this.cantidad[numero] = jugador;
		numero++;
	}

	public int contarJugadores() {
		contador = 0;
		for(int i=0;i<cantidad.length;i++){
			if(cantidad[i] != null){
				contador++;
			}
		}
		return contador;
	}

	public Jugador getJugador(int i) {
		return cantidad[i-1];
	}
	public void deleteJugador(Jugador jugador){
		for(int i=0;i<cantidad.length;i++){
			if(cantidad[i] == jugador){
				cantidad[i] = null;
			}
		}
	}
}
