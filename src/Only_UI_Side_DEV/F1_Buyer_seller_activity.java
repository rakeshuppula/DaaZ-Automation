package Only_UI_Side_DEV;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class F1_Buyer_seller_activity {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/leads");
		Thread.sleep(1000);

		// driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
		System.out.println("Click on Login Button");
		driver.findElement(By.id("username")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		Thread.sleep(1000);
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("LOGIN successfully");
		Thread.sleep(8000);

		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[2]/label")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(3000);

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.close();
		driver.switchTo().window(tabs2.get(1));

//	 } catch (Exception e) {
//	 	System.out.println(e);
//	 }
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[2]"))
				.sendKeys("TS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"))
				.click();
		Thread.sleep(2000);
		System.out.println("Message send");

		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,-300)", "");

		try {
			Screen sr = new Screen();
			Pattern pt = new Pattern("C:\\Users\\Administrator\\Desktop\\sandb.PNG");
			sr.wait(pt, 10);
			sr.click(pt, 10);
			// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/ul/li[3]")).click();
		} catch (Exception e) {
			System.out.println(e);
		}

		Thread.sleep(2000);
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(0));
		driver.close();
		driver.switchTo().window(tabs3.get(1));
		driver.navigate().forward();

		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[2]/label"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[3]/label"))
				.click();
		Thread.sleep(2000);
		System.out.println("Searching a Domain");
		driver.findElement(By.id("domainNameSearch")).sendKeys("Remote1221.in");
		Thread.sleep(2000);
		driver.findElement(By.id("domainNameSearch")).clear();
		Thread.sleep(1000);
		System.out.println("Offer Status");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Pending with me");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Pending with other party");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Expired offers");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("on-Hold");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Cancelled");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Support team cancelled");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Accepted");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[1]/div[1]/form/select"))
				.sendKeys("Sent to auction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/a")).click();
		Thread.sleep(2000);
		System.out.println("Auction Part");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[2]/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("bidList_length")).sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.name("bidList_length")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.name("bidList_length")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"bidList_filter\"]/label/input")).sendKeys("kothapally.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[3]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("auctionList_length")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.name("auctionList_length")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.name("auctionList_length")).sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"auctionList_filter\"]/label/input")).sendKeys("TestingTeam.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[3]/div[2]/div[3]/label"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.name("auctionReviewList_length")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.name("auctionReviewList_length")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.name("auctionReviewList_length")).sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"auctionReviewList_filter\"]/label/input")).sendKeys("ak.com");
		Thread.sleep(2000);
		System.out.println("Misc...");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[3]/p")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("bin_table_length")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.name("bin_table_length")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.name("bin_table_length")).sendKeys("500");
		Thread.sleep(1000);
//	    driver.findElement(By.name("bin_table_length")).sendKeys("1000");
//	    Thread.sleep(1000);
		driver.findElement(By.name("bin_table_length")).sendKeys("All");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"bin_table_filter\"]/label/input")).sendKeys("wwwwwwwwwwww");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[1]/div[4]/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fav_table\"]/tbody/tr/td[5]/a")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.close();

	}

}
