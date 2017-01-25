
class MisionRecolectarParcial {
	int pasosOeste;
	int pasosSur;
	
	public int ejecutar(Nave navePiloteada){
		Radar radar = navePiloteada.obtenerRadar();
		irHastaAsteroideSur(navePiloteada,radar);
		destruirYavanzarAsteroideSur(navePiloteada,radar);
		irOesteYEscanearAlSur(navePiloteada,radar);
		destruirAsteroideSur(navePiloteada,radar);
		escanearContenedorYcargar(navePiloteada,radar);
		volverPosicionInicial(navePiloteada,radar);
		return (pasosOeste + pasosSur)*2;
	}
	private void irHastaAsteroideSur(Nave navePiloteada,Radar radar){
		while(radar.escanearSur() != Espectro.ASTEROIDE){
			navePiloteada.avanzarAlSur();
			pasosSur++;
		}
	}
	private void destruirYavanzarAsteroideSur(Nave navePiloteada,Radar radar){
		while(radar.escanearSur() != Espectro.VACIO){
			while(radar.escanearSur() == Espectro.ASTEROIDE){
				navePiloteada.atacarAlSur();
			}
			navePiloteada.avanzarAlSur();
		}
	}
	private void irOesteYEscanearAlSur(Nave navePiloteada,Radar radar){
		while(radar.escanearSur() != Espectro.ASTEROIDE){
			navePiloteada.avanzarAlOeste();
			pasosOeste++;
		}
		navePiloteada.avanzarAlOeste();
		pasosOeste++;
	}
	private void destruirAsteroideSur(Nave navePiloteada,Radar radar){
		while(radar.escanearSur() == Espectro.ASTEROIDE){
			navePiloteada.atacarAlSur();
		}
		navePiloteada.avanzarAlSur();
		pasosSur++;
	}
	private void escanearContenedorYcargar(Nave navePiloteada,Radar radar){
		if(radar.buscarAlSur(Sustancia.ANTIMATERIA) > 0){
			navePiloteada.cargarDesdeSur(Sustancia.ANTIMATERIA, 100);
		}else{
			navePiloteada.atacarAlSur();
		}
	}
	private void volverPosicionInicial(Nave navePiloteada,Radar radar){
		for(int i=0;i<pasosSur;i++){
			navePiloteada.avanzarAlNorte();
		}
		for(int i=0;i<pasosOeste;i++){
			navePiloteada.avanzarAlEste();
		}
	}
	
}
