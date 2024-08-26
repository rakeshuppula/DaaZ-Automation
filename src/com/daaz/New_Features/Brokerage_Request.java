package com.daaz.New_Features;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.tigervnc.rfb.screenTypes;

public class Brokerage_Request {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/dashboard/");
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/dashboard/");
		System.out.println("Enter into URL");
		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		System.out.println("Enter Username and Password");
		Thread.sleep(1000);
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();//Buy domain button
	       Thread.sleep(2000);
	      
	       JavascriptExecutor jt2 = (JavascriptExecutor) driver;
		    jt2.executeScript("window.scrollBy(0,100)", "");
		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
//		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/label")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")).click();
		    Thread.sleep(4000);
		    ArrayList<String> gt=new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(gt.get(1));
		    Thread.sleep(2000);
//		driver.findElement(By.id("keyword")).sendKeys("DronShoot.com");
//		System.out.println("Domain name searched");
		Thread.sleep(2000);
//		try {
//			Screen screen = new Screen();
//			Pattern ch = new Pattern("C:\\Users\\Administrator\\Desktop\\Capturesee.PNG");
//			screen.wait(ch, 10);
//			screen.click(ch, 10);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		Thread.sleep(3000);
		
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//		try {
//			Screen screen = new Screen();
//			Pattern ch1 = new Pattern("C:\\Users\\Administrator\\Desktop\\CaptureAbc.PNG");
//			// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
//			Thread.sleep(1000);
//			screen.wait(ch1, 10);
//			screen.click(ch1, 10);
//			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(0));
//			driver.close();
//			driver.switchTo().window(tabs2.get(1));
//			driver.navigate().forward();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Clicked on domain");
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("offer")).sendKeys("20");
		Thread.sleep(1000);
		System.out.println("Offer 20");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(7000);
		try {
			Screen screen = new Screen();
			Pattern ch11 = new Pattern("C:\\Users\\Administrator\\Desktop\\Capturebr.PNG");
			screen.wait(ch11, 10);
			screen.click(ch11, 10);
		} catch (Exception e) {
			System.out.println(e);			
		}
		System.out.println("Send To Brokerage");
		
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/a/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("reserve_price")).sendKeys("300");
		System.out.println("Reserve price 300");
		Thread.sleep(1000);
		driver.findElement(By.id("asking_price")).sendKeys("300");
		System.out.println("Asking price 300");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm_request_brokerage")).click();
		
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Brokerage submit");
		Thread.sleep(1000);
		//driver.navigate().to("http://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/login");
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin side");
		Thread.sleep(2000);
		//driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		//driver.findElement(By.id("password")).sendKeys("UAT_DaaZ_Admin UATAdmin@2020");
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();

		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/make/offer/details");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[11]/a[1]"))
				.click();
		System.out.println("Enter into brokerage");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/a[2]")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.close();
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]"))
				.sendKeys("From Admin");
		System.out.println("Admin msg in brokerage");
		Thread.sleep(2000);
		driver.findElement(By.id("status")).sendKeys("Payment");
		Thread.sleep(2000);
		System.out.println("Choose payment option");
		driver.findElement(By.id("final_deal_price")).sendKeys("300");
		Thread.sleep(2000);
		System.out.println("enter price");
		driver.findElement(By.id("send_to")).sendKeys("Both [Seller & Buyer] ");
		Thread.sleep(2000);
		System.out.println("Send to Buyer or Seller");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
		Thread.sleep(2000);
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("Submit");
		//driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/dashboard/");
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/dashboard/");
		
// Here no need give LOGIN DETAILS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/leads");
		//driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/leads");
		System.out.println("Again enter into Buyer Account");
		Thread.sleep(2000);
	try {
		Screen screen=new Screen();
		Pattern p1=new Pattern("C:\\Users\\Administrator\\Desktop\\paymf.PNG");	
		screen.wait(p1, 10);
		screen.click(p1, 10);
	}catch(Exception e) {
		System.out.println(e);
		
	}
	System.out.println("clicked on Pay button");
	     Thread.sleep(3000);
		driver.quit();

	}

}
