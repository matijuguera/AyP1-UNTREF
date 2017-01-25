import static org.junit.Assert.*;

import org.junit.Test;


public class EmpleadoTest {


		@Test

		public void crearEmpleadoConPersona() {

		Persona carlos = new Persona("Carlos", "Garcia");

		Empleado cadete = new Empleado(carlos, "Cadete");

		assertEquals("Carlos", cadete.getNombre());

		assertEquals("Garcia", cadete.getApellido());

		assertEquals("Cadete", cadete.getPuesto());

		// #uno

		carlos.setApellido("Garcia del Rio");

		assertEquals("Garcia del Rio", cadete.getApellido());

		// #dos

		}
}

