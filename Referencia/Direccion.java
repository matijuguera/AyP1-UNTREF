
public class Direccion {
	private String calle;
	private int numero;
	public Direccion(String calle,int numero){
		this.calle = calle;
		this.numero = numero;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getCalle(){
		return this.calle;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setCalle(String calle){
		this.calle = calle;
	}
}
