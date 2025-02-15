package seleniumprctice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//fullpage
		TakesScreenshot sc= (TakesScreenshot)driver;
		/*File source=sc.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		source.renameTo(target);*/
		
		//spceific area
	/*WebElement w=driver.findElement(By.xpath("//div[@class='header-title']"));
	File source=w.getScreenshotAs(OutputType.FILE);
	File target= new File(System.getProperty("user.dir")+"\\screenshots\\specific area.png");
	source.renameTo(target);*/
	
	//specific element
		    WebElement w=driver.findElement(By.xpath("//p[@class='demo-intro']"));
			File source= w.getScreenshotAs(OutputType.FILE);
			File target= new File(System.getProperty("user.dir")+"\\screenshots\\specificelement.png");
            source.renameTo(target);

	}

}
