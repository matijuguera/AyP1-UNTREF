package juego;

import javax.swing.JOptionPane;

/**
 * Juego Cuatro en Línea
 * 
 * Fecha de Entrega: 17/11/2016
 * 
 * 
 * Alumnos:
 * 			- Matías Juguera.
 * 			- Matías Bellotti.
 * 			- Nicolas Hansen.
 * 
 * Reglas:  
 * 			- Se empieza con el tablero vacío.
 * 			- Solo se admite dos jugadores.
 * 			- Cada jugador debe apretar el boton "Soltar"(en la columna que usted quiera) 1 vez por turno, empezando con el jugador Rojo y luego el Amarillo.
 * 			- El jugadores que coloca cuatro fichas en una línea contínua vertical, horizontal o diagonalmente, Gana la partida.	
 * 			- En el caso de que se llenen los casilleros del tablero sin haber cumplido con la condicion anterior,la partida finaliza en empate.
 */
public class CuatroEnLinea {
	private String jugadorRojo;
	private String jugadorAmarillo;
	private Casillero[][] tablero;
	private boolean tiroElRojo;
	private String ganador;
	/**
	 * pre : 'filas' y 'columnas' son mayores o iguales a 4.
	 * post: empieza el juego entre el jugador que tiene fichas rojas, identificado como 
	 * 		 'jugadorRojo' y el jugador que tiene fichas amarillas, identificado como
	 * 		 'jugadorAmarillo'. 
	 * 		 Todo el tablero está vacío.
	 * 
	 * @param filas : cantidad de filas que tiene el tablero.
	 * @param columnas : cantidad de columnas que tiene el tablero.
	 * @param jugadorRojo : nombre del jugador con fichas rojas.
	 * @param jugadorAmarillo : nombre del jugador con fichas amarillas.
	 */
	public CuatroEnLinea(int filas, int columnas, String jugadorRojo, String jugadorAmarillo) {
		if(filas < 4 && columnas < 4){
			JOptionPane.showMessageDialog(null, "Las Filas y las Columnas deben ser mayores a 4.", "Error", JOptionPane.WARNING_MESSAGE);
			throw new Error("Las Filas y las Columnas deben ser mayores a 4"); 
		}else if(filas < 4){
			JOptionPane.showMessageDialog(null, "Las Filas deben ser mayores a 4.", "Error", JOptionPane.WARNING_MESSAGE);
			throw new Error("Las Filas deben ser mayores a 4"); 
		}else if(columnas < 4){
			JOptionPane.showMessageDialog(null, "Las Columnas deben ser mayores a 4.", "Error", JOptionPane.WARNING_MESSAGE);
			throw new Error("Las Columnas deben ser mayores a 4"); 
		}
		this.tablero = new Casillero[filas][columnas];
		this.jugadorRojo = jugadorRojo;
		this.jugadorAmarillo = jugadorAmarillo;
		this.tiroElRojo = false;
		
		for(int i = 0; i <tablero.length; i++){ //Llena el tablero de casilleros vacios.
			for(int j = 0; j < tablero[i].length; j++){
				this.tablero[i][j] = Casillero.VACIO;
			}
		}
		
	}

	/**
	 * post: devuelve la cantidad máxima de fichas que se pueden apilar en el tablero.
	 */
	public int contarFilas() {
		
		return tablero.length;
	}

	/**
	 * post: devuelve la cantidad máxima de fichas que se pueden alinear en el tablero.
	 */
	public int contarColumnas() {
		
		return tablero[0].length;
	}

	/**
	 * pre : fila está en el intervalo [1, contarFilas()],
	 * 		 columnas está en el intervalo [1, contarColumnas()].
	 * post: indica qué ocupa el casillero en la posición dada por fila y columna.
	 * 
	 * @param fila
	 * @param columna
	 */
	public Casillero obtenerCasillero(int fila, int columna) {
		
		return this.tablero[fila-1][columna-1];
	}
	
	/**
	 * pre : el juego no terminó, columna está en el intervalo [1, contarColumnas()]
	 * 		 y aún queda un Casillero.VACIO en la columna indicada. 
	 * post: deja caer una ficha en la columna indicada.
	 * 
	 * @param columna
	 */
	public void soltarFicha(int columna) {
		if(hayGanador()){
			JOptionPane.showMessageDialog(null, "Ya hubo un ganador, no podras seguir jugando.", "Error", JOptionPane.WARNING_MESSAGE);
			throw new Error("Ya hubo un ganador, no podras seguir jugando");
		}
		
	    if(columna < 1 || columna > contarColumnas()){
	    	throw new Error("Columna esta comprendido entre 1 y " + contarColumnas());
	    }
	    
	    int posicion = contarFilas() - 1;
			for (int i = posicion; i >= 0; i--) { // Se fija si se lleno la columna a tirar.
				if (tablero[i][columna-1] != Casillero.VACIO){
					posicion--;
				}
			}
			if(posicion < 0){
				JOptionPane.showMessageDialog(null, "Se lleno la columna.", "Error", JOptionPane.WARNING_MESSAGE);
				throw new Error("Se lleno la columna");
		}
	     if(tiroElRojo) { // Se fija si ya tiro el rojo.
	    	 tablero[posicion][columna-1] = Casillero.AMARILLO;
	    	 tiroElRojo = false;
	     } else {
	    	 tablero[posicion][columna-1] = Casillero.ROJO;
	    	 tiroElRojo = true;
	     }
	     
	}
	
