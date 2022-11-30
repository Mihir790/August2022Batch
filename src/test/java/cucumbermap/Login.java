package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	
	@When ("^user provide \"(.*)\" and exe location as \"(.*)\"$")
	public void bLaunch(String key, String value)
	{
		 Object[] input= new Object[2];
         input[0]=key;
         input[1]=value;
         SeleniumOperations.browserlaunch(input);     	
	}
	
	 @When ("^user provide url as \"(.*)\"$")
	  public void openApp(String url)
	 {
		 Object[] input1= new Object[1];
         input1[0]=url; 
         SeleniumOperations.open_Applications(input1);
	 }
	
	 @When ("^user cancel initial login page$")
	 public void clickOn_Cancel()
	 {
		Object[] input2= new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']"; 
        SeleniumOperations.clickon_Element(input2);
	 }
	
	 @When ("^user navigate to login$")
	 public void mouse_Over()
	 {
   	   Object[] input3= new Object[1];
   	     	    input3[0]="//*[text()='Login']"; 
   	     	Hashtable<String, Object> output3= SeleniumOperations.mouse_Over(input3);
   	  HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user navigate to login$" , output3.get("MESSAGE").toString());
  
   	     	
	 }
	
	 @When ("^user click on My Profile$")
	 public void my_Profile()
	 {
		   Object[] input4= new Object[1];
  	                input4[0]="//*[text()='My Profile']"; 
  	              Hashtable<String, Object> output4=  SeleniumOperations.my_Profile(input4);
 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on My Profile$" , output4.get("MESSAGE").toString());
  	            
	 }
	 
	 @When ("^user enter \"(.*)\" as username$")
	 public void username(String username)
	 {
		 Object[] input5= new Object[1];
                  input5[0]="(//*[@type='text'])[2]";
                  Hashtable<String, Object> output5=  SeleniumOperations.user(input5);
  HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
	 }
	 
	@When ("^user enter \"(.*)\" as password$")
	public void password(String Password)
	{
		Object[] input6= new Object[1];
                 input6[0]="(//*[@autocomplete='off'])[3]";
                 Hashtable<String, Object> output6=  SeleniumOperations.pass(input6);  
 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
	}
	
	@When ("^user click on login page$")
	public void click()
	{
            Object[] input7= new Object[1];
                     input7[0]="(//*[@type='submit'])[2]"; 
               Hashtable<String, Object> output7=  SeleniumOperations.login(input7);
   HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on login page$", output7.get("MESSAGE").toString());   
 
	}
	
	@Then("^application shows user profile to user$")
	public void application_shows_user_profile_to_user() 
	{
		 Object[] input8= new Object[2];
		 input8[0]= "Manage Addresses";
         input8[1]="//*[text()='Manage Addresses']";
         Hashtable<String, Object> output8=  SeleniumOperations.validateLogin(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^application shows user profile to user$", output8.get("MESSAGE").toString());
  
         
          
	}
	

}