import static org.junit.Assert.*;

import org.junit.Test;


public class VerificadorDeOrdenTest {

	@Test
	public void estanOrdenadosDeMenorAMayor() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] array = new int[4];
		array[0] = 0;
		array[1] = 2;
		array[2] = 3;
		array[3] = 6;
		vdo.verificarOrdenDeMenorAMayor(array);
		assertTrue(vdo.verificarOrdenDeMenorAMayor(array));
	}
	@Test
	public void FallaEnElAnteUltimo() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] array = new int[4];
		array[0] = 0;
		array[1] = 2;
		array[2] = 1;
		array[3] = 6;
		vdo.verificarOrdenDeMenorAMayor(array);
		assertFalse(vdo.verificarOrdenDeMenorAMayor(array));
	}
	@Test
	public void SonTodosIguales() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		vdo.verificarOrdenDeMenorAMayor(array);
		assertFalse(vdo.verificarOrdenDeMenorAMayor(array));
	}
	@Test
	public void tresIguales() {
		VerificadorDeOrden vdo = new VerificadorDeOrden();
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 2;
		array[2] = 1;
		array[3] = 1;
		vdo.verificarOrdenDeMenorAMayor(array);
		assertFalse(vdo.verificarOrdenDeMenorAMayor(array));
	}


}
