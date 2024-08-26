package Only_Admin_Side_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_Manage_All_Users_1 {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[2]"))
				.click(); 
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
		System.out.println("Google");
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[3]")).click();
        //Facebook
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[4]")).click();
        //LinkedIn
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("LinkedIn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[5]")).click();
        //Twitter
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Twitter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select/option[6]")).click();
        //Direct Register
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Direct Register");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		
		//Status +++++++++++++++++++++++++++++++++++++++++++++
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/select/option[2]")).click();
        //Active
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
		Thread.sleep(2000);
		System.out.println("Active");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/select/option[3]")).click();
        //InActive
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Inactive");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/select/option[4]")).click();
        //Banned
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Banned");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		
		//ROLE++++++++++++++++++++++++++++++++++++++++++++++++++
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/select/option[2]")).click();
        //Buyer
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Buyer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/select/option[3]")).click();
        // Buyer/Seller
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Buyer/Seller");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/select/option[4]")).click();
        // Broker/Partner
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Broker/Partner");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		// Percentage %
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/select/option[2]")).click();
        // Yes
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/select/option[3]")).click();
        // NO
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("No");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		
		//2FA +++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/select/option[2]")).click();
        //Enabled
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Enabled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/select/option[3]")).click();
        // Disable
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Disable");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		Thread.sleep(2000);
		
		// API +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[12]/select/option[2]")).click();
        //Yes
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
				.click();
        System.out.println("Yes-API");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/select/option[3]")).click();
        // NO
        driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[12]/select/option[3]"))
				.click();
        System.out.println("No -API");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("active")).click();
		Thread.sleep(2000);
		Alert at=driver.switchTo().alert();
		at.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("inactive")).click();
		Thread.sleep(2000);
		Alert ar=driver.switchTo().alert();
		ar.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("change_role")).click();
		Thread.sleep(2000);
		Alert at3=driver.switchTo().alert();
		at3.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("change_role")).click();
		Thread.sleep(2000);
		Alert at4=driver.switchTo().alert();
		at4.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.xpath(
					"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]"))
					.click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[2]"))
				.click();
		System.out.println("Search with Email");
		driver.quit();
		
	}

}
