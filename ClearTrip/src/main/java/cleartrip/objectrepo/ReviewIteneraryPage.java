package cleartrip.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewIteneraryPage {
	WebDriver driver;
	public ReviewIteneraryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h3[text()='Standard fare']")
	private WebElement standardFare;
	
	public WebElement getStandardFare() {
		return standardFare;
	}
	
	@FindBy(xpath="//h3[contains(text(), 'travel insurance')]/parent::div/following-sibling::div//button[text()='Add']")
	private WebElement addInsuranceBtn;
	public WebElement getAddInsuranceBtn() {
		return addInsuranceBtn;
	}

	@FindBy(xpath="//p[text()='Total price']/following-sibling::p")
	private WebElement totalFare;
	
	public WebElement getTotalFare() {
		return totalFare;
	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}


	@FindBy(xpath="//button[text()='Continue']/..")
	private WebElement continueBtn;
	
	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getSaveAndExitBtn() {
		return saveAndExitBtn;
	}


	@FindBy(xpath="//*[@data-testid='incrementVeg Diabetic Meal']")
	private WebElement addMeals;
	
	public WebElement getAddMeals() {
		return addMeals;
	}
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement doneButton;
	
	@FindBy(xpath="//span[text()='Save and Exit']")
	private WebElement saveAndExitBtn;
	
	@FindBy(xpath="//*[@data-testid='increment5 KG']")
	private WebElement increment5kgBtn;
	
	public WebElement getIncrement5kgBtn() {
		return increment5kgBtn;
	}
	
	@FindBy(xpath="//input[@data-testid='mobileNumber']")
	private WebElement enterMobileNumber;
	
	@FindBy(xpath="//input[@data-testid='email']")
	private WebElement enterEmail;
	
	@FindBy(xpath="//h4[text()='Adult 1']/following-sibling::div[@class='row']//input[@placeholder='First name']")
	private WebElement firstNameOfTraveller1;
	
	
	@FindBy(xpath="//h4[text()='Adult 1']/following-sibling::div[@class='row']//input[@placeholder='Last name']")
	private WebElement lastNameOfTraveller1;
	
	@FindBy(xpath="//h4[text()='Adult 1']/following-sibling::div[@class='row']//div[@class='col-4']//button[text()='Gender']")
	private WebElement firstTravellerGender;
	
	@FindBy(xpath="//h4[text()='Adult 2']/following-sibling::div[@class='row']//input[@placeholder='First name']")
	private WebElement firstNameOfTraveller2;
	
	
	@FindBy(xpath="//h4[text()='Adult 2']/following-sibling::div[@class='row']//input[@placeholder='Last name']")
	private WebElement lastNameOfTraveller2;
	
	@FindBy(xpath="//h4[text()='Adult 2']/following-sibling::div[@class='row']//div[@class='col-4']//button[text()='Gender']")
	private WebElement secondTravellerGender;
	
	@FindBy(xpath="//h4[text()='Child 1']/following-sibling::div[@class='row']//input[@placeholder='First name']")
	private WebElement firstNameOfChild;
	
	
	@FindBy(xpath="//h4[text()='Child 1']/following-sibling::div[@class='row']//input[@placeholder='Last name']")
	private WebElement lastNameOfChild;
	
	@FindBy(xpath="//h4[text()='Child 1']/following-sibling::div[@class='row']//div[@class='col-4']//button")
	private WebElement childGender;
	
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	private WebElement continueToPaymentBtn;
	public WebElement getEnterMobileNumber() {
		return enterMobileNumber;
	}

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getFirstNameOfTraveller1() {
		return firstNameOfTraveller1;
	}

	public WebElement getLastNameOfTraveller1() {
		return lastNameOfTraveller1;
	}

	public WebElement getFirstTravellerGender() {
		return firstTravellerGender;
	}

	public WebElement getFirstNameOfTraveller2() {
		return firstNameOfTraveller2;
	}

	public WebElement getLastNameOfTraveller2() {
		return lastNameOfTraveller2;
	}

	public WebElement getSecondTravellerGender() {
		return secondTravellerGender;
	}

	public WebElement getFirstNameOfChild() {
		return firstNameOfChild;
	}

	public WebElement getLastNameOfChild() {
		return lastNameOfChild;
	}

	public WebElement getChildGender() {
		return childGender;
	}

	public WebElement getContinueToPaymentBtn() {
		return continueToPaymentBtn;
	}
	
	@FindBy(xpath="(//label[text()='Date of birth']/following-sibling::div//select)[1]")
	private WebElement dateOfBirthOfChild;
	
	@FindBy(xpath="(//label[text()='Date of birth']/following-sibling::div//select)[2]")
	private WebElement monthOfBirthOfChild;
	
	@FindBy(xpath="(//label[text()='Date of birth']/following-sibling::div//select)[3]")
	private WebElement yearOfBirthOfChild;
}
