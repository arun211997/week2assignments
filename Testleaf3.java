package WEEKLY.ASSSIGNMENTS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaf3 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup(); 
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//div[@id='label']/a")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scr, new File("I:\\Eclipse\\snapshots\\snap02.png"));
	    driver.findElement(By.xpath("//a[text()='14703']")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']/input[1]")).sendKeys("14703");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String str = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
        if(str.equals("No records to display")){
        	System.out.println("deletion successful");
        }
        driver.close();
        		
        

	}

}
