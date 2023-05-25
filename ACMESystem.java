package week3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMESystem {

	public static void main(String[] args) {
		//load url and maximize
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
        //enter email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		//enter passwor
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("leaf@12");
		//click login
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		//logout
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		//close
		//driver.close();
		
	}

}
