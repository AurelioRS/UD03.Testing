package es.iessoterohernandez.daw.endes.Boletin4;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestBoa {

	@ParameterizedTest(name = "testIsHealthy")
	@CsvSource({ "Snake1,    5,    mouses,   	false", 
					"Snake2,    5,    granola bars,   true",
					"Snake3,    5,    leaf,        false", 
					"Snake4,    10,   mouses,      false",
					"Snake5,    10,   granola bars,   true", 
					"Snake6,    10,   leaf,        false"

	})

	public void testIsHealthy(String n, int l, String ff, boolean bool) {
		Boa b = new Boa(n, l, ff);

		assertEquals(bool, b.isHealthy());
	}

	@ParameterizedTest(name = "testFitsInCage")
	@CsvSource({ "Snake1,    5,    10,   granola bars,    true",
				"Snake2,    5,   5,   granola bars,   false",
				"Snake3,    10,   5,   granola bars,   false"

	})
	public void testFitsInCage(String n, int l, int cl, String ff, boolean bool) {
		Boa b = new Boa(n, l, ff);

		assertEquals(bool, b.fitsInCage(cl));
	}

}
