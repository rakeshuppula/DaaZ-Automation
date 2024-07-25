package Only_Admin_Side;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class S_Transfer_Center_Bulk_ADD_EDIT_DELETE {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span")).click();// Transfer center																												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[6]/a")).click();// History button
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[6]/ul/li[3]/a")).click();//Bulk Domain ADD																												
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();// Next btn
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();// Next btn
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));//.click();// 
		Thread.sleep(3000);
		st.selectByVisibleText("20");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[2]/input")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(2000);
		Select sy=new Select(driver.findElement(By.name("status")));
		sy.selectByVisibleText("Pending");
		Thread.sleep(2000);
		Select sp=new Select(driver.findElement(By.name("type")));
		sp.selectByVisibleText("Add Domains");
		Thread.sleep(2000);
		driver.findElement(By.name("created_by")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('created_by')[0].setAttribute('style','border:5px red solid;background:yellow;color:green');");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[8]")).click();
		Thread.sleep(4000);
		ArrayList<String> mp=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mp.get(0));
		Thread.sleep(4000);
		driver.quit();
		
	}

}
