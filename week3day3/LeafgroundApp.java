package week3day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundApp {

	public static void main(String[] args) {
    //launch browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/input.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//enter name
	WebElement name = driver.findElement(By.name("j_idt88:name"));
	name.sendKeys("janat");
	
	//add country name
	WebElement country = driver.findElement(By.name("j_idt88:j_idt91"));
	country.sendKeys(", India");
	
	//check is enabled
	boolean textBoxDisable = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
	System.out.println(textBoxDisable);
	
	//clear the text
	WebElement clearText = driver.findElement(By.name("j_idt88:j_idt95"));
	clearText.clear();
	
	//Retrieve the text
	String retrivedText = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
	driver.findElement(By.id("j_idt88:j_idt97")).sendKeys(Keys.TAB);
	
	//type email and use tab key
	WebElement email = driver.findElement(By.name("j_idt88:j_idt99"));
	email.sendKeys("janatvictor24@gmail.com");
	email.sendKeys(Keys.TAB);
	
	//type about yourself
	WebElement aboutYourself = driver.findElement(By.name("j_idt88:j_idt101"));
	aboutYourself.sendKeys("Iam an organised person");
	
	//textEditor
	WebElement textEditor = driver.findElement(By.className("ql-italic"));
	textEditor.click();
	WebElement enterText = driver.findElement(By.className("ql-cursor"));
	enterText.sendKeys("all is well");
	
	//press Enter and confirm error message
	WebElement enter = driver.findElement(By.name("j_idt106:thisform:age"));
	enter.sendKeys(Keys.ENTER);
	boolean errorMessage = driver.findElement(By.className("ui-message-error-detail")).isDisplayed();
	System.out.println(errorMessage);
	
	//click and confirm label position
	WebElement labelPosition = driver.findElement(By.id("j_idt106:j_idt113"));
	Point originalPosition = labelPosition.getLocation();
	Point changedLoc = labelPosition.getLocation();
	
	if(!originalPosition.equals(changedLoc)){
		System.out.println("location changed");
		
	}
	
	//type name and choose 3rd position
	WebElement name1 = driver.findElement(By.name("j_idt106:auto-complete_input"));
	name1.sendKeys("janat");
	WebElement thirdIndex = driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]"));
	thirdIndex.click();
	
	
	//type dob and confirm dob
	WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
	dob.sendKeys("24/01/1999");
	WebElement checkDob = driver.findElement(By.linkText("24"));
	

	
	//type and spin to confirm value changed
	WebElement typeValue = driver.findElement(By.name("j_idt106:j_idt118_input"));
	typeValue.sendKeys("6");
	WebElement spin = driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a"));
	spin.click();
	String newValue = typeValue.getText();
	if(!newValue.equals("6"));
	System.out.println("value is changed");
	
	//type and confirm if slider moves
	
	
	
	//click and confirm whether keyboard appears
	WebElement keyboard = driver.findElement(By.id("j_idt106:j_idt122"));
	keyboard.click();
	boolean keyboard1 = driver.findElement(By.xpath("//div[contains(@class,'shadow keypad-popup')]")).isDisplayed();
	System.out.println(keyboard1);
	
	//
	WebElement underline = driver.findElement(By.className("ql-underline"));
	underline.click();
	WebElement text = driver.findElement(By.className("ql-editor ql-blank"));
	text.sendKeys("all is well");
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

