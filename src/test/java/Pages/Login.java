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

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void print() {
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println("Page title is " + title);
		System.out.println("Page URL is " + URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	By tutorial = By.xpath("//a[@class=\"navbar__tutorial-menu\"]");

	public void tutorial() {
		driver.findElement(tutorial).click();
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	// public void navigateForward(){
	// driver.navigate().forward();
	// }
	public void refresh() {
		driver.navigate().refresh();
	}

	By selenium = By.xpath("//a[@href=\"/selenium-training?q=headers\"]");

	public void selenium() {

		driver.findElement(selenium).click();
	}

	By registration = By.xpath("//a[@class=\"btn btn-primary-shadow btn-block\"]");

	public void registration() {
		driver.findElement(registration).click();
	}

	By firstName = By.xpath("//input[@id=\"first-name\"]");

	public void firstName() {
		driver.findElement(firstName).sendKeys("Babidha");
	}

	By lastName = By.xpath("//input[@id=\"last-name\"]");

	public void lastName() {
		driver.findElement(lastName).sendKeys("Karim");
	}

	By email = By.xpath("//input[@id=\"email\"]");

	public void email() {
		driver.findElement(email).sendKeys("babidha@gmail.com");
	}

	By mobileNumber = By.xpath("//input[@id=\"mobile\"]");

	public void mobileNumber() {
		driver.findElement(mobileNumber).sendKeys("9946658897");
	}

	public void selectCountry() {

		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));

		Select select = new Select(countryDropdown);

		select.selectByVisibleText("Argentina");
	}

	By city = By.xpath("//input[@id=\"city\"]");

	public void city() {
		driver.findElement(city).sendKeys("Tamilnadu");
	}

	By message = By.xpath("//textarea[@id=\"message\"]");

	public void message() {
		driver.findElement(message).sendKeys("I need to study automation for better carear growth");
	}

	By capcha = By.xpath("//input[@id=\"code\"]");

	public void capcha() {

		driver.findElement(capcha).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("please wait for 4 seconds");
		}

	}

	By send = By.xpath("//button[@class=\"btn btn-block btn-primary\"]");

	public void send() {
		driver.findElement(send).click();
	}

	By demoSite = By.xpath("//a[text()=\"Demo Site\"]");

	public void demoSite() {
		driver.findElement(demoSite).click();
	}

	public void demoSiteurl() {

		driver.get("https://demoqa.com/elements");

	}
	By elements=By.xpath("//div[text()='Elements']");
	public void elements() {
		driver.findElement(elements).click();
	}
	
	
	

	public void currentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}

	By textBox = By.xpath("//span[text()='Text Box']");

	public void textBox() {
		driver.findElement(textBox).click();
	}

	By fullName = By.xpath("//input[@placeholder=\"Full Name\"]");

	public void fullName() {
		driver.findElement(fullName).sendKeys("Babidha Abdul");
	}

	By userName = By.xpath("//input[@placeholder='name@example.com']");

	public void userName() {
		driver.findElement(userName).sendKeys("bab@gmail.com");
	}

	By currentAddress = By.xpath("//textarea[@placeholder='Current Address']");

	public void currentAddress() {
		driver.findElement(currentAddress).sendKeys("balaji 125");
	}

	By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");

	public void permanentAddress() {
		driver.findElement(permanentAddress).sendKeys("balaji 125");
	}

	// submit is not clicking
	public void textBoxSubmit() {
		WebElement textBoxSubmit = driver.findElement(By.xpath("//button[@id='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", textBoxSubmit);

		textBoxSubmit.click();
	}

	By checkBox = By.xpath("//a[@href='/checkbox']");

	public void checkBox() {
		driver.findElement(checkBox).click();
	}

	By homeCheckBox = By.xpath("//span[@role='checkbox']");

	public void homeCheckBox() {
		driver.findElement(homeCheckBox).click();
	}

	By homePlus = By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']");

	public void homePlus() {
		driver.findElement(homePlus).click();
	}

	By desktopPlus = By.xpath("//span[@title='Desktop']/preceding-sibling::span[contains(@class,'rc-tree-switcher')]");

	public void desktopPlus() {
		driver.findElement(desktopPlus).click();
	}

	By documentsPlus = By
			.xpath("//span[@title='Documents']/preceding-sibling::span[contains(@class,'rc-tree-switcher')]");

	public void documentsPlus() {
		driver.findElement(documentsPlus).click();
	}

	By downloadsPlus = By
			.xpath("//span[@title='Downloads']/preceding-sibling::span[contains(@class,'rc-tree-switcher')]");

	public void downloadsPlus() {
		driver.findElement(downloadsPlus).click();
	}

	By radioButton = By.xpath("//a[@href='/radio-button']");

	public void radioButton() {
		driver.findElement(radioButton).click();

	}

	By Yes = By.xpath("//input[@id='yesRadio']");

	public void Yes() {
		driver.findElement(Yes).click();
	}

	By webTables = By.xpath("//span[text()='Web Tables']");

	public void webTables() {
		driver.findElement(webTables).click();
	}

	By webTableSearch = By.xpath("//input[@placeholder='Type to search']");

	public void webTableSearch() {
		driver.findElement(webTableSearch).sendKeys("ci");
	}

	By deleteRecord = By.xpath("//span[@id='delete-record-1']");

	public void deleteRecord() {
		driver.findElement(deleteRecord).click();
	}

	By addNewRecord = By.xpath("//button[@id='addNewRecordButton']");

	public void addNewRecord() {
		driver.findElement(addNewRecord).click();
	}

	By webTableAddFirstName = By.xpath("//input[@placeholder='First Name']");

	public void webTableAddFirstName() {
		driver.findElement(webTableAddFirstName).sendKeys("Ashik");
	}

	By webTableAddLastName = By.xpath("//input[@placeholder='Last Name']");

	public void webTableAddLastName() {
		driver.findElement(webTableAddLastName).sendKeys("Muhammed");
	}

	By webTableAddEmail = By.xpath("//input[@placeholder='name@example.com']");

	public void webTableAddEmail() {
		driver.findElement(webTableAddEmail).sendKeys("Ashik@gmail.com");
	}

	By webTableAddAge = By.xpath("//input[@placeholder='Age']");

	public void webTableAddAge() {
		driver.findElement(webTableAddAge).sendKeys("30");
	}

	By webTableAddSalary = By.xpath("//input[@placeholder='Salary']");

	public void webTableAddSalary() {
		driver.findElement(webTableAddSalary).sendKeys("30000");
	}

	By webTableAddDepartment = By.xpath("//input[@placeholder='Department']");

	public void webTableAddDepartment() {
		driver.findElement(webTableAddDepartment).sendKeys("30000");
	}

	By webTableAddSubmit = By.xpath("//button[@type='submit']");

	public void webTableAddSubmit() {
		driver.findElement(webTableAddSubmit).click();
	}

	By buttons = By.xpath("//a[@href='/buttons']");

	public void buttons() {
		driver.findElement(buttons).click();
	}

	By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");

	public void doubleClickButton() {
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(doubleClickButton)).perform();

	}

	By rightClickButton = By.xpath("//button[@id='rightClickBtn']");

	public void rightClickButton() {
		Actions actions = new Actions(driver);

		actions.contextClick(driver.findElement(rightClickButton)).perform();

	}

	By clickButton = By.xpath("//button[text()='Click Me']");

	public void clickButton() {
		driver.findElement(clickButton).click();

	}

	public void scrollDownToLinks() {
		WebElement scrollDownToLinks = driver.findElement(By.xpath("//span[normalize-space()='Links']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", scrollDownToLinks);
	}

	By home = By.xpath("//a[@id='simpleLink']");

	public void home() {
		driver.findElement(home).click();
	}

	By dynamicLink = By.xpath("//a[@id='dynamicLink']");

	public void dynamicLink() {
		driver.findElement(dynamicLink).click();
	}

	By apiCreated = By.xpath("//a[@id='created']");

	public void apiCreated() {
		driver.findElement(apiCreated).click();
	}

	By apiNoContent = By.xpath("//a[@id='no-content']");

	public void apiNoContent() {
		driver.findElement(apiNoContent).click();
	}

	By apimoved = By.xpath("//a[@id='moved']");

	public void apimoved() {
		driver.findElement(apimoved).click();
	}

	By apiBadRequest = By.xpath("//a[@id='bad-request']");

	public void apiBadRequest() {
		driver.findElement(apiBadRequest).click();
	}

	By apiUnauthorized = By.xpath("//a[@id='unauthorized']");

	public void apiUnauthorized() {
		driver.findElement(apiUnauthorized).click();
	}

	public void apiForbidden() {

		WebElement forbidden = driver.findElement(By.xpath("//a[@id='forbidden']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", forbidden);

		js.executeScript("arguments[0].click();", forbidden);
	}

	public void apiInvalidUrl() {

		WebElement apiInvalidUrl = driver.findElement(By.xpath("//a[@id='invalid-url']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", apiInvalidUrl);

		js.executeScript("arguments[0].click();", apiInvalidUrl);
	}

	public void brokenLinksImages() {
		WebElement brokenLinksImages = driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", brokenLinksImages);

		js.executeScript("arguments[0].click();", brokenLinksImages);
	}

	By validLink = By.xpath("//a[text()='Click Here for Valid Link']");

	public void validLink() {
		driver.findElement(validLink).click();
	}

	By brokenLink = By.xpath("//a[text()='Click Here for Broken Link']");

	public void brokenLink() {
		driver.findElement(brokenLink).click();
	}

	public void Upload() {
		WebElement Upload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", Upload);

		js.executeScript("arguments[0].click();", Upload);
	}

	public void download() throws InterruptedException {
		WebElement download = driver.findElement(By.xpath("//a[@id='downloadButton']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", download);
		Thread.sleep(3000);
		download.click();
	}

	By uploadfile = By.xpath("//input[@label='Select a File']");

	public void uploadfile() {

		driver.findElement(uploadfile).sendKeys("C:\\Users\\ASHIK\\OneDrive\\Pictures\\Screenshots");
	}

	public void dynamicProperties() {
		WebElement dynamicProperties = driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", dynamicProperties);

		js.executeScript("arguments[0].click();", dynamicProperties);
	}

	By enableButton = By.id("enableAfter");

	public void clickEnableButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(enableButton)).click();
	}

	By colorChange = By.xpath("//button[@id='colorChange']");

	public void colorChange() {
		driver.findElement(colorChange).click();
	}
	
	By visibleAfter = By.xpath("//button[@id='visibleAfter']");

	public void visibleAfter() {
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(visibleAfter)).click();
	}
	By forms=By.xpath("//div[text()='Forms']");
	public void forms() {
		driver.findElement(forms).click();
	}
	
	By practiceForm=By.xpath("//span[text()='Practice Form']");
	public void practiceForm() {
		driver.findElement(practiceForm).click();
	}

By stfFirstName=By.xpath("//input[@id='firstName']");
public void stfFirstName() {
	driver.findElement(stfFirstName).sendKeys("Babidha");
}
By stfLastName=By.xpath("//input[@id='lastName']");
public void stfLastName() {
	driver.findElement(stfLastName).sendKeys("Karim");
}
By stfemail=By.xpath("//input[@id='userEmail']");
public void stfemail() {
	driver.findElement(stfemail).sendKeys("bab@gmail.com");
}
By stfGender=By.xpath("//label[text()='Female']");
public void stfGender() {
	driver.findElement(stfGender).click();
}
By stfMobile=By.xpath("//input[@id='userNumber']");
public void stfMobile() {
	driver.findElement(stfMobile).sendKeys("9946658897");
}

By stfDob = By.id("dateOfBirthInput");

public void stfDob() {

    driver.findElement(stfDob).click();

    Select month = new Select(
            driver.findElement(By.className("react-datepicker__month-select")));
    month.selectByVisibleText("August");

    Select year = new Select(
            driver.findElement(By.className("react-datepicker__year-select")));
    year.selectByVisibleText("2000");

    driver.findElement(
            By.xpath("//div[contains(@class,'react-datepicker__day') and text()='15']"))
            .click();
}
By stfSubject=By.xpath("//div[@class='subjects-auto-complete__input-container css-19bb58m']");
public void stfSubject() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", stfSubject);
	driver.findElement(stfSubject).sendKeys("Maths");
}
By stfHobbies=By.xpath("//input[@id='hobbies-checkbox-1']");
public void stfHobbies() {
	driver.findElement(stfHobbies).click();
}
By stfPicture=By.xpath("//input[@id='uploadPicture']");
public void stfPicture() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", stfPicture);
	driver.findElement(stfPicture).sendKeys("\"C:\\Users\\ASHIK\\Downloads\\sampleFile (8).jpeg\"");
}
By stfCurrentAddress=By.xpath("//textarea[@id='currentAddress']");
public void stfCurrentAddress() {
	driver.findElement(stfCurrentAddress).sendKeys("nan address");
}
By stfState=By.xpath("//div[text()='Select State']");
public void stfState() {
	driver.findElement(stfState).click();
}
By stfCity=By.xpath("//div[@id='city']");
public void stfCity() {
	driver.findElement(stfCity).click();
}
By stfSubmit=By.xpath("//button[@id='submit']");
public void stfSubmit() {
	driver.findElement(stfSubmit).click();
}
}