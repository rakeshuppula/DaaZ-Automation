package Add_To_Feature;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_To_Featured_Paypal {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./Resources/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();		    		
		driver.navigate().to("https://dev:Devserver@1956!2023@d-v.in/transfer/center");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Rakeshuppula3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rakesh1800##@@");
		driver.switchTo().frame("mtcaptcha-1-iframe-1");
		driver.findElement(By.id("mtcap-inputtext-1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Seller login");
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
	    jt.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(4000);
	    
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div/ul/li[3]/a")).click();
        Thread.sleep(2000);
        ArrayList<String> hk=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(hk.get(1));
        Thread.sleep(2000);
        WebElement ev= driver.findElement(By.xpath("/html/body/main/table/tbody/tr[2]/td[4]"));
        WebElement ev2= driver.findElement(By.xpath("/html/body/main/table/tbody/tr[3]/td[4]"));
     
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the first number: "+ev.getText());
       
        
        System.out.print("\r\nEnter the second number: "+ev2.getText() +ev.getText());
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        
        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
	 public static int performOperation(int firstNumber, int secondNumber, String operation)
	    {
	        int result = 0;
	        if (operation.equals("+")) {
	            result = firstNumber + secondNumber;
	        }
	        
	        return result;
        
	    }}
        
//        Thread.sleep(2000);
//        WebElement ev3= driver.findElement(By.xpath("/html/body/main/table/tbody/tr[4]/td[4]"));
//        System.out.println("VAT="+ev3.getText());
//        Thread.sleep(2000);
      
      
//        int num = 100, sum = 0;
//
//        for(int i = 1; i <= num; ++i)
//        {
//            // sum = sum + i;
//            sum += i;
//        }
//
//        System.out.println("Sum = " + sum);
      
      
      
      
      
      
      
      
      
      
      
	


