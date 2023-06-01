package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Amazonfetchexceldata
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream fis = new FileInputStream("./Excel/exceldata1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		c.setCellValue("Bangalore");
		FileOutputStream fos = new FileOutputStream("./Excel/exceldata1.xlsx");
		book.write(fos);
		book.close();
	
	}
	
}
