package appliweb;

import org.commons.utils.MyStringUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestWeb {

	
	@Test
	public void testString(){
		assertTrue(MyStringUtils.isNullOrEmpty(""));
		assertTrue(MyStringUtils.isNullOrEmpty(null));
		assertTrue(MyStringUtils.isNullOrEmpty(" "));
		assertFalse(MyStringUtils.isNullOrEmpty("null"));
	}
}
