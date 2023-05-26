package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		
			//Step 1: To open the ChromeDriver
		    ChromeDriver driver = new ChromeDriver();
		
			//Step 2: Load the Application Url as 'https://www.facebook.com/'
		    driver.get("https://www.facebook.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
			//Step 3: Maximize the Browser
		    driver.manage().window().maximize();
		  
			//Step 4: Click on Create New Account button
		    WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		    newAccount.click();
		    
			//Step 5: Enter first name
		    WebElement firstName = driver.findElement(By.name("firstname"));
		    firstName.sendKeys("sunanda");
		    
			//Step 6: Enter last name
		    WebElement surName = driver.findElement(By.name("lastname"));
		    surName.sendKeys("sylvester");
		    
			//Step 7: Enter your mobile number
		    WebElement phone = driver.findElement(By.name("reg_email__"));
		    phone.sendKeys("9876543212");
		    
			//Step 8: Enter your password
		    WebElement password = driver.findElement(By.id("password_step_input"));
		    password.sendKeys("brunaACuite");
		    
			//Step 9: Select  date
		    WebElement date = driver.findElement(By.id("day"));
		    Select date1 = new Select(date);
		    date1.selectByVisibleText("24");
		
			//Step 10: Select month
		    WebElement month = driver.findElement(By.id("month"));
		    Select month1 = new Select(month);
		    month1.selectByVisibleText("Jan");
		    
			//Step 11: Select year
		    WebElement year = driver.findElement(By.id("year"));
		    Select year1 = new Select(year);
		    year1.selectByVisibleText("1999");
		    
			//Step 12: Click on your Gender
		    WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		    gender.click();
		    
		    
			//Step 13: Close your Browser
		    driver.close();


	}

}
