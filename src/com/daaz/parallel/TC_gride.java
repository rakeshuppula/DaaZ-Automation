package com.daaz.parallel;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC_gride {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		DesiredCapabilities caps=DesiredCapabilities.firefox();
		//firefoxoptions ff=new firefoxoptions()
		//caps.setVersion("20");
		caps.setPlatform(Platform.WINDOWS);
		URL urlHub=null;
		urlHub=new URL("http:/localhost:5556/wd/hub&quot");

		RemoteWebDriver driver=new RemoteWebDriver(urlHub,caps);
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//driver.navigate().to("http://www.google.com/&quot");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}

}
