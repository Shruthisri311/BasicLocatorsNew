package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//title
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		//click on lead tab
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftaps");
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys( "Meganathan.");
		//enter title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("My First CreateLead assignment");
		//click the create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		

	}

}
