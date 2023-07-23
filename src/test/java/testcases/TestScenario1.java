package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class TestScenario1 extends TestBase{

	@Test
	public void testScenario1() throws MalformedURLException {
		setUp("Chrome");
		driver().get("https://www.lambdatest.com/selenium-playground/");
		driver().findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]")).click();
		Assert.assertTrue(driver().getCurrentUrl().contains("simple-form-demo"));
		String text = "Hello, Welcome to LambdaTest!";
		driver().findElement(By.id("user-message")).sendKeys(text);
		driver().findElement(By.xpath("//button[contains(text(),'Get Checked Value')]")).click();
		String actualText = driver().findElement(By.xpath("//p[@id='message']")).getText();
		Assert.assertEquals(actualText, text);
		driver().quit();
		
	}
}