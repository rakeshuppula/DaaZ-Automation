package Regression_Testing_UAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B1_BuyNow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();		    		
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/portfolio");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(1000);
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("buyer login");
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(4000);	    
      driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]")).click();//Buy domain button
      Thread.sleep(2000);     
      JavascriptExecutor jt2 = (JavascriptExecutor) driver;
	    jt2.executeScript("window.scrollBy(0,100)", "");
	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
//	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/label")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")).click();
	    Thread.sleep(4000);
	    ArrayList<String> gt=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(gt.get(1));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/a/span")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor jt21 = (JavascriptExecutor) driver;
	    jt21.executeScript("window.scrollBy(0,300)", "");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='balance']")).click();
	    Thread.sleep(3000);
	    try {
	    	driver.findElement(By.xpath("//label[@for='balance']")).click();
		    Thread.sleep(3000);
	    }catch(Exception e) {	    	
	    }
	    try {
	    	driver.findElement(By.xpath("//label[@for='balance']")).click();
		    Thread.sleep(3000);
	    }catch(Exception e) {	    	
	    }
      System.out.println("Selected Balance");
      driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[3]/label")).click();
      Thread.sleep(2000);
      System.out.println("Selected USD");
      Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-sm btn btn-primary balance_submit']")).click();
		System.out.println("Payment Done");
		Thread.sleep(3000);
	    driver.quit();
	}

}
