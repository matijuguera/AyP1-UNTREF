import static org.junit.Assert.*;

import org.junit.Test;


public class JuegoTest {

	@Test

	public void jugar() {

	Juego ajedrez = new Juego("Ajedrez", 2);

	assertEquals("juego", "Ajedrez", ajedrez.getNombre());

	assertEquals("jugadores máximos", 2, ajedrez.getCantidadDeJugadores());

	// LINEA A

	Jugador marcelo = new Jugador("Marcelo Gomez");

	Jugador santiago = new Jugador("Santiago Roca");

	marcelo.jugar(ajedrez);

	assertEquals("un jugador de ajedrez", 1, ajedrez.contarJugadores());

	santiago.jugar(ajedrez);

	assertEquals("dos jugadores de ajedrez", 2, ajedrez.contarJugadores());

	assertTrue("Marcelo juega Ajedrez", marcelo.getJuego() == ajedrez);

	assertTrue("Santiago juega Ajedrez", santiago.getJuego() == ajedrez);

	assertTrue("Jugador 1 es Marcelo", ajedrez.getJugador(1) == marcelo);

	assertTrue("Jugador 2 es Santiago", ajedrez.getJugador(2) == santiago);

	// LINEA B

	Juego solitario = new Juego("Solitario", 1);

	santiago.jugar(solitario);

	assertTrue("Santiago juega Solitario", santiago.getJuego() == solitario);
	assertTrue("Jugador 1 es Santiago", solitario.getJugador(1) == santiago);

	assertEquals("queda uno jugando ajedrez", 1, ajedrez.contarJugadores());

	// LINEA C
	}
}
