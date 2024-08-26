package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_Manage_Domains_Automation_API {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[2]/a/span")).click();// Automation
																												// API
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> tt = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tt.get(0));
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> tt1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tt1.get(0));
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> tt12 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tt12.get(0));
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> ta = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ta.get(0));
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a")).click();        
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
