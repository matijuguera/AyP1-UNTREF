class Disco {
	private double radioInterior;
	private double radioExterior;
	public Disco(double radioInterior,double radioExterior){
		if(radioInterior<=0 && radioExterior<=0){
			throw new Error("Ingresar radios mayores a 0 y Enteros");
		}
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	public double consultarRadioInterior(){
		return radioInterior;
	}
	public double consultarRadioExterior(){
		return radioExterior;
	}
	public double perimetroInterior(){
		return 2 * Math.PI * radioInterior;
	}
	public double perimetroExterior(){
		return 2 * Math.PI * radioExterior;
	}
	public double superficieTotal(){
		return (radioInterior + radioExterior) * (radioInterior + radioExterior) * Math.PI;
	}
}