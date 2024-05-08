package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.CucumberJVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\FeatureFiles"
,glue="org.step",monochrome=true,dryRun=false,strict=true,snippets=SnippetType.CAMELCASE,tags="@data",
plugin={"pretty","html:Report\\HtmlReport","json:Report\\JsonReport\\json1.json","junit:Report\\JunitReport\\junit1.xml","rerun:C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\CucumberProject\\\\failed\\\\rerun1.txt"})

public class Runner {
	@AfterClass
	public static void aft() {
		CucumberJVMReport.generateJvmReport("C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Report\\JsonReport\\json1.json");
	}

}
