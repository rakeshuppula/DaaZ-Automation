package Only_Admin_Side;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F_Manage_Teams_All_Roles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("roleName")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("roleName")).sendKeys("Own Role");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("role_name")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("role_name")).clear();
		driver.findElement(By.name("role_name")).sendKeys("Finance");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("role_name")).sendKeys("Own Role");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/a[2]/i")).click();
		Thread.sleep(3000);
		Alert am=driver.switchTo().alert();
		am.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
