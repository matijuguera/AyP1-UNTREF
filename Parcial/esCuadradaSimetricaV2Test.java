import static org.junit.Assert.*;

import org.junit.Test;


public class esCuadradaSimetricaV2Test {

	@Test
	public void test() {
		double[][] matriz = {{1,3},{3,4}};
		esCuadradaSimetricaV2 s = new esCuadradaSimetricaV2();
		assertTrue(s.promediarFilas(matriz));
	}
	@Test
	public void test2() {
		double[][] matriz = {{1,5,2},{5,0,6},{2,6,7}};
		esCuadradaSimetrica s = new esCuadradaSimetrica();
		assertTrue(s.promediarFilas(matriz));
	}
	@Test
	public void test3() {
		double[][] matriz = {{1,5,2},{5,0,6},{2,6,7}};
		esCuadradaSimetrica s = new esCuadradaSimetrica();
		assertTrue(s.promediarFilas(matriz));
	}
	@Test
	public void test4() {
		double[][] matriz = {{1,3},{4,4}};
		esCuadradaSimetricaV2 s = new esCuadradaSimetricaV2();
		assertTrue(s.promediarFilas(matriz));
	}


}
