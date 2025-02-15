package seleniumprctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("mytext1")).sendKeys("vivan");
		driver.switchTo().defaultContent();
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext2")).sendKeys("sonali");
		driver.switchTo().defaultContent();
		
	   WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	   driver.switchTo().frame(frame3);
	   driver.findElement(By.name("mytext3")).sendKeys("mahesh");
	   
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	   driver.switchTo().defaultContent();
	   
	   WebElement frame4= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	   driver.switchTo().frame(frame4);
	   driver.findElement(By.name("mytext4")).sendKeys("myra");
	   driver.switchTo().defaultContent();
	   
	}

}
