package es.iessoterohernandez.daw.endes.Persona;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPersona {
	private static Persona p1, p2, p3;
	
	@BeforeClass
	public static void init() {
		p1 = new Persona("Pepa",17,'M',160,1.6);
		p2 = new Persona("Pepe",18,'H',65,1.7);
		p3 = new Persona("Pepi",16,'M',40,1.5);

	}
	
	@AfterClass
	public static void finish() {
		p1 = null;
		p2 = null;
		p3 = null;

	}
	
	@Test 
	public void testCalcularIMC() {
		assertEquals(Persona.SOBREPESO,p1.calcularIMC());
		
		assertEquals(Persona.PESO_IDEAL,p2.calcularIMC());
		
		assertEquals(Persona.INFRAPESO,p3.calcularIMC());
	}
	
	@Test
	public void testEsMayorDeEdad() {
		assertEquals(true,p2.esMayorDeEdad());
		
		assertEquals(false,p1.esMayorDeEdad());
	}

}
