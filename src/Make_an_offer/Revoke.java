package Make_an_offer;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Revoke {

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
		driver.findElement(By.id("keyword")).sendKeys("DefectDomain.in");
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
		driver.findElement(By.id("offer")).sendKeys("20");
		Thread.sleep(1000);
		System.out.println("Offer 20");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div[2]/a")).click();	
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("reason")).sendKeys("I don't Like");
		Thread.sleep(1000);
		driver.findElement(By.id("revoke_offer")).click();
		Robot rk=new Robot();
		rk.keyPress(KeyEvent.VK_ENTER);
		rk.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		JavascriptExecutor jj=(JavascriptExecutor)driver;
		jj.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.name("counterOffer")).sendKeys("50");
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[4]/label/b")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[6]/button")).click();
		
		Thread.sleep(4000);
		
		
		
		
		
		
		

	}

}
