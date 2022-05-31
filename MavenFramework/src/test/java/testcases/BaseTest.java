package testcases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpages.BaseClass;
import testpages.FileUploadOnWebPage;
import testpages.LogOut;
import testpages.LoginPage;

public class BaseTest extends BaseClass {
	
	
	@BeforeSuite
	public void BrowserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		option = new ChromeOptions();
		option.addArguments("start-maximized");
		driver = new ChromeDriver(option);
		driver.get("https://www.naukri.com/");
	}
	
	@BeforeClass
	public void allPageObject() throws InterruptedException
	{
	     login= new LoginPage(driver);
	
	     FileUpload = new FileUploadOnWebPage(driver);
	     
	     log_out = new LogOut(driver);
	}
	@AfterSuite
	public void browserClose()
	{
		driver.quit();
	}
	
	


}
