package Only_Admin_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZA_Manage_Orders_Successful_BIN {

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
	        
		driver.findElement(By.id("signInBtn")).click();		
		System.out.println("Admin Login succuss");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/a")).click();// Manage Orders
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a/span")).click();// successful 
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/a[2]/i")).click();
        Thread.sleep(2000);
        Select st=new Select(driver.findElement(By.name("datatable_orders_length")));
        st.selectByIndex(1);
        Thread.sleep(2000);        
        st.selectByIndex(2);
        Thread.sleep(2000);        
        st.selectByIndex(3);
        Thread.sleep(2000);        
        st.selectByIndex(4);
        Thread.sleep(2000);        
        st.selectByIndex(5);
        Thread.sleep(2000);        
        st.selectByIndex(0);
        Thread.sleep(2000);
        driver.findElement(By.name("id")).sendKeys("OR0051255110002");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("domain_name")).sendKeys("rules.in");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("buyer_name")).sendKeys("rakesh_buyer");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("seller_name")).sendKeys("rakesh_sellerr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("created_at")).click();//Calendar
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]")).click();        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
       driver.navigate().refresh();
        // driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("price")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("grand_total")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("currency")).sendKeys("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        Select stp=new Select(driver.findElement(By.name("order_status")));
        stp.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stp.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        try {
        Select sto=new Select(driver.findElement(By.name("price_option")));
        sto.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        sto.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        sto.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        }catch(Exception e) {
        	
        }
        Thread.sleep(2000);
        Select stt=new Select(driver.findElement(By.name("type")));
        stt.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(4);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(6);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(7);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg.get(0));
        //driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg3=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg3.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[13]/a[2]")).click();
        Thread.sleep(2000);
        ArrayList<String> mg5=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg5.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.id("exampleModalCenter")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[13]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/ul/li/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg9=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg9.get(0));
      //  driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[1]/a")).click();       
        Thread.sleep(2000);
        ArrayList<String> mp=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mp.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[2]/a")).click();
        Thread.sleep(2000);// seller invoice.
        ArrayList<String> ms=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ms.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[3]/a")).click();
        Thread.sleep(2000);// transaction overview
        ArrayList<String> msl=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(msl.get(0));
        // driver.close();
        Thread.sleep(2000);
	
	    driver.quit();
	
	
	
	
	
	
	
	
	}

}
