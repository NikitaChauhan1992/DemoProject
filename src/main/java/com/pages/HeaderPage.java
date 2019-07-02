package com.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;


public class HeaderPage extends BasePage implements HeaderPageConstant  {

	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	

	@FindBy (xpath="//*[@id='navbar']/div/div[4]/a/img[1]")
	public WebElement logo;

	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[1]/a")
	public WebElement ContactUs;

	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[2]/a")
	public WebElement Press;
	
	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[3]/a")
	public WebElement Clinic;
	
	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[4]/a")
	public WebElement faqFooter;
	
	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[5]/a")
	public WebElement legal;
	
	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[6]/a")
	public WebElement policyFooter;
	
	@FindBy (xpath="//*[@id='block-resty-footer']/ul/li[7]/a")
	public WebElement cookiesFooter;
	
	@FindBy (xpath="//*[@id='block-cp-info-menu']/ul/li[2]")
	public WebElement WhereToBuy;

	@FindBy (xpath="//*[@id='block-cp-info-menu']/ul/li[3]")
	public WebElement FAQ;

	@FindBy (xpath="//*[@id='block-cp-info-menu']/ul/li[4]")
	public WebElement login;

	@FindBy (xpath="//*[@id='edit-keys']")
	public WebElement Search;
	
	@FindBy (xpath="//*[@id='search-form']/div/div/div/input")
	public WebElement resultform;
	
	@FindBy (xpath="/html/body/div/div/section/div/ol/li[1]/h2/a")
	public WebElement result;

	@FindBy (xpath="//*[@id='block-galderma-theme-topmenu']/ul")
	public WebElement upperHeader;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[1]")
	public  WebElement Restylane;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[2]")
	public  WebElement yourClinic;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[3]")
	public  WebElement yourRestylane;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[4]")
	public  WebElement beforeAfter;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[5]")
	public  WebElement Faq;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/')]")
	public WebElement mainLogo;

	@FindBy (xpath="//*[@id='main-menu']/li")
	public  List<WebElement> MainMenu;
	
	@FindBy(linkText="Restylane")
	public  WebElement Restylane1;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[1]/ul/li[2]/a")
	public WebElement heritage;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[1]/ul/li[3]/a")
	public WebElement safety;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[1]/ul/li[4]/a")
	public WebElement science;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[2]/ul/li[2]/a")
	public WebElement aesthetic;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[2]/ul/li[3]/a")
	public WebElement beforeTreatment;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[2]/ul/li[4]/a")
	public WebElement afterTreatment;

	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[2]/ul/li[5]/a")
	public WebElement clinic;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[3]/ul/li[2]/a")
	public WebElement enhance;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[3]/ul/li[3]/a")
	public WebElement refresh;
	
	@FindBy (xpath="//*[@id='block-resty-main-menu']/div/ul/li[4]/ul/li[2]/a")
	public WebElement testimonials;
	
	/*Implementing the Header Image*/
	public HeaderPage() throws IOException, InterruptedException 
	{
		PageFactory.initElements(navigate(), this);
	}

	/*Calling the function to open the URL*/
	public void getPageOpened() throws IOException, InterruptedException 
	{
		BasePage.openURL();
	}

	/*Click the logo of the site on header area*/
	public void clickLogo() throws IOException{
		logo.click();
	}

	/*Get the Logo url*/
	public String getLogoUrl() throws IOException{
		String logoURL = logo.getAttribute("href");
		return logoURL;
	}

	/*Click on the content and lands to particular page*/
	public void getPage(int i){
		List<WebElement> links = upperHeader.findElements(By.tagName("li"));
		links.get(i).click();
		
	}
	
	/*Click on the navigation */
	public static WebElement getNavigation(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@id='main-menu']")).findElements(By.tagName("li"));
		return links.get(i);
	}
	
	/*Click on the global header */
	public static void getHeaderPage(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@id='main-menu']")).findElements(By.tagName("li"));
		//List<WebElement> links = globalHeader1.findElements(By.tagName("li"));
		System.out.println(links.get(i).getText());
		links.get(i).click();
	}
	
	




}
