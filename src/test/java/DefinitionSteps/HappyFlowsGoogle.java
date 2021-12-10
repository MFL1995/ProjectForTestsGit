package DefinitionSteps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import resources.base;
import stepsImplemented.Step_NavigateToGoogleURL;

public class HappyFlowsGoogle extends base {
	@Given("that I open my URL link Google")
	public void that_i_open_my_url_link_google() throws IOException {
		driver = initializeDriver();
		Step_NavigateToGoogleURL ng = new Step_NavigateToGoogleURL(driver);
		ng.BaseURLGoogleMethod();
	}
}
