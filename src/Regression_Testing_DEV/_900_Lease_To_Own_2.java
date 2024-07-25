package Regression_Testing_DEV;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class _900_Lease_To_Own_2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
		Thread.sleep(1000);

		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
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
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		try {
			Screen sc=new Screen();
			Pattern pt=new Pattern("C:\\Users\\Administrator\\Desktop\\1996.PNG");			
			sc.wait(pt,10);
			sc.click(pt,10);			
		}catch(Exception e) {	
		}
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("installment_status")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("installment_status")).sendKeys("Active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
//==================================================================================================		
		System.setProperty("webdriver.edge.driver", "./EdgeDriver/msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://dev:Devserver@1956!2023@d-v.in/dashboard");
		Thread.sleep(1000);

		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver1.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver1.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver1.switchTo().frame("mtcaptcha-1-iframe-1");
		driver1.findElement(By.id("mtcap-inputtext-1")).click();
		driver1.switchTo().defaultContent();
		Thread.sleep(10000);
		driver1.findElement(By.id("login_submit")).click();
		System.out.println("LOGIN successfully");
		Thread.sleep(2000);
		driver1.navigate().refresh();
		driver1.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")).click();		
		Thread.sleep(3000);
		try {
			Screen sc=new Screen();
			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\Lease.PNG");
			sc.wait(pr,10);
			sc.click(pr,10);	
		}catch(Exception e) {	
		}
				Thread.sleep(2000);
		JavascriptExecutor jt2 = (JavascriptExecutor) driver1;
		jt2.executeScript("window.scrollBy(0,100)", "");
		//driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		try {
			Screen sc=new Screen();
			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\AcceptLease.PNG");
			sc.wait(pr,10);
			sc.click(pr,10);	
		}catch(Exception e) {	
		}
		//driver1.findElement(By.name("confirm_agreement")).click();
		Thread.sleep(2000);
		try {
			Screen sc=new Screen();
			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\BuyLease.PNG");
			sc.wait(pr,10);
			sc.click(pr,10);	
		}catch(Exception e) {	
		}
		//driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[6]/a")).click();
		Thread.sleep(5000);
		JavascriptExecutor jt21 = (JavascriptExecutor) driver1;
		jt21.executeScript("window.scrollBy(0,200)", "");
		try {
			Screen sc=new Screen();
			//Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\PayBal.PNG");
			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\LeaseStripe.PNG");
			sc.wait(pr,10);
			sc.click(pr,10);	
		}catch(Exception e) {	
		}
        //driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span/b")).click();
        Thread.sleep(3000);
//        try {
//			Screen sc=new Screen();
//			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\BalEUR.PNG");
//			sc.wait(pr,10);
//			sc.click(pr,10);	
//		}catch(Exception e) {	
//		}
//        
        //driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[1]/label")).click();
        Thread.sleep(2000);
        try {
			Screen sc=new Screen();
			Pattern pr=new Pattern("C:\\Users\\Administrator\\Desktop\\BalSub.PNG");
			sc.wait(pr,10);
			sc.click(pr,10);	
		}catch(Exception e) {	
		}
        //driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/button")).click();
        Thread.sleep(5000);
        driver1.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
	    Thread.sleep(1000);		     
	     driver1.findElement(By.id("billingName")).sendKeys("Rakesh");
	     driver1.findElement(By.xpath("//*[@id=\"cardNumber\"]")).click();
	     driver1.findElement(By.xpath("//*[@id=\"cardExpiry\"]")).sendKeys("1033");
	    // Thread.sleep(1000);
	     driver1.findElement(By.xpath("//*[@id=\"cardCvc\"]")).sendKeys("224");	    	   
	    Thread.sleep(4000);
	     driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div[2]/form/div[2]/div/div[2]/button/div[3]")).click();
	   //  Thread.sleep(1000);
	     System.out.println("Payment successfully");
	     Thread.sleep(1000);
        
        
        
        
        
        
        
        
        
        
	}

}
