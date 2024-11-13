package Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class differDropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//single DropDown handle
		WebElement courseDropdown = driver.findElement(By.id("course"));
		Select course = new Select(courseDropdown);
		List<WebElement> courseOptions = course.getOptions();
		for(WebElement courselist: courseOptions) {
			System.out.println(courselist.getText());
		}
		course.selectByVisibleText("Python");
		
		//multiple DropDown handle
		WebElement multiCourseDropDown = driver.findElement(By.id("ide"));
		Select multicourse = new Select(multiCourseDropDown);
		List<WebElement> multicourseOptions = multicourse.getOptions();
		for(WebElement multicourselist: multicourseOptions) {
			System.out.println(multicourselist.getText());
		}
		multicourse.selectByVisibleText("Eclipse");
		multicourse.selectByIndex(2);
		multicourse.selectByValue("nb");
		

	}

}
