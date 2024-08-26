package Only_Admin_UAT;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Z2_Acution_Review {

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
	        
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/a")).click();// Auction
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/ul/li[4]/a")).click();// Auction Review
		Thread.sleep(2000);
		 System.out.println("Clicked on Auction Review");
		 try {
		 driver.findElement(By.name("select")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on checkbox");		 
		// WebElement Rakesh2= driver.findElement(By.id("auction_option"));
		 Select Rak=new Select(driver.findElement(By.id("auction_option")));
		 Rak.selectByIndex(1);
		 }catch(Exception e) {			 
		 }
		 Thread.sleep(2000);		 
		 System.out.println("options");
		 Robot a3 = new Robot();
	     a3.keyPress(KeyEvent.VK_ENTER);
	     a3.keyRelease(KeyEvent.VK_ENTER); 		 
		 Thread.sleep(2000);
		 System.out.println("Clicked on Accept");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/a[1]/i")).click();
		 Thread.sleep(2000);
		 Select Rake=new Select(driver.findElement(By.name("datatable_orders_length")));
		 Rake.selectByIndex(1);
		 Thread.sleep(2000);
		 Rake.selectByIndex(2);
		 Thread.sleep(2000);
		 Rake.selectByIndex(3);
		 Thread.sleep(2000);
		 Rake.selectByIndex(4);
		 Thread.sleep(2000);
		 Rake.selectByIndex(5);
		 Thread.sleep(2000);
		 Rake.selectByIndex(1);
		 Thread.sleep(2000);
		 System.out.println("Pages");
		 try {
		 driver.findElement(By.name("id")).sendKeys("2288");
		 Thread.sleep(2000);
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("user_name")).sendKeys("rakesh_sellerr");
		 Thread.sleep(2000);
		 System.out.println("user name");
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("domain_name")).sendKeys("restin.com");
		 Thread.sleep(2000);
		 System.out.println("domain name");
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("reserve_price")).sendKeys("200");
		 Thread.sleep(2000);
		 System.out.println("price");
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("buy_now_price")).sendKeys("2000");
		 Thread.sleep(2000);
		 System.out.println("bn price");
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
 }catch(Exception e) {
			 
		 }
		 try {
		 driver.findElement(By.name("duration")).sendKeys("5 days");
		 Thread.sleep(2000);
		 System.out.println("duration");
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 }catch(Exception e) {			 
		 }
		 driver.findElement(By.name("duration")).clear();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/button")).click();
		 Thread.sleep(2000);
		 try {
		 Select Rakes=new Select(driver.findElement(By.name("status")));
		 Rakes.selectByIndex(1);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 System.out.println("status");
		 Rakes.selectByIndex(2);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 
		 Rakes.selectByIndex(3);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		
		 Rakes.selectByIndex(4);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
		 
		 //Search
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		 Thread.sleep(2000);
				 }catch(Exception e) {			 
		 }
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/ul/li[5]/a")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[1]/div/div/a")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("days")).sendKeys("2");
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("tax")).sendKeys("2");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[3]/button[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[3]/button[2]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div[1]/div/div/a")).click();
//
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[1]/input")).sendKeys("11");
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("tax")).sendKeys("11");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[3]/button[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("edit_auction_tax")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("tax")).sendKeys("10");
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("update_details")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("delete_auction_duration")).click();
//		 Thread.sleep(2000);
//		 Alert at= driver.switchTo().alert();
//		 at.accept();
//		 Thread.sleep(2000);
		 
		driver.quit();

	}

}
