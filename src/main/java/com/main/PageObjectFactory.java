package com.main;

import java.io.IOException;

import com.pages.AboutRestalanePage;
import com.pages.AestheticPage;
import com.pages.HeritagePage;
import com.pages.SafetyPage;
import com.pages.SciencePage;
import com.pages.SocietyPage;
import com.pages.FacialPage;
import com.pages.BeforeYourTreatmentPage;
import com.pages.AfterYourTreatmentPage;
import com.pages.ContactUsPage;
import com.pages.FindClinicPage;
import com.pages.RestorePage;
import com.pages.EnhancePage;
import com.pages.RefreshPage;
import com.pages.GalleryPage;
import com.pages.FooterPage;
import com.pages.TestimonialsPage;
import com.pages.FaqPage;
import com.pages.PressPage;
import com.pages.LegalPage;
import com.pages.HeaderPage;
import com.pages.HomePage;
import com.pages.CookiesPage;
import com.pages.PrivatePolicyPage;
import com.pages.PurposePage;


public class PageObjectFactory {
	
	public static HeaderPage  headerPage = null;
	public static AboutRestalanePage  aboutRestalanePage = null;
	public static AestheticPage  aestheticPage = null;
	public static AfterYourTreatmentPage  afterYourTreatmentPage = null;
	public static BeforeYourTreatmentPage  beforeYourTreatmentPage = null;
	public static EnhancePage  enhancePage = null;
	public static CookiesPage  cookiesPage = null;
	public static FacialPage  facialPage = null;
	public static FaqPage  faqPage = null;
	public static ContactUsPage  contactUsPage = null;
	public static FindClinicPage  findClinicPage = null;
	public static PurposePage purposePage = null;
	public static TestimonialsPage testimonialsPage = null;
	public static PressPage pressPage = null;
	public static GalleryPage galleryPage = null;
	public static SafetyPage safetyPage = null;
	public static HeritagePage heritagePage = null;
	public static RefreshPage refreshPage = null;
	public static PrivatePolicyPage privatePolicyPage = null;
	public static SciencePage sciencePage = null;
	public static RestorePage restorePage = null;
	public static HomePage  homePage = null;
	public static LegalPage  legalPage = null;
	public static FooterPage footerPage = null;
	public static SocietyPage societyPage = null;
	
	
	/*Mapping Header Page with the HeaderPage Test Cases*/
	public static HomePage getHomePage() throws IOException, InterruptedException 
	{
		if (homePage == null)
			homePage = new HomePage();
		return homePage;
	}
	public static HeaderPage getHeaderPage() throws IOException, InterruptedException 
	{
		if (headerPage == null)
			headerPage = new HeaderPage();
		return headerPage;
	}
	public static SciencePage getSciencePage() throws IOException, InterruptedException 
	{
		if (sciencePage == null)
			sciencePage = new SciencePage();
		return sciencePage;
	}
	public static SocietyPage getSocietyPage() throws IOException, InterruptedException 
	{
		if (societyPage == null)
			societyPage = new SocietyPage();
		return societyPage;
	}
	public static RestorePage getRestorePage() throws IOException, InterruptedException 
	{
		if (restorePage == null)
			restorePage = new RestorePage();
		return restorePage;
	}
	public static AboutRestalanePage getAboutRestalanePage() throws IOException, InterruptedException 
	{
		if (aboutRestalanePage == null)
			aboutRestalanePage = new AboutRestalanePage();
		return aboutRestalanePage;
	}

	public static AestheticPage getAestheticPage() throws IOException, InterruptedException 
	{
		if (aestheticPage == null)
			aestheticPage = new AestheticPage();
		return aestheticPage;
	}
	
	public static AfterYourTreatmentPage getAfterYourTreatmentPage() throws IOException, InterruptedException 
	{
		if (afterYourTreatmentPage == null)
			afterYourTreatmentPage = new AfterYourTreatmentPage();
		return afterYourTreatmentPage;
	}
	
	public static BeforeYourTreatmentPage getBeforeYourTreatmentPage() throws IOException, InterruptedException 
	{
		if (beforeYourTreatmentPage == null)
			beforeYourTreatmentPage = new BeforeYourTreatmentPage();
		return beforeYourTreatmentPage;
	}
	public static CookiesPage getCookiesPage() throws IOException, InterruptedException 
	{
		if (cookiesPage == null)
			cookiesPage = new CookiesPage();
		return cookiesPage;
	}
	public static EnhancePage getEnhancePage() throws IOException, InterruptedException 
	{
		if (enhancePage == null)
			enhancePage = new EnhancePage();
		return enhancePage;
	}
	public static FacialPage getFacialPage() throws IOException, InterruptedException 
	{
		if (facialPage == null)
			facialPage = new FacialPage();
		return facialPage;
	}
	public static FaqPage getFaqPage() throws IOException, InterruptedException 
	{
		if (faqPage == null)
			faqPage = new FaqPage();
		return faqPage;
	}
	
	public static ContactUsPage getConatctUsPage() throws IOException, InterruptedException 
	{
		if (contactUsPage == null)
			contactUsPage = new ContactUsPage();
		return contactUsPage;
	}
	public static FindClinicPage getFindClinicPage() throws IOException, InterruptedException 
	{
		if (findClinicPage == null)
			findClinicPage = new FindClinicPage();
		return findClinicPage;
	}
	
	public static HeritagePage getheritagePage() throws IOException, InterruptedException 
	{
		if (heritagePage == null)
			heritagePage = new HeritagePage();
		return heritagePage;
	}
	public static LegalPage getLegalPage() throws IOException, InterruptedException 
	{
		if (legalPage == null)
			legalPage = new LegalPage();
		return legalPage;
	} 
	public static PurposePage getPurposePage() throws IOException, InterruptedException 
	{
		if (purposePage == null)
			purposePage = new PurposePage();
		return purposePage;
	} 
	public static TestimonialsPage getTestimonialsPage() throws IOException, InterruptedException 
	{
		if (testimonialsPage == null)
			testimonialsPage = new TestimonialsPage();
		return testimonialsPage;
	}
	public static PressPage getPressPage() throws IOException, InterruptedException 
	{
		if (pressPage == null)
			pressPage = new PressPage();
		return pressPage;
	}
	
	public static GalleryPage getGalleryPage() throws IOException, InterruptedException 
	{
		if (galleryPage == null)
			galleryPage = new GalleryPage();
		return galleryPage;
	}
	public static SafetyPage getSafetyPage() throws IOException, InterruptedException 
	{
		if (safetyPage == null)
			safetyPage = new SafetyPage();
		return safetyPage;
	}
	
	public static RefreshPage getRefreshPage() throws IOException, InterruptedException 
	{
		if (refreshPage == null)
			refreshPage = new RefreshPage();
		return refreshPage;
	}
	public static PrivatePolicyPage getPrivatePolicyPage() throws IOException, InterruptedException 
	{
		if (privatePolicyPage == null)
			privatePolicyPage = new PrivatePolicyPage();
		return privatePolicyPage;
	}

	public static FooterPage getFooterPage() throws IOException, InterruptedException 
	{
		if (footerPage == null)
			footerPage = new FooterPage();
		return footerPage;
	}
	
	public static HeritagePage getHeritagePage() throws IOException, InterruptedException 
	{
		if (heritagePage == null)
			heritagePage = new HeritagePage();
		return heritagePage;
	}
	
}
