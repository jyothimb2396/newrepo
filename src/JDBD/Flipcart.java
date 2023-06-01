package JDBD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipcart
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(2000);
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		Thread.sleep(2000);
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("projectName")).sendKeys("Meesho");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("jyothi");
		WebElement ele = driver.findElement(By.xpath("//input[@name='createdBy']/../following-sibling::div/select"));
		Select s = new Select(ele);
		s.selectByVisibleText("On Gogin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
	}
}
