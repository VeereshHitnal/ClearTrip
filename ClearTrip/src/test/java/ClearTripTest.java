import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cleartrip.genericutilities.BaseClass;
import cleartrip.genericutilities.WebDriverUtilities;
import cleartrip.objectrepo.FlightsDetailsPage;
import cleartrip.objectrepo.ReviewIteneraryPage;
import cleartrip.objectrepo.SearchFlightsPage;

public class ClearTripTest extends BaseClass{
	
	@Test
	public void bookTickettest() throws Throwable {

		WebDriverUtilities wu=new WebDriverUtilities();

		SearchFlightsPage sfp=new SearchFlightsPage(driver);
		
		driver.get("https://www.cleartrip.com/flights");
	
		sfp.getRoundTripRadioBtn().click();
		sfp.getFromTextField().sendKeys("Mumbai");
		sfp.getMumbaiAutoSuggestion().click();
		
		
		sfp.getToTextField().sendKeys("Delhi");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sfp.getDelhiAutoSuggestion());
		
		sfp.getDepartOnBtn().click();
		sfp.selectDate("September", 29);
		sfp.selectDate("October", 2);
		
		wu.select(sfp.getAdultsListBox(), "2");	
		wu.select(sfp.getChildrenListBox(), "1");
		
		sfp.getSearchFlightsBtn().click();
		
		FlightsDetailsPage fdp=new FlightsDetailsPage(driver);
		fdp.getBookBtn().click();
		wu.switchToWindow(driver, "Site for Booking Flights");
		Thread.sleep(2000);
		
		ReviewIteneraryPage rp=new ReviewIteneraryPage(driver);
		jse.executeScript("arguments[0].click();", rp.getStandardFare());
		
//		String fare1=rp.getStandardFare().getText();
//		String farePrice=fare1.substring(1, 2)+fare1.substring(4);
//		jse.executeScript("arguments[0].click();", rp.getAddInsuranceBtn());
//		String fare2=rp.getStandardFare().getText().substring(1);
//		String farePrice2=fare2.substring(1, 2)+fare2.substring(4);
//		
//		Assert.assertTrue((Integer.parseInt(farePrice)<Integer.parseInt(farePrice2)));
		
		jse.executeScript("arguments[0].click();", rp.getContinueBtn());
	
	}

}
