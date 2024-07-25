package Regression_Testing_DEV;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _6_Add_To_Feature {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
		// 1st //*[@id="myDomainsList"]/tbody/tr[1]/td[1]/div
		// 2nd //*[@id="myDomainsList"]/tbody/tr[2]/td[1]/div
		// 3rd //*[@id="myDomainsList"]/tbody/tr[3]/td[1]/div
		driver.findElement(By.xpath("//*[@id=\"myDomainsList\"]/tbody/tr[2]/td[1]/div")).click();
		Thread.sleep(2000);
		System.out.println("Selected domain");
		JavascriptExecutor jt2 = (JavascriptExecutor) driver;
		jt2.executeScript("window.scrollBy(0,-500)", "");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div/div[4]/a")).click();
		Thread.sleep(2000);
		System.out.println("Clicked on featured button");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[3]/form/div[5]/button"))
				.click();
		Thread.sleep(2000);
		System.out.println("clicked next button");
		driver.findElement(By.xpath("//a[normalize-space()='proceed to payment']")).click();
		Thread.sleep(1000);
		System.out.println("Clicked proceed button");
		driver.findElement(By.xpath("//label[@for='balance']")).click();
		Thread.sleep(1000);
		System.out.println("Selected Balance");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[3]/label"))
				.click();
		Thread.sleep(1000);
		System.out.println("Selected USD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-sm btn btn-primary balance_submit']")).click();
		System.out.println("Payment Done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.xpath("//*[@id=\"signout\"]")).click();
		System.out.println("Seller logout");
		driver.quit();

	}

}
