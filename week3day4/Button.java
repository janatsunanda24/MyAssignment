package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
	
		//launch browser
				ChromeDriver driver = new ChromeDriver();
			    driver.get("https://www.leafground.com/button.xhtml");
			    driver.manage().window().maximize();
			    
			    
			    driver.get("https://www.leafground.com/button.xhtml");
			    
			   
				//Click and verify title
				WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
				title.click();
				String title1 = driver.getTitle();
				System.out.println(title1);
				if(title.equals(title1))
				System.out.println("title is verified");
				
				// check if enabled
				boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
				System.out.println(enabled);
				
				//close
				driver.close();
				
				
				
				

	}

}
