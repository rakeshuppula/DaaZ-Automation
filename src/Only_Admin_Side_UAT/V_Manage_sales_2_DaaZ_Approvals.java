package Only_Admin_Side_UAT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class V_Manage_sales_2_DaaZ_Approvals {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a")).click();// Daaz Secure 																											// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/ul/li/a")).click();//Daaz Secure approvals	
		Thread.sleep(1000);
        Select ak=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/label/select")));
        ak.selectByVisibleText("15");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
		Thread.sleep(1000);
		System.out.println("Create a Transaction");
		Select sp=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div/div/select")));
		sp.selectByVisibleText("Single Domain Name Sale");
		Thread.sleep(1000);
		driver.findElement(By.id("seller_email")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("secure_domain_name")).sendKeys("RunTimeErrora92s8.com");
		Thread.sleep(1000);
		driver.findElement(By.id("secure_agreed_amount")).sendKeys("500");
		Thread.sleep(1000);
		Select jy=new Select(driver.findElement(By.id("secure_currency")));
		jy.selectByVisibleText("USD");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div[3]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div[3]/div/div[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a")).click();// Daaz Secure																												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/ul/li/a")).click();// Back to Daaz Secure 																												// Center
		Thread.sleep(2000);
        Select as=new Select(driver.findElement(By.id("approval_status")));
        as.selectByVisibleText("Approve");
        Thread.sleep(1000);
        Alert ap=driver.switchTo().alert();
		ap.accept();
        Thread.sleep(1000);		
        Select as3=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[8]/select")));
        as3.selectByVisibleText("Reject");
        Thread.sleep(1000);
		Alert ap2=driver.switchTo().alert();
		ap2.accept();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
//		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div[2]/div/ul/li[7]/a/i")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div[2]/div/ul/li[6]/a/i")).click();
//		Thread.sleep(1000);
		driver.quit();

	}

}
