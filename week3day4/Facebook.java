package week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
	
		//Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2: Load the Application Url as 'https://www.tamilmatrimony.in/'
		driver.get("https://www.tamilmatrimony.in");
		
		//Step 3: Maximize the Browser
		driver.manage().window().maximize();
		
		//Step 4: Select the Matrimony profile for YourSelf
		WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		Select profile1 = new Select(profile);
		profile1.selectByVisibleText("Daughter");
		
		
		//Step 5: Enter Name
		WebElement name = driver.findElement(By.name("NAME"));
		name.sendKeys("janat");
		
		//Step 6: Click on Gender
		WebElement gender = driver.findElement(By.id("genderfemale"));
		gender.click();
		
		//Step 7: Select your Date of Birth
		WebElement date = driver.findElement(By.id("DOBDAY"));
		Select date1 = new Select(date);
		date1.selectByVisibleText("24");
		
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1999");
		
		//Step 8: Select your Religion
		
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religion1 = new Select(religion);
		religion1.selectByVisibleText("Christian - Catholic");
		
		
		//Step 10: Select your Mother Tongue
		WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
		motherTongue.click();
		
		//Step 11: Select your country
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		
		//Step 12: Enter your MobileNumber
		WebElement phone = driver.findElement(By.id("MOBILENO"));
		phone.sendKeys("9876543212");
		
		//Step 13: Enter your E-mail ID
		WebElement email = driver.findElement(By.id("EMAIL"));
		email.sendKeys("sunandasylvester24@gmail.com");
		
		//Step 14: Close the Browser
		driver.close();

		
		

	}

}
