package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login extends BaseClass{
	
//	@Given("Open the Browser")
//	public void openBrowser() {
//		
//		driver = new ChromeDriver();
//	}
//	
//	@And("Launch the URL")
//	public void launchURL() {
//		driver.get("http://leaftaps.com/opentaps");
//	}
//	
//	@When("Enter the username as {string} and password as {string}")
//	public void enterUsernameAndPwd(String uName, String pwd) {
//		driver.findElement(By.id("username")).sendKeys(uName);
//	}
	
	@When("Enter the username as (.*)$")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@When("Enter the password as (.*)$")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@And("Click on Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		if (driver.getTitle().equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")){
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is unsuccessful");
		}
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		if(driver.findElement(By.id("errorDiv")).getText().contains("Password incorrect")) {
			System.out.println("Login failed");
		} else {
			System.out.println("Login is success");
		}
	}

	
	
//		@And("Click on Leads")
//		public void clickLeads() {
//			driver.findElement(By.linkText("Leads")).click();
//		}
//		@And("Click on Create Lead")
//		public void clickCreateLeads() {
//			driver.findElement(By.linkText("Create Lead")).click();
//		
//			
//		}
//		@And("Enter the companyName")
//		public void companyName() {
//			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
//		}
//		@And("Enter the firstName")
//		public void firstName() {
//			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
//		}
//		 @And("Enter the lastName")
//		 public void lastName() {
//			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthi");
//		 }
//		 @And("Click on submitButton")
//		 public void clickSubmit() {
//			 driver.findElement(By.className("smallSubmit")).click();
		 }
		
		
	

	

	
	



