package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Openf {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	{
	driver=new ChromeDriver();
	driver.get("https://actitime/login.do");

}
	public void CloseBrowser() {
		Reporter.log("Closebrowser",true);
		driver.close();
}
}
