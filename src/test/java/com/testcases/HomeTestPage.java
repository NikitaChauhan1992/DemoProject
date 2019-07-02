package com.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.main.BasePage;
import com.main.PageObjectFactory;
import com.pages.AestheticPage;
import com.pages.AestheticPageConstant;
import com.pages.ContactUsPage;
import com.pages.ContactUsPageConstant;
import com.pages.FindClinicPage;
import com.pages.GalleryPage;
import com.pages.GalleryPageConstant;
import com.pages.EnhancePage;
import com.pages.FacialPage;
import com.pages.FacialPageConstant;
import com.pages.FaqPage;
import com.pages.HeaderPage;
import com.pages.HeaderPageConstant;
import com.pages.HomePage;
import com.pages.HomePageConstant;
import com.pages.TestimonialsPage;
import com.pages.TestimonialsPageConstant;
import com.utils.TestUtils;
import org.openqa.selenium.Keys;

public class HomeTestPage extends BasePage{
	
private static final Logger logger = Logger.getLogger(HeaderTestPage.class.getName());
	
	static TestUtils util = new TestUtils();
	SoftAssert softAssert = new SoftAssert();

	@Test(priority=1,enabled=verifyHeroSlider)
	public static void verifyHeroSlider() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			logger.info("Verify the Hero Slider");
			headerPage.logo.click();
			util.scroll(1000);
			Assert.assertEquals(homePage.heroSliderOne.getText().replaceAll("\"",""), HomePageConstant.heroSliderOne, "After Landing into home page, Verify the Hero Slider 1st slide");
			util.wait(10);
			homePage.previousClick.click();
			Assert.assertEquals(homePage.heroSlidertwo.getText(), HomePageConstant.heroSliderTwo, "After Landing into home page, Verify the Hero Slider 1st slide");
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}
	@Test(priority=3,enabled=verifyCommunity)
	public static void verifyCommunity() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			GalleryPage galleryPage = PageObjectFactory.getGalleryPage();
			AestheticPage  aestheticPage = PageObjectFactory.getAestheticPage();
			TestimonialsPage testimonialsPage = PageObjectFactory.getTestimonialsPage();
			logger.info("Verify the Commnunity Section");
			util.scroll(1500);
			homePage.galleryButton.click();
			Assert.assertEquals(galleryPage.TitleText(), GalleryPageConstant.Title, "After Landing into home page, Verify the Pannel is present");
			util.wait(10);
			headerPage.logo.click();
			util.scroll(2000);
			homePage.ReadButton.click();
			Assert.assertEquals(aestheticPage.TitleText(), AestheticPageConstant.Title, "Matching the Title of the Page.");
			util.wait(10);
			headerPage.logo.click();
			util.scroll(2300);
			homePage.TestimonialsButton.click();
			Assert.assertEquals(testimonialsPage.TitleText(), TestimonialsPageConstant.Title, "Matching the Title of the Page.");
			util.wait(10);
			headerPage.logo.click();
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}
	


}
