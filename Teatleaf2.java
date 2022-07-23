package WEEKLY.ASSSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teatleaf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input[1]")).sendKeys("arun");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//a[text()='10206']")).click();
        String Title =  driver.getTitle();
        System.out.println(Title);
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        WebElement l = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
        l.sendKeys("INFO");
        driver.findElement(By.xpath("//input[@CLASS='smallSubmit']")).click();
        String val= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
        if(val.equals("INFO (10206)")) {
        System.out.println("company name changed succefully");
        }
        driver.close();
        
      
        
	}

}
