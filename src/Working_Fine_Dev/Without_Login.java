package Working_Fine_Dev;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Without_Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://dev:Devserver@1956!2023@d-v.in/dashboard");
		 System.out.println("Enter into URL");
	     //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     Thread.sleep(1000);
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
			driver.findElement(By.id("mtcap-inputtext-1")).click();
			driver.switchTo().defaultContent();
	     Thread.sleep(10000);
	     System.out.println("Enter Username and Password");
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Submit successfully");
	     Thread.sleep(1000);
	     driver.findElement(By.id("keyword")).sendKeys("T20-3Dview6.com");
	     Thread.sleep(1000);
	     Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/a/span")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[1]/label")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("trans_id")).sendKeys("idewkkei38383ei3ikk3");
	     Thread.sleep(1000);
	     driver.findElement(By.id("date")).sendKeys("11\r\n"+"05\r\n"+"2024");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[2]/div[2]/div[2]/div[6]/label"));    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

	}

}
