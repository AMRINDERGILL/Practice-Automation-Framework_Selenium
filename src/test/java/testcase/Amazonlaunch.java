package testcase;

import org.testng.annotations.Test;

import base.BaseTest;

public class Amazonlaunch extends BaseTest {

	@Test
	public void amazonStart() {
	driver.get("www.amazon.com");	
	}
}
