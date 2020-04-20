package dummy;

import UISpiceJet.Constants;
import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import UISpiceJet.PropertyLoader;



public class MainTest {

	public static void main(String[] args) {
		//System.out.println(PropertyLoader.getProperty(Constants.BROWSER));
		
		try {
			Workbook wBook = null;
			File file = new File(PropertyLoader.getProperty(Constants.DATA_FILE));
			wBook = new XSSFWorkbook(file);
			
			Sheet wSheet = wBook.getSheetAt(0);
			
			Row wRow = wSheet.getRow(0);
			
			Cell wCell = wRow.getCell(1);
			
			
			for (int i = 0; i <= wSheet.getLastRowNum(); i++) {
				wRow = wSheet.getRow(i);
				for (int j = 0; j <= wRow.getLastCellNum(); j++) {
					wCell = wRow.getCell(j);
					
					System.out.println(wCell);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
