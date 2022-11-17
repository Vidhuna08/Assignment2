package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	   
	    driver.findElement(By.linkText("Find Leads")).click();
	    
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    
	    driver.findElement(By.name("phoneCountryCode")).clear();
	    
	    driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("9600057495");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String leadid = driver.findElement(By.xpath("//a[text()='10723']")).getText();
		System.out.println(leadid);
		
		

}
	}