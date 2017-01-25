import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {

	@Test
	public void DivisoresDeUnNumeroPositivo() {
		Calculadora calculadora = new Calculadora();
		calculadora.contarDivisores(2);
		assertEquals(4,calculadora.contarDivisores(2),0.000001);
	}
	@Test
	public void DivisoresDeUnNumeroNegativo() {
		Calculadora calculadora = new Calculadora();
		calculadora.contarDivisores(-10);
		assertEquals(8,calculadora.contarDivisores(-10),0.000001);
		
	}
	@Test(expected = Error.class)
	public void DivisoresDeCero() {
		Calculadora calculadora = new Calculadora();
		calculadora.contarDivisores(0);
	}

}
