package com.daaz.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//*************testng.org/testng-eclipse-update-site//TestNG***************************************
//StdRules: Provide all TestData & Objects
		public WebDriver driver;		
		
		 public String DomainName="Appollo.network";//DOMAIN NAME -------@#######################  
		 public String Amount_pay="500";
		//***TestData
		public String url = "https://dev:Devserver@1956!2023@d-v.in/";	
		public String Daazbuyer_URL="https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions";
		public String UAT_URL="http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/";//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!		
		public String un= "rakeshuppula3@gmail.com";
		public String un_broker= "rakesh.uppula+broker@daazteam.com";
		public String un_broker_UAT= "rakeshuppula31@gmail.com";
		public String pw  = "Rakesh1800##@@";
		public String Buyer2_un="Rakeshuppula3+seller@gmail.com";
		//***Objects
		//Login***************************
		public String loginbtn ="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a";
		public String txt_loginname_xpath ="//*[@id=\"username\"]";
		public String fram_id="mtcaptcha-1-iframe-1";
		public String captcha_click_id="mtcap-inputtext-1";
		public String txt_password_name = "password";
		public String btn_login_id    = "login_submit";    
		//Logout*********************************
		//public String url1="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a/i";
		public String link_logout_1st  ="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li/a/i";
		public String  Broker_link_logout_1st="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li/a";
		public String link_logout_2nd  = "//*[@id=\"signout\"]";		
		//DaaZ Secure Single 50_50 // BROKER*************************** 
        public String url_daazsecure_xpath ="https://dev:Devserver@1956!2023@d-v.in/all/secure/transactions/";
        public String UAT_daaz_xpath="http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/all/secure/transactions";//%%%%%%%%%%%%%%%%%%%%%%%
        public String createtrn_xpath ="/html/body/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/div/a";
        public String type_of_tran_single="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[2]";
        public String mail_link_id="email";
        public String buyer_mail="rakeshuppula3+buyer@gmail.com";
       // public String buyer_mail="vunnava.chowdary@esmart.in";//kumarisirumalla+buyer@daazteam.com"jackoctober2022+balance@gmail.com
        public String seller_mail_id="seller_email";
        public String seller_mail="rakeshuppula3@gmail.com";
        public String domain_name_id="domain_name";             
      //  public String DomainName="DAAZrare.com";//DOMAIN NAME -------@#######################       
        public String currency="currency";
        public String PhoneCode="phoneCode";
        public String jio="910018002321";
        public String IND="IND [+91]";
        public String Seller_phoneCode="seller_phoneCode";
        public String Seller_Mbno="seller_mobile_no";
        public String Mbnumber="mobile_no";
        public String currency_type_xpath="//*[@id=\"agreed_amount\"]";
        public String currency_type="EUR";
        public String Amount_id="agreed_amount";
     // public String Amount_pay="5067";
        public String fee_percentage_xpath="//*[@id=\"partner_fees\"]";
        public String fee_percentage="20";
        public String Feepayby_50_50_xpath="//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[3]/span";
        public String xpath_50_50="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[3]";
       //                               /html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/button
        public String Review_btn_xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[4]/button[1]";
                                   
        public String Review_button_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[5]/button";
        public String Submit_btn="/html/body/div[6]/div/div/div/div[3]/button[2]";        
      //DaaZ Secure Single buyer AND *************************** 
        public String Feepayby_BUYER_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[1]/span";
       // BROKER
        public String feepayby_buyerbroker="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[1]/span";
        //DaaZ Secure Single Seller AND BROKER*************************** 
        public String Feepayby_SELLER_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[2]/span";
        
        //DAAZ SECURE BULK 50_50 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
        public String type_of_tran_Bulk="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div/div/div/select/option[3]";       
        public String Bulk_Domains_xpath="//*[@id=\"fileToLoad\"]";
        public String Bulk_Domain_path="C:\\Users\\Administrator\\Downloads\\sssssssss.csv";
        public String Daaz_Bulk_50="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[3]/span";
        //Main bulk fee_paid by 50_50
       // public String Bulk_Feepayby_50_50_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[3]";// Working
        public String Bulk_Feepayby_50_50_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[3]";
        public String bulk_Feepayby_buyer="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[1]";
        //Main fee paid by seller
        public String Bulk_fee_paidby_seller="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[2]";
        
        public String Bulk_Feepayby_50_50_xpath2="//*[@id=\"mainDiv\"]/div[3]/div/div/div/label[3]";
        public String broker_Feepayby_50_50_xpath1="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[3]";
        public String Broker_single_fee_50="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[3]/span";
        //DAAZ SECURE BULK buyer
       
        public String broker_Feepayby_BUYER_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[1]/span"; 
        public String broker_single_fee_Buyer_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[1]/span";
        //DAAZ SECURE BULK seller
        public String Broker_Feepayby_SELLER_xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[3]/div/div/div/label[2]/span";
        //Broker 50 50
        public String Feepayby_50_50="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[3]";
        public String Feepayby_buyer="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[5]/div[4]/div/div[2]/div/label[1]";         
       
        // All Footer links Regression Testing***************************************
        public String How_it_work="//*[@id=\"responsive-menu\"]/li[1]/a";
        public String Back_Button="/html/body/nav/div[1]/div[1]/a/span/img";
        public String Back_Button2="/html/body/div[1]/a/span/img";
        public String SearchBar="//*[@id=\"data-categories\"]";
        public String Search_domain="mantra.in";//DOMAIN NAME
        public String click_on_searchbtn="/html/body/div[1]/div[1]/div[1]/div/form/div[1]/div/input";
        //back
        public String By_Domain_Page="/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[1]/a";
        //back
        public String Domain_Auction="/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[2]/a";
        //back
        public String Hire_Broker="/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[3]/a";
        //back 
        public String backbtn="/html/body/nav/div[1]/div[1]/a/span/img";//************
        public String Daaz_APIs="/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[4]/a";
        //back                 
        public String Payment_option="/html/body/footer/div[1]/div/div[1]/div/div[1]/ul[1]/li[5]/a";
        //back
        public String User_Agreement="/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[1]/a";
        //back
        public String Privacy_policy="/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[2]/a";
        //back
        public String Report_TM_concern="/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[3]/a";
        //back
        public String Refound_policy="/html/body/footer/div[1]/div/div[1]/div/div[2]/ul/li[4]/a";
        //back
        public String About_Us="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[1]/a";
        //back
        public String Howitwork="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[2]/a";
        //back
        public String FAQs="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[3]/a";
        //back
        public String Contact_Us="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[4]/a";
        //back
        public String Blog="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[5]/a";
        //back
        public String Domain_Extention_page="/html/body/footer/div[1]/div/div[1]/div/div[3]/ul/li[6]/a";
        //back
        public String Facebook="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[1]/a/span";
        //back
        public String Twitter="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[2]/a/span/img";
        //back
        public String Linkin="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[3]/a/span";
        //back
        public String YouTube="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[5]/a/span";
        //back
        public String Insta="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[4]/a/span";
        //back
        public String Tumblr="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[6]/a";
        //back
        public String Reddit="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[7]/a/span";
        //Back
        public String Medium="/html/body/footer/div[1]/div/div[2]/div[2]/ul/li[8]/a/span";
        
        //  Without Login   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  
                           //   /html/body/div[1]/div[1]/section[1]/div[3]/div[3]/div/div/ul/li[1]/div/div[2]
        public String domain="/html/body/div[1]/div[1]/section[1]/div[3]/div[3]/div/div/ul/li[2]/div/div[2]/span/a";//domain
        public String domain_new="/html/body/div[1]/div[1]/section[1]/div[3]/div[3]/div/div/ul/li[2]/div/div[2]/span";
       // public String Buy_buttons="/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/a/span";//Buy Button
        public String Buy_button="//*[@id=\"pills-home\"]/div[2]/a/span";
        public String buyer_firstname="//*[@id=\"first_name\"]";
        public String name="hyderabad";
        public String buyer_email="//*[@id=\"email\"]";
        public String email="rakeshuppula3+buyer@gmail.com";
        public String mobile_code="mobile_code";
        public String code="IND[+91]";
        public String mobile_no="mobile_no";
        public String number="98873773637363";
        public String country="country";
        public String country_name="India";
        public String state="state";
        public String State_name="Assam";
        public String city="city";
        public String city_name="Hyd";
        public String street="street";
        public String street_name="srnagar";
        public String ZIP_code="zip";
        public String ZIP_no="3673637";
        public String continue_btn="continue";
        public String stripe="/html/body/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/label";
        public String stripe_click="stripe_btn";
        public String card="cardNumber";
        public String card_no="4242424242424242";
        public String bill="billingName";
        public String bill_name="Rakesh";
        public String cardnumber="//*[@id=\"cardNumber\"]";
        public String expairy="//*[@id=\"cardExpiry\"]";
        public String card_expairy_no="1033";
        public String card_CV="//*[@id=\"cardCvc\"]";
        public String cardCV_no="224";
        public String submit="/html/body/div[1]/div/div/div[2]/main/div/div[2]/form/div[2]/div/div[2]/button/div[3]";        
