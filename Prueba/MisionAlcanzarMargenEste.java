
class MisionAlcanzarMargenEste {
	Nave miNave = new Nave();
	Radar miRadar = miNave.obtenerRadar();

	void ejecutar(){
		miNave.despegar();

while(miRadar.escanearEste() == Espectro.VACIO){
			miNave.avanzarAlEste();
			
				
			while (miRadar.escanearEste() != Espectro.VACIO){
					miNave.atacarAlEste();
			}
		}
	}
}

