package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
	}



}
