package es.iessoterohernandez.daw.endes.ShoppingCart;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestShoppingCart {
	private static ShoppingCart sc;
	private static Product p1, p2;

	
	@Before
	public void init() {
		sc = new ShoppingCart();
		p1 = new Product("Mesa", 20.);
		p2 = new Product("Silla", 10.);
			
	}
	
	@After
	public void finish() {
		sc = null;
		p1 = null;
		p2 = null;
	}
	
//	Cuando se crea, el carro tiene 0 elementos.
	@Test
	public void testGetItemCount() {
		assertEquals(0, sc.getItemCount());
	}
	
//	Cuando está vacío, el carro tiene 0 elementos.
	@Test
	public void testEmpty() {
		sc.empty();
		assertEquals(0, sc.getItemCount());
	}
	
//	Cuando se añade un producto, el número de elementos debe incrementarse.
	@Test
	public void testAddItem() {
		assertEquals(0, sc.getItemCount());
		sc.addItem(p1);
		assertEquals(1, sc.getItemCount());
	}

//	Cuando se añade un producto, el balance nuevo debe ser la suma del balance anterior y el precio del producto añadido.
	@Test
	public void testGetBalance() {
		sc.addItem(p1);
		assertEquals(20., sc.getBalance());
		
		sc.addItem(p2);
		assertEquals(30., sc.getBalance());
	}
	
//	Cuando se elimina un producto, el número de elementos debe decrementarse.
	@Test
	public void testRemoveItem() throws ProductNotFoundException{
		sc.addItem(p1);
		assertEquals(1, sc.getItemCount());
		sc.removeItem(p1);
		assertEquals(0,sc.getItemCount());
	}
	
	
//	Cuando se intenta eliminar un producto que no está en el carro, se debe lanzar una excepción ProductNotFoundException. Pista: inserta la llamada en un bloque try y pon un método fail() después de la llamada a removeItem().
	
	@Test
	public void testProductNotFoundException() {
		sc.addItem(p1);
		try {
			sc.removeItem(p1);
		} catch (Exception e) {
			fail("Excepcion al borrar un producto del carro");
		}
	}

	

	

}
