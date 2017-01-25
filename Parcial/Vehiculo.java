
public class Vehiculo {
	private Pasajero[] lugares;
	private int contador;
	public Vehiculo(int cantidadDeLugares) {
	this.lugares = new Pasajero[cantidadDeLugares];
	}

	public int contarLugaresLibres() {
		this.contador = 0;
		for(int i=0;i<this.lugares.length;i++){
			if(this.lugares[i] == null){
				this.contador++;
			}
		}
		return contador;
	}

	public int contarLugaresOcupados() {
		this.contador = 0;
		for(int i=0;i<this.lugares.length;i++){
			if(this.lugares[i] != null){
				this.contador++;
			}
		}
		return contador;
	}

	public void subir(int lugar, Pasajero pasajero) {
		this.lugares[lugar-1] = pasajero;
		
	}

	public Pasajero obtenerPasajero(int i) {
		return this.lugares[i-1];
		
	}

}
