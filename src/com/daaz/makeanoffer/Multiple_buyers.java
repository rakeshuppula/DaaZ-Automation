package com.daaz.makeanoffer;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Multiple_buyers {
	
   public static void main(String[]args) throws Exception {	
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
		driver.findElement(By.id("keyword")).sendKeys("Doctor.com");
		System.out.println("Domain name searched");
		Thread.sleep(2000);
		try {
			Screen screen = new Screen();
			Pattern ch = new Pattern("C:\\Users\\Administrator\\Desktop\\Capturesee.PNG");
			screen.wait(ch, 10);
			screen.click(ch, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		try {
			Screen screen = new Screen();
			Pattern ch1 = new Pattern("C:\\Users\\Administrator\\Desktop\\CaptureAbc.PNG");
			// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
			Thread.sleep(1000);
			screen.wait(ch1, 10);
			screen.click(ch1, 10);
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			driver.close();
			driver.switchTo().window(tabs2.get(1));
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Clicked on domain");
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("offer")).sendKeys("20");
		Thread.sleep(1000);
		System.out.println("Offer 20");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(7000);
        
    
    
    
    
}
}