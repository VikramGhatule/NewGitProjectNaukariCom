package testpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FileUploadOnWebPage extends BaseClass {
	
	@FindBy(xpath="//div[text()='My Naukri']//parent::a//div[text()='My Naukri']")
	WebElement MyNaukari;
	
	@FindBy(xpath="//a[@title='Edit Profile']//parent::li//a")
	WebElement EditProfile;
	
	@FindBy(xpath="//div[@class='uploadBtn']")
	WebElement UploadButton;
	
	
	public FileUploadOnWebPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Upload_PDF_File() throws IOException, InterruptedException
	{
		//String wid= driver.getWindowHandle();
		waitTime(MyNaukari,20);
		Actions act = new Actions(driver);
		act.moveToElement(MyNaukari).build().perform();
		waitTime(EditProfile,15);
		EditProfile.click();
		waitTime(UploadButton,15);
		UploadButton.click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("C://autoit//fileupload.exe"+" "+"C:\\Users\\Admin\\Desktop\\Vikram_CV.pdf");
		Thread.sleep(5000);
	//	driver.switchTo().window(wid);
	}

}
