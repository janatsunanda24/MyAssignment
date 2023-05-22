package weeek3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                                        
public class LoginIn {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();                                                      // Maximize the window
		driver.get("http://leaftaps.com/opentaps/");                                              // Load the url
		WebElement username = driver.findElement(By.id("username"));                             // Locate username field
		username.sendKeys("DemoSalesManager");                                                   //enter username as DemoSalesManager
		WebElement password = driver.findElement(By.id("password"));                             //Locate password field
		password.sendKeys("crmsfa");                                                             //Enter password as crmsfa
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit")); 
		loginButton.click();                                                                     //click login         
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));                          // Click on the crmsfa link
		crmsfa.click();
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));                            // Click on the leads tab
		leadsTab.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));                      
		createLead.click();                                                                        //Click on the create lead 
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));   //Enter companyName as TestLeaf
		companyName.sendKeys("testLeaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));       //Enter first name as janat
		firstName.sendKeys("janatSunanda");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));         //Enter lastName as sunanda
		lastName.sendKeys("sunanda");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Janat");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));   //enter department name as abc
		department.sendKeys("abc");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));   //enter description as abc     
		description.sendKeys("rolesAndResponsibilities");
		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("janatvictor24@gmail.com");
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		
		Thread.sleep(3000);
		driver.close();  
		
                                                                                                //To close the window
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	