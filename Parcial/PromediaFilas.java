import java.util.Arrays;


class PromediaFilas {
	private double[] matrizPromedio;
	private double filapromedio;
	private double valorDeFila;
	
	private void promediarfilaIndividual(int numeroDeFila,double[][] matriz ){
		
			for(int j=0;j<matriz[numeroDeFila].length;j++){
				this.filapromedio += (matriz[numeroDeFila][j]);
			}
			this.valorDeFila = this.filapromedio/matriz[numeroDeFila].length;
	}	
	
	public double[] promediarFilas(double[][] matriz){
		this.matrizPromedio = new double[matriz.length];
		for(int i=0;i<matriz.length;i++){
			promediarfilaIndividual(i,matriz);
			this.matrizPromedio[i] = this.valorDeFila;
			this.filapromedio = 0;
		}
		System.out.println(Arrays.toString(this.matrizPromedio));
		return this.matrizPromedio;
	}
	

}
