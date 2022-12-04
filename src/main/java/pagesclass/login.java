package pagesclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseclass;

public class login extends baseclass  {
	
	@FindBy(id = "session_key")
	WebElement email;
	
	@FindBy(id = "session_password")
	WebElement pass;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
	WebElement fpass;
	
	@FindBy(xpath = "//button[contains(text(),'Show')]")
	WebElement show;

	@FindBy(css = "img[data-test-id='hero__illustration']")
	WebElement image;
	
	@FindBy(css = "button[type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//span[contains(text(),'Discover')]")
	WebElement Discover;
	
	@FindBy(xpath = "//span[contains(text(),'Discover')]")
	WebElement Jobs;
	
	@FindBy(css = "div.t-16")
	WebElement name;
	
	public login(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateImage(){
		return image.isDisplayed();
	}
	
	public HomePage signin(String un, String pwd)
	{
		email.sendKeys(un);
		pass.sendKeys(pwd);
		show.click();
		loginbtn.click();
		  return new HomePage();
	}
	public boolean validateJobs(){
		
				    	
		return Jobs.isDisplayed();
	}
	public boolean validateDiscover(){
		
		
		    	
		return Discover.isDisplayed();
	}
	
}


