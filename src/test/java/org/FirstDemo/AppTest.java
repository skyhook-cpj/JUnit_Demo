package org.FirstDemo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	
	App app = new App();
	
	@Test
	public void testAddition()
	{
		Assert.assertEquals(app.addition(2, 5), 7);
	}
}
