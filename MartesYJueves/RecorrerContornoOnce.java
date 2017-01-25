
class RecorrerContornoOnce {
	Nave Juan = new Nave();
	Radar miRadar = Juan.obtenerRadar();
	
	void ejecutar(){
		Juan.despegar();
		for(int recorridototal=0;recorridototal<4;recorridototal++){	
			for(int vueltasBase=0;vueltasBase<3;vueltasBase++){
				VueltasBase();
			}
			for(int VueltasContorno=0;VueltasContorno<3;VueltasContorno++){	
				IrHastaElContornoEste();
				RecorrerElNorte();
				RecorrerElOeste();
				RecorrerElSur();
				RecorrerElEste();
				RecorrerElNorte();
			}
		}

	}
	
	void RecorrerElOeste(){
		while(miRadar.escanearOeste() != Espectro.DESCONOCIDO) {//VA AL OESTE
			
			while (miRadar.escanearOeste() == Espectro.VACIO){
				Juan.avanzarAlOeste();
			}
			while (miRadar.escanearOeste() == Espectro.ASTEROIDE||miRadar.escanearOeste() == Espectro.CONTENEDOR||miRadar.escanearOeste() == Espectro.BASE){
				Juan.atacarAlOeste();
			}
		}
	}
	void IrHastaElContornoEste(){
		while(miRadar.escanearEste() != Espectro.DESCONOCIDO) {
			
			while (miRadar.escanearEste() == Espectro.VACIO){
				Juan.avanzarAlEste();
			}
			while (miRadar.escanearEste() == Espectro.ASTEROIDE ){
				Juan.atacarAlEste();
			}
		}
	}
	void RecorrerElSur(){
		while(miRadar.escanearSur() != Espectro.DESCONOCIDO) {//VA AL SUR
			
			while (miRadar.escanearSur() == Espectro.VACIO){
				Juan.avanzarAlSur();
			}
			while (miRadar.escanearSur() == Espectro.ASTEROIDE||miRadar.escanearSur() == Espectro.CONTENEDOR||miRadar.escanearSur() == Espectro.BASE){
				Juan.atacarAlSur();
			}
		}
	}
	void RecorrerElEste(){
		while(miRadar.escanearEste() != Espectro.DESCONOCIDO) {//VA AL ESTE
			
			while (miRadar.escanearEste() == Espectro.VACIO){
				Juan.avanzarAlEste();
			}
			while (miRadar.escanearEste() == Espectro.ASTEROIDE||miRadar.escanearEste() == Espectro.CONTENEDOR||miRadar.escanearEste() == Espectro.BASE){
				Juan.atacarAlEste();
			}
		}
	}
	void RecorrerElNorte(){
		while(miRadar.escanearNorte() != Espectro.DESCONOCIDO) {//VA AL NORTE
			
			while (miRadar.escanearNorte() == Espectro.VACIO){
				Juan.avanzarAlNorte();
			}
			while (miRadar.escanearNorte() == Espectro.ASTEROIDE||miRadar.escanearNorte() == Espectro.CONTENEDOR||miRadar.escanearNorte() == Espectro.BASE){
				Juan.atacarAlNorte();
			}
		}
	}
	void VueltasBase(){
		Juan.avanzarAlNorte();
		Juan.avanzarAlEste();
		Juan.avanzarAlSur();
		Juan.avanzarAlSur();
		Juan.avanzarAlOeste();
		Juan.avanzarAlOeste();
		Juan.avanzarAlNorte();
		Juan.avanzarAlNorte();
		Juan.atacarAlEste();
		}
}
