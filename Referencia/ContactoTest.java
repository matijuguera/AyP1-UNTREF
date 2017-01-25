import static org.junit.Assert.*;

import org.junit.Test;


public class ContactoTest {

	@Test

	public void cambiarDirecciones() {

	Direccion unaDireccion = new Direccion("Larrea",587);

	Contacto unContacto = new Contacto("Alberto");

	assertEquals("Alberto", unContacto.getNombre());

	assertNull(unContacto.getDireccion());

	unContacto.setDireccion( unaDireccion );

	assertNotNull(unContacto.getDireccion());

	assertEquals("Larrea", unContacto.getDireccion().getCalle());

	assertEquals(587, unContacto.getDireccion().getNumero());

	unaDireccion.setCalle("Las Heras");

	assertEquals("Las Heras", unaDireccion.getCalle());


	}

}
