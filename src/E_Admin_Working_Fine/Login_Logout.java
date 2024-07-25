package E_Admin_Working_Fine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Logout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(1000);
		driver.manage().window().maximize();
	     driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
	     Thread.sleep(1000);
	    
		//driver.get("https://dev:Devserver@1956!2023@d-v.in/");
	     //Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/input")).sendKeys("Dev_DaaZ_Admin");
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[2]/div[2]/input")).sendKeys("Pesu@1956!2021"); 
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[4]/div[2]/button")).click();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/nav/ul/li[2]/a")).click();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/nav/ul/li[2]/ul/li[2]/a")).click();
         driver.quit();
	
	}

}
