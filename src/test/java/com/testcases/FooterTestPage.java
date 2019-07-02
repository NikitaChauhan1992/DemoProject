package com.testcases;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.main.BasePage;
import com.main.PageObjectFactory;
import com.pages.HeritagePage;
import com.pages.SciencePage;
import com.pages.FacialPage;
import com.pages.FaqPage;
import com.pages.FaqPageConstant;
import com.pages.FindClinicPage;
import com.pages.FindClinicPageConstant;
import com.pages.FooterPage;
import com.pages.FooterPageConstant;
import com.pages.HeaderPage;
import com.pages.HomePage;
import com.pages.HomePageConstant;
import com.pages.LegalPage;
import com.pages.LegalPageConstant;
import com.pages.PressPage;
import com.pages.PressPageConstant;
import com.pages.PrivatePolicyPage;
import com.pages.PrivatePolicyPageConstant;
import com.pages.ContactUsPage;
import com.pages.ContactUsPageConstant;
import com.pages.CookiesPage;
import com.pages.CookiesPageConstant;
import com.utils.TestUtils;

public class FooterTestPage extends BasePage{
	private static final Logger logger = Logger.getLogger(HeaderTestPage.class.getName());
	
	static TestUtils util = new TestUtils();
	SoftAssert softAssert = new SoftAssert();
	static String URLConstant = "https://galderma:exert-shaky-visor@stage.master3.galderma.com";

	@Test(priority=1,enabled=verifyFooter)
	public static void verifyFooter() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
			FooterPage footerPage = PageObjectFactory.getFooterPage();
			ContactUsPage  contactUsPage = PageObjectFactory.getConatctUsPage();
			PressPage pressPage = PageObjectFactory.getPressPage();
			FaqPage faqPage = PageObjectFactory.getFaqPage();
			FindClinicPage findClinic = PageObjectFactory.getFindClinicPage();
			LegalPage legal = PageObjectFactory.getLegalPage();
			PrivatePolicyPage policy = PageObjectFactory.getPrivatePolicyPage();
			CookiesPage cookies = PageObjectFactory.getCookiesPage();
			logger.info("Verify the Footer links");
			headerPage.logo.click();
			util.scroll(3500);
			headerPage.ContactUs.click();
			util.handles(1);
			util.wait(10);
			Assert.assertEquals(contactUsPage.TitleText(), ContactUsPageConstant.Title, "After Landing into home page, Verify the footer Section");
			driver.switchTo().defaultContent().close();
			util.handles(0);
			headerPage.Press.click();
			Assert.assertEquals(pressPage.TitleText(), PressPageConstant.Title," After Landing into home page, Verify the footer Section");
			util.scroll(3500);
			headerPage.Clinic.click();
			Assert.assertEquals(findClinic.TitleText(), FindClinicPageConstant.Title, " After Landing into home page, Verify the footer Section");
			util.scroll(3500);
			headerPage.faqFooter.click();
			Assert.assertEquals(faqPage.TitleText(), FaqPageConstant.Title, " After Landing into home page, Verify the footer Section");
			util.scroll(3500);
			headerPage.legal.click();
			Assert.assertEquals(legal.TitleText(), LegalPageConstant.Title, " After Landing into home page, Verify the footer Section");
			util.scroll(3500);
			headerPage.policyFooter.click();
			Assert.assertEquals(policy.TitleText(), PrivatePolicyPageConstant.Title, " After Landing into home page, Verify the footer Section");
			util.scroll(3500);
			headerPage.cookiesFooter.click();
			Assert.assertEquals(cookies.TitleText(), CookiesPageConstant.Title, " After Landing into home page, Verify the footer Section");
			
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}

}
