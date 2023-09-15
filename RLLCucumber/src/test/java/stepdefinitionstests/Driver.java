package stepdefinitionstests;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

import bankPages.CreateSavingsAccount;
import bankPages.DepositMoney;
import bankPages.SigninPage;

public class Driver extends Tools {
	
    protected static SigninPage signin; 
    protected static CreateSavingsAccount saving;
    protected static DepositMoney deposit;
    public static Logger logger;
    public static void init() {
    	
    	logger = Logger.getLogger("Deposit");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		
    	driver = new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("http://dbankdemo.com/bank/login");
   	signin = new SigninPage(driver);
   	 saving=new CreateSavingsAccount(driver);
    deposit=new DepositMoney(driver);
}
}