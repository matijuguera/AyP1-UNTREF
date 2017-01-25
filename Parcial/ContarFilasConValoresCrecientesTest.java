import static org.junit.Assert.*;

import org.junit.Test;


public class ContarFilasConValoresCrecientesTest {

	@Test
	public void test() {
		ContarFilasConValoresCrecientes c = new ContarFilasConValoresCrecientes();
		double[][] a = {{1,2},{3,4}};
		assertEquals(2,c.contarFilasConValoresCrecientes(a));
	}
	@Test
	public void test2() {
		ContarFilasConValoresCrecientes c = new ContarFilasConValoresCrecientes();
		double[][] a = {{1,2},{3,4},{6,5}};
		assertEquals(2,c.contarFilasConValoresCrecientes(a));
	}
	@Test
	public void test3() {
	double[][] matriz = new double[4][4];
	matriz[0][0] = 1;
	matriz[1][0] = 2;
	matriz[2][0] = 3;
	matriz[3][0] = 4;
	matriz[0][1] = 2;
	matriz[1][1] = 3;
	matriz[2][1] = 7;
	matriz[3][1] = 0;
	matriz[0][2] = 25;
	matriz[1][2] = 36;
	matriz[2][2] = 214;
	matriz[3][2] = 1000;
	matriz[0][3] = 26;
	matriz[1][3] = -5;
	matriz[2][3] = 33;
	matriz[3][3] = 0;

	ContarFilasConValoresCrecientes f = new ContarFilasConValoresCrecientes();
	assertEquals(1, f.contarFilasConValoresCrecientes(matriz));
	}

	

}
