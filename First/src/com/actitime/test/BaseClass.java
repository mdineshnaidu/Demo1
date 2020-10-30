package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public WebDriver driver;
@Test
@BeforeClass
public void OpenBrowser() {
	Reporter.log("OpenBrowser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("Closebrowser",true);
	driver.close();
}
public void login() {
	Reporter.log("login",true);
	driver.get("https://actitime/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login']")).click();
}

public void logout() {
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutlink")).click();
}
}
