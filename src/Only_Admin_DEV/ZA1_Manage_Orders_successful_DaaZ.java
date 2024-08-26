package Only_Admin_DEV;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ZA1_Manage_Orders_successful_DaaZ {

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
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/input[2]")).click();//Daaz
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/a[2]")).click();
       //driver.navigate().refresh();
        Thread.sleep(2000);
        Select st=new Select(driver.findElement(By.name("datatable_orders1_length")));
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
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[2]/input")).sendKeys("OR0021617510001");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[3]/input")).sendKeys("growee.in");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[4]/input")).sendKeys("rakesh_buyer");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys("rakesh_sellerr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[6]/div/input")).click();//Calendar
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/table/tbody/tr[2]/td[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button[1]")).click();        
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/input[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[7]/input")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[7]/input")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[9]/input")).sendKeys("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        Select stp=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[10]/select")));
        stp.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        stp.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        try {
        Select sto=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[11]/select")));
        sto.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        sto.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        sto.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        }catch(Exception e) {
        	
        }
        Select stt=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[11]/select")));
        stt.selectByIndex(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(4);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        stt.selectByIndex(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/thead/tr[2]/td[12]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg.get(0));
        //driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg3=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg3.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[12]/a[2]")).click();
        Thread.sleep(2000);
        ArrayList<String> mg5=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg5.get(0));
       // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[12]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[5]/div/div/div[3]/button")).click();
		Thread.sleep(4000);
		try {
			Screen sv=new Screen();
			Pattern py=new Pattern("E:\\my Files\\View.PNG");
			
			sv.wait(py,10);
			sv.click(py,10);
		}catch(Exception e) {
			
		}
		try {
		ArrayList<String> mg78=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg78.get(1));
        }catch(Exception e) {
			
		}
        //driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[13]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/ul/li/a")).click();
}       catch(Exception e) {
			
		}
        Thread.sleep(2000);
        ArrayList<String> mg9=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg9.get(1));
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/ul/li[2]/a")).click();        
        Thread.sleep(2000);
        ArrayList<String> mg92=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg92.get(1));
        Thread.sleep(2000);
        }catch(Exception e) {
			
		}try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> mg91=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mg91.get(1));
        Thread.sleep(2000);
        }catch(Exception e) {
			
		}
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[1]/a")).click();       
        Thread.sleep(2000);
        ArrayList<String> mp=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(mp.get(1));
        // driver.close();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[2]/a")).click();
        Thread.sleep(2000);// seller invoice.
        ArrayList<String> ms=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ms.get(1));
       // driver.close();
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[7]/ul/li[3]/a")).click();
        }catch(Exception E){
        	
        }
        Thread.sleep(2000);// transaction overview
        ArrayList<String> msl=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(msl.get(1));
        Thread.sleep(2000);
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[7]/ul/li[1]/a")).click();
        Thread.sleep(2000);// transaction overview
        ArrayList<String> ms3l=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ms3l.get(1));
        Thread.sleep(2000);
        }catch(Exception e) {
			
		}
        try {
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[7]/ul/li[2]/a")).click();
        Thread.sleep(2000);// transaction overview
        ArrayList<String> ms4l=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(ms4l.get(1));
        Thread.sleep(2000);
        }catch(Exception e) {
        }
	    driver.quit();
	

	}

}
