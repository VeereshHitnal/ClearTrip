package cleartrip.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsDetailsPage {

	
	WebDriver driver;
	public FlightsDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Book']")
	private WebElement bookBtn;
	
	public WebElement getBookBtn() {
		return bookBtn;
	}
}
