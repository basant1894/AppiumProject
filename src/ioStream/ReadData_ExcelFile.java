package ioStream;

import java.io.FileInputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ReadData_ExcelFile {
  @Test(enabled=false)
  public void readExcel() throws Exception {
	FileInputStream fi=new FileInputStream("D:\\ExcellData\\TestData");
	Workbook w=Workbook.getWorkbook(fi);
	Sheet s=w.getSheet(0);
	System.out.println(s.getCell(0, 0).getContents());
	System.out.println(s.getCell(1, 0).getContents());
	for (int i = 0; i < s.getRows(); i++) {
		System.out.println(s.getCell(0, i).getContents());
		System.out.println(s.getCell(1, i).getContents());
	}
  }
  @Test
  public void readMultiplerows_cols() throws Exception {
	FileInputStream fi=new FileInputStream("D:\\ExcellData\\TestData");
	Workbook w=Workbook.getWorkbook(fi);
	Sheet s=w.getSheet(0);
	for (int i = 0; i < s.getRows(); i++) {
		for (int j = 0; j < s.getColumns(); j++) {
		System.out.println(s.getCell(j, i).getContents());	
		}
	}
	
  }
}
