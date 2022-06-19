package com.company.technique;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.TreeMap;

public class ServiceCas6 {

	/**
	 * Just create an hash of a string
	 * @param key
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static String getEncryptedString(String key) throws NoSuchAlgorithmException {
	    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
	    messageDigest.update(key.getBytes());
	    return new String(messageDigest.digest());
	}
	
	/**
	 * Mix a list of string.
	 * @param elements
	 * @return
	 * @throws Exception
	 */
	public ArrayList<String> mixElement(ArrayList<String> elements) throws Exception {

		TreeMap<String, String> storage = new TreeMap<>();
		
		try {
			for (String oneElement : elements) {
				String keyValue = getEncryptedString(oneElement);
				storage.put(keyValue, oneElement);
			}
		} catch (Exception ex) {
			throw new Exception("Problem during processing", ex);
		}
		
		return new ArrayList<>(storage.values());
	}
}
