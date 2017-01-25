
public class Cancion {
	
	private String nombre;
	private int duracion;

	public Cancion(String nombre,int duracion){
		this.nombre = nombre;
		this.duracion = duracion;
	}
	public String getNombre(){
		return this.nombre;
	}

	public int getDuracion(){
		return this.duracion;
	}
}
