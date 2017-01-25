
class MisionRebote {
	int pasos = 1;
	
	public void ejecutar(Nave miNave, int rebotes){
		for(int i=0;i<rebotes;i++){
			rebotes(miNave);
		}

		
	}

	private void rebotes(Nave miNave) {
		subirNave(miNave);
		bajarNave(miNave);
	}

	private void bajarNave(Nave miNave) {
		for(int bajar=0;bajar<pasos;bajar++){
			miNave.avanzarAlSur();
		}
		pasos++;
	}

	private void subirNave(Nave miNave) {
		for(int subir=0;subir<pasos;subir++){
			miNave.avanzarAlNorte();
		}
		pasos++;
	}

}
