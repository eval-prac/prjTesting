package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceCas1Test {

	private ServiceCas1 serviceCas1 = new ServiceCas1();

	@BeforeAll
	static void starting() {
		System.out.println("Démarrage des tests");
	}

	@Test
	void test_valid() throws Exception {
		serviceCas1.multiplication(10, 10);
		assertTrue(true, "No exception OK");
	}

	@Test
	void test_invalid() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> serviceCas1.multiplication(11, 10) );
		assertTrue(exception.getMessage().contains("Parameter max"));
	}

}
