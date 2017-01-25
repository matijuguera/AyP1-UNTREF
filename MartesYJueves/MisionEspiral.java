
class MisionEspiral {
	int pasos = 1;
	
	
	public void ejecutar(Nave nave){
		nave.despegar();
		nave.avanzarAlNorte();
		for(int i=0;i<2;i++){
			giroCompleto(nave);
		}
		medioGiro(nave);
		
	}


	private void giroCompleto(Nave nave) {
		for(int i=0;i<pasos;i++){
			nave.avanzarAlEste();
		}pasos++;
		for(int i=0;i<pasos;i++){
			nave.avanzarAlSur();
		}
		for(int i=0;i<pasos;i++){
			nave.avanzarAlOeste();
		}pasos++;
		for(int i=0;i<pasos;i++){
			nave.avanzarAlNorte();
		}
	}
	private void medioGiro(Nave nave){
		for(int i=0;i<pasos;i++){
			nave.avanzarAlEste();
		}pasos++;
		for(int i=0;i<pasos;i++){
			nave.avanzarAlSur();
		}
		nave.avanzarAlOeste();
	}

}
