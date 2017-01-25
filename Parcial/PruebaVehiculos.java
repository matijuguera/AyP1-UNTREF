import static org.junit.Assert.*;

import org.junit.Test;


public class PruebaVehiculos {

    @Test
public
void
 subirPasajeros() {
        Vehiculo colectivo = new Vehiculo(8);
        assertEquals(8, colectivo.contarLugaresLibres());   
        assertEquals(0, colectivo.contarLugaresOcupados());
        Pasajero lucas = new Pasajero("Lucas");
        assertEquals("Lucas", lucas.obtenerNombre());
        assertTrue(lucas.obtenerVehiculo() == null);
        // #uno
        colectivo.subir(1, lucas);
        assertTrue(lucas.obtenerVehiculo() == null);
        assertTrue(lucas == colectivo.obtenerPasajero(1));
        assertEquals(7, colectivo.contarLugaresLibres());   
        assertEquals(1, colectivo.contarLugaresOcupados());
        colectivo.subir(2, new Pasajero("Natalia"));
        colectivo.subir(3, new Pasajero("Marcelo"));
        Pasajero primero = colectivo.obtenerPasajero(1);
        assertEquals("Lucas",primero.obtenerNombre());
        Pasajero roberto = new Pasajero("Roberto");
        colectivo.subir(1, roberto);
        assertEquals("Lucas",primero.obtenerNombre());
        // #dos
        Vehiculo transporte = colectivo;
        Pasajero tercero = transporte.obtenerPasajero(3);
        Vehiculo bicicleta = new Vehiculo(1);
       	bicicleta.subir(1, tercero);
        // #tres
    }

}
