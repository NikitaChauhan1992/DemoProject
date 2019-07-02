package com.utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.main.BasePage;


public class TestUtils extends BasePage
{

	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	static Date date = new Date();

	/*Function is used to set the time wait in the while loading a page*/
	public void waitUntilPageLoads() throws IOException, InterruptedException 
	{
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(navigate())
				.withTimeout(300, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);

		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver sharedDriver) {
				return ((JavascriptExecutor) sharedDriver)
						.executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};

		fWait.until(expectation);
	}
	
	/*Action class is used to click on an element*/
	public void actionClick(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	/*Function is used to set then time span */
	public void waitFor(WebElement we) throws IOException, InterruptedException 
	{
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(navigate())
				.withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		fWait.until(ExpectedConditions.elementToBeClickable(we));

	}
	
	/*Function is used to when element is required to be enabled*/
	public boolean isElementEnabled(WebElement we){
		boolean flag = false;
		try{
			if(we.isEnabled()){
				flag=true;
			}
		}catch(Exception e){

		}
		return flag;
	}

	/*Function is used to check element is Displayed  */
	public boolean isElementDisplayed(WebElement we){
		boolean flag = false;
		try{
			if(we.isDisplayed()){
				flag=true;
			}
		}catch(Exception e){

		}
		return flag;
	}

	/*Function is used to check element is present */
	public boolean isObjectPresent(WebElement we, int sec) throws InterruptedException{
		boolean flag = false;
		for(int i=1;i<=sec;i++){
			if(isElementEnabled(we)){
				flag = true;
				break;
			}
			pause(1);

		}
		return flag;
	}

	/*function is use to set a sleep*/
	public void pause(int sec) throws InterruptedException 
	{
		Thread.sleep(sec*1000);
	}

	/*Function is used to scroll down the page for the particular axis*/
	public void scrollDown() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) navigate();
		js.executeScript("javascript:window.scrollBy(250,350)");
	}

	/*function is used to click on element with javascript*/
	public void clickWithJs(By xpath) throws IOException, InterruptedException 
	{
		JavascriptExecutor executor = (JavascriptExecutor) navigate();
		executor.executeScript("arguments[0].click();",
				navigate().findElement(xpath));
	}

	/*Function is used to wait until the element is find*/
	public static void waitTillElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*Function is used to check Text is Present*/
	public static boolean isTextPresent(String text){
		if(driver.getPageSource().contains(text)){
			return true;
		}else {
			return false;
		}
	}

	/*Function is to select an element via text from dropdown */
	public void selectByText(WebElement we, String text) {
		Select select = new Select(we);
		select.selectByVisibleText(text);
	}

	/*Function is to select an element via index from dropdown */
	public void selectByIndex(WebElement we, int i) {
		Select select = new Select(we);
		select.selectByIndex(i);
	}
	
	/*Function is to select an option  from dropdown */
	public String getFirstSelectedOption(WebElement we) {
		Select select = new Select(we);
		return select.getFirstSelectedOption().getText();
	}

	/*Function is to select a move a mouse hover a element*/
	public void mouseHover(WebElement we) throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
	}

	/*Function is to take the screen shot and put it into the screenshot folder*/
	public static void getscreenshot(String method)
	{
		try
		{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File((System.getProperty("user.dir")+ "/screenshots/sc"+method+ dateFormat.format(date) + ".png"));
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*Function to wait for an element in seconds*/
	public static void wait(int sec)
	{
		try
		{
			Thread.sleep(sec*1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*scroll down the screen using javascript executor*/
	public static void scroll(int xAxis)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,"+xAxis+");");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*Hanldes the multiple windows*/
	public static void handles(int i){
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(i));
	}
	
	/*To close the target window*/
	public static void closehandles(int i){
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(i)).close();
	}
	
/*Mouse Hover*/
	public static void mousehandle(WebElement mainmenuID, WebElement subMenuLink){
		Actions a= new Actions(driver);
		a.moveToElement(mainmenuID).build().perform();
		a.moveToElement(subMenuLink).click().build().perform();

	}

}