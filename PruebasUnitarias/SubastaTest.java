import static org.junit.Assert.*;

import org.junit.Test;


public class SubastaTest {
	
	
	@Test
	public void comprovarNombreDeLaSubasta() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.obtenerArticulo();
		assertEquals("HD6870",subasta.obtenerArticulo());
	}

	@Test
	public void OfertaGanadoraMayorAlPrecioBase() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.ofertar(1100);
		subasta.obtenerOfertaGanadora();
		assertEquals(1100,subasta.obtenerOfertaGanadora(),0.00001);
	}
	@Test(expected = Error.class)
	public void OfertaGanadoraMenorAlPrecioBase() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.ofertar(900);
	}
	@Test
	public void OfertaGanadoraIgualAlPrecioBase() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.ofertar(1000);
		subasta.obtenerOfertaGanadora();
		assertEquals(1000,subasta.obtenerOfertaGanadora(),0.00001);
	}
	@Test(expected = Error.class)
	public void ProbarSiCierra() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.ofertar(1100);
		subasta.obtenerOfertaGanadora();
		subasta.cerrar();
		subasta.ofertar(1200);
	}
	@Test
	public void SuperarALaOfertaQueVaGanando() {
		Subasta subasta = new Subasta("HD6870",1000);
		subasta.ofertar(1100);
		subasta.ofertar(1200);
		assertEquals(1200,subasta.obtenerOfertaGanadora(),0.00001);
	}	
	

}
