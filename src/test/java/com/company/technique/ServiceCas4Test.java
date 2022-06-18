package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ServiceCas4Test {

	private ServiceCas4 serviceCas4 = new ServiceCas4();

	@Test
	void test_valid() throws Exception {
		ArrayList<Boolean> tableSetup = new ArrayList<Boolean>( Arrays.asList(false, false, false, true) );
		serviceCas4.loadSetup(tableSetup);
		int fistAvailable = serviceCas4.getAvailableTable();
		assertTrue(fistAvailable == 3, "Cas4 calcul OK)");
	}
	
	@Test
	void test_abs() throws Exception {
		ArrayList<Boolean> tableSetup = new ArrayList<Boolean>( Arrays.asList(false, false, false, false, false) );
		serviceCas4.loadSetup(tableSetup);
		int fistAvailable = serviceCas4.getAvailableTable();
		assertTrue(fistAvailable == -1, "Cas4 calcul OK)");
	}

}
