package org.ddf2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDF1 {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\Admin\\eclipse-workspace\\DDF2\\Excel\\Excel11.xlsx");
	FileInputStream file= new FileInputStream(f);
	Workbook work= new XSSFWorkbook(file);
	Sheet sheet = work.getSheet("Sheet1");
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	
}
}
