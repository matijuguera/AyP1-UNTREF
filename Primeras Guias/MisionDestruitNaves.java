
class MisionDestruitNaves {
	public void ejecutar(Nave nave){
		nave.despegar();
		Radar radar = nave.obtenerRadar();
		avanzarLineaDeAsteroides(nave,radar);
		destruirAsteroide(nave,radar);
		avanzarLineaDeAsteroides(nave,radar);
		destruirAsteroide(nave,radar);
		avanzarHastaNavesEnemigas(nave,radar);
		destruirNavesEnemigas(nave,radar);
	}
	private void avanzarLineaDeAsteroides(Nave nave,Radar radar){
		while(radar.escanearOeste() != Espectro.ASTEROIDE){
			nave.avanzarAlOeste();
		}
	}
	private void destruirAsteroide(Nave nave,Radar radar){	
		while(radar.escanearOeste() != Espectro.VACIO){
			while(radar.escanearOeste() == Espectro.ASTEROIDE){
				nave.atacarAlOeste();
			}
			nave.avanzarAlOeste();
			nave.avanzarAlOeste();	
		}
	}
	private void avanzarHastaNavesEnemigas(Nave nave,Radar radar){
		while(radar.escanearNorte() != Espectro.NAVE){
			nave.avanzarAlNorte();
		}
	}
	private void destruirNavesEnemigas(Nave nave,Radar radar){
		while(radar.escanearNorte() != Espectro.VACIO){
			while(radar.escanearNorte() == Espectro.NAVE){
				nave.atacarAlNorte();
			}
				nave.avanzarAlNorte();

		}
	}
	
}


