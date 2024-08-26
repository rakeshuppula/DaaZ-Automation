package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZF2_Manage_Ticket_Feature_Request {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);

		// driver.findElement(By.id("signInBtn")).click();
		JavascriptExecutor jsee = (JavascriptExecutor) driver;
		jsee.executeScript("document.getElementById('signInBtn').value='Dev_DaaZ_Admin';");
		jsee.executeScript(
				"document.getElementById('signInBtn').setAttribute('style','border:10px red solid;background:yellow;color:green');");
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/a")).click();// Manage Tickets
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[3]/a")).click();// Feature Request
		Thread.sleep(2000);		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]/i"))
				.click();
		Thread.sleep(2000);
		Select dh = new Select(driver.findElement(By.name("datatable_orders_length")));
		dh.selectByIndex(1);
		Thread.sleep(2000);
		dh.selectByIndex(2);
 		Thread.sleep(2000);
		dh.selectByIndex(3);
		Thread.sleep(2000);
		dh.selectByIndex(4);
		Thread.sleep(2000);
		dh.selectByIndex(5);
		Thread.sleep(2000);
		dh.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.name("request_id")).sendKeys("176860");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("Notification Icon");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		Select ghj=new Select(driver.findElement(By.name("status")));
		ghj.selectByIndex(1);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		ghj.selectByIndex(2);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		ghj.selectByIndex(3);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		ghj.selectByIndex(4);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[5]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> es=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(es.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div[3]/div[2]")).sendKeys("test");
		Thread.sleep(2000);	
		Select gh=new Select(driver.findElement(By.name("status")));
		gh.selectByIndex(3);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
		Thread.sleep(2000);
		Alert uk=driver.switchTo().alert();
		uk.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
