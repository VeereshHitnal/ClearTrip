package cleartrip.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightsPage {
	WebDriver driver;
	public SearchFlightsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
 @FindBy(xpath="//p[text()='Round trip']/parent::div/preceding-sibling::div/span")
 private WebElement roundTripRadioBtn;
 
 @FindBy(xpath="//h4[text()='From']/parent::div//input[contains(@placeholder,'Any worldwide')]")
 private WebElement fromTextField;
 
 @FindBy(xpath="//h4[text()='To']/parent::div//input[contains(@placeholder,'Any worldwide')]")
 private WebElement toTextField;
 
 @FindBy(xpath="//h4[text()='Depart on']/../../following-sibling::div//button")
 private WebElement departOnBtn;
 
 @FindBy(xpath="(//h4[text()='Return on']/../../following-sibling::div//button)[2]")
 private WebElement returnBtn;
 
 @FindBy(xpath="//h4[text()='Adults']/parent::div/child::select")
 private WebElement adultsListBox;
 
 @FindBy(xpath="//h4[text()='Children']/parent::div/child::select")
 private WebElement childrenListBox;
 
 @FindBy(xpath="//button[text()='Search flights']")
 private WebElement searchFlightsBtn;
 
 
 @FindBy(xpath="//div[@class='closeit']")
 private WebElement deleteCookies;
 
 public WebElement getDelhiAutoSuggestion() {
	return delhiAutoSuggestion;
}


@FindBy(xpath="//div[text()='Suggestions']/..//li/p[contains(text(),'Mumbai, IN')]")
 private WebElement MumbaiAutoSuggestion;
 
@FindBy(xpath="//div[text()='Suggestions']/..//li/p[contains(text(),'Delhi')]")
private WebElement delhiAutoSuggestion;


public WebElement getMumbaiAutoSuggestion() {
	return MumbaiAutoSuggestion;
}

public WebElement getDeleteCookies() {
	return deleteCookies;
}

public WebElement getRoundTripRadioBtn() {
	return roundTripRadioBtn;
}

public WebElement getFromTextField() {
	return fromTextField;
}

public WebElement getToTextField() {
	return toTextField;
}

public WebElement getDepartOnBtn() {
	return departOnBtn;
}

public WebElement getReturnBtn() {
	return returnBtn;
}

public WebElement getAdultsListBox() {
	return adultsListBox;
}

public WebElement getChildrenListBox() {
	return childrenListBox;
}

public WebElement getSearchFlightsBtn() {
	return searchFlightsBtn;
}

public void selectDate(String month, int date) {
	WebElement datePicker=driver.findElement(By.xpath("//div[text()='"+month+" 2021']/ancestor::div[@class='DayPicker-Month']//div[text()='"+date+"']"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", datePicker);
	
}

}
