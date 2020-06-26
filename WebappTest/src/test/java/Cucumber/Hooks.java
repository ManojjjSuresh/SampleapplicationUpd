package Cucumber;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import static framework.report.ReportManager.start;
import static framework.report.ReportManager.stop;


public class Hooks {

	private static boolean extentReportManagerStart = false;
	public static ExtentTest report;
	
	@Before
	public void before(Scenario scenario) {
	System.out.println("inside Before");
	if (!extentReportManagerStart) {
		report = start(scenario);
		extentReportManagerStart = true;
		}
	}

	@After
	public void after() {
		if (extentReportManagerStart) {
			extentReportManagerStart = false;
			stop(report);
		}
		}
		
	}

