class MisionEspiral {

	/**
	 * @pre: la nave está al Norte del objeto a ESPIRALAR
	 * @param miNave: la nave que se va a mover
	 * @param n: la cantidad de vueltas a realizar
	 */
	public void ejecutar(Nave miNave, int n) {
		
		int pasos = 1;
		avanzarAlEste(miNave, pasos);

		for(int i = 0; i < n; i++) {
			pasos = vuelta(miNave, pasos);
		}
		
	}

	private int vuelta(Nave miNave, int pasos) {
		pasos = parteDeAbajo(miNave, pasos);
		pasos = parteDeArriba(miNave, pasos);
		return pasos;
	}

	private int parteDeArriba(Nave miNave, int pasos) {
		pasos++;
		avanzarAlNorte(miNave, pasos);
		avanzarAlEste(miNave, pasos);
		return pasos;
	}

	private int parteDeAbajo(Nave miNave, int pasos) {
		pasos++;
		avanzarAlSur(miNave, pasos);
		avanzarAlOeste(miNave, pasos);
		return pasos;
	}

	private void avanzarAlNorte(Nave miNave, int pasos) {
		for (int i = 0; i < pasos; i++) {
			miNave.avanzarAlNorte();
		}
	}

	private void avanzarAlOeste(Nave miNave, int pasos) {
		for (int i = 0; i < pasos; i++) {
			miNave.avanzarAlOeste();
		}
	}

	private void avanzarAlSur(Nave miNave, int pasos) {
		for (int i = 0; i < pasos; i++) {
			miNave.avanzarAlSur();
		}
	}

	private void avanzarAlEste(Nave miNave, int pasos) {
		for (int i = 0; i < pasos; i++) {
			miNave.avanzarAlEste();
		}
	}
	
}
