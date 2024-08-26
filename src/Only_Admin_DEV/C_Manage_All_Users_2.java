package Only_Admin_DEV;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class C_Manage_All_Users_2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://dev:Devserver@1956!2023@admin.d-v.in/admin/dashboard");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Dev_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pesu@1956!2021");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("Rakeshuppula3+ntr@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[1]")).click();
        Thread.sleep(2000);
        ArrayList<String> at=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(at.get(1));
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tab_1_1\"]/div[2]/div[2]/div/button")).click();       
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("test");        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/form/div[5]/a[1]")).click();//Save Button
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("testing");
        Thread.sleep(2000);
        driver.findElement(By.id("email_modal")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email_id_modal")).sendKeys("Rakeshuppula3+mmts@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("comment")).sendKeys("testing");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[3]/div/label[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        Alert ac=driver.switchTo().alert();
        ac.accept();
        Thread.sleep(2000);
        ArrayList<String> atw=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(atw.get(0));
        driver.navigate().refresh();
        Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("Rakeshuppula3+mmts@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/thead/tr[2]/td[15]/div/button[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[15]/a[1]")).click();
        Thread.sleep(2000);
        ArrayList<String> at1=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(at1.get(0));
        driver.close();
		driver.switchTo().window(at1.get(1));
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tab_1_1\"]/div[2]/div[2]/div/button")).click();       
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("test");        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/form/div[5]/a[1]")).click();//Save Button
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("testing");
        Thread.sleep(2000);
        driver.findElement(By.id("email_modal")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email_id_modal")).sendKeys("Rakeshuppula3+ntr@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("comment")).sendKeys("testing");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[3]/div/label[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        Alert ac1=driver.switchTo().alert();
        ac1.accept();                        
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Automation");
        Thread.sleep(2000);
        driver.findElement(By.id("organization")).clear();
        driver.findElement(By.id("organization")).sendKeys("Manual");
        Thread.sleep(2000);
        driver.findElement(By.id("bio")).sendKeys("Daaz");
        Thread.sleep(2000);  
        try {
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/form/div[5]/a[1]")).click();
        }catch(Exception e) {        	
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[8]/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[8]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[4]/form/div[1]/select/option[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("mobile_no")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("mobile_no")).sendKeys("9100180023");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[4]/form/div[3]/select/option[236]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[4]/form/div[4]/select/option[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("Hyd");
        Thread.sleep(2000);
        driver.findElement(By.id("street")).clear();
        driver.findElement(By.id("street")).sendKeys("SR Nagar");
        Thread.sleep(2000);
        driver.findElement(By.id("pincode")).clear();
        driver.findElement(By.id("pincode")).sendKeys("505503");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[4]/form/div[8]/a[1]")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[4]/div[1]/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div[13]/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div[13]/div/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div[13]/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div[13]/div/div[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div[13]/div/div[5]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[4]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[1]/div[1]/select/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[1]/div[2]/div/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[1]/div[2]/div/input")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.id("start_offer")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("start_offer")).sendKeys("40");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[2]/div[1]/select/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[2]/div[2]/select/option[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("buy_make_discount")).clear();
        driver.findElement(By.id("buy_make_discount")).sendKeys("5");
        Thread.sleep(2000);
        driver.findElement(By.id("make_offer_discount")).clear();
        driver.findElement(By.id("make_offer_discount")).sendKeys("4");
        Thread.sleep(2000);
        driver.findElement(By.id("auction_discount")).clear();
        driver.findElement(By.id("auction_discount")).sendKeys("3");
        Thread.sleep(2000);
        driver.findElement(By.id("make_offer_brokerage_discount")).clear();
        driver.findElement(By.id("make_offer_brokerage_discount")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.id("daaz_secure")).clear();
        driver.findElement(By.id("daaz_secure")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.id("lease_to_own")).clear();
        driver.findElement(By.id("lease_to_own")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.id("notes_txt_min")).clear();
        driver.findElement(By.id("notes_txt_min")).sendKeys("Good Domain Names");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[7]/form/div/div[5]/div/div[3]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[8]/form/div/div[1]/div[1]/label")).click();
        }catch (Exception e) {        	
        }
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[8]/form/div/div[1]/div[2]/label")).click();
        }catch (Exception e) {        	
        }
        try {
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[8]/form/div/div[1]/div[1]/label")).click();
        }catch (Exception e) {            	
        }
        Thread.sleep(2000);
        driver.findElement(By.id("public_profile_notes_txt")).sendKeys("testing");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[8]/form/div/div[3]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/ul/li[6]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[11]/form/div/div/div[2]/div[2]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[11]/form/div/div/div[2]/div[3]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[11]/form/div/div/div[3]/a[1]")).click();
        Thread.sleep(2000);
        System.out.println(" without External");
        driver.quit();
 
	}

}
