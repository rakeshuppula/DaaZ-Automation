package Only_Dev_UAT;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class B_DashBoard {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/");
	    Thread.sleep(1000);	    
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
	     Thread.sleep(1000);
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
		 
//		 WebDriverWait wait=new WebDriverWait(driver,15);
//		 wait.until(ExpectedConditions.elementToBeClickable(By.id("login_submit")));
		 
	     Thread.sleep(10000);
	    driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(2000);
	     driver.navigate().refresh();
	     Thread.sleep(1000);
	     //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[5]/button")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("amount")).sendKeys("500");	
	     Thread.sleep(1000);
//	     Select Currency_name=new Select(driver.findElement(By.id("currency")));
//	     Currency_name.selectByVisibleText("EUR");
	     driver.findElement(By.id("continue")).click();
	     Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(1000);
	     Select Currency_name=new Select(driver.findElement(By.id("currency")));
	     Thread.sleep(1000);
	     Currency_name.selectByVisibleText("EUR");
	     Thread.sleep(1000);
	     driver.findElement(By.id("amount")).clear();
	     Thread.sleep(1000);
	     driver.findElement(By.id("continue")).click();
	     Thread.sleep(1000);
	     Robot v = new Robot();
	     v.keyPress(KeyEvent.VK_ENTER);
	     v.keyRelease(KeyEvent.VK_ENTER);
	     driver.findElement(By.id("amount")).sendKeys("10");
	     Thread.sleep(1000);
	     Select Currency_name1=new Select(driver.findElement(By.id("currency")));
	     Thread.sleep(1000);
	     Currency_name1.selectByVisibleText("EUR");
	     Thread.sleep(1000);
	     driver.findElement(By.id("continue")).click();
	     Thread.sleep(1000);
	     WebElement Rakesh1=driver.findElement(By.xpath("//*[@id=\"alert_msg\"]"));
	     Thread.sleep(1000);
		 System.out.println("Error Msg = "+Rakesh1.getText());
		 Thread.sleep(1000);
		 driver.findElement(By.id("continue")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("amount")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.id("amount")).sendKeys("20");
		 Thread.sleep(1000);
		 Select Currency_name2=new Select(driver.findElement(By.id("currency")));
	     Currency_name2.selectByVisibleText("EUR");
	     Thread.sleep(1000);
	     driver.findElement(By.id("continue")).click();
	     Thread.sleep(1000);
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"stripe_btn\"]")).click();
	     Thread.sleep(1000);
	     Robot p = new Robot();
	     p.keyPress(KeyEvent.VK_ENTER);
	     p.keyRelease(KeyEvent.VK_ENTER);
	     driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);	     
	     Thread.sleep(3000);
	     // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[1]/div/fieldset/div/div[1]/div/div[1]/span/input")).sendKeys("4242424242424242");
	     driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
	     Thread.sleep(1000);		     
	     driver.findElement(By.id("billingName")).sendKeys("Rakesh");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"cardExpiry\"]")).sendKeys("1033");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"cardCvc\"]")).sendKeys("224");	    	   
	     Thread.sleep(3000);
	     Robot e = new Robot();
	     e.keyPress(KeyEvent.VK_ENTER);
	     e.keyRelease(KeyEvent.VK_ENTER);
	    // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div[2]/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]")).click();	 
	     System.out.println("20 payment");//################3
	     Thread.sleep(7000);
	     driver.findElement(By.xpath("//*[@id=\"responsive-menu\"]/li[1]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[5]/button")).click();	   
	     Thread.sleep(1000);
	     driver.findElement(By.id("amount")).sendKeys("2000");
	     Thread.sleep(1000);
	     Select Currency_name4=new Select(driver.findElement(By.id("currency")));
	     Thread.sleep(1000);
	     Currency_name4.selectByVisibleText("EUR");
	     Thread.sleep(1000);
	     driver.findElement(By.id("continue")).click();
	     Thread.sleep(1000);
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	 
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"stripe_btn\"]")).click();
	     Thread.sleep(1000);
	     Robot r1 = new Robot();
	     r1.keyPress(KeyEvent.VK_ENTER);
	     r1.keyRelease(KeyEvent.VK_ENTER);
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	     
	     Thread.sleep(5000);
	    // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[1]/div/fieldset/div/div[1]/div/div[1]/span/input")).sendKeys("4242424242424242");
	     driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
	     Thread.sleep(1000);		     
	     driver.findElement(By.id("billingName")).sendKeys("Rakesh");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"cardExpiry\"]")).sendKeys("1033");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"cardCvc\"]")).sendKeys("224");	    	   
	     Thread.sleep(2000);
	     Robot e1 = new Robot();
	     e1.keyPress(KeyEvent.VK_ENTER);
	     e1.keyRelease(KeyEvent.VK_ENTER);
	    // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div[2]/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]")).click();	 
	     System.out.println("2000 Stripe Balance");
	     Thread.sleep(7000);
	   try {
				Screen screen = new Screen();
				Pattern ch11 = new Pattern("D:\\Administrator\\Pictures\\acc.PNG");
				screen.wait(ch11, 10);
				screen.click(ch11, 10);
	   }catch(Exception e112) {
		   System.out.println(e112);
	   }
	    ArrayList<String> RL=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(RL.get(0));
	    driver.close();
	    driver.switchTo().window(RL.get(1));
	    
	    // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/p[2]/b/a")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"balanceHistoryDiv\"]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("balance_button")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("back")).click();
	     System.out.println("Transaction History Page");
	     driver.findElement(By.name("balanceTable_length")).sendKeys("All");
	     Thread.sleep(1000);
	     driver.findElement(By.name("balanceTable_length")).sendKeys("100");
	     Thread.sleep(1000);
	     driver.findElement(By.name("balanceTable_length")).sendKeys("50");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"balanceTable_paginate\"]/ul/li[3]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"balanceTable_filter\"]/label/input")).sendKeys("OR00905650");
	     Thread.sleep(1000);
	    // driver.findElement(By.xpath("//*[@id=\"balanceTable\"]/tbody/tr/td[1]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(1000);
	     /////////////////////////////////////////
	    
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[1]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[4]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[5]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[6]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[7]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[8]/a/div[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();// dashboard
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[9]/a/div[1]")).click();
	     System.out.println("DashBoard completed");
	     Thread.sleep(2000);
	     driver.quit();
	     
	     
	}
}
