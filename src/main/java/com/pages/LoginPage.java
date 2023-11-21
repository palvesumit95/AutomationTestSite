package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static WebDriver driver = null;
	public static Select select = null;

	@FindBy (id ="btn2")
	WebElement signup;

	@FindBy (xpath ="//input[@type='text']")
	WebElement username;

	@FindBy (xpath = "//input[@type='password']")
	WebElement password;

	@FindBy (xpath ="//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy (xpath="//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy (xpath = "//*[@rows='3']")
	WebElement address;

	@FindBy (xpath="//input[@type='email']")
	WebElement email;

	@FindBy (xpath="//input[@type='tel']")
	WebElement telephone;

	@FindBy (xpath="//input[@type='radio'][@value='Male']")
	WebElement gender;

	@FindBy (xpath="//input[@id=\"checkbox2\"]")
	WebElement hobbies;

	@FindBy (xpath="/html/body/section/div/div/div[2]/form/div[8]/div/select")
	WebElement skills;
	
	@FindBy (xpath = "//span[@id='select2-country-container']")
	WebElement country;

    @FindBy (xpath = "//select[@type=\"text\"][@placeholder=\"Month\"]")
    WebElement dob;

    
    
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

	
	public void registerToSite() {
		
		signup.click();

	}

	public void enterDetails() {
		
		firstname.sendKeys("Sumit");
		lastname.sendKeys("Palve");
		address.sendKeys("Thergaon pune");
		email.sendKeys("palvesumit95@gmail.com");
		telephone.sendKeys("8983499900");
		gender.click();
		hobbies.click();
		select = new Select(skills);
		select.selectByVisibleText("Analytics");
		select = new Select(country);
		select.selectByVisibleText("Denmark");
		select = new Select(dob);
		select.selectByIndex(10);
				
	}
	
	public void getDob ( String xpath , String attribute , String value , String data) {
		
		List<WebElement> links = driver.findElements(By.xpath(xpath));
		
		for (WebElement web : links) {
			
			Select select = new Select(web);
			
			if(web.getAttribute(attribute).equals(value)) {
				
				select.selectByVisibleText(data);
			}
		}
		
	}

	
	
	
	
}
	// for radiobutton

	//	public void radioButton(String attribute , String xpath , String attributevalue  ) {
	//
	//		List<WebElement> links =  driver.findElements(By.xpath(xpath));
	//
	//		for (WebElement element : links) {
	//			if(element.equals(attributevalue)) {
	//				element.click();
	//				
	//			}
	//			








