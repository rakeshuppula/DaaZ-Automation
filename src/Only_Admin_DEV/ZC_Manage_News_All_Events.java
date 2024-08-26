package Only_Admin_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZC_Manage_News_All_Events {

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
		
		//driver.findElement(By.id("signInBtn")).click();	
		JavascriptExecutor jsee= (JavascriptExecutor)driver;
	   	jsee.executeScript("document.getElementById('signInBtn').value='Dev_DaaZ_Admin';");		
	   	jsee.executeScript("document.getElementById('signInBtn').setAttribute('style','border:10px red solid;background:yellow;color:green');");
	   	driver.findElement(By.id("signInBtn")).click();
	   	Thread.sleep(1000);
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[9]/a")).click();// Manage News Letter
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[9]/ul/li[1]/a")).click();// All Events
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		Select dh=new Select(driver.findElement(By.name("datatable_orders_length")));
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
		driver.findElement(By.name("event")).sendKeys("Automation Test");
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.name("updated_by")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
	    Select sp=new Select(driver.findElement(By.name("status")));
	    sp.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
	    sp.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.name("created_by")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(2000);// Reset
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("event")).sendKeys("Entry7");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/span/button")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(3000);//search          
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a/i")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("subject-email")).sendKeys("Metro");
	    Thread.sleep(2000);
	  //  driver.switchTo().frame("cke_wysiwyg_frame cke_reset");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div/div/div/span[1]/span[2]/span[4]/span[3]/a[2]/span[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		//driver.switchTo().defaultContent();
	    driver.findElement(By.id("list1")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("custom")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("emailIds")).sendKeys("Rakeshuppula3+buyer@gmail.com");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/button[1]")).click();
		 Thread.sleep(5000);
		driver.findElement(By.id("view")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[9]/ul/li[1]/a")).click();// All Events
		Thread.sleep(3000);
		driver.findElement(By.id("delete")).click();
		Thread.sleep(2000);
		Alert at=driver.switchTo().alert();
		at.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
