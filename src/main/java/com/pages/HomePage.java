package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class HomePage extends BasePage implements HomePageConstant {

	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	
	@FindBy (xpath="//*[@aria-describedby='slick-slide00']/p")
	public WebElement heroSliderOne;
	
	@FindBy (xpath="//*[@aria-describedby='slick-slide01']/p")
	public WebElement heroSlidertwo;
	
	@FindBy(xpath="//*[@class='prev-arrow slick-arrow']")
	public  WebElement previousClick;
	
	@FindBy(linkText="Gallery")
	public  WebElement galleryButton;
	
	@FindBy(linkText="Read more")
	public  WebElement ReadButton;
	
	@FindBy(linkText="Testimonials")
	public  WebElement TestimonialsButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div/section/div/article/div/div/div[4]/div/h2/span")
	public  WebElement galerma;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/ethics-and-values')]")
	public WebElement ethics1;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/support-dermatology-community')]")
	public WebElement dermatology1;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/skinpact-awards')]")
	public WebElement skinpact1;
	
	@FindBy(linkText="Ethics & values")
	public  WebElement ethics;
	
	@FindBy(linkText="Global education initiatives")
	public  WebElement dermatology;
	
	@FindBy(linkText="SKINPACT Awards")
	public  WebElement skinpact;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/your-skin')]")
	public  WebElement readmoreSkin;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/stories')]")
	public  WebElement readmoreStories;
	
	
	
	
	/*Implementing the Header Image*/
	public HomePage() throws IOException, InterruptedException 
	{
		PageFactory.initElements(navigate(), this);
	}

	/*Calling the function to open the URL*/
	public void getPageOpened() throws IOException, InterruptedException 
	{
		BasePage.openURL();
	}

	/*Get the latest news Home Page*/
	public static WebElement getLatestNews(int i){
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='views-field views-field-title']//*[@class='field-content']/a"));
		return links.get(i);
	}
	/*Get the latest news on Article Page*/
	public static String getArticlePage(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@class='views-field views-field-title']//*[@class='field-content']")).findElements(By.tagName("a"));
		return links.get(i).getText();
	}
	
}
