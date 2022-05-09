package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
            glue = "com/vytrack/step_definations",
            dryRun = false,
            tags = "@navigation"
        // dryRun false execute the real code  and dryRun true will not execute the java code inside the step def
        // if use "and" just execute a scenario a tag, and if use "or" can execute two or more testcases at the same time.
)
public class CukesRunner {
}
