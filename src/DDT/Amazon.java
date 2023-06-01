package DDT;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//thank you
		//gitbash edited prgm
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int size =all_links.size();
		for(int i=0; i<size; i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(all_links.get(i).getAttribute("href"));
		}
		FileOutputStream fos = new FileOutputStream("./Excel/data.xlsx");
		book.write(fos);
	}
	
}
