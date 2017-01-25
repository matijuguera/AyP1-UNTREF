public class Cubo{
	private double lado;
	private double superficieCara;
	private double volumen;
	public Cubo(double lado){
		if(lado <= 0){
			throw new Error("Poner una medida mayor a 0");
			}
			this.lado = lado;
	}
	public double medirLongitudLado(){
		return lado;
	}
	public void cambiarLongituLado(double lado){
		if(lado <= 0){
			throw new Error("Poner una medida mayor a 0");
			}
			this.lado = lado;
	}
	public double medirSuperficieCara(){
		superficieCara = lado * lado * 6;
		return superficieCara;
	}
	public void cambiarSuperficieCara(double superficieCara){
		if(superficieCara <= 0){
			throw new Error("Poner una medida mayor a 0");
			}
			this.superficieCara = superficieCara;
			lado = Math.sqrt(superficieCara/6);
	}
	public double medirVolumen(){
		volumen = lado * lado * lado;
		return volumen;
	}
	public void cambiarVolumen(double volumen){
		if(volumen <= 0){
			throw new Error("Poner una medida mayor a 0");
			}
			this.volumen = volumen;
			lado = Math.pow(volumen, 1.0/3.0); 		
	}
} //La Superficie es proporcional a el volumen y viceversa.
