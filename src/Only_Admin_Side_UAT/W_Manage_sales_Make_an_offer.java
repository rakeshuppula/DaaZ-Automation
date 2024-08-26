package Only_Admin_Side_UAT;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class W_Manage_sales_Make_an_offer {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[2]/a")).click();//Make an offer												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a[1]")).click();//Restricted words
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("word")).sendKeys("numberswords");
        Thread.sleep(1000);
        Select ste=new Select(driver.findElement(By.id("word_status")));
        ste.selectByVisibleText("Active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[1]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.id("word")).clear();
		 driver.findElement(By.id("word")).sendKeys("Automation");
	        Thread.sleep(1000);
	        Select st36=new Select(driver.findElement(By.id("word_status")));
	        st36.selectByVisibleText("Active");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[2]")).click();// Cancel
		Thread.sleep(1000);
		Alert rt=driver.switchTo().alert();
		rt.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(1000);
		Select stq=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/label/select")));
		stq.selectByVisibleText("150");
		Thread.sleep(1000);
		driver.findElement(By.name("word")).sendKeys("call");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();//Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();// reset
		Thread.sleep(1000);
		
		Select syh=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[3]/select")));
		syh.selectByVisibleText("Active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();//Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();// reset
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[2]")).click();		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();//Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();// reset
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/span/button")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[2]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();//Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();// reset
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(1000);
		Alert ro=driver.switchTo().alert();
		ro.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[2]/a")).click();//Make an offer												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("domain_name")).sendKeys("Salesmarket.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		System.out.println("Search Domain");
		driver.findElement(By.name("buyerName")).sendKeys("rakesh_buyer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		System.out.println("Buyer profile");
		driver.findElement(By.name("sellerName")).sendKeys("rakesh_sellerr");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		System.out.println("Seller profile");
		Select a=new Select(driver.findElement(By.id("status")));
		a.selectByVisibleText("Pending from Buyer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		Select b=new Select(driver.findElement(By.id("status")));
		b.selectByVisibleText("Pending from Seller");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		Select a1=new Select(driver.findElement(By.id("status")));
		a1.selectByVisibleText("Pending Payment");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		Select a2=new Select(driver.findElement(By.id("status")));
		a2.selectByVisibleText("Payment Received");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		Select a3=new Select(driver.findElement(By.id("status")));
		a3.selectByVisibleText("Cancelled by Buyer");
		Thread.sleep(1000);
		Select a4=new Select(driver.findElement(By.id("status")));
		a4.selectByVisibleText("Cancelled by Seller");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		Select a5=new Select(driver.findElement(By.id("status")));
		a5.selectByVisibleText("Automatically cancelled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		Select a6=new Select(driver.findElement(By.id("status")));
		a6.selectByVisibleText("Support team cancelled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		Select a7=new Select(driver.findElement(By.id("status")));
		a7.selectByVisibleText("Sent to auction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		Select a8=new Select(driver.findElement(By.id("status")));
		a8.selectByVisibleText("Offer not available");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		Select a9=new Select(driver.findElement(By.id("status")));
		a9.selectByVisibleText("Offer on Hold");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		System.out.println("All Status completed");
		driver.findElement(By.name("last_offer")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		System.out.println("price");
		Select b22=new Select(driver.findElement(By.id("currency")));
		b22.selectByVisibleText("EUR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		System.out.println("Eur");
		Select b23=new Select(driver.findElement(By.id("currency")));
		b23.selectByVisibleText("USD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		System.out.println("USD");
		Select b24=new Select(driver.findElement(By.id("currency")));
		b24.selectByVisibleText("GBP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(1000);
		System.out.println("GBP");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
        Select nk=new Select(driver.findElement(By.id("pending_comment")));
		nk.selectByVisibleText("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[1]")).click();// Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[11]/div/button[2]")).click();// Reset
		Thread.sleep(2000);
 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();// clicked on domain name
		Thread.sleep(2000);
		System.out.println("clicked on domain name");
		ArrayList<String> tt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tt.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
		ArrayList<String> t=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(t.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[11]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[1]/button[3]")).click();// Refresh btn
		Thread.sleep(2000);
		System.out.println("refresh");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> t2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(t2.get(1));
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/h3/a")).click();
		Thread.sleep(2000);
		
		try {
		driver.findElement(By.id("refresh_whois_details")).click();
		}catch(Exception e) {
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();//chat with buyer/seller
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]")).sendKeys("Testing @@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		System.out.println("Chat with buyer / seller completed");
		ArrayList<String> t0=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(t0.get(0));
		Thread.sleep(4000);
		try {
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/a[2]")).click();// View Brokerage
		Thread.sleep(2000);
		System.out.println("Enter into brokerage");
		ArrayList<String> t9=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(t9.get(1));
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/ul/li[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("Brokerage");
		Thread.sleep(2000);
		System.out.println("comment");
		Select sm=new Select(driver.findElement(By.id("status")));
		sm.selectByVisibleText("Negotiation");
		Thread.sleep(2000);
		Select smq=new Select(driver.findElement(By.id("send_to")));
		smq.selectByVisibleText("Both [Seller & Buyer]");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();//send
		Thread.sleep(2000);
		Alert mo3=driver.switchTo().alert();
		mo3.accept();		
		Thread.sleep(4000);
		//Thread.sleep(2000);
		System.out.println("Negotiation completed");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[3]/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("Brokerage");
		Thread.sleep(2000);
		Select sme=new Select(driver.findElement(By.id("status")));
		sme.selectByVisibleText("Agreement");
		Thread.sleep(2000);
		Select op=new Select(driver.findElement(By.id("send_to")));
		op.selectByVisibleText("Both [Seller & Buyer]");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();//send
		Thread.sleep(2000);
		Alert mo2=driver.switchTo().alert();
		mo2.accept();		
		
		Thread.sleep(4000);
		System.out.println("Agreement completed");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("Brokerage");
		Thread.sleep(2000);
		Select po=new Select(driver.findElement(By.id("status")));
		po.selectByVisibleText("Payment");
		Thread.sleep(2000);
		Select op1=new Select(driver.findElement(By.id("send_to")));
		op1.selectByVisibleText("Both [Seller & Buyer]");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();//send
		Thread.sleep(2000);
		Alert mo=driver.switchTo().alert();
		mo.accept();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[3]/button/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("Brokerage");
		Thread.sleep(2000);
		Select p2=new Select(driver.findElement(By.id("status")));
		p2.selectByVisibleText("Payment");
		Thread.sleep(1000);
		driver.findElement(By.id("final_deal_price")).sendKeys("500");
		Thread.sleep(2000);
		Select op2=new Select(driver.findElement(By.id("send_to")));
		op2.selectByVisibleText("Both [Seller & Buyer]");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();//send
		Thread.sleep(2000);
		Alert mo1=driver.switchTo().alert();
		mo1.accept();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/button[1]")).click();
		Thread.sleep(2000);
		Alert dr=driver.switchTo().alert();
		dr.accept();	
		System.out.println("Send Payment Link");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		Alert dr1=driver.switchTo().alert();
		dr1.accept();
		Thread.sleep(4000);
		System.out.println("Brokerage Cancelled");
		
		}catch(Exception e) {
			
		}
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button")).click();//close
		}
		catch(Exception e) {
			
		}
		driver.quit();

	}

}
