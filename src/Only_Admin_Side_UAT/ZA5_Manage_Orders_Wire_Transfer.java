package Only_Admin_Side_UAT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ZA5_Manage_Orders_Wire_Transfer {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/a")).click();// Manage Orders
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/ul/li[4]/a")).click();// Wire tr
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
		driver.findElement(By.name("transaction_id")).sendKeys("r4weklrfijlejijtigji6jo3t45jg");
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("domain_name")).sendKeys("program.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("buyer_name")).sendKeys("rakesh_sellerr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("seller_name")).sendKeys("rakesh_buyer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("original_amount")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.name("discount_percentage")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		}catch(Exception e) {			
		}
		Thread.sleep(2000);	
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.name("discount_amount")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("grand_total")).sendKeys("495");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("amount_paid")).sendKeys("495");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("USD");
		Thread.sleep(2000);driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("EUR");
		Thread.sleep(2000);driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("currency")).sendKeys("GBP");
		Thread.sleep(2000);driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.name("updated_by")).sendKeys("Admin");
		Thread.sleep(2000);driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		}catch(Exception e) {			
		}
		Thread.sleep(2000);	
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		try {
		driver.findElement(By.name("updated_by")).sendKeys("Tester");
		Thread.sleep(2000);driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		}catch(Exception e) {			
		}
		Thread.sleep(2000);	
		driver.navigate().refresh();
		Thread.sleep(2000);				
		Select kk=new Select(driver.findElement(By.name("status")));
		kk.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		kk.selectByIndex(2);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);		
		kk.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		kk.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		Select rr=new Select(driver.findElement(By.name("transaction_type")));
		rr.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		rr.selectByIndex(2);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);		
		rr.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		rr.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[2]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[1]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[19]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		Select Nm=new Select(driver.findElement(By.id("type")));
		Nm.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("domain_name")).sendKeys("Void1.com");
		driver.findElement(By.id("transID")).sendKeys("8u4jejejjeuj343u44u4u4uu");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Rakeshuppula3+uyer@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("original_price")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.id("amount_paid")).sendKeys("495");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[13]/button")).click();
		Thread.sleep(2000);
		try {
			Screen sd=new Screen();
			Pattern yt=new Pattern("E:\\my Files\\crt.PNG");
			sd.wait(yt,10);
			sd.click(yt,10);
			
		}catch(Exception e) {
			
		}
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[13]/button")).click();
		Thread.sleep(3000);
		//driver.quit();
		
		
		
		
		
		
		

	}

}
