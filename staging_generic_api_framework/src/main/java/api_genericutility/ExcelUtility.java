package api_genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheet, int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./testscriptdata/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return data;

	}

}
