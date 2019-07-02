package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class BasePage implements BasePageConstant {
	
	public static Properties CONFIG;
	protected static WebDriver driver = null;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest testInfo;

	/*Function is made to read the CONFIG file */
	public static Properties initialize() {
		CONFIG = new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/config/config.properties");
			CONFIG.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CONFIG;
	}

	/*Function is to select the browser from the folder*/
	@BeforeSuite
	public static WebDriver navigate() throws IOException, InterruptedException {
		if (driver == null) {
			if (initialize().getProperty("testBrowser").equalsIgnoreCase("Firefox")
					&& initialize().getProperty("OS").equalsIgnoreCase("Mac")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/browsers/geckodriver");
				driver = new FirefoxDriver();
			}else if (initialize().getProperty("testBrowser").equalsIgnoreCase("Chrome") && initialize().getProperty("OS").equalsIgnoreCase("Mac")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browsers/chromedriver6");
				driver = new ChromeDriver();
			}else if (initialize().getProperty("testBrowser").equalsIgnoreCase("Firefox")
					&& initialize().getProperty("OS").equalsIgnoreCase("Windows")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/browsers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if (initialize().getProperty("testBrowser").equalsIgnoreCase("Chrome") && initialize().getProperty("OS").equalsIgnoreCase("Windows")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browsers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/AutomationReports.html");
			htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir"))+"/extent-config.xml");
			reports = new ExtentReports();
			reports.attachReporter(htmlReporter);
			reports.setSystemInfo("Host Name", "Nestle Skin Health");
			reports.setSystemInfo("Environment", "END To END Testing");
			reports.setSystemInfo("User Name", "Nikita Chauhan");
			htmlReporter.config().setChartVisibilityOnOpen(true);
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Advance Report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.DARK);
			openURL();

		}
		return driver;
	}

	/*Function is to launch the URL*/
	public static void openURL() throws IOException, InterruptedException
	{
		driver.get(URL);
	}

//	/*Generating the Extended Reports with screenshot & error message*/
//	@BeforeMethod
//	public void startreport() throws IOException, InterruptedException{
//		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/AutomationReports.html");
//		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir"))+"/extent-config.xml");
//		reports = new ExtentReports();
//		reports.attachReporter(htmlReporter);
//		reports.setSystemInfo("Host Name", "Nestle Skin Health");
//		reports.setSystemInfo("Environment", "END To END Testing");
//		reports.setSystemInfo("User Name", "Nikita Chauhan");
//		htmlReporter.config().setChartVisibilityOnOpen(true);
//		htmlReporter.config().setDocumentTitle("Automation Report");
//		htmlReporter.config().setReportName("Advance Report");
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//		htmlReporter.config().setTheme(Theme.DARK);
//		openURL();
//	}

	/*Generating the PASS/FAIL/SKIP Results */
	@AfterMethod
	public void captureStatus(ITestResult result) throws Exception{
		if(result.getStatus()== ITestResult.SUCCESS){
			testInfo.log(Status.PASS,"Method Name :" +result.getName()+":is passes");
		}
		else if(result.getStatus()== ITestResult.FAILURE){
			testInfo.log(Status.FAIL,"Method Name :" +result.getName()+":is fail");
			testInfo.log(Status.FAIL, "Test Case Failed is "+result.getName());
			testInfo.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			String screenshotPath = BasePage.getScreenShot(driver, "screenShotName");
			testInfo.fail("Failed ScreenShot " + testInfo.addScreenCaptureFromPath(screenshotPath));
		}
		if(result.getStatus()== ITestResult.SKIP){
			testInfo.log(Status.SKIP,"Method Name :" +result.getName()+":is skipped");
		}
	}

	/*Function is to take the screenshot of failed result with  time*/
	public static String getScreenShot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/failedtestScreenshots/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}


	/*Closing the Browser & Reports*/
	@AfterSuite
	public void tearDown() throws IOException, InterruptedException
	{
		reports.flush();
		navigate().close();
		navigate().quit();
	}

}
