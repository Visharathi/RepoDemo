import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.baseclass;
import pagesclass.HomePage;
import pagesclass.Jobs;
import pagesclass.Network;
import pagesclass.login;

public class JobsTest extends baseclass {
	login login;
	HomePage homepage;
	Jobs jobs;
	Network network;
	public  JobsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		login = new login();
		homepage=login.signin(prop.getProperty("username"), prop.getProperty("password"));
		jobs=homepage.clickJobs();
			
	}
	
	@Test(priority=1)
	public void HomePageTitleTest(){
		String title = jobs.validateJobsPageTitle();
		Assert.assertEquals(title, "(1) LinkedIn");
	}
	@Test(priority=2)
	public void JobsPageTest() {
		String jobspagename = jobs.validateJobPage(); 
		Assert.assertEquals(jobspagename, "Job seeker guidance");
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
