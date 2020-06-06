package MonKharap.KharapMon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectElement {
	//div[@class='common-typeahead-results-BasicResult__result--1mjnd']
	
//	public WebDriver driver;
//	public String url="https://www.tripadvisor.com/";
//	
//  @Test
//  public void select() throws InterruptedException {
//	  System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
//	 	
//		driver=new ChromeDriver();  
//		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("India");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        List<WebElement> ele=driver.findElements(By.xpath("//div[@class='common-typeahead-results-BasicResult__result--1mjnd']"));
//    for(WebElement element:ele) {
//    	if(element.getText().equalsIgnoreCase("India")) {
//    		element.click();
//    	}
//    	driver.close();
//    }
//  }
	public WebDriver driver;
	public String url="https://rb-shoe-store.herokuapp.com/";
	@BeforeTest
	public void setUp() throws InterruptedException{
		  
			   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
		 	   driver=new ChromeDriver();
		 	   driver.get(url);
		 	   driver.manage().window().maximize();
		   }
	
  @Test
  public void searchText() throws InterruptedException {
	 
		WebElement searchTextBox=driver.findElement(By.xpath("//select[@id='brand']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.click(searchTextBox).click();
		Thread.sleep(3000);
  }
  @Test
  public void selectText() throws InterruptedException {
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='brand']")));
		dropdown.selectByVisibleText("Acorn");
		
    
  }
  @Test
  public void validateAcronShoes(){
  //	WebElement expectedText=driver.findElement(By.xpath("//h2[contains(text(),\"Acorn's Shoes\")]"));
  
  	WebDriverWait wait = new WebDriverWait(driver, 100);
  	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),\"Acorn's Shoes\")]"))).getText();
  	//String actualText="Acorn's Shoes";
  	//Assert.assertEquals(actualText,expectedText);
System.out.println("pooo");
  }
  @AfterTest
  public void tearDown() {
	 // driver.close(); 
	  System.out.println("Test done");
  }
}
