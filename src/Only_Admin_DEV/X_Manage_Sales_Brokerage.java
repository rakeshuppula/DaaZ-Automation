package Only_Admin_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class X_Manage_Sales_Brokerage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[3]/a")).click();//Brokerage											
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();//next btn
		Thread.sleep(2000);
		
//		int day=24;
//		
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
//        driver.findElement(By.xpath("//table[@class=' table-condensed']//td[text()="+day+"]")).click();
//        
//        Thread.sleep(7000);
		
        Select nn=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
	    nn.selectByVisibleText("20");
	    Thread.sleep(2000);
        Select n1=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
	    n1.selectByVisibleText("50");
	    Thread.sleep(2000);
        Select n2=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
	    n2.selectByVisibleText("100");
	    Thread.sleep(2000);
        Select n3=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
	    n3.selectByVisibleText("150");
	    Thread.sleep(2000);
        Select n5=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));
	    n5.selectByVisibleText("All");
	    Thread.sleep(2000);
	    driver.findElement(By.id("domain_name")).sendKeys("Address.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("buyerName")).sendKeys("rakesh_buyer");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("sellerName")).sendKeys("rakesh_sellerr");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("offer_price")).sendKeys("500");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("currency")).sendKeys("EUR");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("currency")).sendKeys("USD");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("currency")).sendKeys("GBP");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);   
	    Select nb=new Select(driver.findElement(By.name("status")));
	    nb.selectByVisibleText("Submitted");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);   
	    Select nimm=new Select(driver.findElement(By.name("status")));
	    nimm.selectByVisibleText("Review");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    Select nia=new Select(driver.findElement(By.name("status")));
	    nia.selectByVisibleText("Negotiations");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    Select na=new Select(driver.findElement(By.name("status")));
	    na.selectByVisibleText("Agreement");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    Select nan=new Select(driver.findElement(By.name("status")));
	    nan.selectByVisibleText("Payment");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    Select nanw=new Select(driver.findElement(By.name("status")));
	    nanw.selectByVisibleText("Cancelled");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("created_by")).sendKeys("rakesh_buyer");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.name("created_by")).sendKeys("rakesh_sellerr");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[3]")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();
	   Thread.sleep(2000);
	   ArrayList<String> nm=new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(nm.get(0));
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
	   Thread.sleep(2000);
	   ArrayList<String> nk=new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(nk.get(0));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();
	   Thread.sleep(2000);
	   ArrayList<String> nie=new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(nie.get(0));	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//reset
	    Thread.sleep(2000);
	   Select ni=new Select(driver.findElement(By.name("status")));
	    ni.selectByVisibleText("Review");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//search
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
	   Thread.sleep(2000);
	   System.out.println("Enter into brokerage");
		ArrayList<String> t9=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(t9.get(1));
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/ul/li[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("Brokerage");
		Thread.sleep(2000);
		System.out.println("MSG");
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
		Thread.sleep(4000);
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
		System.out.println("Brokerage cancelled");
	   driver.quit();
	    
	
	}

}
