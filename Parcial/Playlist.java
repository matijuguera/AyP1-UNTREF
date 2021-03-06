
class Playlist {
	private Cancion[] canciones;
	private Cancion cancion;
	private int contador;
	private int contadorDos;
	private int duracionTotal;
	
	public Playlist(int numeroDeCanciones){
		this.canciones = new Cancion[numeroDeCanciones];
		this.contador = numeroDeCanciones-1;
		
	}
	
	public void setCancion(String nombre,int duracion){
		if(this.contador < 0){
			throw new Error("Se lleno la lista");
		}
		this.cancion = new Cancion(nombre,duracion);
		this.canciones[contador] = this.cancion;
		contador--;	
		
	}
	public String getTitulo(int posicion){
		return this.canciones[posicion-1].getNombre();
	}
	public int cantidadDeCancionesTotales(){
		this.contadorDos = 0;
		for(int i=0;i<this.canciones.length;i++){
			if(this.canciones[i] != null){
				this.contadorDos++;
			}
		}
		return this.contadorDos;
	}
	public int duracionTotalEnSegundos(){
		this.duracionTotal = 0;
		for(int i=0;i<this.canciones.length;i++){
			if(this.canciones[i] != null){
				this.duracionTotal += this.canciones[i].getDuracion();
			}
		}
		return this.duracionTotal;
	}
		
}
