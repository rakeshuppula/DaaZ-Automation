package Only_UI_DEV;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E_Portfolio {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/portfolio");
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
	     Thread.sleep(2000);
	     driver.findElement(By.id("management_view")).sendKeys("Deleted Domains");
	     Thread.sleep(2000);
	     System.out.println("clicked on deleted domain");
	    // driver.findElement(By.id("management_view")).clear();
	     driver.findElement(By.id("management_view")).sendKeys("Upload Domains Report");
	     Thread.sleep(2000);
	     System.out.println("upload domain report");
	    // driver.findElement(By.id("management_view")).clear();
	     driver.findElement(By.id("management_view")).sendKeys("Insights");
	     Thread.sleep(2000);
	     System.out.println("Insights");
	     driver.findElement(By.id("management_view")).sendKeys("Portfolio Management View");     
	     Thread.sleep(2000);
	     JavascriptExecutor jt = (JavascriptExecutor) driver;
	     jt.executeScript("window.scrollBy(0,1000)", "");
	     Thread.sleep(2000);
	     Select st=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/select")));
	     st.selectByIndex(1);
	     Thread.sleep(2000);
	     st.selectByIndex(2);
	     Thread.sleep(2000);
	     st.selectByIndex(3);
	     Thread.sleep(2000);
	     st.selectByIndex(0);
	     Thread.sleep(2000);
	     Select se=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/select")));
	     se.selectByIndex(1);
	     Thread.sleep(2000);
	     se.selectByIndex(2);
	     Thread.sleep(2000);
	     se.selectByIndex(3);
	     Thread.sleep(2000);
	     se.selectByIndex(4);
	     Thread.sleep(2000);
	     se.selectByIndex(0);
	     Thread.sleep(2000);
	     Select sp=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/select")));
	     sp.selectByIndex(1);
	     Thread.sleep(2000);
	     sp.selectByIndex(2);
	     Thread.sleep(2000);
	     sp.selectByIndex(3);
	     Thread.sleep(2000);
	     sp.selectByIndex(4);
	     Thread.sleep(1000);
	     sp.selectByIndex(5);
	     Thread.sleep(1000);
	     sp.selectByIndex(6);
	     Thread.sleep(1000);
	     sp.selectByIndex(7);
	     Thread.sleep(1000);
	     sp.selectByIndex(8);
	     Thread.sleep(1000);
	     sp.selectByIndex(9);
	     Thread.sleep(1000);
	     sp.selectByIndex(0);
	     Thread.sleep(2000);
	     Select sa=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[2]/div[3]/select")));	     
	     sa.selectByIndex(1);
	     Thread.sleep(2000);
	     sa.selectByIndex(2);
	     Thread.sleep(2000);
	     sa.selectByIndex(3);
	     Thread.sleep(2000);
	     sa.selectByIndex(4);
	     Thread.sleep(2000);
	     sa.selectByIndex(5);
	     Thread.sleep(2000);
	     sa.selectByIndex(6);
	     Thread.sleep(2000);
	     sa.selectByIndex(7);
	     Thread.sleep(2000);
	     sa.selectByIndex(8);
	     Thread.sleep(2000);
	     sa.selectByIndex(9);
	     Thread.sleep(2000);
	     sa.selectByIndex(10);
	     Thread.sleep(2000);
	     sa.selectByIndex(0);          
	     Thread.sleep(2000);
	     driver.findElement(By.id("length")).sendKeys("5");
	     Thread.sleep(5000);
	     driver.findElement(By.id("length")).clear();
	     Thread.sleep(5000);
	     Select ss=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[1]/div/div[2]/select")));
	     ss.selectByIndex(1);
	     Thread.sleep(2000);
	     ss.selectByIndex(2);
	     Thread.sleep(2000);
	     ss.selectByIndex(0);
	     Thread.sleep(2000);
	     Select sd=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/select")));
	     sd.selectByIndex(1);
	     Thread.sleep(2000);
	     sd.selectByIndex(2);
	     Thread.sleep(2000);
	     sd.selectByIndex(0);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/button")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/ul/li[1]/div/input")).sendKeys(".com");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/span/div/ul/li[337]/a/label")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[4]/div[1]/select")).sendKeys("Active");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[4]/div[1]/select")).sendKeys("Inactive");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/input")).sendKeys("GoldAndDiamonds.in");
	     Thread.sleep(5000);
	     Thread.sleep(3000);
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     WebDriverWait wait = new WebDriverWait(driver, 15);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/input"
	     ))).clear();
	     Thread.sleep(3000);
	     driver.findElement(By.id("price")).sendKeys("1000");
	     Thread.sleep(5000);
	     driver.findElement(By.id("price")).clear();
	     Thread.sleep(5000);
	     driver.findElement(By.id("offer")).sendKeys("20");
	     Thread.sleep(5000);
	     driver.findElement(By.id("offer")).clear();
	     Thread.sleep(2000);
	     driver.findElement(By.id("btn-clear-search")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/div[4]/div[2]/div[1]/table/tbody/tr[1]/td[11]/div/a[2]/i")).click();
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[3]/div[3]/div[2]/button")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div[1]/ol/button[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
	     Thread.sleep(1000);
         driver.quit();

         
         
         
         
         
         
         
         
         
         
         
         
	}

    }
