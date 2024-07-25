package Only_Admin_Side;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_Manage_Teams_Roles_Assignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("password")).sendKeys("UAT_DaaZ_Admin
		// UATAdmin@2020");
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("tester");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("first");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3+sss@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Rakesh123@");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmPassword")).sendKeys("Rakesh123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buyers")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[3]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[4]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[5]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[6]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[7]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]/div/ul/li[8]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[3]/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/button[1]")).click();
		Thread.sleep(2000);
		Alert at=driver.switchTo().alert();
		at.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/button[2]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/button[2]")).click();
		Alert ak=driver.switchTo().alert();
		ak.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/button[3]")).click();
		Thread.sleep(2000);
		ArrayList<String> uk=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(uk.get(1));
		
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("master");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Rakeshuppula3+buyer009@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("mindgame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/form/div[5]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/button[4]")).click();
		Thread.sleep(2000);
		Alert ak2=driver.switchTo().alert();
		ak2.accept();
		
		driver.quit();		
	}

}
