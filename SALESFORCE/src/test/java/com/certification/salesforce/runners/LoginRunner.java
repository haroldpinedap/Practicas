package com.certification.salesforce.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"com.certification.salesforce.steps"},
        tags = "@Login_prueba",
        snippets = SnippetType.CAMELCASE)
public class LoginRunner {
}
