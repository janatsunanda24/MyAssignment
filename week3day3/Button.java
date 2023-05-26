package week3day3;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/button.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   
		//Click and Confirm title
		WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
		title.click();
		
		//Confirm if the button is disabled.
		boolean button = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(button);
		
		//Find the position of the Submit button
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		submitButton.getLocation();
		System.out.println(submitButton);
		
		//find the height and width of the button
	    WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		size.getSize();
		
		//close the browser
		driver.close();
		
	    
	    
	}
	

}