import static org.junit.Assert.*;

import org.junit.Test;


public class BuscadorSecuencialTest {

	@Test
	public void test() {
		int[] vector = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		BuscadorSecuencial secuencial = new BuscadorSecuencial();
		assertEquals(4,secuencial.buscar(vector, 65));
	}
	@Test
	public void test2() {
		int[] vector = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BuscadorSecuencial secuencial = new BuscadorSecuencial();
		assertEquals(8,secuencial.buscar(vector, 9));
	}
	@Test
	public void test3() {
		int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
		BuscadorSecuencial secuencial = new BuscadorSecuencial();
		assertEquals(0,secuencial.buscar(vector, 10));
	}
	@Test
	public void test4() {
		int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
		BuscadorSecuencial secuencial = new BuscadorSecuencial();
		assertEquals(-1,secuencial.buscar(vector, 8));
	}
	
	
	

}
