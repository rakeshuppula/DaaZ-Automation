package Regression_Testing_UAT;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _90_Portfolio {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/portfolio");
	    Thread.sleep(1000);	    
	     //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
	     Thread.sleep(1000);
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(2000);
	     driver.findElement(By.id("management_view")).sendKeys("Deleted Domains");
	     Thread.sleep(2000);
	     System.out.println("clicked on deleted domain");
	    // driver.findElement(By.id("management_view")).clear();
	     driver.findElement(By.id("management_view")).sendKeys("Upload Domains Report");
	     Thread.sleep(2000);
	     System.out.println("upload domain report");
	    // driver.findElement(By.id("management_view")).clear();
	     driver.findElement(By.id("management_view")).sendKeys("Insights");
	     Thread.sleep(2000);
	     System.out.println("Insights");
	     driver.findElement(By.id("management_view")).sendKeys("Portfolio Management View");     
	     Thread.sleep(5000);
	     driver.findElement(By.id("domain_keyword")).sendKeys("GoldAndDiamonds.in");
	     Robot rb=new Robot();
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     driver.findElement(By.id("domain_keyword")).clear();
	     
	     driver.findElement(By.id("price")).sendKeys("1000");
	     Thread.sleep(5000);
	     driver.findElement(By.id("price")).clear();
	     Thread.sleep(5000);
	     driver.findElement(By.id("offer")).sendKeys("20");
	     Thread.sleep(5000);
	     driver.findElement(By.id("offer")).clear();
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/select")).sendKeys("USD");
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/select")).sendKeys("GBP");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/select")).sendKeys("EUR");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("Auction");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("Buy Now");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("Make offer");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("Buy Now/Make offer");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("Price Option");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/select")).sendKeys("Uncategorized");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[3]/select")).sendKeys("Simple 2");	     
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[3]/select")).sendKeys("Theme");
	     Thread.sleep(5000);
	     driver.findElement(By.id("length")).sendKeys("5");
	     Thread.sleep(5000);
	     driver.findElement(By.id("length")).clear();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[1]/div/div[2]/select")).sendKeys("Active");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[1]/div/div[2]/select")).sendKeys("Inactive");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[1]/div/div[2]/select")).sendKeys("Status");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/select")).sendKeys("Featured");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/select")).sendKeys("Non-Featured");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/select")).sendKeys("Featured/Non-Featured Domains");
	     Thread.sleep(5000); 
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/button")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/ul/li[1]/div/input")).sendKeys(".com");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/ul/li[337]/a/label")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[4]/div[1]/select")).sendKeys("Active");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[4]/div[1]/select")).sendKeys("Inactive");
	     Thread.sleep(5000);
	     driver.findElement(By.id("btn-clear-search")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[11]/div/a[2]/i")).click();
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/button")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/ol/button[1]")).click();
	     Thread.sleep(1000);
	     //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
	     Thread.sleep(1000);
         driver.quit();

         
         
         
         
         
         
         
         
         
         
         
	}
}
