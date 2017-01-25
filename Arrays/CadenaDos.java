
class CadenaDos {
	private EslabonDos[] eslabones;
	private EslabonDos eslabon;
	private double longitudTotal;
	
	public CadenaDos(double[] longitudesDeEslabones){
		this.eslabones = new EslabonDos[longitudesDeEslabones.length];
		for(int i=0;i<eslabones.length;i++){
			eslabon = new EslabonDos(i+1,longitudesDeEslabones[i]);
			eslabones[i] = eslabon;
		}
		
	}
	public int contarCantidadDeEslabones(){
		return eslabones.length;
	}
	public EslabonDos obtenerEslabon(int numero){
		if(numero < 1 || numero > eslabones.length){
			throw new Error("Numero esta comprendido entre 1 y "+ eslabones.length);
		}
		return this.eslabones[numero-1];
	}
	public double obtenerLongitud(){
		for(EslabonDos eslabon:eslabones){
			this.longitudTotal += eslabon.obtenerLongitud();
		}
		return this.longitudTotal;
		
	}
	public int contarEslabonesConLongitudSuperiorA(double longitudMinima){
		int contador = 0;
		for(EslabonDos eslabon:eslabones){
			if(eslabon.obtenerLongitud() > longitudMinima){
				contador++;
			}
		}
		return contador;
	}
}
