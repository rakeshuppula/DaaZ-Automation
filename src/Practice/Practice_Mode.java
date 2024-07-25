package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Practice_Mode {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("ChatGPT");
		Robot rb=new Robot();		
		rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.xpath("/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/div/span/a/div/div/span/div/img")),
		driver.findElement(By.id("APjFqb"))).perform();
		Thread.sleep(6000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		  je.executeScript("window.scrollBy(0,300)","");
		  Thread.sleep(1000);
		  JavascriptExecutor je2=(JavascriptExecutor)driver;
		  je2.executeScript("window.scrollBy(0,-300)","");		
		driver.quit();
		
		
		
	}}
