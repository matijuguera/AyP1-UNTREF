import static org.junit.Assert.*;
import org.junit.Test;


public class CadenaDosTest {
	
	@Test
	public void ProbarMetodoObtenerEslabon() {
		double[] longitudes = {10,4,5,9};
		CadenaDos cadena = new CadenaDos(longitudes);
		EslabonDos Eslabon = cadena.obtenerEslabon(2);
		
		assertEquals(4, Eslabon.obtenerLongitud(),0.0001);
	}
	
	

}
