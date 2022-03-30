package assessment.assessment;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;  
public class App {  
public String baseUrl = "https://www.saucedemo.com/";  
String driverPath = "E:\\Selenium\\chromedriver.exe";  
public WebDriver driver ;   
@Test
public void test() {      
// set the system property for Chrome driver      
System.setProperty("webdriver.chrome.driver", driverPath);  
// Create driver object for CHROME browser  
driver = new ChromeDriver();  
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver.manage().window().maximize();  
driver.get(baseUrl);  
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
WebElement testDropDown = driver.findElement(By.className("product_sort_container"));  
Select dropdown = new Select(testDropDown); 
dropdown.selectByValue("lohi");  
driver.findElement(By.className("inventory_item_name")).click();
driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
driver.findElement(By.id("checkout")).click(); driver.findElement(By.id("first-name")).sendKeys("Mostafa");
driver.findElement(By.id("last-name")).sendKeys("Gamal");
driver.findElement(By.id("postal-code")).sendKeys("11234");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("finish")).click();
//WebElement elem = driver.findElement(By.xpath("//*[contains(.,'COMPLETE!')]")); 
//if (elem == null)  println("The text is not found on the page!");
//Assert.assertEquals(ExpectedTitle, ActualTitle);
String str = driver.findElement(By.className("title")).getText();
System.out.println(str);







// get the current URL of the page  
//String URL= driver.getCurrentUrl();  
//System.out.print(URL);  
////get the title of the page  
//String title = driver.getTitle();                  
//System.out.println(title);  
}     
private void println(String string) {
	// TODO Auto-generated method stub
	
}
@BeforeTest  
public void beforeTest() {    
System.out.println("before test");  
}     
@AfterTest  
public void afterTest() {  
//driver.quit();  
System.out.println("after test");  
}         
}  