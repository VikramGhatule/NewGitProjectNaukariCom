package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends BaseClass {
	
	@FindBy(xpath="//div[text()='My Naukri']//parent::a//div[text()='My Naukri']")
	WebElement NaukriLogout;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Naukri_Logout_click;
	
	
	public LogOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void NaukriLogOut() throws InterruptedException
	{
		waitTime(NaukriLogout,20);
		ActionMovement(NaukriLogout);
		waitTime(Naukri_Logout_click,10);
		Naukri_Logout_click.click();
		Thread.sleep(3000);
	}

}
