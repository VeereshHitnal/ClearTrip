package cleartrip.genericutilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

public	WebDriver driver;

@BeforeClass
public void configBC() {
	System.out.println("=========Launch the browser=====");
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/executables/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

//@AfterClass()
public void configAC() {
	driver.quit();
}

}
