package Only_Admin_DEV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Z1_Manage_Sales_Add_Auction {
	public static void main(String[] args) throws Exception {
		
		
		// Update Domain name ======================================================================
		
		
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
	        
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/a")).click();//Add Auction
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/ul/li[2]/a")).click();//Add Auction
		Thread.sleep(2000);
        driver.findElement(By.id("keyword")).sendKeys("electricvans.co");//Domain name
        Thread.sleep(2000);
        driver.findElement(By.id("search")).click();
        Thread.sleep(2000);
        Select RK=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/form/div/div/div/div[1]/div[2]/select")));
        RK.selectByVisibleText("50");
        Thread.sleep(2000);
        driver.findElement(By.id("reserve_price")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.id("buy_now_price")).sendKeys("600");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/form/div/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("keyword")).sendKeys("electricvans.co");//Domain name
        Thread.sleep(2000);
        driver.findElement(By.id("search")).click();
        Thread.sleep(2000);
        Select RK3=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/form/div/div/div/div[1]/div[2]/select")));
        RK3.selectByVisibleText("50");
        Thread.sleep(2000);
        driver.findElement(By.id("reserve_price")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.id("buy_now_price")).sendKeys("600");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/form/div/button")).click();
        Thread.sleep(4000);
// Auction Event History
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/ul/li[3]/a")).click();// 
        Thread.sleep(2000);           
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/a[1]/i")).click();
        Thread.sleep(2000);
        Select RK2=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
        RK2.selectByVisibleText("20");
        Thread.sleep(2000);
        Select RK4=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
        RK4.selectByVisibleText("50");
        Thread.sleep(2000);
        Select RK5=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
        RK5.selectByVisibleText("100");
        Thread.sleep(2000);
        Select RK6=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
        RK6.selectByVisibleText("150");
        Thread.sleep(2000);
        Select RK7=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
        RK7.selectByVisibleText("All");
        Thread.sleep(2000);
        driver.findElement(By.name("domain_name")).sendKeys("restin.com");
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
        }catch(Exception W) {       	
        }
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("seller_email")).sendKeys("rakeshuppula3@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("seller_email")).clear();
        
        driver.findElement(By.name("seller_email")).sendKeys("vunnava.chowdary@esmart.in");
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
        }catch(Exception W) {       	
        }
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[5]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[4]")).click();
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
	 }catch(Exception W) {       	
     }
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/thead/tr[2]/td[5]/div/span/button")).click();
        Thread.sleep(2000);
       
        
        
     // Update Domain name ======================================================================
        
        
        
        
        
        
        
        
        driver.quit();
        
        
        
        
        
        
        
        
	}

}
