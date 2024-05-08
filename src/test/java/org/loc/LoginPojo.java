package org.loc;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@aria-label='Phone number, username or email address']")
	private WebElement username;
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement passward;
	@FindBy(xpath="(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]")//this is forgot passward
	private WebElement login;
	@FindBy(xpath="//span[text()='Sign up']")
	private WebElement signup;
	@FindBy (xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement signupemail;
	@FindBy(xpath="//img[@alt='Get it on Google Play']")
	private WebElement scrolldown;
	public WebElement getScrolldown() {
		return scrolldown;
	}
	public WebElement getSignupemail() {
		return signupemail;
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassward() {
		return passward;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
