package Make_an_offer;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Buyer_Seller_offers {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/dashboard/");
		System.out.println("Enter into URL");
		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		Thread.sleep(1000);
		System.out.println("Enter Username and Password");
		Thread.sleep(1000);
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(2000);
		driver.findElement(By.id("keyword")).sendKeys("lc.ae");
		System.out.println("Domain name searched");
		Thread.sleep(2000);
		try {
			Screen screen = new Screen();
			Pattern ch = new Pattern("C:\\Users\\Administrator\\Desktop\\Capturesee.PNG");
			screen.wait(ch, 10);
			screen.click(ch, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		try {
			Screen screen = new Screen();
			Pattern ch1 = new Pattern("C:\\Users\\Administrator\\Desktop\\CaptureAbc.PNG");
			// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
			Thread.sleep(1000);
			screen.wait(ch1, 10);
			screen.click(ch1, 10);
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			driver.close();
			driver.switchTo().window(tabs2.get(1));
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Clicked on domain");
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("bid_user")).sendKeys("100");
		Thread.sleep(1000);
		System.out.println("Offer 20");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/button")).click();
		Thread.sleep(1000);
		
		Thread.sleep(7000);
		
		// Seller @@@@@@@@@@@@@@@@@@@@@@@@@
		
		System.setProperty("webdriver.edge.driver", "./EdgeDriver/msedgedriver.exe");
		WebDriver drivers = new EdgeDriver();
		drivers.manage().window().maximize();
	
		drivers.navigate().to("https://dev:Devserver@1956!2023@d-v.in/leads");
		Thread.sleep(4000);
		driver.quit();
		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		drivers.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		drivers.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		Thread.sleep(1000);
		System.out.println("Enter Username and Password");
		Thread.sleep(1000);
		drivers.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(1000);
		drivers.findElement(By.id("mtcap-inputtext-1")).click();
		drivers.switchTo().defaultContent();
		Thread.sleep(13000);
		drivers.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(4000);
		//drivers.navigate().refresh();
		JavascriptExecutor jt = (JavascriptExecutor) drivers;
	     jt.executeScript("window.scrollBy(0,300)", "");
		try{
			Screen sr=new Screen();
			Pattern pn=new Pattern("C:\\Users\\Administrator\\Desktop\\R15.PNG");
			sr.wait(pn,10);
	        sr.click(pn, 10);
		}catch(Exception e) {
			System.out.println(e);
		}
		Thread.sleep(1000);
		drivers.findElement(By.name("counterOffer")).sendKeys("45");
		Thread.sleep(1000);
		drivers.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[4]/label/b")).click();
		Thread.sleep(1000);
		drivers.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[6]/button")).click();
		
		Thread.sleep(4000);
		
		// Buyer @@@@@@@@@@@@@@@@@@@@@@@@
		
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.navigate().to("https://dev:Devserver@1956!2023@d-v.in/leads");
		Thread.sleep(1000);
		drivers.quit();
		driver2.findElement(By.id("username")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver2.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		System.out.println("Enter Username and Password");
		Thread.sleep(1000);
		driver2.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(2000);
		driver2.findElement(By.id("mtcap-inputtext-1")).click();
		driver2.switchTo().defaultContent();
		Thread.sleep(13000);
		driver2.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(5000);
		driver2.navigate().refresh();
		JavascriptExecutor jt2 = (JavascriptExecutor) driver2;
	     jt2.executeScript("window.scrollBy(0,300)", "");
		try{
			Screen sr=new Screen();
			Pattern pn=new Pattern("C:\\Users\\Administrator\\Desktop\\R15.PNG");
			sr.wait(pn,10);
	        sr.click(pn, 10);
		}catch(Exception e) {
			System.out.println(e);
		}
		driver2.findElement(By.name("counterOffer")).sendKeys("30");
		Thread.sleep(1000);
		driver2.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[4]/label/b")).click();
		Thread.sleep(1000);
		JavascriptExecutor jt3 = (JavascriptExecutor) driver2;
	     jt3.executeScript("window.scrollBy(0,300)", "");
		try{
			Screen sr=new Screen();
			Pattern pn=new Pattern("C:\\Users\\Administrator\\Desktop\\Capturemsub.PNG");
			sr.wait(pn,10);
	        sr.click(pn, 10);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//driver2.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[6]/button")).click();
		Thread.sleep(4000);
		driver2.quit();
//		driver.quit();
		
		
		
		
		
		
	}

}
