package testcase;

import org.testng.annotations.Test;

import base.BaseTest;

public class Chrome extends BaseTest {

	@Test
	public void chromeLaunch()
	{
		//launching chrome
		driver.get("www.google.com");
	}
}

