package Only_UI_DEV;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class B3_Add_Balance {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// try {
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");
		// driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/");
		// Thread.sleep(1000);
		System.out.println("Enter into URL");
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		System.out.println("Enter Username and Password");
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Login successful");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[5]/button")).click();
		// System.out.println("");
		driver.findElement(By.id("amount")).sendKeys("1000");
		Select Currency_name = new Select(driver.findElement(By.id("currency")));
		Currency_name.selectByVisibleText("EUR");
		// driver.findElement(By.id("currency")).sendKeys("USD");
		// Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Login completed");
		System.out.println("Payment method start");
		driver.findElement(By.xpath("//*[@id=\"stripe_btn\"]")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[1]/div/fieldset/div/div[1]/div/div[2]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(5000);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[1]/div/fieldset/div/div[1]/div/div[1]/span/input")).sendKeys("4242424242424242");
		driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
		Thread.sleep(1000);
		driver.findElement(By.id("billingName")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cardExpiry\"]")).sendKeys("1033");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cardCvc\"]")).sendKeys("224");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div[2]/form/div[2]/div/div[2]/button/div[3]"))
				.click();
		// Thread.sleep(1000);
		System.out.println("Payment successfully");
		Thread.sleep(1000);
		driver.quit();

	}

}
