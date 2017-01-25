
class Persona {
	
	private String nombre;
	private String apellido;
	private Telefono telefono;

	public Persona(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public void setTelefono(Telefono telefono){
		this.telefono = telefono;
	}
	public Telefono getTelefono(){
		return this.telefono;
	}
}
