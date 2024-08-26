package com.daaz.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;

import com.daaz.utility.Log;

public class General extends Global {
	// stdrule: Provide all re-usable fun:methods
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");// Console
		Reporter.log("Application Opened");// html Rep
		Log.info("Application Opened");// logfile
	}

	public void captcha_frame() {
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
	}

	public void loginbtn() {
		driver.findElement(By.xpath(loginbtn)).click();
		System.out.println("clicked on login btn");// Console
		Reporter.log("clicked on login btn");// html Rep
		Log.info("clicked on login btn");// logfile
	}

	public void login_seller() throws Exception {
		Thread.sleep(1000);
		driver.navigate().to(Makeoffer_URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(17000);
		driver.findElement(By.id(btn_login_id)).click();
		System.out.println("Login completed");
		Log.info("Login Completed");
	}

	public void login_buyer() throws Exception {
		driver.navigate().to(Makeoffer_URL);
		Thread.sleep(1000);
		// driver.findElement(By.xpath(loginbtn)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(buyer_mail);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(17000);
		driver.findElement(By.id(btn_login_id)).click();
		System.out.println("Login completed");
		Log.info("Login Completed");
	}

	public void login_buyer2() throws Exception {
		driver.navigate().to(Makeoffer_URL);
		Thread.sleep(1000);
		// driver.findElement(By.xpath(loginbtn)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(Buyer2_un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(17000);
		driver.findElement(By.id(btn_login_id)).click();
		System.out.println("Login completed");
		Log.info("Login Completed");
	}

	public void Daaz_buyer_login() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(Daazbuyer_URL);
		Thread.sleep(1000);
		// driver.findElement(By.xpath(loginbtn)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(buyer_mail);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		System.out.println("Login completed");
		Log.info("Login Completed");
	}

	public void closeApplication() {
		driver.quit();
		System.out.println("Application closed");
		Log.info("Application Closed");
	}

	public void logout() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath(link_logout_1st)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(link_logout_2nd)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}

	public void broker_logout() {
		driver.findElement(By.xpath(Broker_link_logout_1st)).click();
		driver.findElement(By.xpath(link_logout_2nd)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}

	public void daazsecure_single50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.navigate().to(UAT_daaz_xpath);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();

		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//	daazsecure_single_BUYER******************************************************************************				
	public void daazsecure_single_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		// driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		driver.findElement(By.xpath(Feepayby_BUYER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

	public void daazsecure_single_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_SELLER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(4000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

	// BROKER SINGLE 50
	// *********************************************************************************
	public void BROKER_SINGLE_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		Thread.sleep(2000);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		driver.findElement(By.xpath(Broker_single_fee_50)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

	// BROKER SINGLE BUYER
	// *******************************************************************************
	public void BROKER_single_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		Thread.sleep(2000);
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		// driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		driver.findElement(By.xpath(broker_single_fee_Buyer_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

	// BROKER SELLER
	public void BROKER_single_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//****************************************************************************************************************************
//                     DAAZ BULK 50
	public void daazsecure_BULK_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		// driver.findElement(By.xpath(Bulk_Feepayby_50_50_xpath)).click();
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,200)", "");
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath_50_50)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//	  DAAZ BULK BUYER
	public void daazsecure_BULK_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		driver.findElement(By.xpath(bulk_Feepayby_buyer)).click();
		Thread.sleep(2000);
		// driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//	  DAAZ BULK SELLER

	public void daazsecure_BULK_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Bulk_fee_paidby_seller)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		// driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Bulk_fee_paidby_seller)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//*************************************************************************************************************************
//      BROKER BULK	50 50		
	public void BROKER_BULK_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		Thread.sleep(2000);
		// driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
