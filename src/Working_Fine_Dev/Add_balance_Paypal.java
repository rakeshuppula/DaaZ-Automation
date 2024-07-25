package Working_Fine_Dev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_balance_Paypal {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	     driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
	     System.out.println("Enter into URL");
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     System.out.println("Enter Username and Password");
	     Thread.sleep(1000);
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Login successful");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[5]/button")).click();
	    // System.out.println("");
	     driver.findElement(By.id("amount")).sendKeys("1000");
	     Select Currency_name=new Select(driver.findElement(By.id("currency")));
	     Currency_name.selectByVisibleText("EUR");
	    // driver.findElement(By.id("currency")).sendKeys("USD");
	   //  Thread.sleep(1000);l`
	     driver.findElement(By.id("continue")).click();
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	     
	     System.out.println("Payment method start");
//	     driver.findElement(By.xpath("")).click();
//	     driver.findElement(By.xpath("")).sendKeys("");	 	     
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[5]/div/div[4]/ul/li[2]/label/span/b")).click();
	     Thread.sleep(2000);  // driver.findElement(By.id("zoid-paypal-buttons-uid_9e654e30a8_mte6mte6mjm")).click();
	     driver.switchTo().frame("iframe");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/span")).click();	     
	     driver.switchTo().defaultContent();
	     
	     
	     
	     
	     
	     
	}

}
