package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata {

@DataProvider(name="testdata")	
public String[][] getData(Method m) throws EncryptedDocumentException, IOException
{
	File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
    FileInputStream fis=new FileInputStream(f); 
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sheetname=wb.getSheet(m.getName());
    int rowcount=sheetname.getLastRowNum();
    System.out.println(rowcount);
    Row rowcells=sheetname.getRow(0);
    int colcount=rowcells.getLastCellNum();
    System.out.println(colcount);
     
    DataFormatter format=new DataFormatter();
    String testData[][]=new String[rowcount][colcount];
    for (int i=1;i<=rowcount;i++)
    {
    	for (int j=0;j<colcount;j++)
    	{
    		testData[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
             System.out.println(testData[i-1][j]);    	
    	}
    }
       return testData;
}

}
