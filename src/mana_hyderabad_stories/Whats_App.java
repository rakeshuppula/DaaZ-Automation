package mana_hyderabad_stories;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Whats_App {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
         driver.navigate().to("https://web.whatsapp.com/");
         Thread.sleep(4000);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/aside/div/div[3]/button")).click();
         Thread.sleep(90000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div")).sendKeys("mom");
         Thread.sleep(5000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[14]/div/div/div/div[2]")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/span/span")).click();
         Thread.sleep(4000);
//         int i;
//         for(i=1;i<=100;i++) {
         WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p"));
        wb.sendKeys("Sorry\r\n"+"Sorry");
        Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span")).click();
 		 Thread.sleep(4000);
         
	}

}
