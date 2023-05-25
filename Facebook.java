package week3day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//download and set path
		ChromeDriver driver =  new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load url
		driver.get("https://en-gb.facebook.com/");
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on create new account button
		WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createNewAccount.click();
	
	//enter first name
	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstName.sendKeys("sunanda");
	//enter surname
	WebElement surname = driver.findElement(By.name("lastname"));
	surname.sendKeys("sylvester");
	//enter mobile number
	WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
	mobileNumber.sendKeys("9876543210");
	//enter password
	WebElement password = driver.findElement(By.id("password_step_input"));
	password.sendKeys("brunoacutie");
	
	
	//enter date
	WebElement date = driver.findElement(By.id("day"));
	Select day = new Select(date);
	day.selectByIndex(23);

	//enter month
	WebElement monthMM = driver.findElement(By.id("month"));
	Select month = new Select(monthMM);
	month.selectByIndex(0);
	
	//enter year
	WebElement yearyy = driver.findElement(By.id("year"));
	Select yearYY = new Select(yearyy);
	yearYY.selectByVisibleText("1999");
	
	//select female
	WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
	gender.click();
	
	//close the window
	driver.close();
	
	
	
	
	
	
	
	
		
		
		

	}

}
