package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
   public static void main(String[]args) throws InterruptedException 
   {
	  
	  System.setProperty("webdriver.chrome.driver", "D://Automation Support//chromedriver.exe");
	  ChromeDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://www.flipkart.com/");
	  driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	  
	  Actions act= new Actions(driver);
	  
	  WebElement abc= driver.findElementByXPath("//*[text()='Login']");
	  act.moveToElement(abc).build().perform();
	  
	  driver.findElementByXPath("//*[text()='My Profile']").click();
	  
	  driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("7219300620");
	  
	  driver.findElementByXPath("(//*[@autocomplete='off'])[3]").sendKeys("Mhkkul@56");
	  
	 driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	 
	 WebElement a= driver.findElementByXPath("//*[text()='Manage Addresses']");
	
	 
	 try
	 {
		 a.click();
	 }
	 catch( StaleElementReferenceException e)
	 {
		 a= driver.findElementByXPath("//*[text()='Manage Addresses']");
		 a.click();
			
	 }
	 
	 driver.findElementByXPath("//*[text()='ADD ADDRESSES']").click();
	 
	 driver.findElementByXPath("//*[@tabindex='1']").sendKeys("Mihir Hemant Kulkarni");
	 
	 driver.findElementByXPath("//*[@name='phone']").sendKeys("7219300620");
	 
	 driver.findElementByXPath("//*[@name='pincode']").sendKeys("414003");
	 
	 driver.findElementByXPath("//*[@tabindex='4']").sendKeys("Ahmednagar");
	 
	 driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Puhpak bunglow near to mansi apartment behind manavmandir bunglow near to daule hospital savedi, Ahmednagar");
	 
	 driver.findElementByXPath("//*[@name='landmark']").sendKeys("Manavmandir Bunglow");
	 
	 driver.findElementByXPath("(//*[@autocomplete='off'])[3]").sendKeys("9960103727");
	 
	 driver.findElementByXPath("//*[text()='Home']").click();
	 
	 driver.findElementByXPath("(//*[@type='button'])[2]").click();
	 
	
	
	
			  
	 
	  
	    
   }
}
