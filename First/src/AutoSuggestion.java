import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	 static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		  // Open the chrome browser
		  WebDriver driver=new ChromeDriver();
		  // Go to www.google.com
		  driver.get("https://www.google.com/");
		  // Type ‘ java ‘ in search text box
		  driver.findElement(By.name("q")).sendKeys("java");
		  Thread.sleep(3000);
		  // Find all the auto suggestions and print count of auto suggestion.
		  List<WebElement> AllSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		  int count = AllSugg.size();
		  //print all the autosuggestion
		  System.out.println(count);
		  for(int i=0;i<count;i++) {
		   String text = AllSugg.get(i).getText();
		   System.out.println(text);
		  }
		  //Select the first Autosuggestion
		  AllSugg.get(0).click();
		  driver.close();
		 }
}
