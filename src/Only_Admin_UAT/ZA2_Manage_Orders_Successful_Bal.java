package Only_Admin_UAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZA2_Manage_Orders_Successful_Bal {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://daaz_uat:daaz_uat@2020@teams.daaz.xyz/admin/view/all/domain/history");
		System.out.println("Enter admin");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("UAT_DaaZ_Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("UATAdmin@2020");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/input[3]")).click();//Balance
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/a[2]")).click();
        //driver.navigate().refresh();
        Thread.sleep(2000);
        Select st=new Select(driver.findElement(By.name("datatable_orders2_length")));
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
        Thread.sleep(2000);//User  name
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[2]/input")).sendKeys("rakesh_2195");
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[3]/input")).sendKeys("OR00895615");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[4]/input")).sendKeys("44");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);//currency
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("EUR");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        }catch(Exception e) {
        	
        }
        Select su=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[6]/select")));
        su.selectByIndex(1);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        su.selectByIndex(2);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        su.selectByIndex(3);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        su.selectByIndex(4);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        
        Select ss=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[7]/select")));
        ss.selectByIndex(1);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        ss.selectByIndex(2);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        ss.selectByIndex(3);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        ss.selectByIndex(4);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        ss.selectByIndex(5);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        ss.selectByIndex(6);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        Select aa=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[8]/select")));
        aa.selectByIndex(1);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        aa.selectByIndex(2);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        aa.selectByIndex(3);
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        
        //Calendar
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[9]/div/input")).click();        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        //driver.navigate().refresh();
       Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]")).click();
        
        Thread.sleep(2000);//Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[10]/input")).sendKeys("saz");
        Thread.sleep(2000);
        //Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        Select bb=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[11]/select")));
        bb.selectByIndex(1);
        Thread.sleep(2000);
      //Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        bb.selectByIndex(2);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
   
        Thread.sleep(2000);
      //Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/input")).sendKeys("Admin");
        Thread.sleep(2000);
      //Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/input")).sendKeys("TESTER");
        Thread.sleep(2000);
      //Search
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[1]")).click();
        Thread.sleep(2000);//Reset
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[13]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/a[1]")).click();
        Thread.sleep(2000);
        ArrayList<String> ts=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ts.get(0));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/a[2]/span")).click();
        Thread.sleep(2000);
        ArrayList<String> ts1=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ts1.get(0));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]/a")).sendKeys("USD");
        Thread.sleep(2000);
        ArrayList<String> ts2=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ts2.get(0));
        Thread.sleep(2000);
        driver.quit();

	}

}
