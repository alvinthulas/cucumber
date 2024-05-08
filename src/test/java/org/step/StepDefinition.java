package org.step;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.loc.LoginPojo;
import org.loc.forgottenPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("To pass the email and passward")
	public void toPassTheEmailAndPassward(DataTable d ) {
		List<Map<String, String>> m = d.asMaps(String.class, String.class);
		Map<String,String>mm=m.get(1);
		String email=mm.get("email");
		String pwd=m.get(1).get("pwd");
		LoginPojo l=new LoginPojo();
		passTheValues(l.getUsername(),email);
		passTheValues(l.getPassward(),pwd);
		System.out.println(email);
		System.out.println(pwd);
		
		 
	    
	}

	@When("To click login button")
	public void toClickLoginButton() {
	   LoginPojo l=new LoginPojo();
	   clickButton(l.getLogin());
	}



	
	
		
	    
	

	

}
