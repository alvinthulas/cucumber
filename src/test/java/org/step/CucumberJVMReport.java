package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class CucumberJVMReport {
	public static void generateJvmReport(String jsonpath) {
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Report\\JVMReport");
		Configuration c=new Configuration(f,"instagram application");
		c.addClassifications("java version","jdk-11");
		c.addClassifications("Browser", "edge");
		List<String> li=new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder r=new ReportBuilder(li,c);
		r.generateReports();
	}

}
