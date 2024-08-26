package Only_Admin_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class H_Manage_Domains_All_Domains {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a")).click();
		Thread.sleep(2000);
		Alert at = driver.switchTo().alert();
		at.accept();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[12]/a")).click();
		Thread.sleep(2000);
		Alert at3 = driver.switchTo().alert();
		at3.accept();
		Thread.sleep(12000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[13]/a")).click();
//        Thread.sleep(2000);
//        Alert at31 = driver.switchTo().alert();
//		at31.accept();
		
		driver.findElement(By.id("price")).sendKeys("500");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("USD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/span/button/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/select/option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/select/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/select/option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/select/option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[12]/select/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(9000);
      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[13]/a")).click();
      Thread.sleep(2000);
      Alert at31 = driver.switchTo().alert();
		at31.accept();
		Thread.sleep(7000);
		driver.quit();
		//html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[13]/a
		
	}

}
