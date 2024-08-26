package Only_Admin_Side_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZB_Manage_Promo_Code {

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

		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[8]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"promocode\"]")).sendKeys("DAA090");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"promocode_desc\"]")).sendKeys("Offer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"discount\"]")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[4]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[5]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("limit_users")).sendKeys("14");
		Thread.sleep(1000);
		driver.findElement(By.id("limit_per_user")).sendKeys("5");
		Thread.sleep(1000);
		Select st=new Select(driver.findElement(By.id("status")));
		st.selectByIndex(1);
		Thread.sleep(1000);
		Select s=new Select(driver.findElement(By.id("type")));
		s.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"promocode\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"promocode\"]")).sendKeys("DAA109");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"promocode_desc\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"promocode_desc\"]")).sendKeys("Offer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"discount\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"discount\"]")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[4]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[5]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("limit_users")).clear();
		driver.findElement(By.id("limit_users")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("limit_per_user")).clear();
		driver.findElement(By.id("limit_per_user")).sendKeys("5");
		Thread.sleep(1000);
		Select st1=new Select(driver.findElement(By.id("status")));
		st1.selectByIndex(2);
		Thread.sleep(1000);
		Select s2=new Select(driver.findElement(By.id("type")));
		s2.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(1000);
		System.out.println("****");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"promocode\"]")).sendKeys("DAAZRR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"promocode_desc\"]")).sendKeys("Offer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"discount\"]")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[4]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/div[5]/div/span/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("limit_users")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.id("limit_per_user")).sendKeys("5");
		Thread.sleep(1000);
		Select st4=new Select(driver.findElement(By.id("status")));
		st4.selectByIndex(1);
		Thread.sleep(1000);
		Select s4=new Select(driver.findElement(By.id("type")));
		s4.selectByIndex(3);
		Thread.sleep(1000);
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[1]")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		driver.findElement(By.id("delete")).click();
        Thread.sleep(2000);
        Alert at=driver.switchTo().alert();
        at.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();
        Thread.sleep(2000);
        Select uj=new Select(driver.findElement(By.name("datatable_orders_length")));
        uj.selectByIndex(1);
        Thread.sleep(2000);
        uj.selectByIndex(2);
        Thread.sleep(2000);
        uj.selectByIndex(3);
        Thread.sleep(2000);
        uj.selectByIndex(4);
        Thread.sleep(2000);
        uj.selectByIndex(5);
        Thread.sleep(2000);
        uj.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.name("promocode")).sendKeys("Land");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[3]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" /html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("10");
        Thread.sleep(2000);
       
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        Select ty=new Select(driver.findElement(By.name("status")));
        ty.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        ty.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        Select tp=new Select(driver.findElement(By.name("type")));
        tp.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        tp.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
        Thread.sleep(2000);
        
        
        driver.quit();
        
        
        
        
        
        
        
        
        
        
	}

}
