package Only_UI_Side_DEV;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class N1_Enquiry_Domain_Balance {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");

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
		driver.findElement(By.name("keyword")).sendKeys("Enquiryfee.in");
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
				"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
				.click();
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor jtwe = (JavascriptExecutor) driver;
			jtwe.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(1000);
		}
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		Thread.sleep(3000);
		System.out.println("Selected Balance");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/button")).click();	
		Thread.sleep(10000);
//LogOut
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/ul/li[4]/a")).click();
		Thread.sleep(4000);
		
// Admin  ####################################################################################################
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[4]/a")).click();// Domain
																										// Enquiries
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> a7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a7.get(1));
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]"))
				.sendKeys("test");
		Thread.sleep(2000);
		Select lk3 = new Select(driver.findElement(By.name("status")));
		lk3.selectByVisibleText("Payment");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[3]/input"))
				.sendKeys("500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]"))
				.sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]"))
				.sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]"))
				.sendKeys("Rakeshuppula3+9077@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]"))
				.sendKeys("Rake");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
		Thread.sleep(2000);

		Alert am3 = driver.switchTo().alert();
		am3.accept();
		Thread.sleep(6000);

//UI  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/brokerage-service");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);// Invoice
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
		Thread.sleep(2000);
		try {
			ArrayList<String> ar = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(ar.get(1));
		} catch (Exception e) {

		}
		ArrayList<String> ar = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(3));
		driver.close();
		Thread.sleep(2000);
		ArrayList<String> ar0 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar0.get(0));
		Thread.sleep(2000);
			ArrayList<String> ar2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(ar2.get(2));
			driver.close();
			Thread.sleep(2000);
			ArrayList<String> ari = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(ari.get(1));
		Thread.sleep(2000);
//		try {
//		ArrayList<String> ar1 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(ar1.get(3));
//		driver.close();
//		} catch (Exception e) {
//
//		}
		Thread.sleep(2000);// Chat
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[1]")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/div/div[2]/span")).click();//Refresh
		} catch (Exception e) {
			
					}
		try {
			driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/div/div[2]/span")).click();//Refresh
		} catch (Exception e) {
			
					}
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div[5]/div[2]/p[5]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[2]/div/label/span")).click();
		Thread.sleep(2000);

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
				.click();
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor jtwe = (JavascriptExecutor) driver;
			jtwe.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(1000);
		}
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[1]/label/span"))
					.click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		Thread.sleep(3000);
		System.out.println("Selected Balance");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/button")).click();	
		Thread.sleep(10000);
	
		Thread.sleep(10000);

		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/brokerage-service");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[4]/a")).click();		

		Thread.sleep(2000);// Chat
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[9]/a[1]")).click();
		Thread.sleep(3000);
		try {
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/form/div/div/div[3]/div[2]")).sendKeys("Payment completed");
		Thread.sleep(2000);// transfer center
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/div/div[2]/button[1]")).click();
		}catch(Exception e) {
			
		}
		Thread.sleep(4000);
		try {
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div[7]/div[1]/p[4]/a")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/a[3]")).click();
        Thread.sleep(2000);
        
        ArrayList<String> ar13e = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar13e.get(1));
}catch(Exception e) {
			
		}
		 Thread.sleep(2000);
// Admin  #######################################################################################       
        driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/a")).click();// Manage domains
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span")).click();//Transfer Center																												
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/ul/li[1]/a")).click();//ALL
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
		Thread.sleep(2000);
		ArrayList<String> ar13e = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar13e.get(2));		
		Select db=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/select")));
		db.selectByIndex(11);
		Thread.sleep(2000);
        Alert yt=driver.switchTo().alert();
        yt.accept();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[13]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/div/ul/li[2]/a")).click();//invoice btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> jh=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(jh.get(2));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> jh1=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(jh1.get(2));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> jh2=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(jh2.get(2));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/ul/li/a")).click();
        Thread.sleep(2000);
        ArrayList<String> jh3=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(jh3.get(2));
        Thread.sleep(2000);
		driver.quit();

	}

}
