package Only_Admin_UAT;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_Manage_All_Users_3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(2000);
		// driver.findElement(By.id("password")).sendKeys("UAT_DaaZ_Admin
		// UATAdmin@2020");
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
		Thread.sleep(2000);
		driver.findElement(By.id("signInBtn")).click();
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("rakeshuppula3@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]")).click();
		Thread.sleep(2000);
		//Email address @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[2]/span")).click();
        Thread.sleep(2000);
        ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ar.get(1));
        driver.close();
        driver.switchTo().window(ar.get(0)); 
      //Domain portfolio @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[15]/a[3]")).click();
        Thread.sleep(2000);
        ArrayList<String> at=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(at.get(1));
        driver.close();
        driver.switchTo().window(at.get(0));
        //Add Domains @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[15]/a[4]/span")).click();        
        Thread.sleep(2000);
        ArrayList<String> ata=new ArrayList<String>(driver.getWindowHandles()); 
        driver.switchTo().window(ata.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[4]/form/div[1]/div/textarea")).sendKeys("Hypertext.com");
        Thread.sleep(2000);        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[4]/form/div[2]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> as=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(as.get(1));
        driver.close();
        driver.switchTo().window(as.get(0)); 
      //Add balance @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[15]/a[5]/span")).click();
        Thread.sleep(2000); 
        ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(a.get(1));
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/a[1]/span")).click();
        Thread.sleep(2000); 
        ArrayList<String> ap=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ap.get(1));
        driver.findElement(By.id("amount")).sendKeys("500");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[2]/div/select/option[4]")).click();//EUR
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[3]/div/select/option[2]")).click();//Add 
        Thread.sleep(2000); 
        driver.findElement(By.id("comments")).sendKeys("Testing");//Comment
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[5]/a")).click();//submit
        Thread.sleep(2000);  
        Alert ao=driver.switchTo().alert();
        ao.accept();
        Thread.sleep(8000); 
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/a[1]/span")).click();
        Thread.sleep(2000); 
        driver.findElement(By.id("amount")).sendKeys("500");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[2]/div/select/option[4]")).click();//EUR
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[3]/div/select/option[3]")).click();//Withdrawn 
        Thread.sleep(2000); 
        driver.findElement(By.id("comments")).sendKeys("Testing");//Comment
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[4]/div/div/div[4]/div/form/div[5]/a")).click();//submit
        Thread.sleep(2000);  
        Alert aa=driver.switchTo().alert();
        aa.accept();        
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/a[2]/span")).click();//Export
        Thread.sleep(5000); 
        ArrayList<String> au=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(au.get(0));
        Thread.sleep(2000);     
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[15]/a[6]/span")).click();
        Thread.sleep(2000);  
        ArrayList<String> ai=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ai.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[7]/span")).click();
        Thread.sleep(2000);  
        ArrayList<String> ad=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ad.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[8]/span")).click();//make
        Thread.sleep(2000); 
        ArrayList<String> ad1=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ad1.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[9]/span")).click();//Truk
        Thread.sleep(2000); 
        ArrayList<String> ad11=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ad11.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[10]/span")).click();
        ArrayList<String> ad12=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ad12.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/input")).sendKeys("namerk");
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("rakeshuppula3+cv@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[4]/button")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("true5g");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("rakeshuppula3+spt929@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Rakesh123@");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmPassword")).sendKeys("Rakesh123@");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("rakeshuppula3+spt929@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[11]")).click();
        Thread.sleep(2000);
        Alert ae=driver.switchTo().alert();
        ae.accept();
        Thread.sleep(2000);
        System.out.println("Logout succuss");
        driver.quit();

	}

}
