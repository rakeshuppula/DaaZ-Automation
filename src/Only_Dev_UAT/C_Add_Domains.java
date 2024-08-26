package Only_Dev_UAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_Add_Domains {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/");
		Thread.sleep(1000);
		System.out.println("Enter into URL");
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		System.out.println("Entered Username and Password");
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("LOGIN successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.id("domains")).sendKeys("DronShoot.Coffee\r\n" + "DronShoot.com\r\n" + "DronShoot.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/button")).click();
		System.out.println("Added Domain Successfully");
		Thread.sleep(5000);
		driver.quit();

	}

}
