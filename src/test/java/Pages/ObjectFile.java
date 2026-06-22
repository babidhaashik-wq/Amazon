package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectFile {
	WebDriver driver;

	public ObjectFile(WebDriver driver) {
		this.driver = driver;
	}

	public void initialization() {
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println("Page title is " + title);
		System.out.println("Page URL is " + URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	By closeButton = By.xpath("//div[@class='pb-1 px-1 flex flex-middle nmx-1']");

	public void closeButton() {
		driver.findElement(closeButton).click();
	}

	By login = By.xpath("//button[@class='sc-iqHZue kWgmbq']");

	public void login() {
		driver.findElement(login).click();
	}

	By loginMobileNumber = By.xpath("//input[@placeholder='Enter mobile number']");

	public void loginMobileNumber() {
		driver.findElement(loginMobileNumber).sendKeys("8139810020");
	}

	By otp = By.xpath("//button[@class='sc-jrAIFA fSripd h-10 bg-black-500 hover:bg-black-500']");

	public void otp() {
		driver.findElement(otp).click();
	}

	By offer = By.xpath("//p[text()='Offers']");

	public void offer() {
		driver.findElement(offer).click();
	}

	By offersDropdown = By.xpath("//span[text()=' All Offers']");

	public void offersDropdown() {
		driver.findElement(offersDropdown).click();
	}

	By airlineOffer = By.xpath("//label[text()='Airline Offers']");

	public void airlineOffer() {
		driver.findElement(airlineOffer).click();
	}

	By studentOffer = By
			.xpath("//a[@href='https://www.cleartrip.com/all-offers/flights-international-student-offer/']");

	public void studentOffer() {
		driver.findElement(studentOffer).click();
	}

	public void studentOfferSite() {

		driver.get("https://www.cleartrip.com/all-offers/flights-international-student-offer/");

	}

	By bookNow = By.xpath("//a[text()='Book Now']");

	public void bookNow() {
		WebElement button = driver.findElement(bookNow);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);

		button.click();
	}

	public void studentOfferSiteRedirect() {

		driver.get("https://www.cleartrip.com/flights?isRedirect=true");

	}

	By bsRoundTrip = By.xpath("//input[@id='roundtrip']");

	public void bsRoundTrip() {
		driver.findElement(bsRoundTrip).click();
	}

	By bsAdult = By.xpath("//span[text()='1 Adult, Economy']");

	public void bsAdult() {
		driver.findElement(bsAdult).click();
	}

	By bsAdult2 = By.xpath("(//button[@class='bn c-pointer'])[1]");

	public void bsAdult2() {
		driver.findElement(bsAdult2).click();
	}

	By whereFrom = By.xpath("//input[@placeholder='Where from?']");

	public void whereFrom() {
		driver.findElement(whereFrom).click();
	}

	By selectMumbai = By.xpath("//p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']");

	public void selectMumbai() {
		driver.findElement(selectMumbai).click();
	}

	By whereTo = By.xpath("//input[@placeholder='Where to?']");

	public void whereTo() {
		driver.findElement(whereTo).click();
	}

	By selectBengaluru = By.xpath("//p[text()='Bengaluru, IN - Kempegowda International Airport (BLR)']");

	public void selectBengaluru() {
		driver.findElement(selectBengaluru).click();
	}

	By dateOfTravel = By.xpath("//div[@data-testid='dateSelectOnward']");

	public void dateOfTravel() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement travelDate = wait.until(ExpectedConditions.elementToBeClickable(dateOfTravel));
		travelDate.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", travelDate);

		WebElement date = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Sat Aug 15 2026']")));

		date.click();
	}

	By dateOfReturn = By.xpath("//div[@data-testid='dateSelectReturn']");

	public void dateOfReturn() {

		driver.findElement(dateOfReturn).click();

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("August");

		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("2000");

		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='18']")).click();
	}

	By nonStopFlight = By.xpath("//p[text()='Non-stop flights only']");

	public void nonStopFlight() {
		driver.findElement(nonStopFlight).click();
	}

	By submit = By.xpath("//h4[text()='Search flights']");

	public void submit() {
		driver.findElement(submit).click();
	}

	public void bookUrl() {

		driver.get(
				"https://www.cleartrip.com/flights/results?adults=2&childs=0&infants=0&class=Economy&depart_date=23/06/2026&return_date=23/06/2026&from=BOM&to=BLR&intl=n&origin=BOM%20-%20Mumbai,%20IN&destination=BLR%20-%20Bengaluru,%20IN&sft=&sd=1782038760181&rnd_one=R&isCfw=false&isFF=false&sourceCountry=Mumbai&destinationCountry=Bengaluru&nonStop=");

	}

	By selectFlight = By.xpath("(//div[@class='sc-bdfDLd fpyICC px-3 pt-1'])[1]");

	public void selectFlight() {
		driver.findElement(selectFlight).click();
	}

	By support = By.xpath("//p[text()='Support']");

	public void support() {
		driver.findElement(support).click();
	}

	By tripID = By.xpath("//input[@placeholder='Enter Trip ID']");

	public void tripID() {
		driver.findElement(tripID).sendKeys("112233445");
	}

	By getOTP = By.xpath("//button[text()='Get OTP']");

	public void getOTP() {
		driver.findElement(getOTP).click();
	}

	By faq1 = By.xpath("//a[text()='How do I cancel a flight ?']");

	public void faq1() {

		WebElement faq = driver.findElement(faq1);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", faq);

		faq.click();
	}

	By faq2 = By.xpath("//a[text()='How do I make changes to flight reservation?']");

	public void faq2() {
		driver.findElement(faq2).click();
	}

	By faq3 = By.xpath("//a[@href='faq/hotels/']");

	public void faq3() {
		driver.findElement(faq3).click();
	}

	public void currentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}

	By moreOffers = By.xpath("//a[text()='View all']");

	public void moreOffers() {
		driver.findElement(moreOffers).click();
	}

	public void moreOfferUrl() {

		driver.get("https://www.cleartrip.com/all-offers/flights/");

	}

	By Hotels = By.xpath("//span[text()='Hotels']");

	public void Hotels() {
		driver.findElement(Hotels).click();
	}

	public void hotelUrl() {

		driver.get("https://www.cleartrip.com/all-offers/hotels/");

	}

	By selectHotels = By
			.xpath("(//a[@href='https://www.cleartrip.com/mw/cbc/sbi?sourceType=pwa_home?isredirect=true'])[1]");

	public void selectHotels() {
		driver.findElement(selectHotels).click();
	}

	By goa = By.xpath("//img[@alt='Goa']");

	public void goa() {
		WebElement seeGoa = driver.findElement(goa);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", seeGoa);

		seeGoa.click();

	}

	public void goaURL() {

		driver.get(
				"https://www.cleartrip.com/hotels/results?city=Goa&state=Goa&country=IN&dest_code=37264&adults1=2&children1=0&num_rooms=1&adults=2&childs=0&chk_in=24/06/2026&chk_out=25/06/2026");

	}

	By searchHotels = By.xpath("//input[@class='sc-bbSZdi AYRpZ']");

	public void searchHotels() {
		driver.findElement(searchHotels).sendKeys("ITC", Keys.ENTER);
	}
	By searchHotelsclick = By.xpath("//input[@class='sc-bbSZdi AYRpZ']");

	public void searchHotelsclick() {
		driver.findElement(searchHotelsclick).click();
	}

	By searchHotelsITC = By.xpath("//div[text()='ITC Grand Goa, a Luxury Collection Resort & Spa, Goa']");

	public void searchHotelsITC() {
		driver.findElement(searchHotelsITC).click();
	}

	By searchHotelsITC2 = By.xpath("(//div[@class='sc-gFqAkR jLvBLj'])[2]");

	public void searchHotelsITC2() {
		driver.findElement(searchHotelsITC2).click();
	}
	
	By changeGoa = By.xpath("//input[@class='sc-hmdomO hzFsvJ fs-16 lh-24 fw-500 ']");

	public void changeGoa() {
		driver.findElement(changeGoa).click();
	}
}
