package Only_Admin_Side_UAT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class D1_VAT_Verification {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("password")).sendKeys("UAT_DaaZ_Admin
		// UATAdmin@2020");
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/ul/li[7]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
        Thread.sleep(2000);
        Select oi=new Select(driver.findElement(By.name("datatable_orders_length")));
        oi.selectByIndex(1);
        Thread.sleep(2000);
        oi.selectByIndex(2);
        Thread.sleep(2000);
        oi.selectByIndex(3);
        Thread.sleep(2000);
        oi.selectByIndex(4);
        Thread.sleep(2000);
        oi.selectByIndex(5);
        Thread.sleep(2000);
        oi.selectByIndex(0);
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("rakeshuppula3@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("company_no")).sendKeys("04098");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("vat_no")).sendKeys("iuhyg");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        Select ty=new Select(driver.findElement(By.name("vat_approve")));
        ty.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        ty.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        ty.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
        Thread.sleep(2000);
        
        Select t=new Select(driver.findElement(By.name("vat_approve")));
        t.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        Select t7=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/select")));
       t7.selectByIndex(1);
       Thread.sleep(2000);
        Alert ar=driver.switchTo().alert();
        ar.accept();
        Thread.sleep(2000);
        Select t2=new Select(driver.findElement(By.name("vat_approve")));
        t2.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
        Thread.sleep(2000);
        Select t17=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/select")));
       t17.selectByIndex(2);
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/form/div/textarea")).sendKeys("test");
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
       Thread.sleep(4000);
      driver.quit();

	}

}
