import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWeb 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  public static void main(String[] args)
  {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/dinesh/Desktop/demo.html");
	 WebElement e=driver.findElement(By.tagName("a"));
	 driver.findElement(By.className("c1")).click();
	 driver.navigate().back();
	 driver.findElement(By.id("d1")).click();
	 driver.navigate().back();
	 driver.close();
	 
  
	  
	  
	 
	
}
}
