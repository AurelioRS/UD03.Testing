package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPila {
	private Pila p;
	
	@Before
	public void setUp() throws Exception {
		p = new Pila();
	}

	@After
	public void tearDown() throws Exception {
		p = new Pila();
	}

	@Test
	public void testPush() {
		p.push(2);
		assertEquals(true, p.isEmpty());
		p.push(20);
		assertEquals(true, p.isEmpty());
		p.push(10);
		assertEquals(false, p.isEmpty());
	}
	
	@Test
	public void testPop() {
		assertEquals(null, p.pop());
		p.push(10);
		p.push(11);
		assertEquals(11, p.pop(),0);
		assertEquals(10, p.pop(),0);
		assertEquals(null, p.pop());
	}
	

	@Test
	public void testIsEmpty() {
		assertEquals(true, p.isEmpty());
		p.push(10);
		assertEquals(false, p.isEmpty());
	}

	@Test
	public void testTop() {
		assertEquals(null, p.top());
		p.push(10);
		p.push(11);
		assertEquals(11, p.top(),0);
	}

}
