package es.iessoterohernandez.daw.endes.CuentaTarjeta;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDebito {

	private Debito d;
	private Cuenta c;
	private Movimiento m;
	
	@Before
	public void setUp() throws Exception {
		c = new Cuenta("12 3456 7890 1234567890","Juan Nadie");
		
		m = new Movimiento();
		m.setImporte(299.9);
		m.setConcepto("Alquiler Febrero");
		
		d = new Debito("234", "Juan Nadie", new Date(11/11/2021));
		d.setCuenta(c);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
		
		m = null;
		
		d = null;
	}

	
	
	
	@Test
	public void testRetirar() {
		try {
			d.ingresar(299.9);
			d.retirar(299.9);

			assertEquals(0, d.getSaldo(),0);
		
		} catch (Exception e) {
			fail("No se pudo retirar");
		}
	}
	
	@Test
	public void testIngresar() {
		try {
			d.ingresar(299.9);
			assertEquals(true,d.getSaldo()==299.9);
			
		} catch (Exception e) {
			fail("No se pudo ingresar");
		}
		
	}
	
	
	@Test
	public void pagoEnEstablecimiento() {
		try {
			d.ingresar(299.9);
			d.pagoEnEstablecimiento("Establecimiento", 100.0);
			assertEquals(199.9, d.getSaldo(),0);
		} catch (Exception e) {
			fail("No se pudo pagar");
		}
	}
	
	@Test
	public void testGetSaldo(){
		try {
			

			d.ingresar(299.9);
			assertEquals(299.9,d.getSaldo(),0);
		} catch (Exception e) {
		
			fail("No se pudo ingresar");
		}
		
		
	}
	
	
}
