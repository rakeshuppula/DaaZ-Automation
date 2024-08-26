package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class P_Transfer_Center7_LEASE_TO_OWN {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
		Thread.sleep(1000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/a")).click();// Manage domains
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span")).click();//Transfer Center																												
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[4]/a")).click();//Lease to own
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		
		Select obj=new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select")));//verify
		obj.selectByVisibleText("20");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/label/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[1]/div/a")).click();//Update lease to own
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/table/tbody/tr[1]/td[1]/button")).click();//Update
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/table/tbody/tr[1]/td[16]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/div/div/div/div[3]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[3]/table/tbody/tr[1]/td[17]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> mt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mt.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> m1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(m1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> m2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(m2.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[10]/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[13]/a")).click();
		Thread.sleep(2000);
//		try {
//		Screen sc=new Screen();
//		Pattern pt=new Pattern("C:\\Users\\Administrator\\Desktop\\LST.PNG");
//		sc.wait(pt,0);
//		sc.click(pt,0);
//		}catch (Exception e) {
//			
//		}		
//Thread.sleep(3000);
//
//		try {
//		Screen sc=new Screen();
//		Pattern ptr=new Pattern("C:\\Users\\Administrator\\Desktop\\vfy2.PNG");
//		sc.wait(ptr,0);
//		sc.click(ptr,0);
//		}catch (Exception e) {
//	    Alert at=driver.switchTo().alert();
//		at.accept();
//		Thread.sleep(2000);	
//		}
//		
//		try {
//	    Screen sc=new Screen();
//		Pattern pt=new Pattern("C:\\Users\\Administrator\\Desktop\\pt.PNG");
//		sc.wait(pt,0);
//		sc.click(pt,0);
//		}catch (Exception e) {
//			
//		}
//		Thread.sleep(2000);
//		Alert awt=driver.switchTo().alert();
//		awt.accept();
		
		Thread.sleep(2000);
		ArrayList<String> mtw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mtw.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/a")).click();//View subcription
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/h3/a")).click();//Who is
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[3]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[7]/div/div/div[2]/form/div[1]/div/div[3]/div[2]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[7]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[7]/div/div/div[2]/form/div[1]/div/div[3]/div[2]")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[7]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[7]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[6]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[6]/div/div/div[2]/form/div[1]/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[6]/div/div/div[2]/form/div[2]/input")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[6]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[6]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[5]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[5]/div/div/div[2]/form/div/textarea")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[5]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		Alert awt3=driver.switchTo().alert();
		awt3.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/button")).click();//Cancel 
		Thread.sleep(2000);
		driver.findElement(By.id("message-text1")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[4]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		Alert aw3=driver.switchTo().alert();
		aw3.accept();
		Thread.sleep(4000);
		driver.quit();
	
	}

}
