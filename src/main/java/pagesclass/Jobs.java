package pagesclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclass.baseclass;

public class Jobs extends baseclass {
	@FindBy(css = "h2[class='t-black ph1 t-bold t-16']")
	WebElement jobslabel;
	
	
		public Jobs(){
		PageFactory.initElements(driver, this);
	}
	public String validateJobsPageTitle(){
		return driver.getTitle();
	}
	
	public String validateJobPage()
	{
		String jobsname = jobslabel.getText();
		return jobsname;
		  
	}
	public void ssamplefuntion()
	{
		int sample;
		  
	}
	

}
