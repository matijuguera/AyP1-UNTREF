
public class Instrumento {
	private String instrumento;
	private Musico musico;

	public Instrumento(String instrumento){
		this.instrumento = instrumento;
	}
	public void setNombre(String instrumento){
		this.instrumento = instrumento;
	}
	public String getNombre(){
		return this.instrumento;
	}
	public void setMusico(Musico musico){
		this.musico = musico;
	}
	public Musico getMusico(){
		return this.musico;
	}
		
}
