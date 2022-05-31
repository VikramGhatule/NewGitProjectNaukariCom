package testpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseClass {
	
	@FindBy(id="login_Layer")	
	WebElement LoginClick;
	
	@FindBy(xpath="//div[@class='login-layer']//input[@placeholder='Enter your active Email ID / Username']")
	WebElement Username;
	
	@FindBy(xpath="//div[@class='login-layer']//input[@placeholder='Enter your password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void LoginApp(String id,String pass) throws InterruptedException
	{
		waitTime(LoginClick,20);
		LoginClick.click();
		waitTime(Username,10);
		Username.sendKeys(id);
		Password.sendKeys(pass);
		Submit.click();
		
	}
	
	
	
	
}
