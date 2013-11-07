package br.org.cesar.test;

import java.net.URL;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import br.org.cesar.common.SimpleFormPage;
import br.org.cesar.common.Property;
import br.org.cesar.common.Selenium;

public class BaseTestcase {
	protected static SimpleFormPage homePage;
	protected static WebDriver driver;


	@BeforeClass
	public static void beforeClass() throws Exception {		
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
		Selenium.resetDriver();
	}
}
