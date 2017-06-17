package com.ing.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App obj;

	@Before
	public void initalize() {
		obj = new App();
	}

	@Test
	public void testLengthOfTheUniqueKey() {
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}

	/*
	 * @Test public void failTestLengthOfTheUniqueKey() {
	 * 
	 * App obj = new App(); Assert.assertEquals(37,
	 * obj.generateUniqueKey().length());
	 * 
	 * }
	 */

}