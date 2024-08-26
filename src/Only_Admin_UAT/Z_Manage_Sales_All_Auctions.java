package Only_Admin_UAT;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Z_Manage_Sales_All_Auctions {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/a")).click();//Auction
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[5]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();
        Thread.sleep(2000);
        Select RK=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK.selectByVisibleText("20");		
        Thread.sleep(2000);
        Select RK1=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK1.selectByVisibleText("50");		
        Thread.sleep(2000);
        Select RK2=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK2.selectByVisibleText("100");		
        Thread.sleep(2000);
        Select RK3=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK3.selectByVisibleText("150");		
        Thread.sleep(2000);
        Select RK4=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK4.selectByVisibleText("All");		
        Thread.sleep(4000);
        Select RK5=new Select(driver.findElement(By.name("datatable_orders_length")));
        RK5.selectByVisibleText("10");		
        Thread.sleep(2000);
        driver.findElement(By.name("domain_name")).sendKeys("Roll-Z.coffee");       		
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("user_name")).sendKeys("rakesh_sellerr");  
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK6=new Select(driver.findElement(By.name("sold_status"))); 
        RK6.selectByVisibleText("Auction Scheduled");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK7=new Select(driver.findElement(By.name("sold_status"))); 
        RK7.selectByVisibleText("In Auction");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK8=new Select(driver.findElement(By.name("sold_status"))); 
        RK8.selectByVisibleText("Auction Closed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK9=new Select(driver.findElement(By.name("sold_status"))); 
        RK9.selectByVisibleText("Pending Payment");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK10=new Select(driver.findElement(By.name("sold_status"))); 
        RK10.selectByVisibleText("Payment Completed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK11=new Select(driver.findElement(By.name("sold_status"))); 
        RK11.selectByVisibleText("Support Team Cancelled");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("buy_now_price")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("reserve_price")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK12=new Select(driver.findElement(By.name("currency")));
        RK12.selectByVisibleText("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK13=new Select(driver.findElement(By.name("currency")));
        RK13.selectByVisibleText("EUR");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);
        Select RK14=new Select(driver.findElement(By.name("currency")));
        RK14.selectByVisibleText("GBP");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);//Calendar1 start
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[11]/div/span/button/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);// Calendar2 start
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[12]/div/span/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);// Calendar3 start
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[13]/div/span/button/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[14]/div/button[2]")).click();
        Thread.sleep(2000);//Calendar3 completed
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/i")).click();
        }catch(Exception e) {        	
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[14]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> ak=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ak.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[8]/div/div[1]/div[1]/div/label/select/option[2]")).click();       
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[8]/div/div[1]/div[1]/div/label/select/option[3]")).click();       
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[8]/div/div[1]/div[1]/div/label/select/option[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/form/div/textarea")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();//send btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/form/div/textarea")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();//send btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        Alert atw=driver.switchTo().alert();
        atw.accept();
        Thread.sleep(2000);
        driver.quit();

	}

}
