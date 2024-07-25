package daaz_secure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Single_50_50 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/all/secure/transactions");
	    // driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
	     //driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions/");
		 //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	    // driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rakesh1800##@@");
	     System.out.println("Enter Username and Password");
//	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
//	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
//	     System.out.println("Enter Username and Password");
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Submit successfully");
	     Thread.sleep(1000);
     //  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[5]")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[2]")).click();
       driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com");        
       driver.findElement(By.id("domain_name")).sendKeys("security0050.com");
       driver.findElement(By.id("currency")).sendKeys("EUR");
       driver.findElement(By.id("agreed_amount")).sendKeys("1002");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[3]/span")).click(); 
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
       Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
      Thread.sleep(2000);
       System.out.println("Submit successfully");
       
       driver.close();
	}

}
