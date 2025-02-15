package seleniumprctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		//Single file
	/*	driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt");
		if(driver.findElement(By.id("fileList")).getText().equals("sonali.txt")) 
		{
			System.out.println("File is upload successfully");
		}
		else 
		{
			System.out.println("File fail");
		}*/
		
		//multiple file
		
	   String file1="C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt";
	   String file2="C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali2.txt";
	   driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
	   
	int count=   driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	if(count==2) 
	{
		System.out.println("file uploaded sucessfully");
	}
	else 
	{
		System.out.println("file failed");
	}

	}

}
