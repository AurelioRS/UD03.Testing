package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAccount {
	private Account a;
	@Before
	public void setUp() throws Exception {
		a = new Account("Pepe", 1234567890, 10.5f);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}	
	
	@Test
	public void testDeposit() {
		assertTrue(a.deposit(1f));
		assertFalse(a.deposit(-1f));
	}

	@Test
	public void testWithdraw() {
		assertFalse(a.withdraw(-2f, -1f));
		assertTrue(a.withdraw(2f, 1f));
	}

	@Test
	public void testAddInterest() {
		a.addInterest();
		assertEquals(10.5f + (10.5f * 0.045f), a.getBalance(),0);
	}
	
	
}
