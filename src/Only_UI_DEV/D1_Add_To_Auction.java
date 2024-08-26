package Only_UI_DEV;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class D1_Add_To_Auction {

	public static void main(String[] args) throws  Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		    		
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Seller login");
		Thread.sleep(2000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,1000)", "");
	    Thread.sleep(2000);
	    
     // Carefully select an Auction Domain	    
	    // 1st    //*[@id="myDomainsList"]/tbody/tr[1]/td[1]/div
	                       // 2nd    //*[@id="myDomainsList"]/tbody/tr[2]/td[1]/div
	                       //3rd     //*[@id="myDomainsList"]/tbody/tr[3]/td[1]/div
        driver.findElement(By.xpath("//*[@id=\"myDomainsList\"]/tbody/tr[1]/td[1]/div")).click();
        System.out.println("Selected domain"); // //*[@id="myDomainsList"]/tbody/tr[5]/td[1]/div
        driver.findElement(By.id("btn-add-auction-domains")).click();
        System.out.println("Clicked on Auction Button");
        Thread.sleep(1000);
        JavascriptExecutor Rakesh = (JavascriptExecutor) driver;
	    Rakesh.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(1000);
	    Select dt=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/form/div[3]/div/div/div[2]/div/div/select")));
        dt.selectByIndex(3);
        Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/form/div[4]/button")).click();
        Thread.sleep(1000);
        System.out.println("clicked next button");
        driver.findElement(By.xpath("//a[normalize-space()='proceed to payment']")).click();
        Thread.sleep(1000);
        System.out.println("Clicked proceed button");
        driver.findElement(By.xpath("//label[@for='balance']")).click();
        Thread.sleep(1000);
        System.out.println("Selected Balance");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[3]/label")).click();
        Thread.sleep(1000);
        System.out.println("Selected USD");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-sm btn btn-primary balance_submit']")).click();
		System.out.println("Payment Done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		 driver.findElement(By.xpath("//*[@id=\"signout\"]")).click();
		 System.out.println("Seller logout");
// Admin side
		System.out.println("***** ADMIN SIDE *****");// Admin side	********************************************************8	
		 driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
	     Thread.sleep(1000);	    
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dev_DaaZ_Admin");
	     Thread.sleep(2000);
	     System.out.println("Enter Mail");	     
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pesu@1956!2021"); 
	     Thread.sleep(2000);
	     System.out.println("Enter Password");	   
	     driver.findElement(By.xpath("//button[@id='signInBtn']")).click();	     
	     Thread.sleep(1000);
	     driver.navigate().refresh();
	     System.out.println("Enter Submit");	     
	     Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Manage Sales Activities']")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on Manage Sales");
		 driver.findElement(By.xpath("//li[contains(@class,'open')]//ul[contains(@class,'sub-menu')]//a[contains(@class,'nav-link nav-toggle')]")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on Auction");
		 driver.findElement(By.xpath("//a[contains(@href,'/admin/auction-details')]")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on Auction Review");
		 driver.findElement(By.name("select")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on checkbox");		 
		 WebElement Rakesh2= driver.findElement(By.id("auction_option"));
		 Select RakeshTesting3=new Select(Rakesh2);
		 RakeshTesting3.selectByIndex(1);
		 Thread.sleep(2000);		 
		 System.out.println("options");
		 Robot a3 = new Robot();
	     a3.keyPress(KeyEvent.VK_ENTER);
	     a3.keyRelease(KeyEvent.VK_ENTER); 		 
		 Thread.sleep(2000);
		 System.out.println("Clicked on Accept");
		 //logout
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/a/span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[2]/a")).click();
		 Thread.sleep(2000);
		 System.out.println("Admmin Logout");
		 driver.quit();

	}

}
