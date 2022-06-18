package com.company.technique;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ServiceCas6Test {

	private ServiceCas6 serviceCas6 = new ServiceCas6();
	
	@Test
	void test_valid() throws Exception {
		ArrayList<String> elements = new ArrayList<String>( Arrays.asList("Frederic", "Tom", "Bob", "Tim") );
		ArrayList<String> result = serviceCas6.mixElement(elements);
		assertTrue(result.size() == 4, "Cas6 calcul OK)");
	}
	
	@Test
	void test_empty() throws Exception {
		ArrayList<String> elements = new ArrayList<String>();
		ArrayList<String> result = serviceCas6.mixElement(elements);
		assertTrue(result.size() == 0, "Cas6 calcul vide OK)");
	}
	
}
