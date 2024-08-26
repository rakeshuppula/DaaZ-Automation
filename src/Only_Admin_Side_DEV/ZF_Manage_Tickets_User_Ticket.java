package Only_Admin_Side_DEV;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZF_Manage_Tickets_User_Ticket {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/a")).click();// Manage Tickets
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[1]/a")).click();// User Ticket
		Thread.sleep(2000);		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/a[2]/i"))
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
		driver.findElement(By.name("ticket_id")).sendKeys("1768504");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		
		driver.findElement(By.name("category")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		
		driver.findElement(By.name("title")).sendKeys("Rakesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		
		driver.findElement(By.name("name")).sendKeys("Rakesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("agent")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("created_by")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("created_by")).sendKeys("User");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		Select nb=new Select(driver.findElement(By.name("status")));
		nb.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		nb.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		nb.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		nb.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		nb.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
		Thread.sleep(2000);//Calendar 
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("create_ticket")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Rakeshuppula3+buyer@gmail.com");
		Thread.sleep(2000);
		Select yu=new Select(driver.findElement(By.name("category")));
		yu.selectByIndex(5);
		driver.findElement(By.name("title")).sendKeys("Sales page not working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div[1]/div[4]/div/div/div/div[3]/div[2]")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("create_ticket")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[1]/a")).click();// User Ticket
		Thread.sleep(2000);	
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[9]/div/span/button")).click();
		Thread.sleep(2000);//Calendar 
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[10]/div/button[1]")).click();	
		Thread.sleep(2000);//Search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div/div[3]/div[2]")).sendKeys("test3");
		Thread.sleep(2000);
		Select vc=new Select(driver.findElement(By.name("status")));
		vc.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div/div/div/div[2]/form/button")).click();
		Thread.sleep(2000);
		Alert ab=driver.switchTo().alert();
		ab.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[1]/a")).click();// User Ticket
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[1]/a")).click();//all cat.
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div[1]/input")).sendKeys("TestNG");
		Thread.sleep(2000);
		Select gf=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[2]/div[2]/select")));
		gf.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("category")).sendKeys("Ticket response");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
//		driver.findElement(By.xpath(""));
//		Thread.sleep(2000);
		Select nj=new Select(driver.findElement(By.name("status")));
		nj.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		nj.selectByIndex(2);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("name")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("name")).sendKeys("Archana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.name("updated_by")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[6]/div/span/button")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[1]")).click();
		Thread.sleep(2000);//search
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[8]/div/button[2]")).click();
		Thread.sleep(2000);//Reset
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
		Alert ab3=driver.switchTo().alert();
		ab3.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("category")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[8]/a[2]")).click();
		Thread.sleep(2000);
		Alert ab4=driver.switchTo().alert();
		ab4.accept();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[12]/ul/li[1]/a")).click();// User Ticket
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
