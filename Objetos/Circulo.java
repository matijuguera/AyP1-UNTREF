class Circulo {
	private double radio;
	public Circulo(double radio){
		if(radio<=0){
			throw new Error("Ingresar un radio mayor a 0");
		}
		this.radio = radio;
	}
	public double radio(){
		return radio;
	}
	public double consultarDiametro(){
		return radio * radio;
	}
	public double consultarPerimetro(){
		return 2 * Math.PI * radio;
	}
	public double consultarSuperficie(){
		return Math.PI * radio * radio;
	}
}
