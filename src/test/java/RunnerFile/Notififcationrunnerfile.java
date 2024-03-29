package RunnerFile;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features", //path to the directory containing your feature files,
		glue={"StepDefinitions"} //Package name where your step definitions are located
		//plugin = {"pretty", "html:target/cucumber-reports"} //Generate pretty console output and HTML reports
		)

public class Notififcationrunnerfile {

}
