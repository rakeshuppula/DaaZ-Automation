package Only_Admin_UAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class U_Manage_sales_DaaZ_Secure {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/a")).click();// Manage sales
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a")).click();// Daaz Secure 																												// Center
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a[1]")).click();
		Thread.sleep(1000);
		System.out.println("Create a Transaction");
		Select sp=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div/div/div/select")));
		sp.selectByVisibleText("Single Domain Name Sale");
		Thread.sleep(1000);
		driver.findElement(By.id("seller_email")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("rakeshuppula3+buyer@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("secure_domain_name")).sendKeys("RunTimeError80.com");
		Thread.sleep(1000);
		driver.findElement(By.id("secure_agreed_amount")).sendKeys("500");
		
		Select jy=new Select(driver.findElement(By.id("secure_currency")));
		jy.selectByVisibleText("USD");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div[3]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div[3]/div/div[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a")).click();// Daaz Secure 																												// Center
		Thread.sleep(2000);
		System.out.println("API History");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a[2]")).click();// api  																												// Center
		Thread.sleep(2000);
		Select yt=new Select (driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/label/select")));
		yt.selectByVisibleText("All");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[13]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a")).click();// Daaz Secure 																												// Center
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();// next page 
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/label/select")));//.click();// next 20 pages																												
		st.selectByVisibleText("20");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[2]/input")).sendKeys("4331");//ID
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[3]/input")).sendKeys("F21.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		Select st1=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st1.selectByVisibleText("Pending from Buyer");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st2=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st2.selectByVisibleText("Pending from DaaZ Team");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
				
		Select st3=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st3.selectByVisibleText("Accepted");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st4=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st4.selectByVisibleText("Rejected by Buyer");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st5=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st5.selectByVisibleText("Rejected by DaaZ Team");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st6=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st6.selectByVisibleText("Cancelled by Seller");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st7=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st7.selectByVisibleText("Cancelled by Broker");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st8=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st8.selectByVisibleText("Payment completed");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st9=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[4]/select")));
		st9.selectByVisibleText("Transfer Agent cancelled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("500");//Price
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st10=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select")));
		st10.selectByVisibleText("USD");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st11=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select")));
		st11.selectByVisibleText("EUR");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st12=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/select")));
		st12.selectByVisibleText("GBP");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st13=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/select")));//Created By
		st13.selectByVisibleText("Broker");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st14=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/select")));//Created By
		st14.selectByVisibleText("Seller");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);		
		
		Select st15=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/select")));//Created By
		st15.selectByVisibleText("Admin");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		Select st16=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/select")));//Created By
		st16.selectByVisibleText("User API");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();//Search
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();//Reset
		Thread.sleep(2000);	
        
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> sh=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sh.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div[5]/div/div/a[2]")).click();		
		Thread.sleep(2000);
		ArrayList<String> sl=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sl.get(2));
		Thread.sleep(1000);
		Select my=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div[7]/div[2]/div[2]/div/div[1]/select")));
		my.selectByVisibleText("EUR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div[9]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div[6]/div/div/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Redirect to Transfer Center");
		driver.quit();

	}

}
