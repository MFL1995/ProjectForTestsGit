package stepsImplemented;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import resources.StringsDefined;
import resources.base;

public class Step_NavigateToYoutubeURL extends base {
	private static Logger log = LogManager.getLogger(Step_NavigateToYoutubeURL.class.getName());

	public Step_NavigateToYoutubeURL(WebDriver driver) {
		base.driver = driver;
	}

	public void NavigateToYoutubeURLMethod() {
		StringsDefined sd = new StringsDefined(driver);
		driver.get(sd.getBaseURLYoutube());
		System.out.println("Asta e un mesaj pentru proiectul de pe master in youtube class");

		log.info("s-a rulat");
		log.trace("cu success");
		log.error("s-a reprodus eroarea");
	}
}
