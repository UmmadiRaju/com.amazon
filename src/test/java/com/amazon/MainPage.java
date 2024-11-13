package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aceOnlineShoe.SnapMoneyAdmin;

public class MainPage {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		driver = new ChromeDriver();
		//driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/");
		driver.get("https://snapmoneytest.micnxt.com/jw/web/login");
		driver.manage().window().maximize();
	}
	@Test
	public static void validateAdminLogin() throws InterruptedException {
		try{
			SnapMoneyAdmin.adminLogin();
		}catch(Exception e) {
			System.out.println("Admin login is failed!");
		}
	}
	@Test(dependsOnMethods = "validateAdminLogin")
	public static void clickLoan() throws InterruptedException {
		SnapMoneyAdmin.loanApp();
	}
	@AfterTest
	public static void tearDown() throws InterruptedException {
		 try {
	            if (driver != null) {
	                driver.quit();
	            }
	        } catch (Exception e) {
	            System.out.println("Error during WebDriver cleanup: " + e.getMessage());
	        }
	}
	
	

}
