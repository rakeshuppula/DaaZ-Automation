package Only_Admin_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZD1_Manage_Blog_Manage_Comment {

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

		// driver.findElement(By.id("signInBtn")).click();
		JavascriptExecutor jsee = (JavascriptExecutor) driver;
		jsee.executeScript("document.getElementById('signInBtn').value='Dev_DaaZ_Admin';");
		jsee.executeScript(
				"document.getElementById('signInBtn').setAttribute('style','border:10px red solid;background:yellow;color:green');");
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[10]/a")).click();// Manage Blog
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[10]/ul/li[2]/a")).click();// Manage Comment
		Thread.sleep(2000);		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/a[2]"))
				.click();
		Thread.sleep(2000);
		Select dh = new Select(driver.findElement(By.name("datatable_orders_length")));
		dh.selectByIndex(1);
		Thread.sleep(2000);
		dh.selectByIndex(2);
 		Thread.sleep(2000);
		dh.selectByIndex(3);
		Thread.sleep(2000);
		dh.selectByIndex(4);
		Thread.sleep(2000);
		dh.selectByIndex(5);
		Thread.sleep(2000);
		dh.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("support-test@daaz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("name")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("url")).sendKeys("https://d-v.in/blog/rrrrrdsdccd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		Select st=new Select(driver.findElement(By.name("status")));
		st.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		st.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/form/div[2]/input")).click();
		Thread.sleep(2000);
		Alert ab1=driver.switchTo().alert();
		ab1.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[10]/ul/li[2]/a")).click();// Manage Comment
		Thread.sleep(2000);
		driver.findElement(By.id("delete")).click();
		Thread.sleep(2000);
		Alert ab=driver.switchTo().alert();
		ab.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
