package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
			    //enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//click on login
				driver.findElement(By.className("decorativeSubmit")).click();
				//click crmsfa
				driver.findElement(By.partialLinkText("CRM")).click();
				//click leads
				driver.findElement(By.linkText("Leads")).click();
				//createlead
				driver.findElement(By.linkText("Create Lead")).click();
				//company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shruthi");
				//lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
				//locate the source DD
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//instantiate the select class
				Select select=new Select(sourceDD);
				select.selectByIndex(4);
				//industryDD
				WebElement MarketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				//instantiate the select class
				Select select1=new Select(MarketingCampaignDD);
				select1.selectByVisibleText("Automobile");
				//industryDD
				WebElement OwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				//instantiate the select class
				Select select2=new Select(OwnershipDD);
				select2.selectByValue("OWN_CCORP");
				//industryDD
				driver.findElement(By.name("submitButton")).click();
				
				

	}

}
