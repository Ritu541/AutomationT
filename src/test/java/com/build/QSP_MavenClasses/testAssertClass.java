package com.build.QSP_MavenClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAssertClass {

	@Test
	public static void Asserttest () {
		
	Assert.assertEquals("Ritu", "Ritu1"); // testng understand only assert excception
	
	Assert.assertEquals(true, false);
	
	Assert.fail("name has been wrong");
	
	}
}
