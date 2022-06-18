package com.company.technique;

public class ServiceCas3 {

	/**
	 * Return random int betwen 1 and val
	 * @param val
	 * @return
	 * @throws Exception
	 */
	public int randInt(int val) throws Exception {
		if ( val < 1) {
			throw new Exception("Parameter min is 1"); 
		}
		return (int) (Math.random() * val + 1);
	}
	
}
