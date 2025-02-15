package seleniumprctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
	    WebElement w1=driver.findElement(By.id("draggable"));
	    WebElement w2=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(w1, w2).perform();
		
	    WebElement ww=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	    ac.doubleClick(ww).perform();
	    
	   WebElement w3= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
	   ac.moveToElement(w3).perform();

	}

}
