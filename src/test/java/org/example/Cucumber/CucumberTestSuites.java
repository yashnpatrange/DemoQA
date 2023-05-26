package org.example.Cucumber;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key= GLUE_PROPERTY_NAME, value = "org.example.StepDefination")
@IncludeTags("login | logout")//Custom tag to run only particular required test scenario


public class CucumberTestSuites {

}
