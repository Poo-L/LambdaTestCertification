package Utilities;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private DriverFactory() {
		
	}
	
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstances() {
		return instance;
	}
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void setDriver(WebDriver params) {
		 driver.set(params);
	}

}