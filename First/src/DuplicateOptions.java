import java.awt.List;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOptions {
 static {
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.get("file:///C:/Users/Shwetha/Desktop/Hotel.html");
  WebElement mtrlistbox = driver.findElement(By.id("mtr"));
  Select s=new Select(mtrlistbox);        
  HashSet< String> alltext=new HashSet<>();
  List<WebElement> Alloptions = s.getOptions();
  int count = Alloptions.size();
  //selecting all the options
  for(int i=0;i<count;i++) {
   
   String text = Alloptions.get(i).getText();
   if(alltext.add(text)==false) {
   System.out.println(text);
 
   }
  }
  driver.close();
 }
}