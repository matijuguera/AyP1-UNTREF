import static org.junit.Assert.*;

import org.junit.Test;


public class esCuadradaSimetricaTest {

	@Test
	public void test() {
		double[][] matriz = {{1,3},{3,4}};
		esCuadradaSimetrica s = new esCuadradaSimetrica();
		assertTrue(s.promediarFilas(matriz));
	}
	@Test
	public void test2() {
		double[][] matriz = {{1,5,2},{5,0,6},{2,6,7}};
		esCuadradaSimetrica s = new esCuadradaSimetrica();
		assertTrue(s.promediarFilas(matriz));
	}

}
