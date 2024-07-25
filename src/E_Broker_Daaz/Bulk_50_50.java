package E_Broker_Daaz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bulk_50_50 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	  //driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
		 driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/all/secure/transactions");
	   // driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
	    Thread.sleep(1000);
	    System.out.println("Enter into URL");
	  //  driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	    System.out.println("Click on Login Button");
	    //driver.findElement(By.id("username")).sendKeys("rakesh.uppula+broker@daazteam.com");
	    driver.findElement(By.id("username")).sendKeys("Rakeshuppula31@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	    System.out.println("Enter Username and Password");
	    driver.findElement(By.id("login_submit")).click();
	    System.out.println("Submit successfully");
	  Thread.sleep(1000);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[2]/a")).click();
	    Thread.sleep(1000);
      //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[5]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select")).click();       
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[3]")).click();
        driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com"); 
        driver.findElement(By.id("seller_email")).sendKeys("rakeshuppula3@gmail.com");
        WebElement fileInput =driver.findElement(By.xpath("//*[@id=\"fileToLoad\"]"));
        fileInput.sendKeys("C:\\Users\\Administrator\\Downloads\\sssssssss.csv");    		   
        JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,300)", "");
	    driver.findElement(By.id("partner_fees")).sendKeys("10");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[5]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.close();

	}

}
