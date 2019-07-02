package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class ContactUsPage extends BasePage implements ContactUsPageConstant {
	
	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/

	@FindBy (xpath="//*[@class='contentWrapper']/h1")
	public WebElement TitleText;
	
	/*Implementing the Header Image*/
	public ContactUsPage() throws IOException, InterruptedException 
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
