package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "F:\\Automation Training\\Rough\\Sample0426new.xls";
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet =wb.createSheet();
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("FirstColumn");
		row.createCell(1).setCellValue("SecondColumn");
		row.createCell(2).setCellValue("ThirdColumn");
		
		for (int i = 1; i < 6; i++) {
			row = sheet.createRow(i);
			for (int j = 0; j < 3; j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue("Data_" + i + j);
			}

		}

		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);
		fo.close();

	}

}
