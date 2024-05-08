package org.loc;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgottenPojo extends BaseClass {
	public forgottenPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Email address, phone number or username']")
	private WebElement phonenumber;
	@FindBy(xpath="//span[text()='Forgotten your password?']")
	private WebElement forgot;
	
	
	@FindBy(xpath="(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh xdj266r x1yztbdb x7i73kt x14n70j1 x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[4]")
	private WebElement sendloginclick;


	public WebElement getPhonenumber() {
		return phonenumber;
	}


	public WebElement getForgot() {
		return forgot;
	}


	public WebElement getSendloginclick() {
		return sendloginclick;
	}
	
	

}
