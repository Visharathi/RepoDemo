package pagesclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseclass;

public class HomePage extends baseclass  {
	
	@FindBy(css = "div.t-16")
	WebElement username;
	
	@FindBy(css="span[title='Jobs']")
	WebElement Jobslabel;
	
	@FindBy(css="span[title='My Network']")
	WebElement Network;
	

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	public String validateUsername(){
		String username1 = username.getText();
		return username1;
	}
	
	
	public Jobs clickJobs()
	{
		Jobslabel.click();
		  return new Jobs();
		  
	}
	public Network clickNetwork()
	{
		Network.click();
		  return new Network();
	}
}
