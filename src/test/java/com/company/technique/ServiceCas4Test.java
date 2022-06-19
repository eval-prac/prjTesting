package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ServiceCas4Test {

	private ServiceCas4 serviceCas4 = new ServiceCas4();

	@Test
	void test_valid() throws Exception {
		ArrayList<Boolean> tableSetup = new ArrayList<>(Arrays.asList(false, false, false, true));
		serviceCas4.loadSetup(tableSetup);
		int fistAvailable = serviceCas4.getAvailableTable();
		assertEquals(3, fistAvailable, "Cas4 calcul OK)");
	}

	@Test
	void test_abs() throws Exception {
		ArrayList<Boolean> tableSetup = new ArrayList<>(Arrays.asList(false, false, false, false, false));
		serviceCas4.loadSetup(tableSetup);
		int fistAvailable = serviceCas4.getAvailableTable();
		assertEquals(-1, fistAvailable, "Cas4 calcul OK)");
	}

}
