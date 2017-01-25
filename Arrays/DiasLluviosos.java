class DiasLluviosos {
	private boolean[] dias = new boolean[364];
	private int diasQueLlovio;
	private int primerDia;
	private int primerDiaConLluvia;
	private int primerCuatri;
	private int segundoCuatri;
	private int tercerCuatri;

	
	public void registrarQueLlovioElDia(int diaDeAño, boolean llovio){
		this.dias[diaDeAño] = llovio;
		if(llovio){
			this.diasQueLlovio++;
		}
		
		
	}
	public boolean consultarSiLlovioDia(int diaDelAño){
		return this.dias[diaDelAño];
		
	}
	public int contarDiasLluviosos(){
		return this.diasQueLlovio;
	}
	public int consultarCuatrimestreMasLluvioso(){
		for(int i=0;i<120;i++){
			if(dias[i]){
				primerCuatri++;
			}
			
		}
		for(int i=120;i<243;i++){
			if(dias[i]){
				segundoCuatri++;
			}
		}
		for(int i=243;i<364;i++){
			if(dias[i]){
				tercerCuatri++;
			}
		}
		if(primerCuatri>segundoCuatri&&primerCuatri>tercerCuatri){
			return 1;
		}
		if(segundoCuatri>primerCuatri&&segundoCuatri>tercerCuatri){
			return 2;
		}
		if(tercerCuatri>primerCuatri&&tercerCuatri>segundoCuatri){
			return 3;
		}
		if(primerCuatri==segundoCuatri&&primerCuatri>tercerCuatri){
			return 12;
		}
		if(primerCuatri==tercerCuatri&&primerCuatri>segundoCuatri){
			return 13;
		}
		if(segundoCuatri==tercerCuatri&&segundoCuatri>primerCuatri){
			return 23;
		}
		if(primerCuatri==tercerCuatri&&primerCuatri==segundoCuatri&&segundoCuatri==tercerCuatri&&primerCuatri!=0){
			return 123;//los tres son iguales, pero tendria que llover minimo 1 vez.
		}

		return 0;//no llovio nunca
		

		
	}
	public int consultarPrimerDiaConLluvia(){
		primerDia=0;
		while(!dias[primerDia] && this.primerDia < 364){
			if(dias[primerDia]){
				this.primerDiaConLluvia = primerDia;
			}
			primerDia++;
		}
			return primerDiaConLluvia;
	}
}
//si o si recorrer todo el vector
// while recorrez con condicion