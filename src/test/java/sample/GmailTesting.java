package sample;

		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class GmailTesting {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
//			ProfilesIni prof = new ProfilesIni();
//			FirefoxProfile ffProfile= prof.getProfile ("Senthil");
//			ffProfile.setAcceptUntrustedCertificates(true);
//			ffProfile.setAssumeUntrustedCertificateIssuer(false);
//			
			//driver = new FirefoxDriver(ffProfile);
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			System.out.println("Senthil Successful Loggged in");
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			ProfilesIni prof = new ProfilesIni();
			FirefoxProfile ffProfile= prof.getProfile ("Senthil");
			ffProfile.setAcceptUntrustedCertificates(true);
			ffProfile.setAssumeUntrustedCertificateIssuer(false);
		    driver = new FirefoxDriver(ffProfile);  
		}		
		@AfterTest
		public void afterTest() {
			//driver.quit();			
		}		
}	

