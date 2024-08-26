package Only_UI_Side_UAT;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_Orders {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/user/payment/details");
	    Thread.sleep(1000);	    
	     //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(3000);
	     driver.findElement(By.name("example_length")).sendKeys("50");
	     Thread.sleep(1000);
	     driver.findElement(By.name("example_length")).sendKeys("100");
	     Thread.sleep(1000);
	     driver.findElement(By.name("example_length")).sendKeys("All");
	     Thread.sleep(1000);
	     System.out.println("50 , 100 , All buttons working");
//	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/label/input")).sendKeys("Vincy.com");
//	     Thread.sleep(3000);
//	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/label/input")).clear();
//	    Thread.sleep(2000);
//	     Robot r = new Robot();
//	     r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
//	    Thread.sleep(2000);
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[8]/a")).click();
	     Thread.sleep(1000);
	     String parentWindowHandle=driver.getWindowHandle();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();	    
         Set<String>windowHandles=driver.getWindowHandles();
         for(String windowHandle : windowHandles) {
         if(!windowHandle.equals(parentWindowHandle)) {
         driver.switchTo().window(windowHandle);
         Thread.sleep(5000);
         driver.close();
         }
         }
         driver.switchTo().window(parentWindowHandle);    
         Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/label/input")).sendKeys("Vincy.com");
 	     Thread.sleep(3000);
 	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/label/input")).clear();
 	    Thread.sleep(2000);
 	     Robot r = new Robot();
 	     r.keyPress(KeyEvent.VK_ENTER);
 	    r.keyRelease(KeyEvent.VK_ENTER);
 	    Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[1]/div[2]/p")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.name("example1_length")).sendKeys("50");
	     Thread.sleep(1000);
	     driver.findElement(By.name("example1_length")).sendKeys("100");
	     Thread.sleep(1000);
	     driver.findElement(By.name("example1_length")).sendKeys("All");
	     Thread.sleep(1000);
	     System.out.println("Hold= 50 , 100 , All buttons working");
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div/div/div[1]/div[2]/div/label/input")).sendKeys("Stop.com");
	     Thread.sleep(1000);
	     System.out.println("Searched A Domain");
	     driver.quit();
	     
	     
	     
	     
	     
	     
	     
}
}
