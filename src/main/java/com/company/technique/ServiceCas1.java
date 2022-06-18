package com.company.technique;

/**
 * @author user
 * Display multiplication 10 * 10 max
 */
public class ServiceCas1 {
	private static int MAX_LENGHT = 2;
	private static int MAX_COEF = 10;
	private static String PADDING = "     ";
	
	private String formatNumber(int value) {
		String formatedString = Integer.toString(value) + PADDING;
		return formatedString.substring(0,MAX_LENGHT+1);
	}
	
	/**
	 * Display multi table in console
	 * @param coef1
	 * @param coef2
	 * @throws Exception
	 */
	public void multiplication(int coef1, int coef2) throws Exception {
		if ( coef1 > MAX_COEF || coef1 > MAX_COEF) {
			throw new Exception("Parameter max is " + String.valueOf(MAX_COEF)); 
		}
		for(int coef2Cpt = 1; coef2Cpt <= coef2; coef2Cpt++ ) {
			for(int coef1Cpt = 1; coef1Cpt <= coef1; coef1Cpt++ ) {
				String lineContent = formatNumber(coef1Cpt*coef2Cpt);
				System.out.print(lineContent);
			}
			// NewLine
			System.out.println("");
		}
	}
	
}
