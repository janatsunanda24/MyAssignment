package week3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createContact {

	public static void main(String[] args) {
		
		 //Pseudo Code
		 
		 //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();                                                      
		 driver.get("http://leaftaps.com/opentaps/"); 
		 
		 //2.Enter UserName and Password Using Id Locator
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("DemoSalesManager");
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("crmsfa");
		  
		 //3. Click on Login Button using Class Locator
		 WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		 loginButton.click(); 
		 
		 //4. Click on CRM/SFA Link
		 WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));   
		 crmsfa.click();
		 
		 // 5. Click on contacts Button
		 WebElement contacts = driver.findElement(By.linkText("Contacts"));  
		 contacts.click();
		 
		 // 6. Click on Create Contact
		 WebElement createContact = driver.findElement(By.linkText("Create Contact")); 
		 createContact.click();
		   
		// 7. Enter FirstName Field Using id Locator
		 WebElement firstName = driver.findElement(By.id("firstNameField")); 
		 firstName.sendKeys("janat");
		  
		// 8. Enter LastName Field Using id Locator
		 WebElement lastName = driver.findElement(By.id("lastNameField")); 
		 lastName.sendKeys("victor");
		 
		// 9. Enter FirstName(Local) Field Using id Locator
		 WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal")); 
		 firstNameLocal.sendKeys("sunanda");
		 
		  
		// 10. Enter LastName(Local) Field Using id Locator
		 WebElement lastNameLocal = driver.findElement(By.name("lastNameLocal")); 
		 lastNameLocal.sendKeys("sylvester");
		 
		 
		// 11. Enter Department Field Using any Locator of Your Choice
		 WebElement Department = driver.findElement(By.name("departmentName")); 
		 Department.sendKeys("training");
		 
		  
		// 12. Enter Description Field Using any Locator of your choice 
		 WebElement Description = driver.findElement(By.name("description")); 
		 Description.sendKeys("training the employee");
		 
		 
		 // 13. Enter your email in the E-mail address Field using the locator of your choice
		 WebElement emailAddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		 emailAddress.sendKeys("janatvictor24@gmail.com");
		  
		 // 14. Select State/Province as NewYork Using Visible Text

	     WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	     Select province = new Select(state);
	     province.selectByVisibleText("New York");
	     
		 
		 // 15. Click on Create Contact
	     WebElement createContact1 = driver.findElement(By.name("submitButton"));
		 createContact1.click();
			
		 
		 // 16. Click on edit button 
		 WebElement edit  = driver.findElement(By.linkText("Edit"));
		 edit.click();
		 
		 // 17. Clear the Description Field using .clear
		 WebElement clearDescription  = driver.findElement(By.linkText("description"));
		 clearDescription.clear();
		 
		 
		 // 18. Fill ImportantNote Field with Any text  
		 WebElement importantNote = driver.findElement(By.name("importantNote")); 
		 importantNote.sendKeys("contact info; 7398776541");
		 
		 
		 // 19. Click on update button using Xpath locator
		 WebElement update = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		 update.click();
		 
		 
		 // 20. Get the Title of Resulting Page.
         String resultingPage = driver.getTitle();
         System.out.println("page Title=" +resultingPage);



	}

}
