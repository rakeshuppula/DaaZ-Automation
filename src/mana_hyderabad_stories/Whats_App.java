package mana_hyderabad_stories;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Whats_App {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
//         driver.navigate().to("https://web.whatsapp.com/");
//         Thread.sleep(4000);
//        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/aside/div/div[3]/button")).click();
//         Thread.sleep(90000);
//         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div")).sendKeys("mom");
//         Thread.sleep(5000);
//         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[14]/div/div/div/div[2]")).click();
//         Thread.sleep(5000);
//         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/span/span")).click();
//         Thread.sleep(4000);
////         int i;
////         for(i=1;i<=100;i++) {
//         WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p"));
//        wb.sendKeys("Sorry\r\n"+"Sorry");
//        Thread.sleep(2000);
// 		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span")).click();
// 		 Thread.sleep(4000);...................
		  
		    driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
			driver.switchTo().frame("mtcaptcha-1-iframe-1");
			driver.findElement(By.id("mtcap-inputtext-1")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			driver.findElement(By.id("login_submit")).click();
			System.out.println("buyer login");
			Thread.sleep(1000);
			JavascriptExecutor jt = (JavascriptExecutor) driver;
		    jt.executeScript("window.scrollBy(0,500)", "");
		    Thread.sleep(4000);
		    
	       driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();//Buy domain button
	       Thread.sleep(2000);
	      
	       JavascriptExecutor jt2 = (JavascriptExecutor) driver;
		    jt2.executeScript("window.scrollBy(0,100)", "");
		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
//		    Thread.sleep(4000);
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
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[1]/label/span/b")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("trans_id")).sendKeys("trtryyyeyy4ieie9ssk");
		    Thread.sleep(2000);
		    JavascriptExecutor mt = (JavascriptExecutor) driver;
		    mt.executeScript("window.scrollBy(0,500)", "");
		    Thread.sleep(2000);
		    Screen sc=new Screen();
		    Pattern pt=new Pattern("E:\\my Files\\Cap.PNG");
		    Thread.sleep(2000);
		   // Pattern pt1=new Pattern("E:\\my Files\\date1.PNG");
		    
		    sc.wait(pt,10);
		    sc.click(pt,10);
		    sc.click(pt,10);
		    Thread.sleep(2000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
         
	}

}
