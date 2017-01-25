
class Empleado {
	private String puesto;
	private Persona persona;

	public Empleado(Persona persona,String puesto){
		this.puesto = puesto;
		this.persona = persona;
	}
	public String getNombre(){
		return this.persona.getNombre();
	}
	public String getApellido(){
		return this.persona.getApellido();
	}
	public String getPuesto(){
		return this.puesto;
	}
}
