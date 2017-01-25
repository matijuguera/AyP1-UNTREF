class MisionAlcanzarMargeEste {

	public void ejecutarMision() {

		Nave nave = new Nave();

		Radar radar = nave.obtenerRadar();
		
		nave.despegar();
		
		while(radar.escanearEste() != Espectro.DESCONOCIDO) {
			
			while (radar.escanearEste() == Espectro.VACIO){
				nave.avanzarAlEste();
			}
			while (radar.escanearEste() == Espectro.ASTEROIDE ){
				nave.atacarAlEste();
			}
		}
			
			//escanear si hay algo adelante bentonces disparo
			
			
		}
	}