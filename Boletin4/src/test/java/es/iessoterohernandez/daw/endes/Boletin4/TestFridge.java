package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestFridge {

	@ParameterizedTest(name = "testPut")
	@CsvSource({ "milk, true",
		"apple, true",
		"meat, true",
		"orange, true" })


	public void testPut(String item, boolean b) {
		Fridge f = new Fridge();
		
		assertEquals(b, f.put(item));

	}

	@ParameterizedTest(name = "testContains")
	@CsvSource({ "milk, false",
		"apple, false",
		"meat, false",
		"orange, false" })
	
	

	public void testContains(String item, boolean b) {
		Fridge f = new Fridge();
		
		assertEquals(b, f.contains(item));
	}

	@ParameterizedTest(name = "testTake")
	@CsvSource({ "milk, true",
		"apple, true",
		"meat, false",
		"orange, true" })
	
	public void testTake(String item, boolean b) throws NoSuchItemException{
		Fridge f = new Fridge();
		f.put(item);
		
		try {
			f.take(item);
		} catch (NoSuchItemException e) {
			fail(item + " item not found.");
		}
	}
}
