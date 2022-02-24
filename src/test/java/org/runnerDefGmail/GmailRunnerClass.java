package org.runnerDefGmail;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src\\test\\resources", glue = "org.stepDefGmail", dryRun = false)

public class GmailRunnerClass {

}
