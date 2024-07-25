package Working_Fine_Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Logout_Title_Verify {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/");	
		 System.out.println("Enter into URL");		
	     driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")).click();
	     System.out.println("Click on Login Button");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rakeshuppula3@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
	     System.out.println("Enter Username and Password");
	     Thread.sleep(10000);
	     driver.findElement(By.id("login_submit")).click();
	     if(driver.getTitle().equals("Dashboard")) {
				System.out.println("Title matched");
				}
				else {	
					System.out.println("Title not matched and Expected title is"+ driver.getTitle());
				}
	     Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a/i")).click();
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"signout\"]")).click();				
		driver.quit();
	}

}
