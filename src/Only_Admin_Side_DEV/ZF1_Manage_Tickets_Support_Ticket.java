package Only_Admin_Side_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZF1_Manage_Tickets_Support_Ticket {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[2]/a")).click();// Support Ticket
		Thread.sleep(2000);		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/a[2]/i"))
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
		driver.findElement(By.name("ticket_id")).sendKeys("1505");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("category")).sendKeys("Other");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("title")).sendKeys("failure");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("rakesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("Vijju");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("agent")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("created_by")).sendKeys("Chowdary");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		Select mk=new Select(driver.findElement(By.name("status")));		
		mk.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		mk.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		mk.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		mk.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		mk.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		//Calendar
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);
		
		//create a support ticket
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		Select hg=new Select(driver.findElement(By.name("category")));
		hg.selectByIndex(7);
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("404 error");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div[1]/div[4]/div/div/div/div[3]/div[2]")).sendKeys("404 error");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div[2]/input")).click();		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		// View
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div/div[3]/div[2]")).sendKeys("testing");
		Thread.sleep(2000);
		Select ty=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/div/div[2]/form/div[3]/div/select")));
		ty.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/div/div[2]/form/button")).click();
		Thread.sleep(2000);
		Alert uk=driver.switchTo().alert();
		uk.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
