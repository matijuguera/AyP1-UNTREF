
class reboteConParametros {

	public  void ejecutar(Nave navecita){

//		navecita = new Nave();
		//navecita.despegar();
		

		misionRebote(navecita);
	}

	
	
	public void misionRebote(Nave navecita ){
		
		Radar radarNavecita; 
		radarNavecita = navecita.obtenerRadar();
		
		
		//Veces que rebota

		navecita.avanzarAlNorte();

		for(int i=0; i<10; i++){

			//subir
			for(int u=0; u<i; u+=1){
				if(radarNavecita.escanearNorte() == Espectro.VACIO){
					navecita.avanzarAlNorte();
				}
			}

			//bajar
			for(int j=0; j<i; j+=1){
				if(radarNavecita.escanearNorte() == Espectro.VACIO){
					navecita.avanzarAlSur();

				}
			}


		}
	}		
}


