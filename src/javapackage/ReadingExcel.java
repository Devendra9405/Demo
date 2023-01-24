package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
        File src = new File("C:\\Users\\DEVENDRA\\Desktop\\Expenses Sheet.xlsx");
        
        FileInputStream fis = new FileInputStream(src);
        
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        XSSFSheet sh = wb.getSheet("august 2022");
        
        System.out.println(sh.getSheetName());
        System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
        System.out.println(sh.getLastRowNum() + 1);
        System.out.println(sh.getRow(1).getPhysicalNumberOfCells());
        System.out.println(sh.getRow(1).getLastCellNum());
        
        
	}

}
