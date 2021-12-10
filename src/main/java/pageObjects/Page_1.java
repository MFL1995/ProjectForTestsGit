package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Page_1 {
	public WebDriver driver;
	public Page_1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement SelectCountriesFindBy;
	public WebElement getSelectCountriesFindBy() {
		return SelectCountriesFindBy;
	}

	By SelectCountriesBy = By.xpath("//input[@id='autocomplete']");
	public WebElement getSelectCountriesBy() {
		return driver.findElement(SelectCountriesBy);
	}
}
