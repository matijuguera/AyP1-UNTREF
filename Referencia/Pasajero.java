
public class Pasajero {

		String nombre;
	    Transporte transporte;
	    private Transporte transporteAnterior;

	
	   
	    public Pasajero(String nombre) {
	        this.nombre = nombre;
	    }
	 
	    public String getNombre() {
	        return nombre;
	    }
	 
	    public Transporte getTransporte() {
	    	return transporte;
	    }
	 
	    public void subirEn(Transporte transporteASubir) {
	        if(transporte == null) {
	            transporte = transporteASubir;
	            transporteASubir.subirPasajero(this);
	            transporteAnterior = transporteASubir;
	        } else {
	        	if(transporteAnterior != null){ //en el caso de que ya lo halla bajado desde el transporte.
	        		transporteAnterior.bajarA(this);
	        	}
	            this.transporte = transporteASubir;
	            this.transporte.subirPasajero(this);
	            transporteAnterior = transporteASubir;
	            
	        }
	    }
	   
	    public void bajarDelTransporteDeMierda(Transporte t) {
	    	
	    		this.transporte = null;
	    		
	    
	    }     
	
}
