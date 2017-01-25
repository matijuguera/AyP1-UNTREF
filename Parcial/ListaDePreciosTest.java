import static org.junit.Assert.*;

import org.junit.Test;


public class ListaDePreciosTest {

	@Test
	 public void probarLista() {
	  
	  ListaDePrecios supermercado = new ListaDePrecios(5);
	  
	  supermercado.cargarValorDeUnArticulo(1, 10);
	  supermercado.cargarValorDeUnArticulo(2, 8);
	  supermercado.cargarValorDeUnArticulo(5, 3);
	  
	  assertEquals("el valor del producto n°2", 8, supermercado.getPrecio(2), 0.0001);
	  assertEquals("el valor del producto n°1", 10, supermercado.getPrecio(1), 0.0001);
	  assertEquals("el valor del producto n°5", 3, supermercado.getPrecio(5), 0.0001);
	  
	  assertEquals("el precio promedio de los artículos", 7.0, supermercado.getPrecioPromedio(), 0.0001);
	  
	  assertEquals("el precio máximo de la lista", 10, supermercado.getMaximo(), 0.0001);
	  
	  assertEquals("cantidad de productos entre p1 y p5", 1, supermercado.contarPreciosEntre(1,5));
	 
	 }

}
