import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alignment {
	 
		static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		 public static void main(String[] args)
		 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/");
		 int UNx = driver.findElement(By.id("username")).getLocation().getX();
		 int PWx = driver.findElement(By.name("pwd")).getLocation().getX();
		 if(UNx==PWx) {
		  System.out.println("Both are equal and Aligned");
		 }
		 else {
		 System.out.println("Both are not equal "); 
		 }
		 driver.close();
		 }

		}


