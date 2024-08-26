package Only_Admin_UAT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZA4_Manage_Orders_Payment_chechout {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/a")).click();// Manage Orders
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/ul/li[3]/a")).click();// Payment check out 
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
		driver.findElement(By.name("domain_name")).sendKeys("programcc.in");
		Thread.sleep(2000);//Search 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("amount_paid")).sendKeys("500");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("USD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("EUR");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("EUR");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		WebElement RK=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]"));		
		System.out.println("Showing Domain Name is = "+RK.getText());
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		Select d=new Select(driver.findElement(By.name("type")));
		d.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		d.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		d.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		d.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		d.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		d.selectByIndex(6);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		
		Select da=new Select(driver.findElement(By.name("payment_type")));
		da.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		da.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		da.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		da.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		da.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		
		Select ds=new Select(driver.findElement(By.name("login_session")));
		ds.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		ds.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		
		Select dod=new Select(driver.findElement(By.name("status")));
		dod.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		dod.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("id")).sendKeys("cs_test_a1pzmEV156DC");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[12]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
