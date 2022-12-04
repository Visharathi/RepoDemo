import baseclass.baseclass;
import pagesclass.HomePage;
import pagesclass.login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends baseclass {
	login login;
	HomePage homepage;
	public  LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		login = new login();
			
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = login.validateLoginPageTitle();
		Assert.assertEquals(title, "LinkedIn: Log In or Sign Up");
	}
	@Test(priority=2)
	public void loginPageImageTest(){
		Boolean b = login.validateImage();
		Assert.assertTrue(b);
	}
	
	
	@Test(priority=3)
	public void loginPageDiscoverTest(){
		Boolean b = login.validateDiscover();
		Assert.assertTrue(b);
	}
	@Test(priority=4)
	public void loginPageJobsTest(){
		Boolean b = login.validateJobs();
		Assert.assertTrue(b);
	}
	@Test(priority=5)
	public void validateLogin(){
		homepage=login.signin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
