package Only_UI_DEV;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.Enter;

public class C1_Add_domains_with_Excel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\Rakesh(2).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("MyDomains");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		// write domain **********
		System.out.println("Before updating Cell Data " + sheet.getRow(2).getCell(0));
		System.out.println("Before updating Call Data " + sheet.getRow(3).getCell(0));
		System.out.println("Before updating Car Data " + sheet.getRow(4).getCell(0));
		System.out.println("Before updating kk Data " + sheet.getRow(5).getCell(0));
		// write price************
//		System.out.println("Before updating rk Data " + sheet.getRow(2).getCell(1));
//		System.out.println("Before updating uk Data " + sheet.getRow(3).getCell(1));
//		System.out.println("Before updating sk Data " + sheet.getRow(4).getCell(1));
//		System.out.println("Before updating mk Data " + sheet.getRow(5).getCell(1));
       //  Write Date to Excel File
		XSSFCell cell = sheet.getRow(2).getCell(0);
		cell.setCellValue("PUBLICPVT2.ABC");
		XSSFCell call = sheet.getRow(3).getCell(0);
		call.setCellValue("PUBLICLTD2.co.IN");
		XSSFCell car = sheet.getRow(4).getCell(0);
		car.setCellValue("PUBLICTTD2.COFFEE");
		XSSFCell kk = sheet.getRow(5).getCell(0);
		kk.setCellValue("PUBLICORG2.in");
//		XSSFCell rk = sheet.getRow(2).getCell(1);
//		rk.setCellValue("200");
//		XSSFCell uk = sheet.getRow(3).getCell(1);
//		uk.setCellValue("300");
//		XSSFCell sk = sheet.getRow(4).getCell(1);
//		sk.setCellValue("400");
//		XSSFCell mk = sheet.getRow(5).getCell(1);
//		mk.setCellValue("600");
		fis.close();
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Administrator\\Downloads\\Rakesh(2).xlsx");
		workbook.write(fileOut);
		System.out.println("Update Data after write is done " + cell.getStringCellValue());
		System.out.println("Update Data after write is done " + call.getStringCellValue());
		System.out.println("Update Data after write is done " + car.getStringCellValue());
		System.out.println("Update Data after write is done " + kk.getStringCellValue());
		// write price************
//		System.out.println("Update Data after write is done " + rk.getStringCellValue());
//		System.out.println("Update Data after write is done " + uk.getStringCellValue());
//		System.out.println("Update Data after write is done " + sk.getStringCellValue());
//		System.out.println("Update Data after write is done " + mk.getStringCellValue());
//		fileOut.close();
        // Enter into application @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/add/domain");
		Thread.sleep(1000);
		System.out.println("Enter into URL");
		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		Thread.sleep(1000);
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		System.out.println("Entered Username and Password");
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("LOGIN successfully");
		Thread.sleep(3000);
		WebElement ev=driver.findElement(By.id("bulk-domain-file"));
		ev.sendKeys("C:\\Users\\Administrator\\Downloads\\Rakesh(2).xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/div[2]/div[3]/button")).click();		
		Thread.sleep(3000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		System.out.println("Bulk domains added");
		driver.quit();	
	}

}
