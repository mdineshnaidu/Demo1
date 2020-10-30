import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextbox {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.opensourcebilling.org/");
		  String emailValue = driver.findElement(By.id("email")).getAttribute("value");
		  System.out.println(emailValue);
		  driver.close();
		 }
		}	

	

