package Only_Admin_Side;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Z2_Acution_Review {

	public static void main(String[] args) throws Exception {		
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
		
	}

}
