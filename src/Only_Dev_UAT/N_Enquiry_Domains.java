package Regression_Testing_UAT;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class N_Enquiry_Domains {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/portfolio");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("buyer login");
		Thread.sleep(3000);
		driver.findElement(By.name("keyword")).sendKeys("Wood19.in");
		Thread.sleep(1000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		// inquiry button
		try {
			Screen st = new Screen();
			Pattern pk = new Pattern("E:\\my Files\\enq.PNG");
			st.wait(pk, 10);
			st.click(pk, 10);
		} catch (Exception e) {

		}

		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
		Thread.sleep(2000);
		JavascriptExecutor jtw1 = (JavascriptExecutor) driver;
		jtw1.executeScript("window.scrollBy(0,250)", "");
		// Proceed to Pay btn
		Thread.sleep(2000);
		driver.findElement(By.id("confirm_inquiry_request")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("investment_limit_range")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Software tester");
		Thread.sleep(2000);
		// Proceed to Pay btn
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		try {
			Screen st = new Screen();
			Pattern pk = new Pattern("E:\\my Files\\can.PNG");
			st.wait(pk, 10);
			st.click(pk, 10);
		} catch (Exception e) {

		}
		// driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/button[2]")).click();
		Thread.sleep(2000);
		// Proceed to Pay btn
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		Robot rb2 = new Robot();
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);// Accept
		Thread.sleep(7000);
		// Stripe Payment start
		JavascriptExecutor jtw = (JavascriptExecutor) driver;
		jtw.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span"))
				.click();
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor jtwe = (JavascriptExecutor) driver;
			jtwe.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(1000);
		}
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		Thread.sleep(3000);
		System.out.println("Selected stripe");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/button"))
				.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
		System.out.println("Payment Done");
		Thread.sleep(3000);
		// driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
		driver.findElement(By.name("cardExpiry")).sendKeys("333");
		Thread.sleep(1000);
		driver.findElement(By.name("cardCvc")).sendKeys("029");
		Thread.sleep(1000);
		driver.findElement(By.name("billingName")).sendKeys("Rakesh");
		Thread.sleep(1000);
		JavascriptExecutor jt8 = (JavascriptExecutor) driver;
		jt8.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]"))
				.click();
		Thread.sleep(3000);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"sendBasicAuth\", \"arguments\": {\"daaz_uat_user\":\"<daaz_uat_user>\", \"Daaz_uat_user@2020\": \"<Daaz_uat_user@2020>\", \"timeout\": \"<time in milliseconds>\"}}");

		Thread.sleep(6000);
		
// Admin
		Thread.sleep(1000);
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		    driver1.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
				System.out.println("Enter admin");
				Thread.sleep(2000);
				driver1.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
				Thread.sleep(2000);
				driver1.findElement(By.id("password")).sendKeys("UATAdmin@2020");
				Thread.sleep(1000);
				driver1.findElement(By.id("signInBtn")).click();		
				System.out.println("Admin Login succuss");
				Thread.sleep(2000);
				driver1.navigate().refresh();
				Thread.sleep(3000);
				driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
				Thread.sleep(2000);
				driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[4]/a")).click();//Domain Enquiries
				Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]/a")).click();
		        Thread.sleep(4000);
		        ArrayList<String> a7=new ArrayList<String>(driver1.getWindowHandles());
		        driver1.switchTo().window(a7.get(1));
		        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
		        Thread.sleep(4000);
		        Select lk3=new Select(driver1.findElement(By.name("status")));
		        lk3.selectByVisibleText("Payment");
		        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[3]/input")).sendKeys("500");
		        Thread.sleep(2000);
//		        
//		        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]")).sendKeys("");
//		        Thread.sleep(2000);
//		        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]")).sendKeys("");
//		        Thread.sleep(2000);
//		        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
//		        Thread.sleep(2000);
//		        
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]")).sendKeys("Rakeshuppula3+9077@gmail.com");
		        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]")).sendKeys("Rake");
		        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
		        Thread.sleep(3000);
		        
		        Alert am3=driver1.switchTo().alert();
		        am3.accept();
		        Thread.sleep(6000);
		        
