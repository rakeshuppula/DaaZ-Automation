package Add_Bulk_Domains_;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Domains_add_to_Excel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\Downloads\\Rakesh(2).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("MyDomains");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		//write domain **********
		System.out.println("Before updating Cell Data "+sheet.getRow(2).getCell(0));
		System.out.println("Before updating Call Data "+sheet.getRow(3).getCell(0));
		System.out.println("Before updating Car Data "+sheet.getRow(4).getCell(0));
		System.out.println("Before updating kk Data "+sheet.getRow(5).getCell(0));
		//write price************
		System.out.println("Before updating rk Data "+sheet.getRow(2).getCell(1));
		System.out.println("Before updating uk Data "+sheet.getRow(3).getCell(1));
		System.out.println("Before updating sk Data "+sheet.getRow(4).getCell(1));
		System.out.println("Before updating mk Data "+sheet.getRow(5).getCell(1));		
//  Write Date to Excel File
		XSSFCell cell = sheet.getRow(2).getCell(0);
		cell.setCellValue("Adroid11");		
		XSSFCell call = sheet.getRow(3).getCell(0);
		call.setCellValue("Adroid21");		
		XSSFCell car = sheet.getRow(4).getCell(0);
		car.setCellValue("Adroid31");		
		XSSFCell kk = sheet.getRow(5).getCell(0);
		kk.setCellValue("Adroid41");		
		XSSFCell rk = sheet.getRow(2).getCell(1);
		rk.setCellValue("511");
		XSSFCell uk = sheet.getRow(2).getCell(1);
		uk.setCellValue("221");
		XSSFCell sk = sheet.getRow(2).getCell(1);
		sk.setCellValue("1041");
		XSSFCell mk = sheet.getRow(2).getCell(1);
		mk.setCellValue("5021");
		fis.close();
		FileOutputStream fileOut=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\Rakesh(2).xlsx");
		workbook.write(fileOut);
		System.out.println("Update Data after write is done "+cell.getStringCellValue());
		System.out.println("Update Data after write is done "+call.getStringCellValue());
		System.out.println("Update Data after write is done "+car.getStringCellValue());
		System.out.println("Update Data after write is done "+kk.getStringCellValue());
		//write price************
		System.out.println("Update Data after write is done "+rk.getStringCellValue());
		System.out.println("Update Data after write is done "+uk.getStringCellValue());
		System.out.println("Update Data after write is done "+sk.getStringCellValue());
		System.out.println("Update Data after write is done "+mk.getStringCellValue());
		fileOut.close();	
	    }
        }
