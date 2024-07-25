package Working_Fine_Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reopen_Tickets {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	     driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/manage/tickets");
	     Thread.sleep(1000);
	     System.out.println("Enter into URL");
	    // driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	    // System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     Thread.sleep(10000);
	     System.out.println("Entered Username and Password");
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("Submit successfully");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[5]/label[1]/span")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"profile-info-form\"]/div[1]/div/div/div/div[3]/div[2]")).sendKeys("Reopening");
	     Thread.sleep(1000);
	     driver.findElement(By.id("save")).click();
	     Thread.sleep(3000);
	     driver.quit();
	}

}
