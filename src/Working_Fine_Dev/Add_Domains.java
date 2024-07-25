package Working_Fine_Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Add_Domains {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
	    driver.navigate().to("https://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/");
	    //driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
			driver.findElement(By.id("mtcap-inputtext-1")).click();
			driver.switchTo().defaultContent();
	    // driver.findElement(By.id("username")).sendKeys("vunnava.chowdary@esmart.in");
	   //  driver.findElement(By.id("password")).sendKeys("DaaZ@123");
	     System.out.println("Entered Username and Password");

	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a/span")).click();
         driver.findElement(By.id("domains")).sendKeys("CompatabilityTesting00.Coffee\r\n"+"CompatabilityTesting.com\r\n"+"CompatabilityTesting2.in\r\n"+"CompatabilityTesting3.Coffee\r\n"+"CompatabilityTesting4.Coffee\r\n"+"CompatabilityTesting5.Coffee\r\n"+"CompatabilityTesting6.Coffee\r\n"+"CompatabilityTesting7.Coffee\r\n"+"CompatabilityTesting8.Coffee\r\n"+"CompatabilityTesting9.Coffee\r\n"+"CompatabilityTesting.Coffee");
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/button")).click();         
         //System.out.println("Added Domain Successfully");
         Thread.sleep(1000);
         driver.quit();
	}
}
