package proj1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {
	
	public static void main(String[] args) throws IOException {
		//@SuppressWarnings("unused")
		int a=10;
		
		
			String FilePath="C:\\Users\\dtf8207\\eclipse-workspace\\proj2\\test.xlsx";
			FileInputStream fis=new FileInputStream(FilePath);
			XSSFWorkbook wb=new XSSFWorkbook(fis);  //get the workbook
			XSSFSheet sheet=wb.getSheetAt(0);   //get the sheet at index 0
			
			//System.out.println(sheet.getLastRowNum());
			
			int rowcount=sheet.getLastRowNum();
			
			
			//XSSFRow row=sheet.getRow(0);  //get first row
			
			//int rowcount=row.getLastCellNum();
			
			System.out.println(rowcount);
			
			for(int i =1;i<=rowcount;i++)
			{
				XSSFRow row=sheet.getRow(i);
				int colcount=row.getLastCellNum();
				
				System.out.println(colcount);
				for(int k=0;k<colcount;k++) {
			
			XSSFCell cell=row.getCell(k);
				
			
		
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				System.out.print(cell.getStringCellValue()+" ");
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.print(cell.getNumericCellValue()+" ");
				break;
				}
			}
			

			
			
			}


		} 
		




	
	



}
