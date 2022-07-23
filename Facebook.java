package WEEKLY.ASSSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arun");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("arun");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("7094878478");
        Select obj = new Select( driver.findElement(By.xpath("//select[@id='day']")));
        obj.selectByVisibleText("21");
        Select object = new Select( driver.findElement(By.xpath("//select[@id='month']")));
        object.selectByVisibleText("Aug");
        Select object2 = new Select( driver.findElement(By.xpath("//select[@id='year']")));
        object2.selectByVisibleText("1997");
        driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[1]")).click();
     
        
	}

}
