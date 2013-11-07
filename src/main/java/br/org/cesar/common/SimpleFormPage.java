package br.org.cesar.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



/*
 * Executa todas as acoes na pagina Inicial
 */
public class SimpleFormPage {

	/*
	 * Instancia privada do webDriver que vira da suite de teste
	 */
	private static final WebDriver driver;
	private static final WebDriverWait wait;

	/**
	 * Construtor estático
	 */
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	static By titleLocator = By.id("title");
	static By nameLocator = By.id("name");
	static By phoneNumberLocator= By.id("phone");
	static By emailLocator= By.id("email");
	static By websiteLocator= By.id("website");
	static By nrItemsLocator= By.id("numberexample");
	static By lengthLocator= By.id("rangeexample");
	static By deliveryDateLocator= By.id("deliverydate");
	static By timeOfDeliveryLocator= By.id("timeexample");
	static By colorLocator= By.id("colorexample");
	static By enviarButtonLocator= By.cssSelector("input[type='submit']");
	
	public SimpleFormPage() {
	}

	
	/**
	 * Enters example form title 
	 */
	public static void enterTitle(String title){
		clearAndType(titleLocator, title);
	}
	
	/**
	 * Enters example form name 
	 */
	public static void enterName(String name){
		clearAndType(nameLocator, name);
	}
	
	/**
	 * Enters example form phone number 
	 */
	public static void enterPhoneNumber(String phoneNumber){
		clearAndType(phoneNumberLocator, phoneNumber);
	}
	
	/**
	 * Enters example form email 
	 */
	public static void enterEmail(String email){
		clearAndType(emailLocator, email);
	}
	
	
	/**
	 * Enters example form website address
	 */
	public static void enterYourWebsite(String website){
		clearAndType(websiteLocator,website);
	}
	
	
	/**
	 * Enters example form nr of items
	 */
	public static void enterNrOfItems(String nrOfItems){
		clearAndType(nrItemsLocator, nrOfItems);
	}
	
	/**
	 * Moves length bar to
	 */
	public static void moveLengthBar(){

	}
	
	/**
	 * Enters example form delivery date
	 */
	public static void enterDeliveryDate(){

	}
	
	/**
	 * Enters example form time of delivery
	 */
	public static void enterTimeOfDelivery(){
	}
	
	/**
	 * Enters example form color
	 */
	public static void enterColor(){
	}

	/**
	 * Submit form
	 */
	public static void submitForm(){
		driver.findElement(enviarButtonLocator).click();
	}
	
	/**
	 * Clears field and sends text
	 * @param locator
	 * @param keysToSend
	 */
	private static void clearAndType(By locator, String keysToSend) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(keysToSend);
	}
	
	/**
	 * Fill out form completely
	 */
	public static void fillOutForm(String title, String name, String phoneNumber, String email, String website, String nrOfItems){
		enterTitle(title);
		enterName(name);
		enterPhoneNumber(phoneNumber);
		enterEmail(email);
		enterYourWebsite(website);
		enterNrOfItems(nrOfItems);
		submitForm();
	}	
	
	
	

}