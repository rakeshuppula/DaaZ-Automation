package E_Admin_Working_Fine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Promo_Code_Auction {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//Thread.sleep(1000);
			//try {
			driver.manage().window().maximize();
		     driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/login");
			//driver.get("https://dev:Devserver@1956!2023@d-v.in/");
		     //Thread.sleep(1000);
		     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/input")).sendKeys("Dev_DaaZ_Admin");
		     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[2]/div[2]/input")).sendKeys("Pesu@1956!2021"); 
		     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[4]/div[2]/button")).click();
		     //click on manage promo code
		     
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/ul/li[8]/a/span")).click();
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div/div[1]/div[2]/a/span")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"promocode\"]")).sendKeys("1997");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"promocode_desc\"]")).sendKeys("Offer");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"discount\"]")).sendKeys("10");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div/div/form/div[4]/div/span/button/i")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[4]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div/div/form/div[5]/div/span/button/i")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"expiry_date\"]")).click();
		     driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"limit_users\"]")).sendKeys("4");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"limit_per_user\"]")).sendKeys("5");
		     Thread.sleep(1000);
		     driver.findElement(By.id("status")).sendKeys("Active");
		     Thread.sleep(1000);
		     driver.findElement(By.id("type")).sendKeys("Auction");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
		     Thread.sleep(1000);
			
		     
			
//		    	
//		     }
//		    	catch(Exception e) { 
//		     File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		     FileUtils.copyFile(f1,new File("C:\\Users\\Administrator\\Pictures\\Screenshots.png"));
//		    	}
		     driver.quit();

	}

}
