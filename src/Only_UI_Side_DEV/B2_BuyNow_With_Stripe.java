package Only_UI_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B2_BuyNow_With_Stripe {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();		    		
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Seller login");
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(4000);
	    
       driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
       Thread.sleep(2000);
       System.out.println("Selected domain");
       JavascriptExecutor jt2 = (JavascriptExecutor) driver;
	    jt2.executeScript("window.scrollBy(0,100)", "");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/label")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")).click();
	    Thread.sleep(4000);
	    ArrayList<String> gt=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(gt.get(1));
	    Thread.sleep(2000);
	    try {
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div[2]/a/span")).click();	    	
	    }catch(Exception e) {	    	
	    }
	    Thread.sleep(3000);
	    try {
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/a/span")).click();
	    }catch(Exception e) {	    	
	    }
	    Thread.sleep(3000);
	    try {
	    	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/a/span")).click();	
	    }catch(Exception e) {	    	
	    }
	    Thread.sleep(2000);
	    JavascriptExecutor j1tw = (JavascriptExecutor) driver;
 	    j1tw.executeScript("window.scrollBy(0,300)", "");
 	   Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span")).click();
	    Thread.sleep(3000);
	    
	    try {
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b")).click();
		    Thread.sleep(3000);
	    }catch(Exception e) {
	    	 JavascriptExecutor jtw = (JavascriptExecutor) driver;
	 	    jtw.executeScript("window.scrollBy(0,100)", "");
	 	   Thread.sleep(1000);
	    }
	    try {
	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b")).click();
		    Thread.sleep(3000);
	    }catch(Exception e) {
	    	
	    }
	    Thread.sleep(3000);
       System.out.println("Selected stripe");
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/button")).click();
       Thread.sleep(2000);
       
       Thread.sleep(2000);
		driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
		System.out.println("Payment Done");
		Thread.sleep(3000);
		//driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
		 driver.findElement(By.name("cardExpiry")).sendKeys("333");
	       Thread.sleep(1000);
	       driver.findElement(By.name("cardCvc")).sendKeys("029");
	       Thread.sleep(1000);     
	       driver.findElement(By.name("billingName")).sendKeys("Rakesh");
	       Thread.sleep(1000);
	       JavascriptExecutor jt8 = (JavascriptExecutor) driver;
		    jt8.executeScript("window.scrollBy(0,100)", "");
		    Thread.sleep(1000);
	       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]")).click();
	       Thread.sleep(6000);
	    driver.quit();

	}

}
