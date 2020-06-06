package MonKharap.KharapMon;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class CrossBrowser {
	static WebDriver driver=null;
	
	@BeforeTest
	 @Parameters("browser")
	public void setUp(String browser) throws InterruptedException{
		   if(browser.equalsIgnoreCase("Chrome")) {
			   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
		 	   driver=new ChromeDriver();
		 	   driver.manage().window().maximize();
		   }
		   else
			   if(browser.equalsIgnoreCase("Chrome")) {
				   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
			 	   driver=new ChromeDriver();
			 	   driver.manage().window().maximize();
	   }
			   else if(browser.equalsIgnoreCase("Chrome")) {
				   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
			 	   driver=new ChromeDriver();
			 	   driver.manage().window().maximize();
			   }
		
	 }
		   @Test
		   public void test() throws InterruptedException {
			   
		 driver.get("https://google.com");
		 Thread.sleep(4000);
	   }
	
	@AfterTest
	   public void tearDown() {
		  driver.close(); 
		  System.out.println("Test done");
	   }
}
