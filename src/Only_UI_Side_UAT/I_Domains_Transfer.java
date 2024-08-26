package Only_UI_Side_UAT;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_Domains_Transfer {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/transfer/center");
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
	     //
	     //try {
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/a")).click();
//	     }catch(Exception e) {
//	    	 
//	     }
//	     Thread.sleep(2000);
	     //                           /html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[2]/td[7]/div/div/a
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div/ul/li[3]/a")).click();
	     Thread.sleep(2000);
	     
	     ArrayList<String> AL=new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(AL.get(1));
	     driver.close();
	     driver.switchTo().window(AL.get(0));
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/a")).click(); 
	     //driver.findElement(By.id("650638")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div/ul/li[2]/a")).click();
	     Thread.sleep(2000);
	     ArrayList<String>AI=new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(AI.get(1));
	     driver.close();
	     driver.switchTo().window(AI.get(0));
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/a")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div/ul/li[1]/a")).click();
	     Thread.sleep(2000);
	     ArrayList<String> AT=new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(AT.get(1));
	     driver.close();
	     driver.switchTo().window(AT.get(0));
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("25");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("50");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("100");
	     Thread.sleep(2000);
	     //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[5]/ul/li[5]/a")).click();
	    // Thread.sleep(2000);
	     //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/label/input")).sendKeys("BOOKYOUR.IN");
	    // Thread.sleep(2000);
	    // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/label/input")).clear();
	     Thread.sleep(4000);
         driver.findElement(By.id("trade_filter")).sendKeys("Purchased");
         Thread.sleep(2000);
         driver.findElement(By.name("testTable_length")).sendKeys("25");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("50");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("100");
	     Thread.sleep(2000);
         driver.findElement(By.id("trade_filter")).sendKeys("Sold");
         System.out.println("Selected Sold");
         Thread.sleep(2000);
         driver.findElement(By.name("testTable_length")).sendKeys("25");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("50");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("100");
	     Thread.sleep(2000);
	     driver.findElement(By.id("trade_filter")).sendKeys("All");
	     Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("Successful Transactions");
         Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("Cancelled Transactions");
         Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("All");
         Thread.sleep(2000);
        // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/label/input")).sendKeys("MonkeyTesting199.com");
      //   Thread.sleep(2000);
      //   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/label/input")).clear();
        // Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div/div[3]/div[2]")).sendKeys("100% Testing Not Possible");
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/button[1]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/button[2]")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form[1]/div/div[2]/label")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("trade_filter")).sendKeys("Purchased");
         Thread.sleep(2000);
         driver.findElement(By.name("testTable_length")).sendKeys("25");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("50");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("100");
	     Thread.sleep(2000);
         driver.findElement(By.id("trade_filter")).sendKeys("Sold");
         System.out.println("DaaZ secure Selected Sold");
         Thread.sleep(2000);
         driver.findElement(By.name("testTable_length")).sendKeys("25");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("50");
	     Thread.sleep(2000);
	     driver.findElement(By.name("testTable_length")).sendKeys("100");
	     Thread.sleep(2000);
	     driver.findElement(By.id("trade_filter")).sendKeys("All");
	     Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("Successful Transactions");
         Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("Cancelled Transactions");
         Thread.sleep(2000);
         driver.findElement(By.id("transaction_filter")).sendKeys("All");
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/label/input")).sendKeys("Einstein.com");
         Thread.sleep(2000);
         driver.findElement(By.id("4084")).click();        
         Thread.sleep(2000);
         //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr/td[7]/div/div/div/ul/li[3]/a")).click();
         //Thread.sleep(2000);
         String parentWindowHandle=driver.getWindowHandle();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr/td[7]/div/div/div/ul/li[3]/a")).click();	    
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
         driver.findElement(By.id("4084")).click();
         String parentWindowHandlea=driver.getWindowHandle();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr/td[7]/div/div/div/ul/li[2]/a")).click();	    
        
         Set<String>windowHandlesb=driver.getWindowHandles();
         for(String windowHandle : windowHandlesb) {
         if(!windowHandle.equals(parentWindowHandlea)) {
         driver.switchTo().window(windowHandle);
         Thread.sleep(5000);
         driver.close();
         }
         }
         driver.switchTo().window(parentWindowHandlea);    
         Thread.sleep(1000);
         driver.findElement(By.id("4084")).click();
         String parentWindowHandlec=driver.getWindowHandle();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr/td[7]/div/div/div/ul/li[1]/a")).click();	    
         Set<String>windowHandlesd=driver.getWindowHandles();
         for(String windowHandle : windowHandlesd) {
         if(!windowHandle.equals(parentWindowHandlec)) {
         driver.switchTo().window(windowHandle);
         Thread.sleep(5000);
         driver.close();
         }
         }
         driver.switchTo().window(parentWindowHandlec);    
         Thread.sleep(1000);
         
         driver.quit();      
	}
}
