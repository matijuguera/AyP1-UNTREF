class ExpedicionOeste {
	int pasos;
	public int explorar(Nave explorador,int frecuencia,int amplitud){
		explorador.despegar();
		Radar radar = explorador.obtenerRadar();
		while(radar.escanearEste()==Espectro.VACIO){
		irAlEste(explorador,frecuencia,radar);
		secuenciaNorteYSur(explorador,amplitud);
		}
		return pasos;
	}
	private void irAlEste(Nave explorador,int frecuencia,Radar radar){
		for(int i=0;(i<frecuencia)&&(radar.escanearEste()==Espectro.VACIO);i++){
			explorador.avanzarAlEste();
			pasos++;
			
		}
	}
	private void secuenciaNorteYSur(Nave explorador,int amplitud){
		for(int i=0;i<amplitud;i++){
			explorador.avanzarAlNorte();
			pasos++;
		}
		explorador.avanzarAlEste();
		pasos++;
		for(int i=0;i<(amplitud*2);i++){
			explorador.avanzarAlSur();
			pasos++;
		}
		explorador.avanzarAlEste();
		pasos++;
		for(int i=0;i<amplitud;i++){
			explorador.avanzarAlNorte();
			pasos++;
	}
}

}
