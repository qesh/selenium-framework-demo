package com.app.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
        "html:target/cucumber-report",
        "json:target/cucumber.json"
        },
        tags = "@qabook",
        features = {"src/test/resources/com/testdata"},
        glue = {"src/test/java/com/app/step_defs"},
        dryRun = false
)

public class CukesRunner extends AbstractTestNGCucumberTests {
}
