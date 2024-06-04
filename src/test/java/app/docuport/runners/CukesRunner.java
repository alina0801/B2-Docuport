package app.docuport.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "app/docuport/step_definitions/",
        tags = "@day03_task_4",
        dryRun = false // true for snippets
)
public class CukesRunner {

}


