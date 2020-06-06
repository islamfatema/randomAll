package MonKharap.KharapMon;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cognizant {
	public WebDriver driver;
	public String url="";
	 @Test
	 public void test() {
	String str="aabbssdll";
	for(int i=0;i<str.length();i++) {
		if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
			System.out.println(str.charAt(i));
		}
	}
	 }
//	  public void testingCgnizant() {
//		  System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
//		  driver=new ChromeDriver(); 
//		  
//			
//	    	}
	
}