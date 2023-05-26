package week3day3;

import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select fav automation tool
		WebElement automationTool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		Select favTool = new Select(automationTool);
		favTool.selectByVisibleText("Playwright");
		
		//choose country
		WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.click();
		WebElement preferedCountry = driver.findElement(By.xpath("//li[@data-label='India']"));
		preferedCountry.click();
		
		
		
		//select city
		WebElement city = driver.findElement(By.xpath("//label[text()='Select City']"));
		city.click();
		WebElement favCity = driver.findElement(By.xpath("//label[text()='Chennai']"));
		favCity.click();
		
		
		
		//choose the course
		WebElement course = driver.findElement(By.className("ui-button-text"));
		WebElement favCourse = driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']"));
		course.click();
		
		//choose language
		WebElement language = driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all"));
		Select randomLanguage = new Select(language);
		randomLanguage.selectByVisibleText("Tamil");
		
		//

	}

}
