package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ServiceCas2Test {

	private ServiceCas2 serviceCas2 = new ServiceCas2();
	
	@ParameterizedTest
	@CsvSource({
		"10, 11, 12",
		"2, 5, 9",
		"20, 30, 40"
	})
	void test_valid(int x, int y, int z) throws Exception {
		Double result = serviceCas2.calcForm(x, y, z);
		assertTrue(result > Math.sqrt(x)/(y * z) - 0.001 && result < Math.sqrt(x)/(y * z) + 0.001, "Cas2 calcul OK)");
	}

	@Test
	void test_valid2() throws Exception {
		Double result1 = serviceCas2.calcForm(10, 11, 12);
		Double result2 = serviceCas2.calcForm(10, 11, 12);
		assertAll("Test value",
			() ->  assertTrue(result1 > 0.02395 && result1 < 0.02396),
			() ->  { assertTrue(result2 > 0.02395 && result1 < 0.02396 );}
		);
	}

	@Test
	void test_invalidValueX() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> serviceCas2.calcForm(-10, 11, 12) );
		assertTrue(exception.getMessage().contains("be >= 0"));
	}

	@Test
	void test_invalidValueY() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> serviceCas2.calcForm(10, 0, 12) );
		assertTrue(exception.getMessage().contains("can't be 0"));
	}

	@Test
	void test_invalidValueZ() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> serviceCas2.calcForm(10, 11, 0) );
		assertTrue(exception.getMessage().contains("can't be 0"));
	}

}
