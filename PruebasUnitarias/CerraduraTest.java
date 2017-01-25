import static org.junit.Assert.*;

import org.junit.Test;


public class CerraduraTest {

	@Test
	public void ProbarSiAbre() {
		Cerradura cerradura = new Cerradura(1234,4);
		cerradura.abrir(1234);
		assertTrue(cerradura.abrir(1234));
		
	}
	

}
