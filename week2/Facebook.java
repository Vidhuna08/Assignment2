package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Maximize the window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts();
		// Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Vidhuna");
		//Enter the last name/
		driver.findElement(By.name("lastname")).sendKeys("Sri");
		// Enter the MobileNumber
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		//Password
		driver.findElement(By.id("password_step_input")).sendKeys("Vidhuna@08");
		//Handle all the three drop downs
		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day =new Select(birthDay);
		day.selectByValue("29");
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month =new Select(birthMonth);
		month.selectByValue("12");
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year =new Select(birthYear);
		year.selectByVisibleText("1992");
		//Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//driver.findElement(By.name("websubmit")).click();
	}
}


