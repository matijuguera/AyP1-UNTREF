
class PlanDeEstudio {
	private int contador;
	private int[][] cantidadDeDias;

	public PlanDeEstudio(int cantidadDeDias){
		if(cantidadDeDias < 1){
		throw new Error("Ingresar cantidad de dias mayores a 0");
		}
		this.cantidadDeDias = new int[cantidadDeDias][2];
	}
	public void almacenarHorasDeEstudioPlanificadas(int dia,int horas){
		this.cantidadDeDias[dia-1][0] = horas; //posicion 0 es de horas planificadas;
	}
	
	public void almacenarHorasEfectivasDeEstudio(int dia,int horas){
		this.cantidadDeDias[dia-1][1] = horas; //posicion 1 es de horas que se estudiaron;
	}
	public int getHorasEstudiadas(int dia){
		return this.cantidadDeDias[dia-1][1];
	}
	public int getHorasTotalesEstudiadas(){
		this.contador = 0;
		for(int i=0;i<cantidadDeDias.length;i++){
			this.contador += cantidadDeDias[i][1];	
		}
		return this.contador;
	}
	public int  getHorasEstudiadasSuperanHorasPlanificadas(){
		this.contador = 0;
		for(int i=0;i<cantidadDeDias.length;i++){
			if(this.cantidadDeDias[i][1] > this.cantidadDeDias[i][0] ){
				contador++;
			}
		}
		return contador;
	}
	public int getMaximaHoraDeDiferenciaEntreEstudiadasYPlanificadas(){
		this.contador = 0;
		for(int i=0;i<cantidadDeDias.length;i++){
			if(cantidadDeDias[i][0] > cantidadDeDias[i][1] && this.cantidadDeDias[i][0] - this.cantidadDeDias[i][1] > this.contador)
			this.contador = this.cantidadDeDias[i][0] - this.cantidadDeDias[i][1];
		}
		
		
		return this.contador;
	}
	

}
