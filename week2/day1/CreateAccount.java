	package week2.day1;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class CreateAccount {
	
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
			//click on account tab
			driver.findElement(By.linkText("Accounts")).click();
			//click on createaccount
			driver.findElement(By.linkText("Create Account")).click();
			//enter account name
			driver.findElement(By.id("accountName")).sendKeys("Shruthi Meganathan");
			//enter the description
			driver.findElement(By.name("description")).sendKeys( "Selenium Automation Tester.");
			//enter number of employees
			driver.findElement(By.id("numberEmployees")).sendKeys("45");
			//enter site name
			driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			//click the create account button
			driver.findElement(By.className("smallSubmit")).click();
			
	
		}
	
	}
