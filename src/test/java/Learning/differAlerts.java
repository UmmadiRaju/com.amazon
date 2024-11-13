package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class differAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		
		//Selecting alert pop-up
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String alertOutput = driver.findElement(By.id("output")).getText();
        System.out.println(alertOutput);
        
        //Selecting confirm 'OK' pop-up
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        String confirmOutput = driver.findElement(By.id("output")).getText();
        System.out.println(confirmOutput);
        
        //Selecting confirm 'Cancel' pop-up
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        String confirmCancelOutput = driver.findElement(By.id("output")).getText();
        System.out.println(confirmCancelOutput);
        
        //Selecting confirm 'Cancel' pop-up
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        String promptOutput = driver.findElement(By.id("output")).getText();
        System.out.println(promptOutput);
        
        //Selecting confirm 'Cancel' pop-up
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().dismiss();
        String promptCancelOutput = driver.findElement(By.id("output")).getText();
        System.out.println(promptCancelOutput);
	}

}
