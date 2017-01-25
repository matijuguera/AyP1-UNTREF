
class CargarAntimateria {
	
	public void ejecutarMision() {

		Nave nave = new Nave();

		Radar radar = nave.obtenerRadar();
		
		nave.despegar();

		for (int pasos = 1; pasos < 3; pasos++){
			nave.avanzarAlOeste();
		}
		nave.avanzarAlSur();
		
		if (radar.buscarAlSur(Sustancia.ANTIMATERIA)<100){
			for (int pasosbis = 1; pasosbis < 3; pasosbis++){
				nave.avanzarAlEste();
			}
			nave.avanzarAlNorte();
			
		}
	
	}
}
