package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.ObjectFile;
import Utilities.BaseURL;

public class Destinations {
	@Test(priority = 1,groups={"smoke", "regression"})
	public void getSite() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		ObjectFile page = new ObjectFile(driver);
		//page.initialization();
		page.closeButton();
		page.goa();
		page.goaURL();
		page.searchHotels();
		page.searchHotelsITC();
		page.currentWindow();
		driver.quit();
		
	}

	
	
	
	}

