
class MisionZigZag {
	Nave nave = new Nave();
	Radar radar = nave.obtenerRadar();
	int Pasos = 1;
	
	public void ejecutar(int cantidad){
		nave.despegar();
		nave.avanzarAlNorte();
		for(int i=0;i<cantidad;i++){
			bucle();
		}
	}

	private void bucle() {
		pasosEste();
		pasosOeste();
	}

	private void pasosEste() {
	
		for(int i=0; i<Pasos;i++){
			nave.avanzarAlEste();
		}
		Pasos++;
		nave.avanzarAlNorte();
	}

	private void pasosOeste() {
		for(int i=0; i<Pasos;i++){
			nave.avanzarAlOeste();
		}
		Pasos++;
		nave.avanzarAlNorte();
	}
	

}
