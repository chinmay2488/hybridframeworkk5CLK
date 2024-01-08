package genericlibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public WebDriver driver;
	public propertyfile pdata=new propertyfile();
public webdriverutilites driverutilites=new webdriverutilites();

	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status=res.getStatus();
		res.getName();
		if(status==2) {
			photo s=new photo();
			s.getphoto(driver, null);
		}
		driver.quit();
	}

}
