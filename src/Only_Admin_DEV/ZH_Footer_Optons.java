package Only_Admin_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZH_Footer_Optons {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[16]/a")).click();// Footer Options
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[16]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[3]/a")).click();
        Thread.sleep(2000);
        Select ney=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[1]/div/select")));
		ney.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("Super DaaZ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/input[2]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
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
		driver.findElement(By.name("url")).sendKeys("Report_TM_Concerns");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("Trust");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(2000);
		Select ne9=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[1]/div/select")));
		ne9.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/input[2]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/a[2]")).click();
		Thread.sleep(2000);
		Alert uk=driver.switchTo().alert();
		uk.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[16]/a")).click();// Footer Options
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[16]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("url")).sendKeys("Rules_RK-com");
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("Rules");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/input[2]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/a[2]")).click();
		Thread.sleep(2000);
		Alert uk91=driver.switchTo().alert();
		uk91.accept();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
