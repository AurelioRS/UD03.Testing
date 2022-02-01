package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSubscripcion {

	private static Subscripcion s1,s2,s3,s4,s5;

	@BeforeClass
	public static void init() {
		s1 = new Subscripcion(0, 0);
		s2 = new Subscripcion(0, 12);
		s3 = new Subscripcion(24, 0);
		s4 = new Subscripcion(50, 4);
		s5 = new Subscripcion(48, 4);
		
	}
	
	@AfterClass
	public static void finish() {
		s1 = null;
		s2 = null;
		s3 = null;
		s4 = null;
		s5 = null;
	}


	@Test
	public void testPrecioPorMes() {

		assertEquals(0, s1.precioPorMes(), 0);
		
		assertEquals(0., s1.precioPorMes(), 0);
		
		assertEquals(0., s2.precioPorMes(), 0);
		
		assertEquals(0., s3.precioPorMes(), 0);
		
		assertEquals(13.5, s4.precioPorMes(), 0);
		
		assertEquals(12, s5.precioPorMes(), 0);
		
	}

	@Test
	public void testCancel() {
		s1.cancel();
		assertTrue(true);
	}

}
