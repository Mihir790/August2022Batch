package utility;

public class Calling 
{
     public static void main(String[] args) 
     {
    	   Object[] input= new Object[2];
    	            input[0]="webdriver.chrome.driver";
    	            input[1]="D://Automation Support//chromedriver.exe";
    	            SeleniumOperations.browserlaunch(input);
    	            
    	            
    	   Object[] input1= new Object[1];
    	            input1[0]="https://www.flipkart.com/"; 
    	            SeleniumOperations.open_Applications(input1);
    	            
    	            
    	   Object[] input2= new Object[1];
    	            input2[0]="//*[@class='_2KpZ6l _2doB4z']"; 
    	            SeleniumOperations.clickon_Element(input2);
    	                 
    	            
    	   Object[] input3= new Object[1];
    	     	    input3[0]="//*[text()='Login']"; 
    	     	    SeleniumOperations.mouse_Over(input3);
    	     	   
    	     	            
    	   Object[] input4= new Object[1];
   	     	       input4[0]="//*[text()='My Profile']"; 
   	     	       SeleniumOperations.my_Profile(input4);
   	     	       
   	       Object[] input5= new Object[1];
	                input5[0]="(//*[@type='text'])[2]";
	                SeleniumOperations.user(input5);
	          
	       Object[] input6= new Object[1];
	                input6[0]="(//*[@autocomplete='off'])[3]";
	                SeleniumOperations.pass(input6);
	       
	       Object[] input7= new Object[1];
	                input7[0]="//*[text()='Manage Addresses']";
	                SeleniumOperations.validateLogin(input7);
	                 
	               
	       Object[] input8= new Object[1];
   	                input8[0]="(//*[@type='submit'])[2]"; 
   	                SeleniumOperations.login(input8);
   	                
   	                 
   	       Object[] input9= new Object[1];
	                input9[0]="//*[text()='Manage Addresses']"; 
	                SeleniumOperations.manage_Address(input9);
	                 
	              
	       Object[] input10= new Object[1];
	         	    input10[0]="//*[text()='ADD ADDRESSES']"; 
	         	    SeleniumOperations.clickon_Element(input10);  
	         	    
	                
	       Object[] input11= new Object[1];
	     	        input11[0]="//*[@tabindex='1']"; 
	     	        SeleniumOperations.name(input11);
	     	        
	     	        
	       Object[] input12= new Object[1];
	     	        input12[0]="//*[@name='phone']"; 
	     	        SeleniumOperations.Phone(input12);
	     	        
	       Object[] input13= new Object[2];
	     	        input13[0]="//*[@name='pincode']";
	     	        input13[1]="//*[@tabindex='4']";
	     	        SeleniumOperations.pin_Locality(input13);
	     	        
	       Object[] input14= new Object[1];
	     	        input14[0]="//*[@name='addressLine1']"; 
	     	        SeleniumOperations.address(input14);     
	     	        
	     	        
	       Object[] input15= new Object[2];
	     	        input15[0]="//*[@name='landmark']";
	     	        input15[1]="(//*[@autocomplete='off'])[3]";
	     	        SeleniumOperations.mark_alt(input15);
	     	        
	       Object[] input16= new Object[1];
   	                input16[0]="//*[text()='Home']"; 
   	                SeleniumOperations.clickon_Element(input16);
   	                    
   	       Object[] input17= new Object[1];
	                input17[0]="(//*[@type='button'])[2]"; 
	                SeleniumOperations.clickon_Element(input17);
     }
}
