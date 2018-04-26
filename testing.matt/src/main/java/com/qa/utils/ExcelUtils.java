package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static final String URL1 = "http://php.thedemosite.co.uk/adduser.php";
	public static final String URL2 = "http://php.thedemosite.co.uk/login.php";
	public static final String Path_TestData = "C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\excelspreadsheets\\";
	public static final String File_TestData = "ExcellSpreadsheet2ndLine.xlsx";
	public static FileInputStream file = null;
	public static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	static Cell cell = null;
	public static void setExcelFile(String string, String string2) {
		try {
				file = new FileInputStream(string + string2);
		} catch(FileNotFoundException e){}
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {}
	}
	
	public static Cell getCellData(int a, int b) {
		sheet = workbook.getSheetAt(0);
		System.out.println(sheet);
		System.out.println(workbook);
		System.out.println(file);
		cell = sheet.getRow(a).getCell(b);
		return cell;
	}
	
	public static void setCellData(String cellStatus ,int a, int b) {
		sheet = workbook.getSheetAt(0);
		sheet.getRow(a).getCell(b).setCellValue(cellStatus);	
	}
	
}