//UI 
		         // URL
		       // driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/brokerage-service");
		        driver1.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/brokerage-service");
				Thread.sleep(3000);
				try {
				driver1.findElement(By.id("username")).sendKeys("Rakeshuppula3+buyer@gmail.com");
				driver1.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
				driver1.switchTo().frame("mtcaptcha-1-iframe-1");
				driver1.findElement(By.id("mtcap-inputtext-1")).click();
				driver1.switchTo().defaultContent();
				Thread.sleep(10000);
				driver1.findElement(By.id("login_submit")).click();
				System.out.println("buyer login");
				Thread.sleep(3000);
				}catch(Exception e) {
					
				}				
				
		        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[4]/a")).click();
		        Thread.sleep(2000);//Invoice
		        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
		        Thread.sleep(2000);
		        try {
		        ArrayList<String> ar=new ArrayList<String>(driver1.getWindowHandles());
		        driver1.switchTo().window(ar.get(1));
		        }catch(Exception e) {
		        	
		        }
		        Thread.sleep(2000);
		        try {
			        ArrayList<String> ar=new ArrayList<String>(driver1.getWindowHandles());
			        driver1.switchTo().window(ar.get(3));
			        }catch(Exception e) {
			        	
			        }
		        Thread.sleep(2000);
		        ArrayList<String> ar1=new ArrayList<String>(driver1.getWindowHandles());
		        driver1.switchTo().window(ar1.get(1));
		        Thread.sleep(2000);//Chat
		        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[1]")).click();
		        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/div/div[1]/a")).click();
		        Thread.sleep(4000);
		        JavascriptExecutor jtw0 = (JavascriptExecutor) driver1;
				jtw0.executeScript("window.scrollBy(0,250)", "");
				 Thread.sleep(1000);
				    driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span")).click();
				    Thread.sleep(3000);
				    
				    try {
				    	driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b")).click();
					    Thread.sleep(3000);
				    }catch(Exception e) {
				    	 JavascriptExecutor jtwe = (JavascriptExecutor) driver1;
				 	    jtwe.executeScript("window.scrollBy(0,100)", "");
				 	   Thread.sleep(1000);
				    }
				    try {
				    	driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span/b")).click();
					    Thread.sleep(3000);
				    }catch(Exception e) {
				    	
				    }
				    Thread.sleep(3000);
			       System.out.println("Selected stripe");
			       driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/button")).click();
			       Thread.sleep(2000);
			       
			       Thread.sleep(2000);
					driver1.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
					System.out.println("Payment Done");
					Thread.sleep(3000);
					//driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
					 driver1.findElement(By.name("cardExpiry")).sendKeys("333");
				       Thread.sleep(1000);
				       driver1.findElement(By.name("cardCvc")).sendKeys("029");
				       Thread.sleep(1000);     
				       driver1.findElement(By.name("billingName")).sendKeys("Rakesh");
				       Thread.sleep(1000);
				       JavascriptExecutor jt83 = (JavascriptExecutor) driver1;
					    jt83.executeScript("window.scrollBy(0,100)", "");
					    Thread.sleep(1000);
				       driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]")).click();
				       Thread.sleep(8000);
		        //URL
				       driver1.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/brokerage-service");
						Thread.sleep(3000);  
				        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[4]/a")).click();
				        Thread.sleep(2000);//Invoice
				        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
				        
				        Thread.sleep(2000);//Chat
				        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[1]")).click();
				        Thread.sleep(2000);
		        driver1.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/form/div/div/div[3]/div[2]")).sendKeys("Payment completed");
		        Thread.sleep(2000);//transfer center
		        driver1.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div[7]/div[1]/p[4]/a")).click();
		        Thread.sleep(4000);
		        driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/a")).click();
		        Thread.sleep(2000);//transaction overview
		        driver.quit();
		        driver1.quit();
	}

}