//Make An offer  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
        public String Makeoffer_URL="https://d-v.in/leads";
  // buyer side  
        public String daazimg="/html/body/nav/div[1]/div[1]/a/span/img";
        public String makeoffer_domain="/html/body/div[1]/div[1]/section[1]/div[3]/div[3]/div/div/ul/li[2]/div/div[2]/span/a";
        public String makeoffer_domain0="//input[@id='counterOffer2531']";
        public String buyer_first_offer_id="offer";
        public String bid_amount="400";        
        public String send_offer="/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/a/span";
  // Seller side
        public String buyerseller_act_URL="https://d-v.in/leads";
        public String buyer_seller_act="//a[normalize-space()='Buyer/Seller Activity']";
        public String seller_buyer_1st_offer_name="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div[1]/input"; // ENTER price
         public String seller_2nd_offer_2nd_buyer="//*[@id=\"counterOffer2555\"]";      
       
         public String seller_bid_1st="2000";
        public String seller_buyer_message_id="send-message";  // message
        public String seller_2nd_buyer_message="//*[@id=\"send-message\"]";
        public String msg_content="testing";//MSG
        public String Counter_btn="//button[contains(text(),'Counter')]";// COUNT OFFER #############################
        public String Counter_2nd_btn="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[3]/div[2]/section/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[5]/button";
        public String make_logout_1st="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a/i";
        public String make_logout_2nd="//*[@id=\"signout\"]";
 // buyer side      
        public String buyer_bid_2nd="500";       
     // Seller side
        public String seller_bid_2nd="1800"; 
        public String seller_bid4="2100";
        public String Accept="//button[normalize-space()='Accept']";
                
 // Negative Scenario #######################################################################
        // seller side
        public String seller_bid2="300"; 
        public String seller_bid3="2000";
       
       //buyer side
        public String buyer_bid2="300";
        public String buyer_bid3="2500";
        public String buyer_bid4="500";
        
 // Revoke ######################################################################################################
        //Buyer side
        public String revoke="//button[normalize-space()='Revoke']";
        public String reason_xpath="//textarea[@id='reason']";
        public String reason_text="Testing";
        public String submint_revoke_xpath="//button[@id='revoke_offer']";
        // Seller side
        public String Seller_revoke_xpath="//button[normalize-space()='Revoke']";
        
