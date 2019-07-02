package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class CookiesPage extends BasePage implements CookiesPageConstant{
	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	@FindBy (xpath="//*[@class='pth1--inner-container']/h1")
	public WebElement TitleText;
	
	@FindBy (linkText="Innovation for skin health")
	public WebElement innovation;
	
	@FindBy (linkText="Science and technology")
	public WebElement technology;
	
	@FindBy (linkText="Research collaborations")
	public WebElement research;
	
	@FindBy (linkText="Partnering")
	public WebElement partnering;
	
	@FindBy (linkText="Manufacturing")
	public WebElement manufacturing;
	
	@FindBy (linkText="SHIELD")
	public WebElement shield;
	
	/*Implementing the Header Image*/
	public CookiesPage() throws IOException, InterruptedException 
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
