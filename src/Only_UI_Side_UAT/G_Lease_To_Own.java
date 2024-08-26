package Only_UI_Side_UAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_Lease_To_Own {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/all/lease/transactions");
		Thread.sleep(1000);

		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("LOGIN successfully");
		Thread.sleep(3000);
		System.out.println("All");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("50");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/a/b"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/a"))
				.click();
		Thread.sleep(1000);
		System.out.println("clicked on invoice");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/div/ul/li[3]/a"))
				.click();
		Thread.sleep(1000);
		System.out.println("Open trasaction overview invoice");
		ArrayList<String> ai = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ai.get(1));
		driver.close();
		driver.switchTo().window(ai.get(0));

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/a"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/div/ul/li[2]/a"))
				.click();
		Thread.sleep(1000);
		System.out.println("Open seller invoice");
		ArrayList<String> a1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a1.get(1));
		driver.close();
		driver.switchTo().window(a1.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/a"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/div/ul/li[1]/a"))
				.click();
		Thread.sleep(1000);
		System.out.println("Open buyer invoice");
		ArrayList<String> a2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a2.get(1));
		driver.close();
		driver.switchTo().window(a2.get(0));
		Thread.sleep(1000);
		driver.findElement(By.id("chat")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div/div[3]/div[2]"))
				.sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back_button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("100");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]"))
				.sendKeys("an.com");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]"))
				.click();
		Thread.sleep(1000);
		System.out.println("Pending");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("100");
		Thread.sleep(1000);
//	     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]"))
				.sendKeys("ADACTIN.COM");
		Thread.sleep(1000);
		System.out.println("Completed");
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/label[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]"))
				.sendKeys("Micro1.abc");
		Thread.sleep(1000);
		System.out.println("Over Due");
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/label[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]"))
				.sendKeys("test1947.com");
		Thread.sleep(1000);
		System.out.println("Cancelled");
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/label[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]"))
				.sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]"))
				.sendKeys("Friday.coffee");
		Thread.sleep(1000);
		driver.quit();
	     
	     
	}
}