	/**
	 * post: indica si el juego terminó porque uno de los jugadores
	 * 		 ganó o no existen casilleros vacíos.
	 */
	public boolean termino() {
		int contador = 0;
		if (hayGanador()) {
			return true;
			
		}
		contador = seLLenoElTablero(contador); // Se fija si se lleno el tablero para ver si hubo un empate.
		if(contador == contarColumnas()*contarFilas()){
			return true;
		}
		return false;
	}

	private int seLLenoElTablero(int contador) {
		int i = 0;
		boolean hayEmpate = true;
		while(i < tablero.length && hayEmpate && !hayGanador()) {
			int j = 0;
			while(j < tablero[i].length && hayEmpate && !hayGanador()) {
				if(tablero[i][j] != Casillero.VACIO) {
					hayEmpate = true;
					contador++;
				}else{
					hayEmpate = false;
				}
				j++;
			}
			i++;
		}
		return contador;
	}



	/**
	 * post: indica si el juego terminó y tiene un ganador.
	 */
	public boolean hayGanador() {
		
		if(GanoVerticalmente() || GanoHorizontalmente() || GanoDiagonalDescendente() || GanoDiagonalAscendente()){
			return true;
		}
		return false;
	}

	/**
	 * pre : el juego terminó.
	 * post: devuelve el nombre del jugador que ganó el juego.
	 */
	public String obtenerGanador() {
		
		return this.ganador;
	}


	private boolean GanoHorizontalmente() {
		int i=0;
		boolean hayCuatroEnLinea = false;
		while(i<this.tablero.length && !hayCuatroEnLinea){
			int j = 0;
			while(j<tablero[i].length-1 && !hayCuatroEnLinea){
				if(j + 3 < contarColumnas()){
					if(tablero[i][j] != Casillero.VACIO   && tablero[i][j] == tablero[i][j + 1] && tablero[i][j] == tablero[i][j + 2] && tablero[i][j] == tablero[i][j + 3]){
						hayCuatroEnLinea = true;
						if(tablero[i][j] == Casillero.ROJO){
							ganador = this.jugadorRojo;
						}else{ //Casillero.AMARILLO
							ganador = this.jugadorAmarillo;
						}
					}
				}j++;		
			}i++;		
		}
		return hayCuatroEnLinea;
	}
	private boolean GanoVerticalmente() {
		int j=0;
		boolean hayCuatroEnLinea = false;
		while(j<this.tablero[0].length && !hayCuatroEnLinea){
			int i = 0;
			while(i<tablero.length && !hayCuatroEnLinea){
				if(i + 3 < contarFilas()){
					if(tablero[i][j] != Casillero.VACIO && tablero[i][j] == tablero[i+1][j] && tablero[i][j] == tablero[i+2][j] && tablero[i][j] == tablero[i+3][j]){
						hayCuatroEnLinea = true;
						if(tablero[i][j] == Casillero.ROJO){
							ganador = this.jugadorRojo;
						}else{ //Casillero.AMARILLO
							ganador = this.jugadorAmarillo;
						}
					}
				}i++;		
			}j++;		
		}
		return hayCuatroEnLinea;
	}
	private boolean GanoDiagonalDescendente(){
		int i=0;
		boolean hayCuatroEnLinea = false;
		while(i<this.tablero.length && !hayCuatroEnLinea){
			int j = 0;
			while(j<tablero[i].length-1 && !hayCuatroEnLinea){
				if(j + 3 < contarColumnas() && i + 3 < contarFilas()){
					if(tablero[i][j] != Casillero.VACIO   && tablero[i][j] == tablero[i + 1][j + 1] && tablero[i][j] == tablero[i + 2][j + 2] && tablero[i][j] == tablero[i + 3][j + 3]){
						hayCuatroEnLinea = true;
						if(tablero[i][j] == Casillero.ROJO){
							ganador = this.jugadorRojo;
						}else{ //Casillero.AMARILLO
							ganador = this.jugadorAmarillo;
						}
					}
				}j++;		
			}i++;		
		}
		return hayCuatroEnLinea;
	}
	private boolean GanoDiagonalAscendente(){
		int i=0;
		boolean hayCuatroEnLinea = false;
		while(i<this.tablero.length && !hayCuatroEnLinea){
			int j = this.tablero[i].length-1;
			while(j>=0 && !hayCuatroEnLinea){
				if(j - 3 >= 0 && i + 3 < contarFilas()){
					if(tablero[i][j] != Casillero.VACIO   && tablero[i][j] == tablero[i + 1][j - 1] && tablero[i][j] == tablero[i + 2][j - 2] && tablero[i][j] == tablero[i + 3][j - 3]){
						hayCuatroEnLinea = true;
						if(tablero[i][j] == Casillero.ROJO){
							ganador = this.jugadorRojo;
						}else{ //Casillero.AMARILLO
							ganador = this.jugadorAmarillo;
						}
					}
				}j--;		
			}i++;		
		}
		return hayCuatroEnLinea;
	}


}
