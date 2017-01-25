import static org.junit.Assert.*;

import org.junit.Test;


public class TransporteTest {

	@Test

	public void subirEn() {

	Transporte taxi = new Transporte("JPY-234", 4);

	assertEquals("patente del taxi", "JPY-234", taxi.getPatente());

	assertEquals("capacidad del taxi", 4, taxi.getCapacidad());

	assertTrue("taxi sin pasajeros", taxi.getPasajero(1) == null);

	Transporte colectivo = new Transporte("DFW-895", 10);

	Pasajero juan = new Pasajero("Juan Diaz");

	assertEquals("nombre del pasajero", "Juan Diaz", juan.getNombre());

	assertTrue("juan no tiene transporte", juan.getTransporte() == null);

	// LINEA A

	juan.subirEn(taxi);

	assertTrue("juan subió al taxi", juan.getTransporte() == taxi);

	assertTrue("juan es el primer pasajero", taxi.getPasajero(1) == juan);

	assertTrue("juan es el único pasajero", taxi.getPasajero(2) == null);

	Pasajero laura = new Pasajero("Laura Garcia");

	laura.subirEn(colectivo);

	Pasajero marcos = new Pasajero("Marcos Perez");

	marcos.subirEn(colectivo);

	// LINEA B

	taxi.bajarA(juan);

	assertTrue("taxi sin pasajeros", taxi.getPasajero(1) == null);

	marcos.subirEn(taxi);

	// LINEA C

	}
	@Test
	public void sida() {
		Transporte taxi = new Transporte("A",4);
		Transporte colectivo = new Transporte("B",10);
		Transporte moto = new Transporte("C",1);
		Pasajero juan = new Pasajero("juan");
		juan.subirEn(taxi);
		assertEquals(juan,taxi.getPasajero(1));
		juan.subirEn(colectivo);
		assertEquals(null,taxi.getPasajero(1));
		colectivo.bajarA(juan);
		assertEquals(null,juan.getTransporte());
		assertEquals(null,colectivo.getPasajero(1));
		juan.subirEn(moto);
		assertEquals(juan,moto.getPasajero(1));
		assertEquals(moto,juan.getTransporte());
			
	}	
	

}
