class MisionAsteroidesNorte {

	public void ejecutarMision() {

		Nave nave = new Nave();

		Radar radar = nave.obtenerRadar();
		
		nave.despegar();
		
		while(radar.escanearNorte() != Espectro.DESCONOCIDO) {
			
			while (radar.escanearNorte() == Espectro.VACIO){
				nave.avanzarAlNorte();
			}
			while (radar.escanearNorte() == Espectro.ASTEROIDE ){
				nave.atacarAlNorte();
			}
		}		
			
		}
	}
