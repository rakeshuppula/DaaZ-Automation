package Add_To_Auction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_to_Auction_Stripe {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(4000);   
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
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/form/div[4]/button")).click();
       Thread.sleep(1000);
       System.out.println("clicked next button");
       driver.findElement(By.xpath("//a[normalize-space()='proceed to payment']")).click();
       Thread.sleep(1000);
       System.out.println("Clicked proceed button");
       Thread.sleep(1000);
       System.out.println("Clicked stripe");
       driver.findElement(By.xpath("//*[@id=\"stripe_btn\"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
       Thread.sleep(1000);
       driver.findElement(By.name("cardExpiry")).sendKeys("333");
       Thread.sleep(1000);
       driver.findElement(By.name("cardCvc")).sendKeys("480");
       Thread.sleep(1000);     
       driver.findElement(By.id("billingName")).sendKeys("Rakesh");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[2]/form/div[2]/div/div[2]/button/div[3]")).click();
       Thread.sleep(6000);
       System.out.println("Payment Done");
       driver.quit();
	}

}
