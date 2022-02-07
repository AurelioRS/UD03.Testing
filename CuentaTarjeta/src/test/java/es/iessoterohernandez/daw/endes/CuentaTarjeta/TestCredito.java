package es.iessoterohernandez.daw.endes.CuentaTarjeta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.Date;

class CreditoTest {

	private Credito credit;
	private Cuenta c;
	private Movimiento m;
	
	@Before
	public void setUp() throws Exception {
		c = new Cuenta("12 3456 7890 1234567890","Juan Nadie");
		
		m = new Movimiento();
		m.setImporte(299.9);
		m.setConcepto("Alquiler Febrero");
		
		credit = new Credito("234", "Juan Nadie", new Date(11/11/2021),2000.0);
		credit.setCuenta(c);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
		
		m = null;
		
		credit = null;
	}

	
	
	
	@Test
	public void testRetirar() {
		try {
			credit.ingresar(299.9);
			credit.retirar(299.9);

			assertEquals(2000.0, credit.getSaldo(),0);
		
		} catch (Exception e) {
			fail("No se pudo retirar");
		}
	}
	
	@Test
	public void testIngresar() {
		try {
			credit.ingresar(299.9);
			assertEquals(true,credit.getSaldo()==2299.9);
			
		} catch (Exception e) {
			fail("No se pudo ingresar");
		}
		
	}
	
	
	@Test
	public void pagoEnEstablecimiento() {
		try {
			credit.ingresar(299.9);
			credit.pagoEnEstablecimiento("Establecimiento", 100.0);
			assertEquals(2199.9, credit.getSaldo(),0);
		} catch (Exception e) {
			fail("No se pudo pagar");
		}
	}
	
	@Test
	public void testGetSaldo(){
		try {
			

			credit.ingresar(299.9);
			assertEquals(2299.9,credit.getSaldo(),0);
		} catch (Exception e) {
		
			fail("No se pudo ingresar");
		}
		
		
	}
	
	@Test
	public void testLiquidar(){
		
	}
	
	
	


	@Test
	void testGetCreditoDisponible() {
		try {

			credit.retirar(100);

		} catch (Exception e) {
		}
		assertEquals(1900.0, credit.getCreditoDisponible(),0);
	}

	
}
