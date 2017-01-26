
class MisionRecolectarMetal {
	Nave miNave = new Nave();
	Nave miNave2 = new Nave();

	void ejecutar(){
		miNave.obtenerRadar();
		miNave2.obtenerRadar();
		miNave.despegar();
		miNave2.despegar();
		
		for(int Pasos = 0; Pasos < 20; Pasos ++){
			miNave.avanzarAlEste();
		}
			miNave.avanzarAlSur();
			miNave.avanzarAlSur();
			miNave.avanzarAlSur();
			miNave.avanzarAlEste();
			miNave2.avanzarAlSur();
			miNave.cargarDesdeSur(Sustancia.METAL, 2);
		for(int Pasos = 0; Pasos < 19; Pasos ++){
			miNave2.avanzarAlEste();
		}
			miNave2.avanzarAlSur();
			miNave2.avanzarAlSur();
			miNave2.avanzarAlSur();
			miNave2.avanzarAlEste();
			miNave2.cargarDesdeEste(Sustancia.METAL, 2);
		////////////////////----VUELTA------/////////////////
			miNave.avanzarAlOeste();
			miNave.avanzarAlNorte();
			miNave.avanzarAlNorte();
			miNave.avanzarAlNorte();
			miNave2.avanzarAlOeste();
			miNave2.avanzarAlNorte();
			miNave2.avanzarAlNorte();
			miNave2.avanzarAlNorte();
		for(int Pasos2 = 0; Pasos2 < 20; Pasos2 ++){
			miNave.avanzarAlOeste();
		}
			miNave.descargarEnOeste(Sustancia.METAL, 2);
		for(int Pasos2 = 0; Pasos2 < 19; Pasos2 ++){
			miNave2.avanzarAlOeste();
		} 
			miNave2.descargarEnNorte(Sustancia.METAL, 2);
		
			}
}
