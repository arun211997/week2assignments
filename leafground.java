package WEEKLY.ASSSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafground {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leafground.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	        //getTitle
	        System.out.println("The title is :"+driver.getTitle());
	        
	        //getCurrentUrl
	        System.out.println("The title is :"+driver.getCurrentUrl());
	        
	        //getPageSource
	        System.out.println("The title is :"+driver.getPageSource());


	}

}
