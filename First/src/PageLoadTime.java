import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageLoadTime {
 static {
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 public static void main(String[] args)  {
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
  try {
  driver.get("https://demo.actitime.com/"); 
  System.out.println("page is loading within 7 seconds");
  }
  catch(TimeoutException e) {
   System.out.println("page is not loading within 7 seconds");
  }
  driver.close();
  }

 
