package cleartrip.genericutilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtilities {
	
	/**
	 * This method is used to select a list box option by its visible text
	 * @param element
	 * @param option
	 */
	public void select(WebElement element, String option) {
		Select select= new Select(element);
		select.selectByVisibleText(option);
	}
	
	/**
	 * Method to switch window
	 * @param driver
	 * @param partialWinTitle
	 */

	public void switchToWindow(WebDriver driver, String partialWinTitle) {
		Set<String> windowIds = driver.getWindowHandles();
		for(String wid: windowIds) {
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(partialWinTitle)) {
				break;
			}
		}
	}
	
	
}
