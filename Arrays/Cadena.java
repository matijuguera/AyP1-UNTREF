
class Cadena {
	  private Eslabon[] eslabones;
	    private Eslabon variable;
	    private double suma;
	    private double longitudMinima;
	    private int cantidad;
	   
	    public Cadena (double [] longitudesDeEslabones){
	        eslabones = new Eslabon[longitudesDeEslabones.length];
	       
	        suma = 0;
	        cantidad = 0;
	       
	        for(int i = 0; i < eslabones.length; i++){
	           
	            this.variable = new Eslabon(i ,longitudesDeEslabones[i]);
	           
	            suma += variable.obtenerLongitud();
	           
	            this.eslabones[i] = this.variable;
	        }
	    }
	   
	    public int ContarCantidadDeEslabones(){
	        return eslabones.length;
	    }
	   
	    public Eslabon obtenerEslabon(int numero){
	        return this.eslabones[numero];
	    }
	   
	    public double obtenerLongitud(){
	        return suma;
	    }
	   
	    public int contarEslabonesConLongitudSuperiorA(double longitudMinima){
	       
	        this.longitudMinima = longitudMinima;
	       
	        for(int i = 0; i < this.eslabones.length; i++ ){
	           
	              this.variable = obtenerEslabon(i);
	           
	            if(variable.obtenerLongitud() > this.longitudMinima){
	                cantidad++;
	            }
	        }
	        return cantidad;
	    }
	
}
