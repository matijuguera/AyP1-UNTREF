
class MisionRecolectar {
	Nave miNave = new Nave();
	Radar miRadar = miNave.obtenerRadar();
	int pasos = 0;
	
	void ejecutar() {
		miNave.despegar();
		irHaciaElSurHastaAsteroides();
		destruirAsteroidesSur();
		avanzarAlEsteYCargarSustancia();
		volverABase();
	}
	
	void irHaciaElSurHastaAsteroides(){
		while(miRadar.escanearSur() != Espectro.ASTEROIDE){
				miNave.avanzarAlSur();

		}
	}
	void destruirAsteroidesSur(){
		while(miRadar.escanearSur() != Espectro.VACIO){
			while(miRadar.escanearSur() == Espectro.ASTEROIDE){
				miNave.atacarAlSur();
			}
			miNave.avanzarAlSur();
		}
	}

	void avanzarAlEsteYCargarSustancia(){
		while(miRadar.escanearEste() != Espectro.CONTENEDOR){
			while(miRadar.escanearEste() == Espectro.VACIO){
				miNave.avanzarAlEste();
				pasos++;
			}	
			while(miRadar.escanearEste() == Espectro.ASTEROIDE){
				miNave.atacarAlEste();
			}

		}
		miNave.cargarDesdeEste(Sustancia.ANTIMATERIA, 10); //Carga 10 de ANTIMATERIA
	}	
	void volverABase(){
		for(int i=0; i<pasos ;i++){
			miNave.avanzarAlOeste();
		}
		while(miRadar.escanearNorte() != Espectro.BASE)
			miNave.avanzarAlNorte();
		}

}





