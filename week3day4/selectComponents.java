package week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectComponents {

	public static void main(String[] args) {
	
		 //launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//select automation tool
		WebElement automationTool = driver.findElement(By.className("ui-selectonemenu"));
		Select autoTool = new Select(automationTool);
		autoTool.selectByVisibleText("Selenium");
		
		//select country
		WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.click();
		WebElement preferedCountry = driver.findElement(By.xpath("//li[@data-label='India']"));
		preferedCountry.click();
		
		//select city
		WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		city.click();
		WebElement favCity = driver.findElement(By.xpath("//label[text()='Chennai']"));
		favCity.click();
		
		//choose course
		WebElement course = driver.findElement(By.className("ui-button-text"));
		WebElement favCourse = driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']"));
		course.click();
		
		

	}

}
