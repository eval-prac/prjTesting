package com.company.technique;

/**
 * @author user
 * Apply formula SQR(x)/(y*z)
 */
public class ServiceCas2 {

	/**
	 * 
	 * @param val1
	 * @param val2
	 * @param val3
	 * @return Apply formula SQR(x)/(y*z)
	 * @throws Exception
	 */
	public double calcForm(float x, float y, float z) throws Exception {

		if ( x < 0 ) {
			throw new Exception("Parameter x must be >= 0" ); 
		}
		float den = y * z;
		if ( den == 0 ) {
			throw new Exception("Parameter y and z can't be 0" ); 
		}

		return Math.sqrt(x)/den;
	}
	
}
