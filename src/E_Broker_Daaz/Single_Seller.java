package E_Broker_Daaz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Single_Seller {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
	    // driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
		 driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/all/secure/transactions");
	   //  driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions/");
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	    // driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("Rakeshuppula31@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     System.out.println("Enter Username and Password");
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Submit successfully");
	     Thread.sleep(1000);
  //  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[5]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select")).click();
   // driver.findElement(By.xpath("//*[@id=\"seller_email\"]")).sendKeys("rakeshuppula3@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[2]")).click();
    driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"seller_email\"]")).sendKeys("rakeshuppula3@gmail.com");
    driver.findElement(By.id("domain_name")).sendKeys("uatbsellerwire.com");
    driver.findElement(By.id("currency")).sendKeys("USD");
    driver.findElement(By.id("agreed_amount")).sendKeys("98");
    driver.findElement(By.xpath("//*[@id=\"partner_fees\"]")).sendKeys("25%");
//    /html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[5]/button
    Thread.sleep(3000);
   // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[3]/span")).click(); 
   // driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[3]/span")).click();        
    driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
    Thread.sleep(3000);
    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[1]")).click();
   driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    System.out.println("Submit successfully");
    Thread.sleep(3000);
    driver.close();

	}

}
