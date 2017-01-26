
class MisionRecolectarDestruyendo {
	Nave nave = new Nave();
	Radar radar = nave.obtenerRadar();
	int PasosOeste = 0;
	int PasosSur = 0;
	
	
	public void ejecutar(){
		nave.despegar();
		avanzarYDestruirAsteroideNorte();
		avanzarEsteYEscanearNorte();
		avanzarYDestruirAsteroideNorte();
		avanzarEsteYEscanearNorte();
		avanzarYDestruirAsteroideNorte();
		nave.avanzarAlNorte();
		nave.cargarDesdeNorte(Sustancia.ANTIMATERIA, 10);
		volverABase();
		}
	
	
	private void avanzarYDestruirAsteroideNorte(){
		while(radar.escanearNorte() != Espectro.ASTEROIDE){
			nave.avanzarAlNorte();
			PasosSur++;
		}
		while(radar.escanearNorte() != Espectro.VACIO){
			while(radar.escanearNorte() == Espectro.ASTEROIDE){
				nave.atacarAlNorte();
			}
			nave.avanzarAlNorte();
			PasosSur++;
		} 
	}
	private void avanzarEsteYEscanearNorte(){
		while(radar.escanearNorte() != Espectro.ASTEROIDE){
			nave.avanzarAlEste();
			PasosOeste++;
		}
	}
	private void volverABase(){
		for(int i=0 ; i<PasosSur;i++){
			nave.avanzarAlSur();
		}
		for(int i=0 ; i<PasosOeste; i++){
			nave.avanzarAlOeste();
		}
		
		
	}
	

}
