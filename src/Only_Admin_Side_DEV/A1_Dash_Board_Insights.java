package Only_Admin_Side_DEV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_Dash_Board_Insights {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div[2]/div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Today");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("days")).sendKeys("Last 2 Days");
		//ml.selectByVisibleText("Last 2 Days");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 7 Days");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 14 Days");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 1 Month");
		Thread.sleep(2000);
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 2 Months");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 3 Months");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("days")).sendKeys("Last 6 Months");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);		
     	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/div[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
