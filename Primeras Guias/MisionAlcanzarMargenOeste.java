class MisionAlcanzarMargenOeste {

	public void ejecutarMision() {

		Nave nave = new Nave();

		Radar radar = nave.obtenerRadar();
		
		nave.despegar();
		
		while(radar.escanearOeste() != Espectro.DESCONOCIDO) {
			
			while (radar.escanearOeste() == Espectro.VACIO){
				nave.avanzarAlOeste();
			}
			while (radar.escanearOeste() == Espectro.ASTEROIDE ){
				nave.atacarAlEste();
			}
		}		
			
		}
	}
