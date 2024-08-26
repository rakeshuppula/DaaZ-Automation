package Only_Admin_UAT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_Manage_Categories {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[6]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("categoryName")).sendKeys("Artist");
		Thread.sleep(1000);
		driver.findElement(By.id("cat_desc")).sendKeys("Allow desc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[3]/div/label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[4]/div/label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[6]/a[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("category_name")).sendKeys("Artist");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[3]/div/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[4]/div/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[6]/a[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("category_name")).sendKeys("Artist");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[1]")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("active")).click();
		Thread.sleep(2000);
		Alert Akshaya =driver.switchTo().alert(); 
		Akshaya.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("active")).click();
		Thread.sleep(2000);
		Alert Akshaya1 =driver.switchTo().alert(); 
		Akshaya1.accept();
		driver.findElement(By.id("delete")).click();
		Thread.sleep(1000);
		Alert Akshaya2 =driver.switchTo().alert();
		Akshaya2.accept();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/label/select/option[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[6]/a[2]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
