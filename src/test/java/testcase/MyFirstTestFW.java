package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{

	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testdata")
	public static void LoginTest(String user, String pwd)
	{
		driver.findElement(By.linkText(prop.getProperty("signin_link"))).click();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("email_field")))).sendKeys(user);
 	    
	    driver.findElement(By.xpath(prop.getProperty("next_button"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("password_field")))).sendKeys(pwd);
	    
	    driver.findElement(By.xpath(prop.getProperty("signin_button"))).click();
	}

 /*    
@DataProvider(name="testdata") 
public Object[][] tData()
{
return new Object[][] {
	{"rcvtutorials@gmail.com","testautomation@123"},
	{"rcvtutorials@gmail.com","testautomation@123"}
};
	
}

*/

}
