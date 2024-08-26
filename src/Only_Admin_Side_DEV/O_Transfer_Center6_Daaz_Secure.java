package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class O_Transfer_Center6_Daaz_Secure {

	public static void main(String[] args) throws Exception {
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[5]/ul/li[3]/ul/li[6]/a")).click();//Daaz_Secure
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/table/tbody/tr[1]/td[2]/a[2]/span")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/textarea")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/button")).click();//Send
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/textarea")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div/button")).click();//Send
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[2]")).click();//CLose
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[2]/a[1]")).click();//Domain name
		Thread.sleep(3000);
		ArrayList<String> yt=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(yt.get(0));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[3]/a")).click();//buyer
		Thread.sleep(2000);
		ArrayList<String> y=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(y.get(0));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[4]/a")).click();// Seller
		Thread.sleep(2000);
		ArrayList<String> yr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(yr.get(0));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/thead/tr[2]/td[3]/input")).sendKeys("rakesh_buyer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/thead/tr[2]/td[4]/input")).sendKeys("rakesh_sellerr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/thead/tr[2]/td[7]/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/thead/tr[2]/td[12]/div/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[12]/a")).click();
		Thread.sleep(4000);	
		ArrayList<String> yrw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(yrw.get(1));
		Thread.sleep(2000);
		driver.findElement(By.id("chat_download")).click();		
		Thread.sleep(2000);
		ArrayList<String> ycp=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ycp.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/h3/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		ArrayList<String> yrqw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(yrqw.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/select/option[12]")).click();
		Thread.sleep(2000);
		Alert at=driver.switchTo().alert();
		at.accept();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[3]/label[3]/input")).click();
		Thread.sleep(4000);
		Alert atw=driver.switchTo().alert();
		atw.accept();
		Thread.sleep(5000);
		ArrayList<String> y1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(y1.get(4));
		driver.close();
		Thread.sleep(1000);
		ArrayList<String> y2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(y2.get(3));
		driver.close();
		Thread.sleep(1000);
		ArrayList<String> y3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(y3.get(2));
		driver.close();
		Thread.sleep(1000);
		ArrayList<String> y4=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(y4.get(1));
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
