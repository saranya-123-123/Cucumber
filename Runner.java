package Runner;

import Steps.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature/Login.feature",glue={"Steps"},monochrome=true,tags="@Smoke")
public class Runner extends BaseClass{
}

