package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/zerobank/step_defs",
        plugin = {
//                "html:target/default-cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                "rerun:target/failedRerun.txt"
                "json:target/cucumber.json"
        },
        dryRun =false,
        tags = "@positiveLogin"
)
public class CukesRunner {

}
