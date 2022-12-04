
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.baseclass;
import pagesclass.HomePage;
import pagesclass.Jobs;
import pagesclass.Network;
import pagesclass.login;

public class HomePageTest extends baseclass {
	login login;
	HomePage homepage;
	Jobs jobs;
	Network network;
	public  HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		login = new login();
		homepage=login.signin(prop.getProperty("username"), prop.getProperty("password"));
			
	}
	
	@Test(priority=1)
	public void HomePageTitleTest(){
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "(1) Feed | LinkedIn");
	}
	@Test(priority=2)
	public void UsernameTest() {
		String username = homepage.validateUsername();
		Assert.assertEquals(username, "Visarathi Prakash Vel");
		
	}
	@Test(priority=3)
	public void validateJobs(){
		jobs=homepage.clickJobs();
		
	}
	@Test(priority=4)
	public void validateNetwork(){
		network=homepage.clickNetwork();
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
