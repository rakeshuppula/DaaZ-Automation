package Important_Codes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ALL_CODES {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//__________________________________________________________________________________________________________________________________
//__________________________________________________________________________________________________________________________________
	 JavascriptExecutor jsee= (JavascriptExecutor)driver;
	 jsee.executeScript("document.getElementById('username').value='Dev_DaaZ_Admin';");		 
	// jsee.executeScript("document.getElementById('username').style.border='2px blue solid';");
	 Thread.sleep(2000);
	 jsee.executeScript("document.getElementById('username').setAttribute('style','border:10px red solid;background:yellow;color:green');");
//Types**
	 //ID
	 jsee.executeScript("document.getElementById('created_by'),value='id';");
	 //SendKeys
	 WebElement we=( WebElement)jsee.executeScript("return document.getElementById('created_by'),value='id';");
	 we.sendKeys("test");
	 //click
	 jsee.executeScript("document.getElementById('created_by'),click()");
	 
	 //Name
	 jsee.executeScript("document.getElementsByName('created_by')[0],value='Name';");
	 //ClassName
	 jsee.executeScript("document.getElementsByClassName('inputtext')[0],value='ClassName';");
	 //TagName
	 jsee.executeScript("document.getElementsByTagName('input')[2],value='TagName';");
	 //Xpath
//	 jsee.executeScript("document.evaluate(\"//input[@id='email'");No need this line
	 jsee.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value ='xpath';");
	 //CSS
	 jsee.executeScript("document.querySelector('#email').value='CSS';");
	 
	 
//__________________________________________	                      ________________________________________________________________
//__________________________________________ Close child window or Tab ________________________________________________________________
	String parentWindowHandle = driver.getWindowHandle();
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/table/tbody/tr/td[7]/div/div/div/ul/li[3]/a")).click();
	Set<String>windowHandles=driver.getWindowHandles();for(
	String windowHandle:windowHandles)
	{
		if (!windowHandle.equals(parentWindowHandle)) {
			driver.switchTo().window(windowHandle);
			Thread.sleep(5000);
			driver.close();
		}
	}driver.switchTo().window(parentWindowHandle);
    // }
//                             OR
//	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs2.get(0));//close first window
//	driver.close();
//	driver.switchTo().window(tabs2.get(1));// Close 2nd window
//	driver.navigate().forward();
	
//__________________________________________________________________________________________________________________________________
//____________________________________________Drop Down_____________________________________________________________________________



//	 WebElement Rakesh2= driver.findElement(By.id("auction_option"));
//	 Select RakeshTesting3=new Select(Rakesh2);
//	 RakeshTesting3.selectByIndex(1);

//__________________________________________________________________________________________________________________________________
//______________________________________ENTER KEY____________________________________________________________________________________	
	
//	Robot r = new Robot();
//     r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);

//                	  OR

//	 Robot r2 = new Robot();
//	    r2.keyPress(KeyEvent.VK_CONTROL);    
//   r2.keyPress(KeyEvent.VK_V);
//   r2.delay(2000);
//   r2.keyRelease(KeyEvent.VK_CONTROL);
//   r2.keyRelease(KeyEvent.VK_V);
//   r2.delay(2000);
//   r2.keyPress(KeyEvent.VK_ENTER);
//   r2.keyRelease(KeyEvent.VK_ENTER);  
	
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  SCROLL DOWN  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	 JavascriptExecutor jt = (JavascriptExecutor) driver;
//     jt.executeScript("window.scrollBy(0,300)", "");
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  GET  TEXT    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	 WebElement t = driver.findElement(By.xpath("//*[@id=\"domainsGrid\"]/tbody/tr/td[1]/a"));
//	 System.out.println("Showing Domain Name is = "+t.getText());
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	 FULL SIZE   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	// driver.manage().window().maximize();
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   WAIT UNTIL CLICK @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   SCREENSHOT   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	 File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 FileUtils.copyFile(f2, new
//	 File("C:\\Users\\Administrator\\Pictures\\Screenshots.png"));
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   GET TITLE   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//  if(driver.getTitle().equals("Dashboard")) {
//  System.out.println("Title matched");
//	}
//  else {
//	System.out.println("Title not matched and expected title is "+driver.getTitle());
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     ALERT    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//	 Alert a= driver.switchTo ().alert ();
//	 System.out.println (a.getText ());
//	 a.accept ();
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    NAVIGATE  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	// navigate().back()
	// navigate().forword()
	// driver.navigate().refresh();
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  JAVA SCRIPT  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	WebElement logout = driver.findElement(By.linkText("Logout"));
//	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//	executor1.executeScript("arguments[0].click();", logout);
 //__________________________________________________________________________________________________________________________________
 //__________________________________________________________________________________________________________________________________

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  DRAG AND DROP  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//	Actions ac = new Actions(driver);
//	ac.dragAndDrop(driver.findElement(By.id("draggable")),
//	driver.findElement(By.id("droppable"))).perform();
 //__________________________________________________________________________________________________________________________________
 //___________________________________Copy and Paste_________________________________________________________________________________

//	Actions a =new Actions(driver);	     
//    WebElement dd=driver.findElement(By.xpath("//*[@id=\"transfer_chat_modal\"]/div/div/div[2]/div[2]/div/div[3]/div[2]"));//sendKeys(Keys.chord(Keys.CONTROL, "c"));	   
//    a.sendKeys(dd,"Msg").perform();
//    String d=dd.getAttribute("Value");
//    a.keyDown(dd,Keys.CONTROL).sendKeys("ac").keyUp(Keys.CONTROL).perform();
//   // a.keyDown(dd,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//    String s=dd.getAttribute("Value");
//	// METHOD 2***********
//	Actions a =new Actions(driver);
//	WebElement dd=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[1]/article/div/div[1]/p")); 
//	 WebElement dd2=driver.findElement(By.id("domain_name"));
//	    a.keyDown(Keys.CONTROL).sendKeys("a");
//		 a.sendKeys("c");
//	 dd2.moveToElement(dd2).sendKeys("v");
//	 dd2.keyUp(Keys.CONTROL).build().perform();
 //__________________________________________________________________________________________________________________________________
 //___________________________________Size and Width_________________________________________________________________________________

	//Dimension d= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/a")).getSize();
//    Thread.sleep(1000);
//    System.out.println("Width of Buy_Now_Button:"+d.width);
//    System.out.println("Height of Buy_Now_Button:"+d.height);
// //__________________________________________________________________________________________________________________________________
// //______________________________________frame_______________________________________________________________________________________
//
//	// driver.swichTo().frame("hjhlkjhg");
//	// driver..swichTo().defaultContent();
 //__________________________________________________________________________________________________________________________________
 //___________________________________Close child window or Tab______________________________________________________________________
	
//	String parentWindowHandle=driver.getWindowHandle();
//    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[6]/div[1]/div[2]/div/a")).click();	    
//    Set<String>windowHandles=driver.getWindowHandles();
//    for(String windowHandle : windowHandles) {
//    if(!windowHandle.equals(parentWindowHandle)) {
//    driver.switchTo().window(windowHandle);
//
//	 Thread.sleep(5000);
//    driver.close();
//    }
//    }
//    driver.switchTo().window(parentWindowHandle);    
//    Thread.sleep(1000); 
 //__________________________________________________________________________________________________________________________________
 //______________________________________Sikuli______________________________________________________________________________________
  
	try {
		Screen screen=new Screen();
		Pattern p1=new Pattern("C:\\Users\\Administrator\\Desktop\\paymf.PNG");	
		screen.wait(p1, 10);
		screen.click(p1, 10);
	}catch(Exception e) {
		System.out.println(e);
		
	}  

}}
