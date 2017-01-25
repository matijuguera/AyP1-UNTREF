
class HistorialDeHumedad {
	private double[] humedades;
	private double humedadesTotales;
	private double humedadMaxima;
	private double humedadMinima;
	
	public HistorialDeHumedad(int cantidadDeHumedades){
		this.humedades = new double[cantidadDeHumedades];
	}
	public void ingresarHumedades(double humedad,int posicion){
		this.humedades[posicion] = humedad;
	}
	public double calcularHumedadPromedio(){
		this.humedadesTotales = 0;
		for(int i=0;i<this.humedades.length;i++){
			this.humedadesTotales = this.humedades[i];
		}
		return (this.humedadesTotales/this.humedades.length);
	}
	public double calcularHumedadMaxima(){
		this.humedadMaxima = 0;
		for(int i=0;i<this.humedades.length;i++){
			if(this.humedades[i] > humedadMaxima){
				this.humedadMaxima = this.humedades[i];
			}
		}
		return this.humedadMaxima;
		
	}
	public double calcularHumedadMinima(){
		this.humedadMinima = 100;
		for(int i=0;i<this.humedades.length;i++){
			if(this.humedades[i] < humedadMinima){
				this.humedadMinima = this.humedades[i];
			}
		}
		return this.humedadMinima;
		
	}

}
