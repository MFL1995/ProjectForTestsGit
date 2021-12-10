package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static Properties prop;
	public static WebDriver driver;

	protected static WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\My projects\\CucumberProject1\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\cmoldovan\\OneDrive - Pentalog\\Documents\\chromedriver_win32(version96)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\cmoldovan\\OneDrive - Pentalog\\Documents\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
