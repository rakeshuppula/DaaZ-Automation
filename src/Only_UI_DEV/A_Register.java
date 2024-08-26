package Only_UI_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_Register {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a")).click();
		System.out.println("Click on JOIN NOW");
		Thread.sleep(2000);
		// PASSWORD @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]"))
				.click();
//		System.out.println("");
		System.out.println("Clicked on Register Button Directly.");
		Thread.sleep(2000);
		WebElement Rakesh2 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[1]/span"));
		Thread.sleep(2000);
		System.out.println("First Name Error = " + Rakesh2.getText());
		Thread.sleep(2000);

		driver.findElement(By.id("first_name")).sendKeys("Esmart");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[3]/i")).click();
		System.out.println("Click on Password Field Acceptance Rules");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();// submit
																												// button

		Thread.sleep(1000);
		WebElement Rakesh3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[3]/div"));
		Thread.sleep(1000);
		System.out.println("Clicked on Register Button Without Password = " + Rakesh3.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("password_register")).sendKeys("rakesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[3]/span")).click();// 'i' icon
		Thread.sleep(1000);
		WebElement Rakesh4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[3]/div"));
		Thread.sleep(1000);
		System.out.println("Password small letters only  = " + Rakesh4.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("password_register")).sendKeys("RAKESH");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println("Password Capital letters only  = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("123456");
		// driver.findElement(By.id("password-confirm")).sendKeys("rakesh21");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println("Password only number only = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("@#$%$#@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println("Password only number only = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("Rakesh");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println(
				"Password small and Capital letters only  = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("rakes123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out
				.println("Password small letters and number only  = " + Rakesh4.getText());

		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("RDDD123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println(
				"Password Capital letters and number only  = " + Rakesh4.getText());

		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("Rake123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println(
				"Password small, Capital letters and number only  = " + Rakesh4.getText());

		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("rakesh@#$%$#@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println("Password small letters and special characters only = "
				+ Rakesh4.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("RTEB@#$%$#@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println("Password capital letters and special characters only = "
				+ Rakesh4.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("Rakesh@#@$$@$");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out
				.println("Password small, capital letters and special characters  = "
						+ Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("2344@#$%$#@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		System.out.println(
				"Password numbers and special characters only  = " + Rakesh4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();

		driver.findElement(By.id("password_register")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).sendKeys("Rak2#");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		Thread.sleep(1000);
		WebElement one = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[3]/div"));
		System.out.println("Password less than 6 digits = " + one.getText());

		Thread.sleep(1000);
		driver.findElement(By.id("password_register")).clear();
		driver.findElement(By.id("password_register")).sendKeys("Rakesh1800@@");
		Thread.sleep(1000);
		driver.findElement(By.id("showPassword")).click();
		System.out.println("Click on EYE button.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		WebElement one1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[4]/span"));
		System.out.println(
				"Password small, capital letters, numbers and special characters  = "
						+ one1.getText());
		Thread.sleep(1000);

// Confirm password@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		 		 

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button")).click();
		// Thread.sleep(1000);
		System.out.println("Click on Register button without confirm password");

		driver.findElement(By.id("password-confirm")).sendKeys("Rakeowiwi33");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button"))
				.click();
		WebElement one2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[4]/span"));
		System.out.println("Enter Wrong Confirm Password = " + one2.getText());
		Thread.sleep(1000);
//		 System.out.println("ENter Wrong Conform Password. = "+Rakesh5.getText());
//		 Thread.sleep(1000);
		driver.findElement(By.id("password-confirm")).clear();
		Thread.sleep(1000);

		driver.findElement(By.id("password-confirm")).sendKeys("Rakesh1800@@");
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]")).click();
		Thread.sleep(1000);

		// Mail Error @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]"))
				.click();
		Thread.sleep(1000);
		WebElement Rakesh9 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[5]/span"));
		Thread.sleep(1000);
		System.out.println("Without Mail  = " + Rakesh9.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("rakeshuppulagmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();
		Thread.sleep(1000);
		WebElement Rakesh7 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[5]/span"));
		Thread.sleep(1000);
		System.out.println("Mail without @  = " + Rakesh7.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Rakesh.uppula@daazteam.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();
		Thread.sleep(1000);
		WebElement Rakesh8 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[5]/span"));
		Thread.sleep(1000);
		System.out.println("Already existing Mail = " + Rakesh8.getText());
		Thread.sleep(1000);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3+90877@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();
		Thread.sleep(1000);
		// Choose Seller ==================================================

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[7]/div/label")).click();
		Thread.sleep(1000);
		// Choose Buyer
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[6]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();
		Thread.sleep(1000);
		WebElement Rakesh10 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[8]/span"));
		Thread.sleep(1000);
		System.out.println("Without Captcha = " + Rakesh10.getText());

		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(1000);
		driver.findElement(By.id("mtcap-inputtext-1")).sendKeys("et63388uu");
		System.out.println("Enter Wrong captcha");
		Thread.sleep(1000);
		driver.findElement(By.id("mtcap-statusbutton-1")).click();
		System.out.println("Refresh Captcha");
		Thread.sleep(1000);
//		driver.findElement(By.id("mtcap-audioctrlicon-1")).click();
//		System.out.println("Click on Captcha Audio button");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/button")).click();
		System.out.println("Click on Register button without confirm check");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[10]/a")).click();
		System.out.println("Click on Already I have account");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[9]/div/b/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));
		System.out.println("Click on User Agreement");
		// redirected to Login Page ================================================
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[12]/a[1]")).click();
		System.out.println("Clicked on Facebook");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[12]/a[2]")).click();
		System.out.println("Clicked on Twitter");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div[12]/a[3]")).click();
		System.out.println("Clicked on Google");
		driver.navigate().back();
		Thread.sleep(2000);

		driver.quit();

	}

}
