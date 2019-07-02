package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class HeritagePage extends BasePage implements HeritagePageConstant  {
	

	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	@FindBy (xpath="//*[@class='pth1--inner-container']/h1")
	public WebElement TitleText;
	
	@FindBy (linkText="At a glance")
	public WebElement glance;
	
	@FindBy (linkText="Purpose")
	public WebElement purpose;
	
	@FindBy (linkText="CEO foreword")
	public WebElement foreword;
	
	@FindBy (linkText="Galderma medical solutions")
	public WebElement medicalSolutions;
	
	@FindBy (linkText="Consumer solutions")
	public WebElement consumerSolutions;
	
	/*Implementing the Header Image*/
	public HeritagePage() throws IOException, InterruptedException 
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
