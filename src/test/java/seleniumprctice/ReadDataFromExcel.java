package seleniumprctice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\OpencartV121\\testData\\Testdataopencart1.xlsx");
        XSSFWorkbook book= new XSSFWorkbook(file);
        XSSFSheet sheet= book.getSheet("sheet1");
        int rowcount= sheet.getLastRowNum();
        int cellcount= sheet.getRow(1).getLastCellNum();
        
        System.out.println(rowcount+" "+cellcount);
        for(int r=0;r<=rowcount;r++) 
        {
        	XSSFRow currentrow=sheet.getRow(r);
        	for(int c=0;c<cellcount;c++) 
        	{
        		XSSFCell currentcell=currentrow.getCell(c);
        		System.out.print(currentcell.toString()+"\t");
        		
        	}
        	System.out.println();
        }
        book.close();
        file.close();
	}

}
