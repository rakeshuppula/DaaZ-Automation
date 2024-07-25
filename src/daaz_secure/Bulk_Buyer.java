package daaz_secure;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bulk_Buyer {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
	    // driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
	     driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions/");
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	    // driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     Thread.sleep(10000);
	     System.out.println("Enter Username and Password");
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Submit successfully");
	     Thread.sleep(1000);
    //  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[5]")).click();
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a")).click();
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select")).click();       
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[3]")).click();
      driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com"); 
      
      WebElement fileInput =driver.findElement(By.xpath("//*[@id=\"fileToLoad\"]"));
      fileInput.sendKeys("C:\\Users\\Administrator\\Downloads\\sssssssss.csv");    		   
//      Robot r = new Robot();
//	    r.keyPress(KeyEvent.VK_CONTROL);    
//       r.keyPress(KeyEvent.VK_V);
//       r.delay(2000);
//       r.keyRelease(KeyEvent.VK_CONTROL);
//       r.keyRelease(KeyEvent.VK_V);
//       r.delay(2000);
//       r.keyPress(KeyEvent.VK_ENTER);
//       r.keyRelease(KeyEvent.VK_ENTER);  
       JavascriptExecutor jt = (JavascriptExecutor) driver;
	     jt.executeScript("window.scrollBy(0,300)", "");
      driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[1]/span")).click();
      driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
     // driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
      Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
      Thread.sleep(2000);
     // driver.close();
	}

	}


