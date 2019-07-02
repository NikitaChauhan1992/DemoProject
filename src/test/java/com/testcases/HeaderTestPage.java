package com.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.rmi.CORBA.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.main.BasePage;
import com.main.PageObjectFactory;
import com.pages.AboutRestalaneConstant;
import com.pages.AboutRestalanePage;
import com.pages.AestheticPage;
import com.pages.AestheticPageConstant;
import com.pages.HeritagePage;
import com.pages.HeritagePageConstant;
import com.pages.SafetyPage;
import com.pages.SafetyPageConstant;
import com.pages.SciencePageConstant;
import com.pages.SciencePage;
import com.pages.FacialPage;
import com.pages.FacialPageConstant;
import com.pages.BeforeYourTreatmentPage;
import com.pages.BeforeYourTreatmentPageConstant;
import com.pages.AfterYourTreatmentPage;
import com.pages.AfterYourTreatmentPageConstant;
import com.pages.ContactUsPage;
import com.pages.ContactUsPageConstant;
import com.pages.FindClinicPage;
import com.pages.FindClinicPageConstant;
import com.pages.RestorePage;
import com.pages.RestorePageConstant;
import com.pages.EnhancePage;
import com.pages.EnhancePageConstant;
import com.pages.RefreshPage;
import com.pages.RefreshPageConstant;
import com.pages.GalleryPage;
import com.pages.GalleryPageConstant;
import com.pages.TestimonialsPage;
import com.pages.TestimonialsPageConstant;
import com.pages.FaqPage;
import com.pages.FaqPageConstant;
import com.pages.PressPage;
import com.pages.LegalPage;
import com.pages.HeaderPage;
import com.pages.HeaderPageConstant;
import com.pages.CookiesPage;
import com.pages.CookiesPageConstant;
import com.pages.PrivatePolicyPage;

import com.pages.SocietyPage;
import com.pages.SocietyPageConstant;

import com.utils.TestUtils;



public class HeaderTestPage extends BasePage{
	
	private static final Logger logger = Logger.getLogger(HeaderTestPage.class.getName());

	private static final WebElement HERITAGE = null;
	
	static TestUtils util = new TestUtils();
	static SoftAssert softAssert = new SoftAssert();
	static String URLConstant = "https://stage.master3.galderma.com/template-restylane/en";
	

	@Test(priority=1,enabled=verifyUpperheaderPage)
	public static void verifyUpperheaderPage() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			headerPage.logo.click();
			headerPage.Search.click();
			headerPage.Search.sendKeys("testimonials"+Keys.ENTER);
			util.wait(5);
			Assert.assertEquals(headerPage.resultform.getAttribute("value"), headerPage.result.getText().toLowerCase(), "Matching the Title of the Page.");
			util.wait(10);
			
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Test(priority=2,enabled=verifyGlobalheaderPage)
	public static void verifyGlobalheaderPage() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			AboutRestalanePage aboutRestalane = PageObjectFactory.getAboutRestalanePage();
			FaqPage  faqPage = PageObjectFactory.getFaqPage();
			GalleryPage galleryPage = PageObjectFactory.getGalleryPage();
			RestorePage restorePage = PageObjectFactory.getRestorePage();
			FacialPage  facialPage =PageObjectFactory.getFacialPage();
			logger.info("Verify the header");
			headerPage.logo.click();
			headerPage.Restylane.click();
			Assert.assertEquals(aboutRestalane.TitleText(), AboutRestalaneConstant.Title, "Matching the Title of the Page.");
			headerPage.yourClinic.click();
			Assert.assertEquals(facialPage.TitleText(), FacialPageConstant.Title, "Matching the Title of the Page.");
			headerPage.yourRestylane.click();
			Assert.assertEquals(restorePage.TitleText(), RestorePageConstant.Title, "Matching the Title of the Page.");
			headerPage.beforeAfter.click();
			Assert.assertEquals(galleryPage.TitleText(), GalleryPageConstant.Title, "Matching the Title of the Page.");
			headerPage.Faq.click();
			Assert.assertEquals(faqPage.TitleText(), FaqPageConstant.Title, "Matching the Title of the Page.");
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	
	@Test(priority=3,enabled=verifySubheaderAboutUsPage)
	public static void verifySubheaderAboutUsPage() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			AestheticPage  aestheticPage = PageObjectFactory.getAestheticPage();
			AfterYourTreatmentPage  afterYourTreatmentPage = PageObjectFactory.getAfterYourTreatmentPage();
			BeforeYourTreatmentPage  beforeYourTreatmentPage = PageObjectFactory.getBeforeYourTreatmentPage();
			EnhancePage  enhancePage = PageObjectFactory.getEnhancePage();
			FindClinicPage  findClinicPage = PageObjectFactory.getFindClinicPage();
			SafetyPage safetyPage = PageObjectFactory.getSafetyPage();
			HeritagePage heritagePage = PageObjectFactory.getHeritagePage();
			RefreshPage refreshPage = PageObjectFactory.getRefreshPage();
			TestimonialsPage testimonialsPage = PageObjectFactory.getTestimonialsPage();
			SciencePage sciencePage = PageObjectFactory.getSciencePage();
			headerPage.logo.click();
			util.mousehandle(headerPage.Restylane,headerPage.heritage);
			Assert.assertEquals(heritagePage.TitleText(), HeritagePageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.Restylane,headerPage.safety);
			Assert.assertEquals(safetyPage.TitleText(), SafetyPageConstant.Title, "Matching the Title of the Page.");	
			util.mousehandle(headerPage.Restylane,headerPage.science);
			Assert.assertEquals(sciencePage.TitleText(), SciencePageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourClinic,headerPage.aesthetic);
			Assert.assertEquals(aestheticPage.TitleText(), AestheticPageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourClinic,headerPage.beforeTreatment);
			Assert.assertEquals(beforeYourTreatmentPage.TitleText(), BeforeYourTreatmentPageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourClinic,headerPage.afterTreatment);
			Assert.assertEquals(afterYourTreatmentPage.TitleText(), AfterYourTreatmentPageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourClinic,headerPage.clinic);
			Assert.assertEquals(findClinicPage.TitleText(), FindClinicPageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourRestylane,headerPage.enhance);
			Assert.assertEquals(enhancePage.TitleText(), EnhancePageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.yourRestylane,headerPage.refresh);
			Assert.assertEquals(refreshPage.TitleText(), RefreshPageConstant.Title, "Matching the Title of the Page.");
			util.mousehandle(headerPage.beforeAfter, headerPage.testimonials);
			Assert.assertEquals(testimonialsPage.TitleText(), TestimonialsPageConstant.Title, "Matching the Title of the Page.");
			
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	
}
