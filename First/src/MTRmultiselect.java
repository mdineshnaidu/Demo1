import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRmultiselect {
static {
 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
 public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.get("file:///C:/Users/dinesh/Desktop/hotel.html");
   WebElement MtrListBox = driver.findElement(By.id("mtr"));
   Select s=new Select(MtrListBox);
   s.selectByIndex(0);
   s.selectByValue("d");
   s.selectByVisibleText("vada");
   Thread.sleep(3000);
   boolean v = s.isMultiple();
   System.out.println(v);
   s.deselectByIndex(1);
   s.deselectByValue("v");
   s.deselectByVisibleText("idly");
   driver.close();
  }
}
