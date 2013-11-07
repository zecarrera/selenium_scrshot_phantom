package br.org.cesar.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.org.cesar.util.Utils;
import br.org.cesar.common.SimpleFormPage;

@Category(SeleniumTest.class)
public class SimpleFormValidation extends BaseTestcase{
	/**
	 * Example app is a HTML5 demo available on the web
	 */

	/**
	 *  Fill out form
	 */
	@Test
	public void fillOutInvalidTitle() {
		SimpleFormPage.enterTitle("");
		SimpleFormPage.submitForm();
		Utils.takeScreenshot(this.getClass().getName().substring(18));
	}
	
	
	/**
	 *  Fill out form
	 */
	@Test
	@Category(br.org.cesar.test.suite.SanityTests.class)
	public void fillOutFormAndSubmit() {
		SimpleFormPage.fillOutForm("dr", "jose", " ", "jcan@cesar.com", "http://bytesdontbite.com", "2");
		Utils.takeScreenshot(this.getClass().getName().substring(18));
	}
}
