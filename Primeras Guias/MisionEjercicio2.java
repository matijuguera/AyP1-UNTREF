
class MisionEjercicio2 {
	Nave nave = new Nave();
	Radar radar = nave.obtenerRadar();
	
	void ejecutar(){
		IrNorteHastaAsteroide();
		IrEsteEscaneandoContenedorAlNorte();
		IrSurHastaAsteroide();
		IrOesteEscaneandoNaves();
		
	}
	void IrNorteHastaAsteroide(){
		while(radar.escanearNorte() != Espectro.ASTEROIDE){
			nave.avanzarAlNorte();
		}
	}
	void IrEsteEscaneandoContenedorAlNorte(){
		while(radar.escanearNorte() != Espectro.CONTENEDOR){
			nave.avanzarAlEste();
		}
	}
	void IrSurHastaAsteroide(){
		while(radar.escanearSur() != Espectro.ASTEROIDE){
			nave.avanzarAlSur();		
		}
	}
	void IrOesteEscaneandoNaves(){
		while(radar.escanearSur() != Espectro.VACIO){
			while(radar.escanearSur() != Espectro.NAVE){
				nave.avanzarAlOeste();
				while(radar.escanearSur() == Espectro.NAVE){
					nave.atacarAlSur();
				}
			}	
		}
	}
}

