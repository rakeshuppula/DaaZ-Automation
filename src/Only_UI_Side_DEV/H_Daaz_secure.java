package Only_UI_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class H_Daaz_secure {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/dashboard/");
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions");
		System.out.println("Enter into URL");
		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		System.out.println("Enter Username and Password");
		Thread.sleep(1000);
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(1000);
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(3000);
		driver.navigate().refresh();
		try {
			Screen sr=new Screen();
			Pattern pt=new Pattern("C:\\Users\\Administrator\\Desktop\\Daazc.PNG");
				sr.wait(pt,10);	
				sr.click(pt,10);
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
				driver.close();
				driver.switchTo().window(tabs2.get(1));
		}catch(Exception e) {
			
		}
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select")).click();			
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("domain_name")).sendKeys("security9050.com");
		Thread.sleep(2000);
		driver.findElement(By.id("currency")).sendKeys("EUR");
		Thread.sleep(2000);
		driver.findElement(By.id("agreed_amount")).sendKeys("1002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		System.out.println("Submit successfully");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[6]/div[2]/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("currency")).sendKeys("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[4]/button")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[6]/div[1]/div/a")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[2]")).sendKeys("Regression Testing");
        Thread.sleep(2000);
        driver.findElement(By.id("msg_option")).click();
        driver.findElement(By.id("msg_option")).sendKeys("Everyone");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div[5]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("signout")).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}
}
