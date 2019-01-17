package org.my.first.project;

import org.commons.utils.MyStringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(MyStringUtils.isNullOrEmpty(""));
		System.out.println(MyStringUtils.isNullOrEmpty(" "));
		System.out.println(MyStringUtils.isNullOrEmpty("  1234"));
    
    }
}
