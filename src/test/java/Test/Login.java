package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.ObjectFile;
import Utilities.BaseURL;

public class Login {
	@Test(priority = 1,groups="regression")
	public void getSite() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		ObjectFile page = new ObjectFile(driver);
		page.initialization();
		page.closeButton();
		page.login();
		page.loginMobileNumber();
		page.otp();
		Thread.sleep(10000);
	}
	@Test(priority=2,groups="smoke")
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		ObjectFile page = new ObjectFile(driver);
		page.initialization();
		page.closeButton();
		page.offer();
		page.offersDropdown();
		page.airlineOffer();
		page.studentOffer();
		page.studentOfferSite();
		page.bookNow();
		page.studentOfferSiteRedirect();
		page.bsRoundTrip();
		page.bsAdult();
		page.bsAdult2();
		page.whereFrom();
		page.selectMumbai();
		page.whereTo();
		page.selectBengaluru();
		//page.dateOfTravel();
		//page.dateOfReturn();
		page.nonStopFlight();
		page.submit();
		page.bookUrl();
		//page.selectFlight();
		
		
	}
	@Test(priority=3,groups="regression")
	public void support() {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		ObjectFile page = new ObjectFile(driver);
		page.initialization();
		page.closeButton();	
		page.support();
		page.tripID();
		page.getOTP();
		page.faq1();
		page.currentWindow();
		page.faq2();
		page.currentWindow();
		page.faq3();
		page.currentWindow();
		
	}
	@Test(priority=4,groups="smoke")
	public void moreOffers() {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		ObjectFile page = new ObjectFile(driver);
		page.initialization();
		page.closeButton();
		page.moreOffers();
		page.moreOfferUrl();
		page.Hotels();
		page.hotelUrl();
		page.currentWindow();
		page.selectHotels();
		
		}
	
	}

