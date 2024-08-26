package Only_Admin_Side_DEV;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_Dash_Board {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		//driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		//driver.findElement(By.id("password")).sendKeys("UAT_DaaZ_Admin UATAdmin@2020");
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String parentWindowHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
		Thread.sleep(3000);		
	     Set<String>windowHandles=driver.getWindowHandles();
	     for(String windowHandle : windowHandles) {
	     if(!windowHandle.equals(parentWindowHandle)) {
	     driver.switchTo().window(windowHandle);
	    Thread.sleep(5000);
	    driver.close();
	    }
	    }
	    driver.switchTo().window(parentWindowHandle); 	   
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    System.out.println("clicked on Close History");
	    Thread.sleep(2000);
	    driver.findElement(By.id("lease_own_pending_payment")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    System.out.println("clicked on Close History");
	    Thread.sleep(2000);
	    driver.findElement(By.id("wire_transfer_pending_payment")).click();
	    Thread.sleep(3000);
	    System.out.println("Transfer Center"); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
        Thread.sleep(3000);
	    ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(1));
		driver.close();
		driver.switchTo().window(tabs4.get(0));
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    System.out.println("clicked on Close History");
	    Thread.sleep(2000);
	    System.out.println("Buynow"); 
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(1));
		driver.close();
		driver.switchTo().window(tabs5.get(0));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/input[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/input[2]")).click();
	    System.out.println("clicked on Close History");
	    System.out.println("Auction"); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(1));
		driver.close();
		driver.switchTo().window(tabs6.get(0));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000); 
	    System.out.println("clicked on Close History");
	    System.out.println("Make an offer"); 
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/input[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(1));
		driver.close();
		driver.switchTo().window(tabs8.get(0));
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    System.out.println("");
	    System.out.println("DaaZ Secure"); 
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/input[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(1));
		driver.close();
		driver.switchTo().window(tabs9.get(0));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    System.out.println("");
	    System.out.println("Lease To Own"); 
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/input[5]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(3000);
	    ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(1));
		driver.close();
		driver.switchTo().window(tabs10.get(0));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    System.out.println("");
	    Thread.sleep(3500);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    driver.quit();
	  
	}

}
