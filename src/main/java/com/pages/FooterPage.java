package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class FooterPage extends BasePage implements FooterPageConstant{
	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/

	@FindBy (xpath="//*[@class='contentWrapper']/h1")
	public WebElement TitleText;
	
	@FindBy (xpath="/html/body/div/footer/div/div[1]/div[1]/div[1]/a")
	public WebElement galdermaLogo;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[1]/a")
	public WebElement aboutUs;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[2]/a")
	public WebElement yourSkin;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[3]/a")
	public WebElement stories;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[4]/a")
	public WebElement innovation;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[5]/a")
	public WebElement brands;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[6]/a")
	public WebElement society;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[7]/a")
	public WebElement media;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu1']/ul/li[8]/a")
	public WebElement career;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu2']/ul/li[1]/a")
	public WebElement privacy;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu2']/ul/li[2]/a")
	public WebElement termsUse;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu2']/ul/li[3]/a")
	public WebElement sitemap;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu2']/ul/li[4]/a")
	public WebElement contactUs;
	
	@FindBy (xpath="//*[@id='block-galderma-theme-footermenu2']/ul/li[5]/a")
	public WebElement nestleGlobal;
	
	/*Implementing the Header Image*/
	public FooterPage() throws IOException, InterruptedException 
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
