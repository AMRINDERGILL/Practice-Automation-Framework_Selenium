package testcase;

import org.testng.annotations.Test;

import base.BaseTest;

public class ChromeLaunch extends BaseTest {

	@Test
	public void startChrome()
	{
	driver.get("www.google.com");
	}
}
