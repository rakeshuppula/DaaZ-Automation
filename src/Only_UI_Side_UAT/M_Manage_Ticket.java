package Only_UI_Side_UAT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M_Manage_Ticket {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	     driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/manage/tickets");
	     Thread.sleep(1000);	    
	     //driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     driver.switchTo().frame("mtcaptcha-1-iframe-1");
		 driver.findElement(By.id("mtcap-inputtext-1")).click();
		 driver.switchTo().defaultContent();
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     System.out.println("LOGIN successfully");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/a")).click();
	     driver.findElement(By.id("category_id")).sendKeys("domains");
	     driver.findElement(By.id("title")).sendKeys("Automation and Java");
	     driver.findElement(By.xpath("//*[@id=\"profile-info-form\"]/div/div/div[4]/div/div/div/div[3]/div[2]")).sendKeys("AT Testing");
	     driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
	   //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	     System.out.println("Succussfully Created MANAGE TICKET");
	     Thread.sleep(4000);
	     driver.navigate().refresh();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[3]/div[1]/div/div[3]/div[2]")).sendKeys("Automation Testing");
	     Thread.sleep(1000);
	     driver.findElement(By.id("save")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[5]/div[1]/div/div[3]/div[2]")).sendKeys("Automation Testing Completd");
	     Thread.sleep(1000);
	     driver.findElement(By.id("close")).click();
	     Alert Rk=driver.switchTo().alert();
	     Rk.accept();
	     System.out.println("Ticket Closed");
	     Thread.sleep(5000);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     JavascriptExecutor jt1 = (JavascriptExecutor) driver;
	     jt1.executeScript("window.scrollBy(0,700)", "");
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[5]/label[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[6]/div[1]/div/div/div/div[3]/div[2]")).sendKeys("Doubt On Automation");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/div[6]/div[3]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("save")).click();
	     System.out.println("Ticket Reopened");
	     Thread.sleep(3000);
	     driver.quit();

	}
}
