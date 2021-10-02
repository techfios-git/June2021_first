package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\June2021_Selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //object variable
		
		//maximize
		driver.manage().window().maximize();
		//get web site
		driver.get("https://www.google.com/");
		
		//identify web element and perform actoin
		driver.findElement(By.name("q")).sendKeys("selenium");
//		driver.findElement(By.name("btnK")).click();
		
		//wait 
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
