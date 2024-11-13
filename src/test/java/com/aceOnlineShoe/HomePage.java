package com.aceOnlineShoe;

import static com.amazon.MainPage.driver;

import org.openqa.selenium.By; 
public class HomePage {
	
	/* A better approach to script maintenance is to create a separate class file which would find web elements,
	 * fill them or verify them. This class can be reused in all the scripts using that element. In future, if
	 * there is a change in the web element, we need to make the change in just 1 class file and not 10 different scripts.
	 * This approach is called Page Object Model(POM). It helps make the code more readable, maintainable, and reusable.
	 * */
	
	public static String hamburgerMenu = "//*[@id=\"menuToggle\"]/input";
	public static String onlineProducts = "//*[@id=\"menu\"]/a[3]/li";
	
	public static void clickOrderProduct() throws InterruptedException{
		driver.findElement(By.xpath(hamburgerMenu)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(onlineProducts)).click();
		
	}
}
