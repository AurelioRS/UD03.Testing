package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOperadorAritmetico {
	private int n1,n2;
	@Before
	public void setUp() throws Exception {
		n1=2;
		n2=3;
	}

	@Test
	public void testSuma() {
		assertEquals(5, n1+n2);
	}
	
	@Test
	public void testDivision() {
		assertEquals(0, n1/n2);
		
		assertEquals(1, n2/n1);
		
	}
	
	

}
