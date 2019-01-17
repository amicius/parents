package org.commons.utils;

public class MyStringUtils {
	/**
	 * Test if the String in parameter is null or empty. A string with space count
	 * as empty
	 * 
	 * @param string
	 * @return true if the String is empty, else false
	 * 
	 */
	public static boolean isNullOrEmpty(String string) {

		return string == null || string.trim().equals("");
	}
}
