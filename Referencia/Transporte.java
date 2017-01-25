
public class Transporte {

	 String patente;
	    Pasajero[] capacidad;
	   
	    public Transporte(String patente , int capacidad) {
	        this.patente = patente;
	        this.capacidad = new Pasajero[capacidad];
	    }
	 
	    public String getPatente() {
	        return patente;
	    }
	 
	    public int getCapacidad() {
	        return capacidad.length;
	    }
	 
	    public Pasajero getPasajero(int i) {
	        return capacidad[i-1];
	    }
	 
	    public void bajarA(Pasajero pasajero) {
	        for(int i = 0; i < capacidad.length ; i++) {
	            if(capacidad[i] == pasajero) {
	                capacidad[i] = null;
	                pasajero.bajarDelTransporteDeMierda(this);
	            }
	        }
	    }
	   
	    public void subirPasajero(Pasajero p) {
	        boolean seSubio = false;
	        int i = 0;
	        while(i < capacidad.length && !seSubio) {
	            if(capacidad[i] == null) {
	                capacidad[i] = p;
	                seSubio = true;
	            } else {
	                i++;
	            }
	        }
	    }


	

}
