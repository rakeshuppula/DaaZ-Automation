package Only_Admin_Side_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZC1_Manage_News_All_sub {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[9]/a")).click();// Manage News Letter
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[9]/ul/li[2]/a")).click();// All Events
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]"))
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
		driver.findElement(By.name("email")).sendKeys("Rakeshuppula3@gmail.com");
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);// Reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		Select st = new Select(driver.findElement(By.name("status")));
		st.selectByIndex(1);
		Thread.sleep(2000);
		// Search
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]"))
				.click();
		Thread.sleep(2000);// Reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		st.selectByIndex(2);
		// Search
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]"))
				.click();
		Thread.sleep(2000);// Reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")).click();
		//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);// Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);// Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula31@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("delete")).click();
		Thread.sleep(2000);
		Alert at =driver.switchTo().alert();
		at.accept();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
