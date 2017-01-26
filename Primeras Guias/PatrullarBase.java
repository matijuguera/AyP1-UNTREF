
class PatrullarBase {

	Nave Juan = new Nave();
	Radar miRadar = Juan.obtenerRadar();
	
	void ejecutar(){
		Juan.despegar();
		Juan.avanzarAlNorte();
		Juan.avanzarAlNorte();
		Juan.avanzarAlNorte();
		for(int vueltas = 0; vueltas < 3;vueltas++){
			Juan.avanzarAlEste();
			Juan.avanzarAlEste();
			Juan.avanzarAlEste();
			for(int i=0; i<6; i++){
				Juan.avanzarAlSur();
			}
			for(int i=0;i < 6; i++){
			Juan.avanzarAlOeste();
			}
			Juan.avanzarAlNorte();
			Juan.avanzarAlNorte();
			Juan.avanzarAlNorte();
			while(miRadar.escanearNorte() != Espectro.VACIO){
				Juan.atacarAlNorte();
			}
			Juan.avanzarAlNorte();
			Juan.avanzarAlNorte();
			Juan.avanzarAlNorte();
			Juan.avanzarAlEste();
			Juan.avanzarAlEste();
			Juan.avanzarAlEste();
		}
		
	}
	
	
	
	
}
