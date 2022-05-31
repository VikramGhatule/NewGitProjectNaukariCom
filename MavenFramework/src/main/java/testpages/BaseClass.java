package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public WebDriver driver;
	protected ChromeOptions option;
	protected LoginPage login;
	protected FileUploadOnWebPage FileUpload;
	protected LogOut log_out;
	
	public void waitTime(WebElement locator, int delay)
	{
		WebDriverWait wait= new WebDriverWait(driver,delay);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public void ActionMovement(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
	}

}
