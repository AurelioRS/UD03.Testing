package es.iessoterohernandez.daw.endes.Entregable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVideojuego {
	private static Videojuego v1, v2, v3;
	
	@BeforeClass
	public static void init() {
		v1 = new Videojuego("Juego1", 200, "Shooter", "Nintendo");
		v2 = new Videojuego("Juego2", 100, "RPG", "Sony");
		v3 = new Videojuego("Juego3", 100, "RPG", "Nintendo");
		
	}
	
	@AfterClass
	public static void finish() {
		v1 = null;
		v2 = null;
		v3 = null;

	}
	
	
	@Test
	public void testEntregar() {
		v1.entregar();
		assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testDevolver() {
		v1.devolver();
		assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testIsEntregado() {
		v1.devolver();
		assertEquals(false, v1.isEntregado());
		v1.entregar();
		assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Videojuego.MAYOR, v1.compareTo(v2));
		assertEquals(Videojuego.IGUAL, v2.compareTo(v3));
		assertEquals(Videojuego.MENOR, v2.compareTo(v1));
		
	}
	
	

}
