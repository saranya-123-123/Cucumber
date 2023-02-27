package Steps;


	import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

	public class BaseClass extends AbstractTestNGCucumberTests{
		public static ChromeDriver driver;
		@BeforeMethod
		public void preConditions() {
			driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
		@AfterMethod
		public void postConditions() {
			driver.close();
		}}


