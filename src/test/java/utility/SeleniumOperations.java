package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{ 
	   public static ChromeDriver driver= null;
	   public static Actions act= null;
	   public static Hashtable<String, Object> outputParameters= new Hashtable<String, Object>();
	 
	      public static Hashtable<String, Object> browserlaunch(Object[]inputParameters)
	      {
	    	    try
	    	    {
		        String key= (String) inputParameters[0];
		        String value= (String) inputParameters[1];
		  
		        System.setProperty(key, value);
		        driver= new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		        outputParameters.put("STATUS", "PASS");
		        outputParameters.put("MESSAGE", "methodUsed:browserlaunch, InputGiven:" + inputParameters[0].toString());
		      
	    	    }
	    	    catch(Exception e)
	    	    {
	    	    	 outputParameters.put("STATUS", "FAIL");
	 		        outputParameters.put("MESSAGE", "methodUsed:browserlaunch, InputGiven:" + inputParameters[0].toString());
	    	    }
	    	    return outputParameters;
          }
	      
	 
	     public static Hashtable<String, Object> open_Applications(Object[]inputParameters)
	     {       try
	            {
		           String url= (String) inputParameters[0];
		           driver.get(url);
		           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		           outputParameters.put("STATUS", "PASS");
			       outputParameters.put("MESSAGE", "methodUsed:open_Applications, InputGiven:" + inputParameters[0].toString());
			       
	    	    }
		           
	            
	            catch(Exception e)
 	           {
	            	   outputParameters.put("STATUS", "FAIL");
				       outputParameters.put("MESSAGE", "methodUsed:open_Applications, InputGiven:" + inputParameters[0].toString());
			           
 	           }
	        return outputParameters;
	     }
	    
	 
	     public static Hashtable<String, Object> clickon_Element(Object[]inputParameters)
	     {
	    	 try
	    	 {
		     String cancel= (String) inputParameters[0];
		     driver.findElementByXPath(cancel).click();
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     outputParameters.put("STATUS", "PASS");
		     outputParameters.put("MESSAGE", "methodUsed:clickon_Element, InputGiven:" + inputParameters[0].toString());
		   
	    	    
		     
	    	 }
	    	 catch(Exception e)
	    	    {
	    		 outputParameters.put("STATUS", "FAIL");
			     outputParameters.put("MESSAGE", "methodUsed:clickon_Element, InputGiven:" + inputParameters[0].toString());
			     
	    	    }
	    	 return outputParameters;
	     }
	     
	   
	     public static Hashtable<String, Object> mouse_Over(Object[]inputParameters)
	     {    
	    	   try
	    	   {
	    	   act= new Actions(driver);
	    	   String mouse= (String) inputParameters[0];
	    	   WebElement abc= driver.findElementByXPath(mouse);
	    	   act.moveToElement(abc).build().perform();
	    	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	   outputParameters.put("STATUS", "PASS");
			   outputParameters.put("MESSAGE", "methodUsed:mouse_Over, InputGiven:" + inputParameters[0].toString());
		 
	    	   }
	    	   catch(Exception e)
	    	    {
	    		   outputParameters.put("STATUS", "FAIL");
				   outputParameters.put("MESSAGE", "methodUsed:mouse_Over, InputGiven:" + inputParameters[0].toString());
	    	    }
	    	   
	    	   return outputParameters;
	    	   	   	   
	     }
	     
	     public static Hashtable<String, Object> my_Profile(Object[]inputParameters)
	     {
	    	 try
	    	 {
	    	 String profile= (String) inputParameters[0];
	    	 driver.findElementByXPath(profile).click();
	    	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	 outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE", "methodUsed:my_Profile, InputGiven:" + inputParameters[0].toString());
	
	    	    
	    	 
	    	 }
	    	 catch(Exception e)
	    	    {
	    		 outputParameters.put("STATUS", "PASS");
				 outputParameters.put("MESSAGE", "methodUsed:my_Profile, InputGiven:" + inputParameters[0].toString());
	    	    }
	    	 return outputParameters;
	     }
	     
	     public static Hashtable<String, Object> user(Object[]inputParameters)
	     {
	    	 try
	    	 {
	    	 String username= (String) inputParameters[0];
	    	 driver.findElementByXPath(username).sendKeys("7219300620");
	    	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	 outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE", "methodUsed:user, InputGiven:" + inputParameters[0].toString());
			 
	    	    
	    	 
	    	 }
	    	 catch(Exception e)
	    	    {
	    		 outputParameters.put("STATUS", "FAIL");
				 outputParameters.put("MESSAGE", "methodUsed:user, InputGiven:" + inputParameters[0].toString());
		    	 
	    	    }
	    	 return outputParameters;
	     }
	     
	     public static  Hashtable<String, Object> pass(Object[]inputParameters)
	     {
	    	 try
	    	 {
	    	 String Password= (String) inputParameters[0];
	    	 driver.findElementByXPath(Password).sendKeys("Mhkkul@56");
	    	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	 outputParameters.put("STATUS", "PASS");
			 outputParameters.put("MESSAGE", "methodUsed:pass, InputGiven:" + inputParameters[0].toString());
	    	 
	    	 }
	    	 catch(Exception e)
	    	    {
	    		 outputParameters.put("STATUS", "FAIL");
				 outputParameters.put("MESSAGE", "methodUsed:pass, InputGiven:" + inputParameters[0].toString());
		    	 
	    	    }
	    	 return outputParameters;
	     }
	     
	     public static Hashtable<String, Object> login(Object[]inputParameters)
	     {
	    	 try
	    	 {
	    	  String Login= (String) inputParameters[0];
	    	  driver.findElementByXPath(Login).click();
	    	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	  outputParameters.put("STATUS", "PASS");
			  outputParameters.put("MESSAGE", "methodUsed:login, InputGiven:" + inputParameters[0].toString());
		    	 
	    	  
	    	 }
	    	 catch(Exception e)
	    	    {
	    		  outputParameters.put("STATUS", "FAIL");
				  outputParameters.put("MESSAGE", "methodUsed:login, InputGiven:" + inputParameters[0].toString());
	    	    }
	    	 return outputParameters;
	     }
	     
	     public static Hashtable<String, Object> validateLogin(Object [] inputParameters)
	     {
	       try
	      {  
	    	   String requiredtext= (String) inputParameters[0];
	    	   String manage = (String) inputParameters[1];
	    	    String catchtext= null;
	    	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	    outputParameters.put("STATUS", "PASS");
			    outputParameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven:" + inputParameters[0].toString());
	    	    
	    	    try
	    	   {
	    		  catchtext= driver.findElementByXPath(manage).getText();
	    	   }
	    	   catch(StaleElementReferenceException e)
	    	   {
	    		  catchtext= driver.findElementByXPath(manage).getText();
	    	    }
	    	 
	    	
	    	 
	    	    if(catchtext.equalsIgnoreCase(requiredtext))
	    	    {
	    		   System.out.println("Test Case Pass");
	    	    }
	    	   else
	    	   {
	    		 System.out.println("Test Case Fail");
	    	   }
	    	}
	        catch(Exception e)
   	       {
	        	    outputParameters.put("STATUS", "FAIL");
				    outputParameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven:" + inputParameters[0].toString()); 
   	        }
	       return outputParameters;
	     }
	     
	     public static void manage_Address(Object[]inputParameters)
	     {
	    	 try
	    	 {
	    	  String Manage= (String) inputParameters[0];
	    	  WebElement a= driver.findElementByXPath(Manage);
	    	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	 
	    	  try
	    	  {
	    		  a.click();
	    	  }
	    	  catch(StaleElementReferenceException e)
	    	  {
	    		   a= driver.findElementByXPath(Manage);
	    		   a.click();
	    	  }
	    	 }
	    	 catch(Exception e)
	    	    {
	    	    	System.out.println(e);
	    	    }
	     }
	     
	    public static void name(Object[]inputParameters)
	    {
	    	try
	    	{
	    	String Name= (String) inputParameters[0];
	    	driver.findElementByXPath(Name).sendKeys("Mihir Hemant Kulkarni");
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	}
	    	catch(Exception e)
    	    {
    	    	System.out.println(e);
    	    }
	    }
	  
	  
	    public static void Phone(Object[]inputParameters)
	    {
	    	try
	    	{
	    	String phone= (String) inputParameters[0];
	    	driver.findElementByXPath(phone).sendKeys("7219300620");
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	}
	    	catch(Exception e)
    	    {
    	    	System.out.println(e);
    	    }
	    }
		 
	 

	   public static void pin_Locality(Object[]inputParameters)
	    {
		   try
		   {
	    	String Pincode= (String) inputParameters[0];
	    	String Locality= (String) inputParameters[1];
	    	driver.findElementByXPath(Pincode).sendKeys("414003");
	    	driver.findElementByXPath(Locality).sendKeys("Ahmednagar");
		   }
		   catch(Exception e)
   	       {
   	    	 System.out.println(e);
   	       }
	    }
	   
	   public static void address(Object[]inputParameters)
	   {
		   try
		   {
		   String address= (String) inputParameters[0];
		   driver.findElementByXPath(address).sendKeys("Puhpak bunglow near to mansi apartment behind manavmandir bunglow near to daule hospital savedi, Ahmednagar");
		   }
		   catch(Exception e)
   	       {
   	    	 System.out.println(e);
   	       }
	   }
		   
	   
	   public static void mark_alt(Object[]inputParameters)
	   {
		   try
		   {
		   String Landmark= (String) inputParameters[0];
		   String Alternate_ph= (String) inputParameters[1];
		   driver.findElementByXPath(Landmark).sendKeys("Manavmnadir Bunglow");
		   driver.findElementByXPath(Alternate_ph).sendKeys("9960103727");
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   }
		    catch(Exception e)
   	      {
   	    	System.out.println(e);
   	      }
	   }
		 
	  
	 
}
