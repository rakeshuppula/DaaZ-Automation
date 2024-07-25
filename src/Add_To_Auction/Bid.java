package Add_To_Auction;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bid {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();		    		
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
		Thread.sleep(3000);
		 driver.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		 driver.switchTo().frame("mtcaptcha-1-iframe-1");
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(13000);
		 driver.findElement(By.id("login_submit")).click();
		 System.out.println("Buyer login");
		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/a[1]/span[1]/img[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div/ul/li[1]/div/div[3]/span/a")).click();
//		 Thread.sleep(2000);
//		 System.out.println("Clicked on Domain");
//		 driver.findElement(By.name("the-bid")).sendKeys("320");
//		 Thread.sleep(2000);
//		 System.out.println("1st Bid is 20");
//		 driver.findElement(By.xpath("//*[@id=\"bid-form\"]/div/span/button")).click();
//		 Thread.sleep(2000);
//		 Robot a9 = new Robot();
//		 a9.keyPress(KeyEvent.VK_CONTROL);    
//	     a9.keyPress(KeyEvent.VK_V);
//	     a9.delay(1000);
//	     a9.keyRelease(KeyEvent.VK_CONTROL);
//	     a9.keyRelease(KeyEvent.VK_V);
//	     a9.delay(1000);
//	     a9.keyPress(KeyEvent.VK_ENTER);
//	     a9.keyRelease(KeyEvent.VK_ENTER); 		 
//		 Thread.sleep(2000);
//		 System.out.println("Place BID");		 
////		 driver.findElement(By.name("the-bid")).sendKeys("300");
////		 Thread.sleep(2000);
////		 System.out.println("2nd Bid is 30");
////		 driver.findElement(By.xpath("//*[@id=\"bid-form\"]/div/span/button")).click();
////		 System.out.println("Place BID");
////		 Thread.sleep(2000);
////		 Robot r = new Robot();
////		 r.keyPress(KeyEvent.VK_CONTROL);    
////	     r.keyPress(KeyEvent.VK_V);
////	     r.delay(1000);
////	     r.keyRelease(KeyEvent.VK_CONTROL);
////	     r.keyRelease(KeyEvent.VK_V);
////	     r.delay(1000);
////	     r.keyPress(KeyEvent.VK_ENTER);
////	     r.keyRelease(KeyEvent.VK_ENTER); 
////		 System.out.println("Submit");
//		 Thread.sleep(2000);
//		 
//	     System.out.println("***** ADMIN SIDE *****");// Admin Side*********************************************	
//	     
//	     driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
//	     Thread.sleep(1000);	    
//	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dev_DaaZ_Admin");
//	     Thread.sleep(2000);
//	     System.out.println("Enter Mail");	     
//	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pesu@1956!2021"); 
//	     Thread.sleep(2000);
//	     System.out.println("Enter Password");	   
//	     driver.findElement(By.xpath("//button[@id='signInBtn']")).click();	     
//	     Thread.sleep(1000);
//	     driver.navigate().refresh();
//	     System.out.println("Enter Submit");	     
//	     Thread.sleep(6000);	     	     
//		 driver.findElement(By.xpath("//span[normalize-space()='Manage Sales Activities']")).click();
//		 Thread.sleep(2000);
//		 System.out.println("Clicked on Manage Sales");
//		 driver.findElement(By.xpath("//li[contains(@class,'open')]//ul[contains(@class,'sub-menu')]//a[contains(@class,'nav-link nav-toggle')]")).click();
//		 Thread.sleep(2000);
//		 System.out.println("Clicked on Auction");
//		 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[3]/ul/li[1]/a")).click();
//		 Thread.sleep(2000);
//		 System.out.println("Clicked on all auctions");
//		 driver.findElement(By.xpath("//*[@id=\"datatable_orders\"]/tbody/tr[1]/td[14]/a")).click();
//		 System.out.println("Clicked on bid History");
//		 Thread.sleep(4000);
//		
//		 // Auction Button is not working
//		 driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();		 
//		 System.out.println("Clicked on close Auction");
//		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("message-text")).sendKeys("Testing");
//		 Thread.sleep(2000);
//		 System.out.println("Comment");
//		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/button[1]")).click();
//		 Robot r2 = new Robot();
//		 r2.keyPress(KeyEvent.VK_CONTROL);    
//	     r2.keyPress(KeyEvent.VK_V);
//	     r2.delay(2000);
//	     r2.keyRelease(KeyEvent.VK_CONTROL);
//	     r2.keyRelease(KeyEvent.VK_V);
//	     r2.delay(2000);
//	     r2.keyPress(KeyEvent.VK_ENTER);
//	     r2.keyRelease(KeyEvent.VK_ENTER); 	    
//		 System.out.println("Close the Auction");
//		 
		 System.out.println("***** UI SID E*****");// UI side *****************************************************************
		 
		 driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/leads");
		 Thread.sleep(3000);
		 System.out.println("Enter into Buyer account");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[2]/p")).click();
		 Thread.sleep(2000);
		 System.out.println("Bid made");
		 driver.findElement(By.xpath("//*[@id=\"bidList\"]/tbody/tr[1]/td[8]/a[3]/i")).click();
		 Thread.sleep(2000);
		 System.out.println("clicked on pay now");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span/b")).click();
		 Thread.sleep(5000);
		 System.out.println("choose Balance");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div/label")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/button")).click();
		 Thread.sleep(5000);
	}

}
