package seleniumprctice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement w=	driver.findElement(By.xpath("//select[@id='country']"));
	//w.click();
		Select ss= new Select(w);
		//ss.selectByIndex(4);
		
		//ss.selectByValue("india");
		
		ss.selectByVisibleText("France");
		Thread.sleep(5000);
		
		System.out.println(ss.isMultiple());
		List<WebElement> ll=ss.getOptions();
		System.out.println(ll.size());
		
		for(WebElement dd:ll) 
		{
			System.out.println(dd.getText());
			
		}
		
		
		

	}

}