//		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
//		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Bulk_Feepayby_50_50_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//     broker buyer
	public void BROKER_BULKBUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		Thread.sleep(2000);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(feepayby_buyerbroker)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//      BROKER BULK SELLER
	public void BROKER_BULK_SLLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url_daazsecure_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(PhoneCode)).sendKeys(IND);
		driver.findElement(By.id(Mbnumber)).sendKeys(jio);
		Thread.sleep(2000);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		driver.findElement(By.id(Seller_phoneCode)).sendKeys(IND);
		driver.findElement(By.id(Seller_Mbno)).sendKeys(jio);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(Bulk_Domains_xpath)).sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath(Feepayby_SELLER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//			REGRESSION TESTING

	public void Regression() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath(How_it_work)).click();
		Thread.sleep(2000);
		System.out.println("How it work");
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(SearchBar)).sendKeys(Search_domain);
		Thread.sleep(2000);
		driver.findElement(By.xpath(click_on_searchbtn)).click();
		Thread.sleep(2000);
		System.out.println("search");
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(By_Domain_Page)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		System.out.println("By domain page");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Domain_Auction)).click();
		System.out.println("Domain Auction");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Hire_Broker)).click();
		System.out.println("Hire_Broker");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Daaz_APIs)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(Back_Button2)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Payment_option)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(User_Agreement)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Privacy_policy)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Report_TM_concern)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Refound_policy)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(About_Us)).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Howitwork)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(FAQs)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Contact_Us)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Back_Button)).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath(Blog)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Domain_Extention_page)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Facebook)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(0));
		driver.findElement(By.xpath(Twitter)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Linkin)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(YouTube)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Insta)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Tumblr)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Reddit)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Back_Button)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Medium)).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath(Blog)).click();
		ArrayList<String> wind1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind1.get(0));
	}

//UAT %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

//UAT %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%			

	public void daazsecure_UAT_single50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%555
//	daazsecure_single_BUYER******************************************************************************				
	public void daazsecure_UAT_single_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		// driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		driver.findElement(By.xpath(Feepayby_BUYER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public void daazsecure_single_UAT_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		// driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		driver.findElement(By.xpath(Feepayby_SELLER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// BROKER SINGLE 50
	// *********************************************************************************
	public void BROKER_SINGLE_UAT_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		Thread.sleep(2000);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		driver.findElement(By.xpath(Broker_single_fee_50)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// BROKER SINGLE BUYER
	// *******************************************************************************
	public void BROKER_single_UAT_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		Thread.sleep(2000);
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		// driver.findElement(By.xpath(Feepayby_50_50_xpath)).click();
		driver.findElement(By.xpath(broker_single_fee_Buyer_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// BROKER SELLER
	public void BROKER_single_UAT_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		Thread.sleep(10000);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_single)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//    DAAZ BULK 50
	public void daazsecure_BULK_UAT_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(Bulk_Domains_xpath)).sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath_50_50)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Bulk_Feepayby_50_50_xpath)).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Review_btn_xpath)).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Submit_btn)).click();
//	Thread.sleep(3000);					
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//  DAAZ BULK BUYER
	public void daazsecure_BULK_UAT_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(Bulk_Domains_xpath)).sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_BUYER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%			
//  DAAZ BULK SELLER

	public void daazsecure_BULK_UAT_SELLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		// driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(Bulk_Domains_xpath)).sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_SELLER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_btn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%				
//  BROKER BULK	50 50		
	public void BROKER_BULK_UAT_50_50() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Feepayby_50_50)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%				
//   broker buyer
	public void BROKER_BULK_UAT_BUYER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(feepayby_buyerbroker)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%				
//    BROKER BULK SELLER
	public void BROKER_BULK_UAT_SLLER() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(UAT_daaz_xpath);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un_broker_UAT);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createtrn_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(type_of_tran_Bulk)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(mail_link_id)).sendKeys(buyer_mail);
		Thread.sleep(2000);
		driver.findElement(By.id(seller_mail_id)).sendKeys(seller_mail);
		WebElement fileInput = driver.findElement(By.xpath(Bulk_Domains_xpath));
		fileInput.sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(Bulk_Domains_xpath)).sendKeys(Bulk_Domain_path);
		// driver.findElement(By.id(domain_name_id)).sendKeys(DomainName);
		Thread.sleep(2000);
		// driver.findElement(By.name(currency)).sendKeys(currency_type);
		Thread.sleep(2000);
		// driver.findElement(By.xpath(currency_type_xpath)).sendKeys(Amount_pay);
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(fee_percentage_xpath)).sendKeys(fee_percentage);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Review_button_xpath)).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath(Feepayby_SELLER_xpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Submit_btn)).click();
		Thread.sleep(3000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%				
	public void without_login_BIN() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(4000);
		driver.findElement(By.xpath(domain)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Buy_button)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(buyer_firstname)).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.xpath(buyer_email)).sendKeys(email);
		driver.findElement(By.id(mobile_code)).sendKeys(code);
		driver.findElement(By.id(mobile_no)).sendKeys(number);
		driver.findElement(By.id(country)).sendKeys(country_name);
		Thread.sleep(2000);
		driver.findElement(By.id(state)).sendKeys(State_name);
		driver.findElement(By.id(city)).sendKeys(city_name);
		driver.findElement(By.id(street)).sendKeys(street_name);
		driver.findElement(By.id(ZIP_code)).sendKeys(ZIP_no);
		driver.findElement(By.id(continue_btn)).click();
		driver.findElement(By.xpath(stripe)).click();
		driver.findElement(By.id(stripe_click)).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(5000);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[1]/div/fieldset/div/div[1]/div/div[1]/span/input")).sendKeys("4242424242424242");
		driver.findElement(By.id(card)).sendKeys(card_no);
		Thread.sleep(1000);
		driver.findElement(By.id(bill)).sendKeys(bill_name);
		driver.findElement(By.xpath(cardnumber)).click();
		driver.findElement(By.xpath(expairy)).sendKeys(card_expairy_no);
		// Thread.sleep(1000);
		driver.findElement(By.xpath(card_CV)).sendKeys(cardCV_no);
		Thread.sleep(4000);
		driver.findElement(By.xpath(submit)).click();
		System.out.println("payment completed");
		Log.info("payment completed");
	}
