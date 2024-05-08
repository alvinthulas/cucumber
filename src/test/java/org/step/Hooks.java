package org.step;

import org.helper.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before(order=1)
	public void bef() {
		openEdgeDriver();
		openWebPage("https://www.instagram.com/");
	}
	@Before(order=2)
	public void bef1() {
		maxWin();
		Wait();
	}
	@After(order=1)
	public void aft() {
		closeBrowser();
	}
	@After(order=2)
	public void aft1() {
		System.out.println("just");
	}

}
