
class MisionDestruirAsteroideDOS {
	Nave nave = new Nave();
	Radar radar = nave.obtenerRadar();
	
	void ejecutar(){
		avanzarSemiCuadrado();
		avanzarSemiCuadrado();
		avanzarSemiCuadrado();
		avanzarSemiCuadrado();
		destruirAsteroide();	
		nave.avanzarAlSur();
		VolverSemiCuadrado();
		VolverSemiCuadrado();
		VolverSemiCuadrado();
		FinVolverSemiCuadrado();
		

		}

	private void FinVolverSemiCuadrado() {
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlOeste();
		nave.avanzarAlOeste();
		nave.avanzarAlNorte();
	}

	private void destruirAsteroide() {
		while(radar.escanearSur() == Espectro.ASTEROIDE){
			nave.atacarAlSur();
		}
	}

	private void avanzarSemiCuadrado() {
		nave.avanzarAlSur();
		nave.avanzarAlSur();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
		nave.avanzarAlSur();
		nave.avanzarAlSur();
		nave.avanzarAlOeste();
		nave.avanzarAlOeste();
	}
	private void VolverSemiCuadrado() {
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlOeste();
		nave.avanzarAlOeste();
		nave.avanzarAlNorte();
		nave.avanzarAlNorte();
		nave.avanzarAlEste();
		nave.avanzarAlEste();
	}
	
}

	