//MAKE AN OFFER %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	

	public void Make_an_offer_buyer_side() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(daazimg)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(makeoffer_domain)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(buyer_first_offer_id)).sendKeys(bid_amount);
		Thread.sleep(1000);
		driver.findElement(By.xpath(send_offer)).click();
		Thread.sleep(8000);
		System.out.println("countered");
		Log.info("countered");
	}

	public void Make_an_offer_seller_side() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid_1st);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("countered");
		Log.info("countered");
	}

	public void Make_an_offer_buyer_side2() throws Exception {
//		Thread.sleep(1000);	
//		driver.findElement(By.xpath(buyer_seller_act)).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(buyer_bid_2nd);
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(2000);
		System.out.println("countered");
		Log.info("countered");
	}

	public void Make_an_offer_seller_side2() throws Exception {
//		Thread.sleep(4000);
//	    driver.get(buyerseller_act_URL);			
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath(buyer_seller_act)).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid_2nd);
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("countered");
		Log.info("countered");
	}

	public void Make_an_offer_buyer_side3() throws Exception {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath(Accept)).click(); // ACCEPT *****************
		System.out.println("countered");
		Log.info("countered");
	}

//NAGATIVE SCENARIO #################################################################		
//%%%%%%%%%%%%%%%%%%%//USE ***********Make_an_offer_buyer_side()%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
//		public void Negative_Scenario_buyer_side3()throws Exception{
//		Thread.sleep(4000);
//		driver.findElement(By.xpath(daazimg)).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(makeoffer_domain)).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id(buyer_first_offer_id)).sendKeys(bid_amount);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(send_offer)).click();
//	    Thread.sleep(8000);
//		System.out.println("countered");
//		Log.info("countered");
//	            }//------------------------------------------------
	public void Negative_Scenario_seller_side3() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid2);// 300
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid3);// bid 2000
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid4);// bid 2100
		Thread.sleep(1000);
		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		js21.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("countered");
		Log.info("countered");
	}// -------------------------------------------------------------------

	public void Negative_Scenario_buyer_side4() throws Exception {
		Thread.sleep(1000);
//		driver.findElement(By.xpath(buyer_seller_act)).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(buyer_bid2);// 300
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(2000);
		driver.findElement(By.name(seller_buyer_1st_offer_name)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(buyer_bid3);// 2100
		Thread.sleep(4000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(2000);
		driver.findElement(By.name(seller_buyer_1st_offer_name)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(buyer_bid4);// 500
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(2000);
		System.out.println("countered");
		Log.info("countered");
	}
//REVOKE ############################################################################################

	public void Revoke_buyer_side() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(daazimg)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(makeoffer_domain)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(buyer_first_offer_id)).sendKeys(bid_amount);// 400 revoked
		Thread.sleep(1000);
		driver.findElement(By.xpath(send_offer)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(revoke)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(reason_xpath)).sendKeys(reason_text);
		driver.findElement(By.xpath(submint_revoke_xpath)).click();
		Alert rakesh = driver.switchTo().alert();
		rakesh.accept();
		Thread.sleep(10000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(buyer_bid4);// 500
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(2000);
		System.out.println("countered");
		Log.info("countered");
	} // -------------------------------------------------------------------------------

	public void Revoke_seller_side() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid3);// 2000 revoked
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Seller_revoke_xpath)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(reason_xpath)).sendKeys(reason_text);
		driver.findElement(By.xpath(submint_revoke_xpath)).click();
		Alert rakesh = driver.switchTo().alert();
		rakesh.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid4);// bid 2100
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("countered");
		Log.info("countered");
	}

