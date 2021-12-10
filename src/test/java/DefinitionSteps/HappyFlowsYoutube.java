package DefinitionSteps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import resources.base;
import stepsImplemented.Step_NavigateToYoutubeURL;

public class HappyFlowsYoutube extends base {

	@Given("that I open my Youtube link")
	public void that_i_open_my_youtube_link() throws IOException {
		driver = initializeDriver();
		Step_NavigateToYoutubeURL nb = new Step_NavigateToYoutubeURL(driver);
		nb.NavigateToYoutubeURLMethod();
	}
}
