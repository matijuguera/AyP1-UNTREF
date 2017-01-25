
class DefenderBaseSecundaria {
	Nave nave = new Nave();
	Radar radar = nave.obtenerRadar();
	
	public void ejecutar(){
		nave.despegar();
		irContenedorEste();
		nave.avanzarAlNorte(); //Esquivar el contenedor
		nave.avanzarAlEste(); //Se posicione arriba del contenedor
		irAsteroideNorte();
		irNaveEnemigaEste();
		destruirNavesEnemiga();
	}
	private void irContenedorEste(){
		while(radar.escanearEste() != Espectro.CONTENEDOR){
			nave.avanzarAlEste();
		}
	}
	private void irAsteroideNorte(){
		while(radar.escanearNorte() != Espectro.ASTEROIDE){
			nave.avanzarAlNorte();
		}
	}
	private void irNaveEnemigaEste(){
		while(radar.escanearEste() != Espectro.NAVE){
			nave.avanzarAlEste();
		}
	}
	private void destruirNavesEnemiga(){
		while(radar.escanearEste() != Espectro.VACIO){
			while(radar.escanearEste() == Espectro.NAVE){
				nave.atacarAlEste();
			}
			nave.avanzarAlEste();
		}
		while(radar.escanearNorte() != Espectro.VACIO){
			while(radar.escanearNorte() == Espectro.NAVE){
				nave.atacarAlNorte();
			}
			nave.avanzarAlNorte();
		}
		while(radar.escanearOeste() != Espectro.VACIO){
			while(radar.escanearOeste() == Espectro.NAVE){
				nave.atacarAlOeste();
			}
			nave.avanzarAlOeste();
		}
		while(radar.escanearSur() != Espectro.VACIO){
			while(radar.escanearSur() == Espectro.NAVE){
				nave.atacarAlSur();
			}
			nave.avanzarAlSur();
		}
	}	
}
