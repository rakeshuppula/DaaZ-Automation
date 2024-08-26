package Only_UI_Side_UAT;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_All_Footer_Links {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.navigate().to("http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/");
		 Thread.sleep(2000);		
		 driver.findElement(By.xpath("//*[@id=\"responsive-menu\"]/li[3]/a")).click();
		 Thread.sleep(1000);
		 System.out.println("Auction");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div[1]/div[3]/div[2]/a")).click();// Auction SEE ALL
		 Thread.sleep(3000);
		 System.out.println("Auction see all ");
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div[2]/div[3]/a")).click();// Feature SEE ALL
		 Thread.sleep(3000);
		 System.out.println("feature see all ");
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div[3]/div[3]/a")).click();// Recent SEE ALL
		 Thread.sleep(3000);
		 System.out.println("recent see all");
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();
		 Thread.sleep(3000);		 		 
		 driver.findElement(By.xpath("//*[@id=\"responsive-menu\"]/li[1]/a")).click();
		 Thread.sleep(3000);
		 System.out.println("How It Works");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"data-categories\"]")).sendKeys("Testing5.Coffee");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/form/div[1]/div/input")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 Thread.sleep(3000);
		 System.out.println("Search Bar");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********	
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[1]/a")).click();
		System.out.println("BUY DOMAIN PAGE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[2]/a")).click();
        Thread.sleep(2000);
		System.out.println("DOMAIN AUCTION");
		  Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(1000);
        System.out.println("HIRE A BROKER");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[4]/a")).click();
        Thread.sleep(1000);
        System.out.println("DaaZ APIs");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        System.out.println("Payment Options");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        System.out.println("User Agreement");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        System.out.println("Privacy Policy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button**********
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[3]/a")).click();
        Thread.sleep(1000);
        System.out.println("Report TM Concerns");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button*********
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[4]/a")).click();
        Thread.sleep(1000);
        System.out.println("Refunds Policy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button 
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        System.out.println("About As");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button   
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        System.out.println("How It Works");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button   
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[3]/a")).click();
        Thread.sleep(1000);
        System.out.println("FAQs");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button  
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[4]/a")).click();
        Thread.sleep(000);
        System.out.println("Contact Us");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[5]/a")).click();
        Thread.sleep(1000);
        System.out.println("Blog ");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[6]/a")).click();
        Thread.sleep(1000);
        System.out.println("Domain Extensions Page");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div/div[4]/ul/li/li[1]/a")).click();
        Thread.sleep(1000);
        System.out.println("New Feature");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/div/div[1]/a/span/img")).click();//*******BAck Button
       
        //###### Social Media Links #########
       
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        System.out.println("FACE BOOK");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button'
       
        ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab.get(1));
		 driver.close();
		 driver.switchTo().window(tab.get(0));
		 driver.navigate().refresh();
//        ArrayList<String> wind=new
//        ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(wind.get(0));
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        System.out.println("TWitter");
       
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        
        ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab1.get(1));
		 driver.close();
		 driver.switchTo().window(tab1.get(0));
		 driver.navigate().refresh();
       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[3]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("Linked IN ");
        
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab3=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab3.get(1));
		 driver.close();
		 driver.switchTo().window(tab3.get(0));
		 driver.navigate().refresh();
       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[5]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("YouTube ");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab4=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab4.get(1));
		 driver.close();
		 driver.switchTo().window(tab4.get(0));
		 driver.navigate().refresh();
       
       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[4]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("Instagram ");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab5=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab5.get(1));
		 driver.close();
		 driver.switchTo().window(tab5.get(0));
		 driver.navigate().refresh();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[6]/a")).click();
        Thread.sleep(2000);
        System.out.println("Tumblr");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab6=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab6.get(1));
		 driver.close();
		 driver.switchTo().window(tab6.get(0));
		 driver.navigate().refresh();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[7]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("Reddit");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab7=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab7.get(1));
		 driver.close();
		 driver.switchTo().window(tab7.get(0));
		 driver.navigate().refresh();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/nav/div[1]/div[1]/a/span/img")).click();//*******BAck Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[8]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("Medium");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        ArrayList<String> tab8=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab8.get(1));
		 driver.close();
		 driver.switchTo().window(tab8.get(0));
		 driver.navigate().refresh();
        System.out.println("--------ALL COMPLETED--------");
        driver.quit();


	}
}
