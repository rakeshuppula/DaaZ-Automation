package Add_To_Feature;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Add_To_Featured_Balance {
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
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/a/span")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor jtw2 = (JavascriptExecutor) driver;
 	    jtw2.executeScript("window.scrollBy(0,300)", "");
 	   Thread.sleep(1000);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[3]/div[1]/label/span")).click();
//	    Thread.sleep(3000);
//	    try {
//	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[1]/label/span")).click();
//		    Thread.sleep(3000);
//	    }catch(Exception e) {
//	    	 JavascriptExecutor jtw = (JavascriptExecutor) driver;
//	 	    jtw.executeScript("window.scrollBy(0,100)", "");
//	 	   Thread.sleep(1000);
//	    }
//	    try {
//	    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[1]/label/span")).click();
//		    Thread.sleep(3000);
//	    }catch(Exception e) {
//	    	
//	    }
//	    Thread.sleep(3000);
//       
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[1]/label/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("ryyy6499ewkkwo030e");
        Thread.sleep(2000);
        JavascriptExecutor jtw = (JavascriptExecutor) driver;
	    jtw.executeScript("window.scrollBy(0,500)", "");
 	   Thread.sleep(1000);
        try {
        	Screen St=new Screen();
        	Pattern pt=new Pattern("E:\\my Files\\cc.PNG");
        	St.wait(pt,10);
        	St.click(pt,10);
        	
        }catch(Exception e) {
        	
        }
        
               Thread.sleep(1000);
               try {
               	Screen St=new Screen();
               	Pattern pt=new Pattern("E:\\my Files\\cc.PNG");
               	St.wait(pt,10);
               	St.click(pt,10);
               	
               }catch(Exception e) {
               	
               }
               Thread.sleep(1000);
               try {
               	Screen St=new Screen();
               	Pattern pt=new Pattern("E:\\my Files\\cc.PNG");
               	St.wait(pt,10);
               	St.click(pt,10);
               	
               }catch(Exception e) {
               	
               }
        
        
        
        
        
        
        
        
        Thread.sleep(6000);
	   // driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div/div[4]/a")).click();
//        Thread.sleep(2000);
//        System.out.println("Clicked on featured button");
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[3]/form/div[5]/button")).click();
//        Thread.sleep(2000);
//        System.out.println("clicked next button");
//        driver.findElement(By.xpath("//a[normalize-space()='proceed to payment']")).click();
//        Thread.sleep(1000);
//        System.out.println("Clicked proceed button");
//        driver.findElement(By.xpath("//label[@for='balance']")).click();
//        Thread.sleep(1000);
//        System.out.println("Selected Balance");
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[3]/label")).click();
//        Thread.sleep(1000);
//        System.out.println("Selected USD");
//        Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn-sm btn btn-primary balance_submit']")).click();
//		System.out.println("Payment Done");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
//		driver.findElement(By.xpath("//*[@id=\"signout\"]")).click();
//		System.out.println("Seller logout");
	//	.///driver.quit();
		
	}

}
