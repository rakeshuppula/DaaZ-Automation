package Sikuli;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		Thread.sleep(1000);	
		 driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions");
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	     //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();		   
	     System.out.println("Entered Username and Password");
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(3000);
		try {
			Screen screen=new Screen();
		//Pattern trans =new Pattern("C:\\Users\\Administrator\\Desktop\\Capture0.PNG");
		driver.navigate().to("https://d-v.in/secure/transaction/details/4239");
		 JavascriptExecutor jt = (JavascriptExecutor) driver;
 	     jt.executeScript("window.scrollBy(0,300)", "");
 	    Thread.sleep(1000);
		Pattern btn =new Pattern("C:\\Users\\Administrator\\Desktop\\Capture90.PNG");
		Pattern ch =new Pattern("C:\\Users\\Administrator\\Desktop\\Capture200.PNG");
		Pattern paynow =new Pattern("C:\\Users\\Administrator\\Desktop\\Capturepaynow.PNG");
		Pattern bal =new Pattern("C:\\Users\\Administrator\\Desktop\\Capturebal.PNG");
		Pattern eur =new Pattern("C:\\Users\\Administrator\\Desktop\\Captureeur.PNG");
		Pattern order =new Pattern("C:\\Users\\Administrator\\Desktop\\Captureorder.PNG");
//		screen.wait(trans,10);
//		screen.click(trans,10);
//		 screen.click(btn,10);
		
		screen.wait(ch,10);
        screen.click(ch, 10);
        Thread.sleep(5000);
//        Robot r5 = new Robot();
//        r5.keyPress(KeyEvent.VK_ENTER);
//		r5.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		screen.wait(btn,10);
		screen.click(btn,10);
		Thread.sleep(2000);
		screen.wait(paynow,10);
		screen.click(paynow,10);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs2.get(1));
         driver.close();
         driver.switchTo().window(tabs2.get(0));
        
		Thread.sleep(3000);
		screen.wait(bal,10);
		screen.click(bal,10);
		Thread.sleep(3000);
		screen.wait(eur,10);
		screen.click(eur,10);
		Thread.sleep(3000);
		screen.wait(order,10);
		screen.click(order,10);
		
	}catch(Exception e) {
		System.out.println(e);
	}	
	}

}
