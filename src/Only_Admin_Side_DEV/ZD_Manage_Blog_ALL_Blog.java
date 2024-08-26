package Only_Admin_Side_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZD_Manage_Blog_ALL_Blog {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[10]/ul/li[1]/a")).click();// All Blog
		Thread.sleep(2000);
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
		driver.findElement(By.name("email")).sendKeys("Rakeshuppula3+spt@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[3]/input")).sendKeys("new");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("url")).sendKeys("https://d-v.in/blog/kjhgfd.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(By.name("status")));
		st.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		st.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys("Regression");
		Thread.sleep(2000);
		driver.findElement(By.name("url")).sendKeys("d-v.in-dashboard");
		Thread.sleep(2000);
		driver.findElement(By.name("tags")).sendKeys("#Rakesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[8]/div/label[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[8]/div/label[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[9]/button")).click();
		Thread.sleep(2000);
		ArrayList<String> kl=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(kl.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[9]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[1]")).click();
		Thread.sleep(2000);// Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[7]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("title")).clear();
		driver.findElement(By.name("title")).sendKeys("Regression Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[8]/div/label[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/form/div[9]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		Alert ab=driver.switchTo().alert();
		ab.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("delete")).click();
		Thread.sleep(2000);
		Alert ab1=driver.switchTo().alert();
		ab1.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
