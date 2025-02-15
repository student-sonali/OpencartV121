package seleniumprctice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
	/*	driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Alert ss=driver.switchTo().alert();
		Thread.sleep(5000);
		ss.accept();*/
		
	/*	driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
		//a.accept();
		a.dismiss();*/
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("sonali");
		//a.accept();
		a.dismiss();
		
		

	}

}
