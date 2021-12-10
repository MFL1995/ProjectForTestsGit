package resources;

import org.openqa.selenium.WebDriver;

public class StringsDefined extends base {

	public StringsDefined(WebDriver driver) {
		base.driver = driver;
	}

	String BaseURLGoogle = "https://www.google.ro/";
	String BaseURLYoutube = "https://www.youtube.com/";
	String Ragulpage = "https://rahulshettyacademy.com/AutomationPractice";
	
	public String getBaseURLGoogle() {
		return BaseURLGoogle;
	}
	public String getBaseURLYoutube() {
		return BaseURLYoutube;
	}
	public String getRagulpage() {
		return Ragulpage;
	}
}
