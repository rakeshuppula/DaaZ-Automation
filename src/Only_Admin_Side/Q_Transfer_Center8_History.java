package Only_Admin_Side;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Q_Transfer_Center8_History {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/a")).click();// Manage domains
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span")).click();// Transfer
																												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[6]/a")).click();// History
																										// button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[6]/ul/li[1]/a")).click();// Admin
																													// domain
																													// upload
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]"))
				.click();// Next btn
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]"))
				.click();// Next btn
		Thread.sleep(2000);
		Select st = new Select(driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
		st.selectByVisibleText("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> mt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mt.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[3]/input"))
				.sendKeys("Rakeshuppula3+buyer@gmail.com");
		Thread.sleep(2000);
		Select st1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st1.selectByVisibleText("Completed");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(2000);
		Select st2 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st2.selectByVisibleText("Conflict");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);

		Select st3 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st3.selectByVisibleText("Conflict - Already exists in your portfolio");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);
		
		Select st4 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st4.selectByVisibleText("Conflict - Exists in other seller portfolio");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);
		
		Select st5 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st5.selectByVisibleText("Failed");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);
		
		Select st6 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st6.selectByVisibleText("Completed & Whois Verified");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);
		
		Select st7 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st7.selectByVisibleText("Deleted");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]"))
				.click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]"))
				.click();// Reset
		Thread.sleep(1000);		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
