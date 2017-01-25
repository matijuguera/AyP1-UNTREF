
public class Contacto {
	private String nombre;
	private Direccion direccion;

	
	public Contacto(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setDireccion(Direccion direccion){
		this.direccion = direccion;
	}
	public Direccion getDireccion(){
		return this.direccion;
	}
}