// Multiple Buyers $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
        //buyer side 
        public String logoutbuyer="/html/body/nav/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/a/i";
        //  seller side
        public String select_buyer1="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]";
        public String sales_price_xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]";
        public String Success_fee9="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]";
        public String VAT_20="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]";
        public String Total="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]";
         
 // Add To Featured %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        public String Portfolio="/html/body/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[2]/a";
        public String select_domain_xpath="//*[@id=\"myDomainsList\"]/tbody/tr[1]/td[1]/div";
        public String Feature_button_ID="btn-add-feature-domains";
        public String next_btn="/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[3]/form/div[5]/button";
        public String proceed_btn="//a[normalize-space()='proceed to payment']";
        public String choose_balance="//label[@for='balance']";
        public String USD="/html/body/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[1]/div[2]/div[3]/label";
        public String payment_done="//button[@class='btn-sm btn btn-primary balance_submit']";
 
//***********************************************************
       // New Features
      // 1. Feature Request
//***********************************************************        
        public String url1 = "https://dev:Devserver@1956!2023@d-v.in/dashboard/";
        public String url11 = "http://daaz_uat_user:Daaz_uat_user@2020@daaz.xyz/dashboard/";
        public String feature_request ="/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div[3]/a";
        public String feature_Title_ID="title";
        public String Title_sendKey="old Feature";
        public String Feature_Description_xpath="/html/body/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div[2]";
        public String Feature_Description="create a new request fro seller";
        public String feature_sumit_ID="save";
        public String feature_view="/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a";
        //Admin side
        public String feature_request_url_admin="http://dev:Devserver@1956!2023@admin.d-v.in/admin/feature/request"; //*******
        public String feature_request_url_admin1="http://dev:Devserver@1956!2023@admin.d-v.in/admin/feature/request";
        public String admin_login1st_ID="username"; // Admin login username
        public String username_admin="Dev_DaaZ_Admin";//1st name
        public String password_admin="Pesu@1956!2021";// 2nd password
        public String admin_login2nd_ID="password";
        public String admin_submit_ID="signInBtn";
        
        public String feature_admin_view="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[6]/a";
        public String feature_admin_decription="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div[3]/div[2]";
        public String admindec_accept="Admin accepted/Reject your request";
        public String feature_admin_accept="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/select/option[4]";
        public String feature_admin_submit="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/button";
        public String admin_reject="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/select/option[3]";
        
        // New Feature        
        // 2. Footer All Options
        public String All_Option_URL="http://dev:Devserver@1956!2023@admin.d-v.in/admin/footer/option/ajax";
        public String new_Option="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]/a/span";
        public String Title_URL="url";
        public String Title_URL_des="DaaZ.FAV";
        public String Titl_name="title";
        public String Title_des="One of DaaZ user";
        public String Frame="cke_wysiwyg_frame cke_reset";
        public String Description_id="cke_96";
        public String Des_note="Most trusted domains";
        public String option_submit="/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div/div/form/input[2]";
       
        
        
}