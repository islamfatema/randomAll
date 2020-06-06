package MonKharap.KharapMon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListOfElements {

	
	public WebDriver driver; 
	public String url="http://www.google.co.in/";
	
	
	@Test
	public void user_launch_chrome_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
	 	
		driver=new ChromeDriver();
	    driver.get(url);
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("India");
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	   List<WebElement> sugg=driver.findElements(By.xpath("//li[@class='sbct']"));
	for(WebElement ele:sugg) {
		if(ele.getText().equalsIgnoreCase("indiana")) {
			ele.click();
		}
		//driver.close();
	}
	
	}
}
