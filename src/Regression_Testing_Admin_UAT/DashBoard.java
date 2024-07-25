package Regression_Testing_Admin_UAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DashBoard {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
	     Thread.sleep(1000);
	     driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
	     Thread.sleep(1000);
	     driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021"); 
	     Thread.sleep(1000);
	     driver.findElement(By.id("signInBtn")).click();
	     driver.navigate().refresh();
	     System.out.println("Admin Login completed");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/a")).click();
	     WebElement ele=driver.findElement(By.xpath("//*[@id=\"datatable_orders\"]/tbody/tr/td[7]"));
	     System.out.println("Status ="+ele.getText());
	     Thread.sleep(2000);
	     driver.findElement(By.id("signInBtn")).click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
