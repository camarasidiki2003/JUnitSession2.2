package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	public void init() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\camar\\Desktop\\SeleniumProject\\session2\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\C:\\Users\\camar\\Desktop\\SeleniumProject\\session2\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\C:\\Users\\camar\\Desktop\\SeleniumProject\\session2\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\C:\\Users\\camar\\Desktop\\SeleniumProject\\session2\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\C:\\Users\\camar\\Desktop\\SeleniumProject\\session2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(10, Timeunit)
	}

}
