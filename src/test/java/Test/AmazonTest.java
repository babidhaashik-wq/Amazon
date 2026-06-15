package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.Login;
import Utilities.BaseURL;

public class AmazonTest {
	@Test
	public static void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		Login page = new Login(driver);

		page.print();
		page.tutorial();
		page.refresh();
		page.selenium();
		page.registration();
		page.firstName();
		page.email();
		page.mobileNumber();
		page.selectCountry();
		page.city();
		page.message();
		page.capcha();
		page.send();
		driver.quit();
	}

	@Test
	public static void demoSite() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		Login page = new Login(driver);
		page.print();
		page.demoSite();
		// page.about();
		page.demoSiteurl();
		page.currentWindow();
		page.textBox();
		page.fullName();
		page.userName();
		page.currentAddress();
		page.permanentAddress();
		// page.textBoxSubmit();
		page.checkBox();
		page.homeCheckBox();
		page.homePlus();
		page.desktopPlus();
		page.documentsPlus();
		page.downloadsPlus();
		page.radioButton();
		page.Yes();
		page.webTables();
		page.webTableSearch();
		page.deleteRecord();
		page.addNewRecord();
		page.webTableAddFirstName();
		page.webTableAddLastName();
		page.webTableAddEmail();
		page.webTableAddAge();
		page.webTableAddSalary();
		page.webTableAddDepartment();
		page.webTableAddSubmit();
		page.buttons();
		page.doubleClickButton();
		page.rightClickButton();
		page.clickButton();
		page.scrollDownToLinks();
		page.home();
		page.currentWindow();
		page.dynamicLink();
		page.currentWindow();
		page.apiCreated();
		page.apiNoContent();
		page.apimoved();
		page.apiBadRequest();
		page.apiUnauthorized();
		page.apiForbidden();
		page.apiInvalidUrl();
		page.brokenLinksImages();
		page.validLink();
		page.navigateBack();
		page.brokenLink();
		page.navigateBack();
		page.Upload();
		page.download();
		page.uploadfile();
		page.dynamicProperties();
		page.clickEnableButton();
		page.colorChange();
		page.visibleAfter();
		driver.quit();
		// page.vijaySharma();
		// driver.close();

	}
	@Test
	public static void forms() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(BaseURL.URL);
		Login page = new Login(driver);
		page.print();
		page.demoSite();
		page.demoSiteurl();
		page.currentWindow();
		page.elements();
		page.forms();
		page.practiceForm();
		page.stfFirstName();
		page.stfLastName();
		page.stfGender();
		page.stfemail();
		page.stfMobile();
		page.stfDob();
		//page.stfSubject();
		page.stfPicture();
		page.stfHobbies();
		page.stfCurrentAddress();
	}
}