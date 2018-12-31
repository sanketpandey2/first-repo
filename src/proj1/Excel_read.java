package proj1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {
	
	public static void main(String[] args) {
		//@SuppressWarnings("unused")
		int a=10;
		
		try {
			String FilePath="C:\\Users\\dtf8207\\eclipse-workspace\\proj1\\Test_data\\test.xlsx";
			FileInputStream fis=new FileInputStream(FilePath);
			XSSFWorkbook wb=new XSSFWorkbook(fis);  //get the workbook
			XSSFSheet sheet=wb.getSheetAt(0);   //get the sheet at index 0
			
			System.out.println(sheet.getLastRowNum());
			
			XSSFRow row=sheet.getRow(0);  //get first row
			
			int rowcount=row.getLastCellNum();
			
			System.out.println(rowcount);
			
			for(int i =0;i<=1;i++)
			{
			
			XSSFCell cell=row.getCell(i);
		
			System.out.println(cell.getStringCellValue());
			}
			

			
			
			


		} catch (Exception e) {		
			e.printStackTrace();
		}




	}


}
