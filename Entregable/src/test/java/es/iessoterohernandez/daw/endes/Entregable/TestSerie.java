package es.iessoterohernandez.daw.endes.Entregable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSerie {
	private static Serie s1, s2, s3;

	@BeforeClass
	public static void init() {
		s1 = new Serie("Serie1", 5, "Comedia", "Pepe");
		s2 = new Serie("Serie2", 2, "Misterio", "J J Abrams");
		s3 = new Serie("Serie3", 2, "Misterio", "Pepe");
	}
	
	@AfterClass
	public static void finish() {
		s1 = null;
		s2 = null;
		s3 = null;

	}
	
	@Test
	public void testEntregar() {
		s1.entregar();
		assertEquals(true, s1.isEntregado());
	}

	@Test
	public void testDevolver() {
		s1.devolver();
		assertEquals(false, s1.isEntregado());
	}

	@Test
	public void testIsEntregado() {
		s1.devolver();
		assertEquals(false, s1.isEntregado());
		s1.entregar();
		assertEquals(true, s1.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Serie.MAYOR, s1.compareTo(s2));	
		assertEquals(Serie.IGUAL, s2.compareTo(s3));
		assertEquals(Serie.MENOR, s2.compareTo(s1));	
	}
	
	
	

}
