package Regression_Testing_DEV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh = driver.findElement(By.id("validation-login"));		
		System.out.println("Click on Login button directly Without username and password = " + Rakesh.getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh11 = driver.findElement(By.id("validation-login"));		
		System.out.println("Enter valid username=" + Rakesh11.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();//9999999999999
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh2 = driver.findElement(By.id("validation-login"));
		System.out.println("Enter valid Password = " + Rakesh2.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("rakeshuppul@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh3 = driver.findElement(By.id("validation-login"));
		System.out.println("Enter Invalid username, valid password = " + Rakesh3.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh18##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh4 = driver.findElement(By.id("validation-login"));
		System.out.println("Enter valid username, invalid password = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("rakeshuppula@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh180##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh5 = driver.findElement(By.id("validation-login"));
		System.out.println("Enter both invalid username and password = " + Rakesh5.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh6 = driver.findElement(By.id("validation-login"));
		System.out.println("Enter both valid username and password = " + Rakesh6.getText());
		Thread.sleep(1000);
		
		driver.findElement(By.id("hidePassword")).click();
		System.out.println("Click on EYE button");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.findElement(By.id("login_submit")).click();
		WebElement Rakesh7 = driver.findElement(By.id("validation-login"));
		System.out.println("Without Captcha click on Register button = " + Rakesh7.getText());
		Thread.sleep(1000);
		
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-statusbutton-1")).click();
		System.out.println("Refresh Captcha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[1]/input")).sendKeys("TyFFSKEKK");
		System.out.println("Enter Wrong captcha");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[5]/div[1]/p/a")).click();
		System.out.println("Click on Register button");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[5]/div[2]/p/a")).click();
		System.out.println("Click on Forgot password button");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[1]/input")).sendKeys("rakeshuppul@gmail.com");
		System.out.println("Enter Wrong Forgot Email");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[1]/input")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/button[1]")).click();
		WebElement Rakesh8 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[2]/span/b"));
		System.out.println("Enter forgot mail and click on Restore = " + Rakesh8.getText());
		Thread.sleep(1000);
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[1]/input")).sendKeys("iHHJDUUEJ");
		System.out.println("Enter Wrong captcha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/input[2]")).click();
		System.out.println("Refresh Captcha");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/div[3]/a")).click();
		System.out.println("Return to LogIn");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[5]/div[2]/p/a")).click();
		System.out.println("Click on Forgot password button");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/button[2]")).click();
		System.out.println("Click on close button");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[7]/a[1]")).click();
		System.out.println("Click on FB");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[7]/a[2]")).click();
		System.out.println("Click on Twitter");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[7]/a[3]")).click();
		System.out.println("Click on Google");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
