package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class SocietyPage extends BasePage implements SocietyPageConstant{
	
	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	@FindBy (xpath="//*[@class='contentWrapper']/h1")
	public WebElement TitleText;
	
	@FindBy (linkText="Ethics and values")
	public WebElement EthicsValues;
	
	@FindBy (linkText="Support to the dermatology community")
	public WebElement dermatology;
	
	@FindBy (linkText="SKINPACT Awards")
	public WebElement skinpact;
	
	@FindBy (linkText="Funding requests")
	public WebElement funding;
	
	@FindBy (linkText="Sustainable development")
	public WebElement sustainable;	
	
	@FindBy (linkText="Transparency reports")
	public WebElement transparency;	
	
	/*Implementing the Header Image*/
	public SocietyPage() throws IOException, InterruptedException 
	{
		PageFactory.initElements(navigate(), this);
	}

	/*Calling the function to open the URL*/
	public void getPageOpened() throws IOException, InterruptedException 
	{
		BasePage.openURL();
	}
	/*Extracting the text of title*/
	public String TitleText() {
		String Result = TitleText.getText();
		return Result;
	}
}
