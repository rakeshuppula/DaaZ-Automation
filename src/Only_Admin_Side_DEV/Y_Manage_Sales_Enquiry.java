package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Y_Manage_Sales_Enquiry {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[4]/a")).click();//Domain Enquiries
		Thread.sleep(2000);
		
		Select dm=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[1]/div/label/select")));//
		dm.selectByVisibleText("25");
		Thread.sleep(2000);
		Select dm1=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[1]/div/label/select")));//
		dm1.selectByVisibleText("50");
		Thread.sleep(2000);
		Select dm2=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[1]/div/label/select")));//
		dm2.selectByVisibleText("100");
		Thread.sleep(2000);
		Select dmo=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[1]/div/label/select")));//
		dmo.selectByVisibleText("10");
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[2]/div/ul/li[7]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[2]/div/ul/li[8]/a")).click();//Last Page
        Thread.sleep(2000);
        driver.findElement(By.name("order_id")).sendKeys("OR0098312928");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("domain_name")).sendKeys("cricket.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("buyer_email")).sendKeys("rakeshuppula3@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("budget_amount")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select yb=new Select(driver.findElement(By.name("currency")));
        yb.selectByVisibleText("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select ybw=new Select(driver.findElement(By.name("currency")));
        ybw.selectByVisibleText("EUR");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select ybm=new Select(driver.findElement(By.name("currency")));
        ybm.selectByVisibleText("GBP");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select ybb=new Select(driver.findElement(By.name("status")));
        ybb.selectByVisibleText("Active");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select ybs=new Select(driver.findElement(By.name("status")));
        ybs.selectByVisibleText("Inactive");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select yb2s2=new Select(driver.findElement(By.name("domain_currency")));
        yb2s2.selectByVisibleText("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        yb2s2.selectByVisibleText("GBP");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        yb2s2.selectByVisibleText("EUR");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select mb=new Select(driver.findElement(By.name("payment_type")));
        mb.selectByVisibleText("Stripe");        
               
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select mb3=new Select(driver.findElement(By.name("payment_type")));
        mb3.selectByVisibleText("Paypal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select mb6=new Select(driver.findElement(By.name("payment_type")));
        mb6.selectByVisibleText("Wire Transfer");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select dd=new Select(driver.findElement(By.name("payment_status")));
        dd.selectByVisibleText("Pending");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select dc=new Select(driver.findElement(By.name("payment_status")));
        dc.selectByVisibleText("Paid");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select dt=new Select(driver.findElement(By.name("payment_status")));
        dt.selectByVisibleText("Rejected");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select det=new Select(driver.findElement(By.name("review_status")));
        det.selectByVisibleText("Submitted");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select de=new Select(driver.findElement(By.name("review_status")));
        de.selectByVisibleText("Review");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select det1=new Select(driver.findElement(By.name("review_status")));
        det1.selectByVisibleText("Negotiation");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select det2=new Select(driver.findElement(By.name("review_status")));
        det2.selectByVisibleText("Agreement");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select det3=new Select(driver.findElement(By.name("review_status")));
        det3.selectByVisibleText("Payment");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        Select det4=new Select(driver.findElement(By.name("review_status")));
        det4.selectByVisibleText("Completed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        Select det5=new Select(driver.findElement(By.name("review_status")));
        det5.selectByVisibleText("Cancelled");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("domain_id")).sendKeys("650760");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("seller_email")).sendKeys("rakeshuppula3+mp@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("reset-table")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> sy=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(sy.get(0));
        Thread.sleep(2000);
        Select dd00=new Select(driver.findElement(By.name("review_status")));
        dd00.selectByVisibleText("Review");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/thead/tr[2]/td[18]/div/button[1]")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        ArrayList<String> syi=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(syi.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/h3/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/ul/li[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
        Thread.sleep(2000);
        Select lk=new Select(driver.findElement(By.name("status")));
        lk.selectByVisibleText("Negotiation");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        Alert am=driver.switchTo().alert();
        am.accept();
        Thread.sleep(4000);       
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
        Thread.sleep(2000);
        Select lk2=new Select(driver.findElement(By.name("status")));
        lk2.selectByVisibleText("Agreement");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        Alert am2=driver.switchTo().alert();
        am2.accept();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
        Thread.sleep(2000);
        Select lk3=new Select(driver.findElement(By.name("status")));
        lk3.selectByVisibleText("Payment");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[3]/input")).sendKeys("500");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[1]")).sendKeys("Rakeshuppula3+p8t@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[4]/input[2]")).sendKeys("Rake");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        
        Alert am3=driver.switchTo().alert();
        am3.accept();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
        Thread.sleep(2000);
        Select lk7=new Select(driver.findElement(By.name("status")));
        lk7.selectByVisibleText("Completed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        Alert am8=driver.switchTo().alert();
        am8.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div[3]/div[2]")).sendKeys("test");
        Thread.sleep(2000);
        Select lk6=new Select(driver.findElement(By.name("status")));
        lk6.selectByVisibleText("Cancelled");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[5]/button")).click();
        Thread.sleep(2000);
        Alert am7=driver.switchTo().alert();
        am7.accept();
        Thread.sleep(2000);       
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/button")).click();
        Thread.sleep(2000);
        Alert amw7=driver.switchTo().alert();
        amw7.accept();
        Thread.sleep(2000);       
        driver.quit();
         
	}

}
