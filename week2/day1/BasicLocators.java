package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
			    //enter the username
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				//enter the password
				driver.findElement(By.name("pass")).sendKeys("Tuna@321");
				//click on login
				driver.findElement(By.name("login")).click();
				
	}

}