//Multiple Buyers $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//Buyer1 -----------------------------------------------					 
	public void Multiple_buyers() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(daazimg)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(makeoffer_domain)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(buyer_first_offer_id)).sendKeys(bid_amount);// 400
		Thread.sleep(1000);
		driver.findElement(By.xpath(send_offer)).click();
		Thread.sleep(8000);
		System.out.println("countered");
		Log.info("countered");
	}

//Buyer2 -----------------------------------------------------------------------------------					 
	public void Multiple_buyer2() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(daazimg)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(makeoffer_domain)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(buyer_first_offer_id)).sendKeys(buyer_bid4);// 500
		Thread.sleep(1000);
		driver.findElement(By.xpath(send_offer)).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(logoutbuyer)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(link_logout_2nd)).click();
		System.out.println("countered");
		Log.info("countered");
	}

//Seller side ------------------------------------------------------------------------------					 
	public void Multiple_seller() throws Exception {
		Thread.sleep(1000);
		driver.navigate().to(Makeoffer_URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(17000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		driver.findElement(By.xpath(seller_buyer_1st_offer_name)).sendKeys(seller_bid_1st);// 2000
		Thread.sleep(3000);
		driver.findElement(By.id(seller_buyer_message_id)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_btn)).click();
		Thread.sleep(5000);
		System.out.println("->-> BUYER2 OVERVIEW <-<-");
		WebElement t = driver.findElement(By.xpath(sales_price_xpath));
		System.out.println("Sales price is = " + t.getText());
		WebElement rk = driver.findElement(By.xpath(Success_fee9));
		System.out.println("Success fee (9%) is = " + rk.getText());
		WebElement vn = driver.findElement(By.xpath(VAT_20));
		System.out.println("VAT (20%) is = " + vn.getText());
		WebElement rm = driver.findElement(By.xpath(Total));
		System.out.println("Total is = " + rm.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("count offered to buyer1");
		// Log.info("count offered to buyer1");
		Thread.sleep(5000);
	}

//   ----------------------------------------------------------------------------				 
	public void Multiple_seller3() throws Exception {
		Thread.sleep(1000);
		driver.navigate().to(Makeoffer_URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		driver.switchTo().frame(fram_id);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(17000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		driver.findElement(By.xpath(select_buyer1)).click();
		Thread.sleep(1000);
		WebElement r = driver.findElement(By.xpath(seller_2nd_offer_2nd_buyer));// .sendKeys(seller_bid_1st);//2000
		r.sendKeys(seller_bid_1st);
//		 Thread.sleep(4000);					 
//		 driver.findElment(By.xpath(seller_2nd_buyer_message)).sendKeys(msg_content);
		Thread.sleep(7000);
		driver.findElement(By.xpath(Counter_2nd_btn)).click();
		Thread.sleep(5000);
		System.out.println("->-> BUYER2 OVERVIEW <-<-");
		WebElement t2 = driver.findElement(By.xpath(sales_price_xpath));
		System.out.println("Sales price is = " + t2.getText());
		WebElement rk2 = driver.findElement(By.xpath(Success_fee9));
		System.out.println("Success fee (9%) is = " + rk2.getText());
		WebElement vn2 = driver.findElement(By.xpath(VAT_20));
		System.out.println("VAT (20%) is = " + vn2.getText());
		WebElement rm2 = driver.findElement(By.xpath(Total));
		System.out.println("Total is = " + rm2.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_1st)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(make_logout_2nd)).click();
		System.out.println("count offered to buyer2");
		Log.info("count offered to buyer2");
	}

//Add To Featured 					 
	public void Add_Featured() throws Exception {
		driver.findElement(By.xpath(Portfolio)).click();
		Thread.sleep(1000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(4000);
		// Carefully select an Auction Domain
		// 1st //*[@id="myDomainsList"]/tbody/tr[1]/td[1]/div
		// 2nd //*[@id="myDomainsList"]/tbody/tr[2]/td[1]/div
		// 3rd //*[@id="myDomainsList"]/tbody/tr[3]/td[1]/div
		driver.findElement(By.xpath(select_domain_xpath)).click();
		System.out.println("Selected domain");
		driver.findElement(By.id(Feature_button_ID)).click();
		System.out.println("Clicked on featured button");
		driver.findElement(By.xpath(next_btn)).click();
		System.out.println("clicked next button");
		driver.findElement(By.xpath(proceed_btn)).click();
		Thread.sleep(1000);
		System.out.println("Clicked proceed button");
		driver.findElement(By.xpath(choose_balance)).click();
		Thread.sleep(1000);
		System.out.println("choose balance");
		driver.findElement(By.xpath(USD)).click();
		Thread.sleep(1000);
		System.out.println("Selected USD");
		Thread.sleep(2000);
		driver.findElement(By.xpath(payment_done)).click();
		System.out.println("Payment Done");
		System.out.println("Add_featured");
		Log.info("Add_featured");
	}
//******************************************************************************************
	// New Feature
	// 1. Feature Request

	public void Feature_Request1() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url1);
		//driver.navigate().to(url11);  //UAT
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		Thread.sleep(1000);
		driver.findElement(By.id(captcha_click_id)).click();		
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath(feature_request)).click();
		Thread.sleep(1000);
		driver.findElement(By.id(feature_Title_ID)).sendKeys(Title_sendKey);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Feature_Description_xpath)).sendKeys(Feature_Description);
		Thread.sleep(1000);
		driver.findElement(By.id(feature_sumit_ID)).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath(feature_view)).click();
		Thread.sleep(6000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.navigate().to(feature_request_url_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login1st_ID)).sendKeys(username_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login2nd_ID)).sendKeys(password_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_submit_ID)).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to(feature_request_url_admin1);
		Thread.sleep(4000);
		driver.findElement(By.xpath(feature_admin_view)).click();
		Thread.sleep(2000);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
		driver.close();
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(2000);
		driver.navigate().refresh();
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(feature_admin_decription)).sendKeys(admindec_accept);
		Thread.sleep(2000);
		driver.findElement(By.xpath(feature_admin_accept)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(feature_admin_submit)).click();
		Thread.sleep(2000);
		try {
			Screen screen = new Screen();
			Pattern btn = new Pattern("C:\\Users\\Administrator\\Desktop\\CaptureR3.PNG");
			screen.wait(btn, 10);
			screen.click(btn, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}
	public void Feature_Request_Reject() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url1);
		//driver.navigate().to(url11);
		// driver.findElement(By.xpath(url_daazsecure_xpath)).click();
		driver.findElement(By.xpath(txt_loginname_xpath)).sendKeys(un);
		driver.findElement(By.id(txt_password_name)).sendKeys(pw);
		Thread.sleep(1000);
		driver.switchTo().frame(fram_id);
		Thread.sleep(1000);
		driver.findElement(By.id(captcha_click_id)).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.id(btn_login_id)).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath(feature_request)).click();
		Thread.sleep(1000);
		driver.findElement(By.id(feature_Title_ID)).sendKeys(Title_sendKey);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Feature_Description_xpath)).sendKeys(Feature_Description);
		Thread.sleep(1000);
		driver.findElement(By.id(feature_sumit_ID)).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath(feature_view)).click();
		Thread.sleep(6000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.navigate().to(feature_request_url_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login1st_ID)).sendKeys(username_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login2nd_ID)).sendKeys(password_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_submit_ID)).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to(feature_request_url_admin1);
		Thread.sleep(4000);
		driver.findElement(By.xpath(feature_admin_view)).click();
		Thread.sleep(2000);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
		driver.close();
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(2000);
		driver.navigate().refresh();
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(feature_admin_decription)).sendKeys(admindec_accept);
		Thread.sleep(2000);
		driver.findElement(By.xpath(admin_reject)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(feature_admin_submit)).click();
		Thread.sleep(2000);
		try {
			Screen screen = new Screen();
			Pattern btn = new Pattern("C:\\Users\\Administrator\\Desktop\\CaptureR3.PNG");
			screen.wait(btn, 10);
			screen.click(btn, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(2000);
		System.out.println("create trans completed");
		Log.info("create trans completed");
	}
//              2. New Feature 
	public void All_Options() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(feature_request_url_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login1st_ID)).sendKeys(username_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_login2nd_ID)).sendKeys(password_admin);
		Thread.sleep(2000);
		driver.findElement(By.id(admin_submit_ID)).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to(All_Option_URL);
		Thread.sleep(4000);
		driver.findElement(By.xpath(new_Option)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(Title_URL)).sendKeys(Title_URL_des);
		Thread.sleep(2000);
		driver.findElement(By.id(Titl_name)).sendKeys(Title_des);
		Thread.sleep(2000);
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath(Description_id)).sendKeys(Des_note);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(option_submit)).click();
		Thread.sleep(2000);
		
		
		
		
		
		

	}
}
