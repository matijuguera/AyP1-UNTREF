import static org.junit.Assert.*;

import org.junit.Test;


public class BusquedaBinariaTest {

	@Test
    public void test() {
        int[] vector1 = { 1, 12, 25, 54, 65, 68, 76, 76, 86, 87 };
        int[] vector2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vector3 = { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
        int[] vector4 = { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
        int[] vector5 = {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 };
        int[] vector6 = {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 };
        int[] vector7 = {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 };
        Seleccion s = new Seleccion();
        s.ordenar(vector3);
        s.ordenar(vector4);

       
        VerificadorDeOrden v = new VerificadorDeOrden();
        assertTrue(v.verificarOrdenDeMenorAMayor(vector1));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector2));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector3));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector4));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector5));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector6));
        assertTrue(v.verificarOrdenDeMenorAMayor(vector7));
       
        BusquedaBinaria b = new BusquedaBinaria();
        assertEquals(4, b.buscar(vector1, 65));
        assertEquals(8, b.buscar(vector2, 9));
        assertEquals(8, b.buscar(vector3, 10));
        assertEquals(-1, b.buscar(vector4, 8));
        assertEquals(6, b.buscar(vector5, 65));
        assertEquals(11, b.buscar(vector6, 125));
        assertEquals(-1, b.buscar(vector7, 3));
    }
 
}