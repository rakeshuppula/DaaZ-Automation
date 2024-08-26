package Only_Admin_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZG_Theme_Settings {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[15]/a")).click();// Theme Setting
		Thread.sleep(2000);
		Select fg=new Select(driver.findElement(By.name("default_theme")));
		fg.selectByIndex(4);
		Thread.sleep(2000);	
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        
		Alert uk=driver.switchTo().alert();
		uk.accept();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Select fgw=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[2]/div[1]/select[1]")));
        fgw.selectByIndex(2);
        Thread.sleep(2000);
        Select fgwo=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[2]/div[1]/select[2]")));
        fgwo.selectByIndex(3);
        Thread.sleep(2000);
        Select fb=new Select(driver.findElement(By.name("limit")));
        fb.selectByIndex(1);
        Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[2]/div[2]/button")).click();
       Thread.sleep(2000);
       Alert uk1=driver.switchTo().alert();
		uk1.accept();
		Thread.sleep(2000);
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
