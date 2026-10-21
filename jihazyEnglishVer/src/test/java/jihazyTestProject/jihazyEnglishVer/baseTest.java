package jihazyTestProject.jihazyEnglishVer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
	
	protected  WebDriver driver;
	private static String baseUrlEn ="https://jihazy.ps/en";
//	private static String baseUrlAr ="https://jihazy.ps/ar";
	
	@BeforeMethod
	public void setup() {
	    driver = new EdgeDriver(); //use edge browser
	    	
	    driver.manage().window().maximize();
	    driver.get(baseUrlEn);
	    }
		
//		@AfterMethod
	public void tearDown() {
		driver.quit();
		}

}
