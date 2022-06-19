package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ServiceCas3Test {

	private ServiceCas3 serviceCas3 = new ServiceCas3();

	@Test
	void test_valid() throws Exception {
		int result = serviceCas3.randInt(10);
		assertTrue(result >=1 && result <= 10, "Cas3 calcul OK)");
	}

	@Test
	void test_invalidValue() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> serviceCas3.randInt(-1) );
		assertTrue(exception.getMessage().contains("min is 1"));
	}

}
