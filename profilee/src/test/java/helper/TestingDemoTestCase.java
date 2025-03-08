package helper;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestingDemoTestCase {
	FileInputStream fis;
	File f;
	XSSFWorkbook wb;
	XSSFSheet sh;
  @Test
  public void testdata() {



		try {
			f= new File("src\\test\\resources\\testdata\\data.xlsx");
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			} catch (IOException e)
			{
			e.printStackTrace();
			}
			}
			// Read the Data
			public String getdata(int shno ,int row, int col)
			{
			sh= wb.getSheetAt(shno);
			String value= sh.getRow(row).getCell(col).getStringCellValue();
			return value;
			}
			//number of rows
			public int getRowCount(int shno)
			{
			sh= wb.getSheetAt(shno);
			int row=sh.getLastRowNum();
			return row;
			}

			//number of columns
			public short getColumnCount(int shno)
			{
			sh= wb.getSheetAt(shno);
			short col= sh.getRow(2).getLastCellNum();
			return col;
			}
}
