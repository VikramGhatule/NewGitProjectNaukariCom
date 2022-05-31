package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority=0)
	public void LoginWithCorrectCredintionals() throws InterruptedException
	{
		login.LoginApp("vikram.ghatule2707@gmail.com","Vikram2665@#");
	}
	
	@Test(priority=1)
	public void FileUploadOnNaukari() throws IOException, InterruptedException
	{
		FileUpload.Upload_PDF_File();
	}
	
	@Test(priority=2)
	public void LogoutNaukriProfile() throws InterruptedException
	{
		log_out.NaukriLogOut();
	}
	
	

}
