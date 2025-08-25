package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
	
	public static void main(String[] args)
	{
		//instantiate the browser driver
				ChromeDriver driver = new ChromeDriver();
				//load the url
				driver.get("https://www.facebook.com/");
				//maximize the page
				driver.manage().window().maximize();
				//title of the page
				String title = driver.getTitle();
				System.out.println(title);
				

			}
		
	}


