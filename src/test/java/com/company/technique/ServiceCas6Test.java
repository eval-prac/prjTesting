package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ServiceCas6Test {

	private ServiceCas6 serviceCas6 = new ServiceCas6();

	@ParameterizedTest
	@MethodSource("test_valid_getValues")
	void test_valid(ArrayList<String> elementList) throws Exception {
		ArrayList<String> result = serviceCas6.mixElement( elementList );
		assertEquals(4, result.size(), "Cas6 calcul OK)");
		assertTrue(result.contains(elementList.get(0)));
	}
	private static ArrayList<ArrayList<String>> test_valid_getValues() {
		ArrayList<ArrayList<String>> toBeTested = new ArrayList<>();
		ArrayList<String> elements1 = new ArrayList<>( Arrays.asList("Frederic", "Tom", "Bob", "Tim") );
		toBeTested.add(elements1);
		ArrayList<String> elements2 = new ArrayList<>( Arrays.asList("Mardi", "Mercredi", "Jeudi", "Vendredi") );
		toBeTested.add(elements2);
		return toBeTested;
	}

	@Test
	void test_empty() throws Exception {
		ArrayList<String> elements = new ArrayList<>();
		ArrayList<String> result = serviceCas6.mixElement(elements);
		assertEquals(0, result.size(), "Cas6 calcul vide OK)");
	}

}
