package com.aceOnlineShoe;
import static com.amazon.MainPage.driver;
import org.openqa.selenium.By;

public class SnapMoneyAdmin {
	
	public static String userName= "j_username";
	public static String password = "j_password";
	public static String adminLogin = "//*[@id=\"loginForm\"]/table/tbody/tr[3]/td[2]/i/input/1";
	public static String clickLoan = "//*[@id=\"apps\"]/li[9]";
	
	public static void adminLogin() throws Exception {
		driver.findElement(By.id(userName)).sendKeys("Prasanth");
		driver.findElement(By.id(password)).sendKeys("Prasanth@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(adminLogin)).click();
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL = "https://snapmoneytest.micnxt.com/jw/web/userview/appcenter/v/_/home";
		if(actualURL.equals(expectedURL)) {
			System.out.println("Admin successfully logged into the portal");
		}
		else {
			System.out.println("Please entered valid login credentials");
		}
		
	}
	
	public static void loanApp() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(clickLoan)).click();
		Thread.sleep(3000);
	}
}
