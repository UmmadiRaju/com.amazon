package Learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowsOrTabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        
        //single window
        String parentwindowhandle = driver.getWindowHandle();
        System.out.println(parentwindowhandle);
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windowHandle: windowHandles) {
        	if(!windowHandle.equals(parentwindowhandle)) {
        		driver.switchTo().window(windowHandle);
        		driver.manage().window().maximize();
        		driver.findElement(By.id("firstName")).sendKeys("Raju");
        		Thread.sleep(3000);
        		driver.close();
        		Thread.sleep(2000);
        	}
        }
        driver.switchTo().window(parentwindowhandle);
        driver.findElement(By.id("name")).sendKeys("Raju Tutorials");
        Thread.sleep(3000);
        driver.quit();
	}

}
