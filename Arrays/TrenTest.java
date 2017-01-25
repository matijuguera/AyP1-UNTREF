import static org.junit.Assert.*;

import org.junit.Test;


public class TrenTest {

	@Test
	public void DevuelveCodigo() {
		int[] capacidadesDeCarga = new int[4];
		capacidadesDeCarga[0] = 10;
		capacidadesDeCarga[1] = 15;
		capacidadesDeCarga[2] = 5;
		capacidadesDeCarga[3] = 20;
		
		Tren tren = new Tren("thomas",capacidadesDeCarga);
		tren.obtenerCodigo();
		assertEquals("thomas",tren.obtenerCodigo());
	}
	@Test
	public void DevuelveCuantosVagonesSeCrean() {
		int[] capacidadesDeCarga = new int[4];
		capacidadesDeCarga[0] = 10;
		capacidadesDeCarga[1] = 15;
		capacidadesDeCarga[2] = 5;
		capacidadesDeCarga[3] = 20;
		
		Tren tren = new Tren("thomas",capacidadesDeCarga);
		tren.numeroDeVagones();
		assertEquals(4,tren.numeroDeVagones(),0.0001);
	}
	@Test(expected = Error.class)
	public void probarVagonConParametroMayorALaDimensionTotalDeLaArray() {
		int[] capacidadesDeCarga = new int[4];
		capacidadesDeCarga[0] = 10;
		capacidadesDeCarga[1] = 15;
		capacidadesDeCarga[2] = 5;
		capacidadesDeCarga[3] = 20;
		Tren tren = new Tren("thomas",capacidadesDeCarga);
		tren.obtenerVagon(4);
		
	}
	@Test
	public void ProbarCargaTotal() {
		int[] capacidadesDeCarga = new int[4];
		capacidadesDeCarga[0] = 10; //se va a guardar en el 1.
		capacidadesDeCarga[1] = 15; //se va a guardar en el 2.
		capacidadesDeCarga[2] = 5;  //se va a guardar en el 3.
		capacidadesDeCarga[3] = 20; //se va a guardar en el 4.
		
		Tren tren = new Tren("thomas",capacidadesDeCarga);
		tren.obtenerVagon(1).cambiarCarga(10);
		tren.obtenerVagon(2).cambiarCarga(15);
		tren.obtenerVagon(3).cambiarCarga(5);
		tren.obtenerCargaTotal();
		assertEquals(30,tren.obtenerCargaTotal(),0.0001);
		
		
	}

	
	

}
