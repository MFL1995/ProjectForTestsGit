package stepsImplemented;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.Page_1;
import resources.StringsDefined;
import resources.base;

public class Step_NavigateToGoogleURL extends base {
	private static Logger log = LogManager.getLogger(Step_NavigateToGoogleURL.class.getName());

	public Step_NavigateToGoogleURL(WebDriver driver) {
		base.driver = driver;
	}

	public void BaseURLGoogleMethod() {
		StringsDefined sd = new StringsDefined(driver);
		driver.get(sd.getRagulpage());
		System.out.println("Asta e un mesaj pentru proiectul de pe master in google class");
		log.info("s-a rulat");
		
		Page_1 p1 = new Page_1(driver);
		p1.getSelectCountriesFindBy().sendKeys("valoare20");
		
		
//		log.debug("I am debugging");
//		log.error("object is not present");
//		log.fatal("this is fatal error");
	}
}
