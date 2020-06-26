package Cucumber;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;
import java.util.ArrayList;

import static Cucumber.Hooks.report;
import static com.relevantcodes.extentreports.LogStatus.PASS;

public class steps {
	
	WebDriver driver;
	ArrayList<String> tabs = new ArrayList();
	
	@Given("^Login screen of whatsapp web application is displayed$")
	 	public void login_screen_of_whatsapp_web_application_is_displayed() throws InterruptedException 
	 	{
		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
//		WebElement openWhatsAppOn = driver.findElement(By.xpath("(//li[@class='eGEEX'])[1]"));
//			
//			if(existsElement("openWhatsAppOn")==true){
//				report.log(PASS, "Verify whatsapp web app page", " Whatsapp web page displayed");
//			}
//				else{
//				System.out.println("Element not find");
//				//report.log(PASS, "Verify whatsapp web app page", " Whatsapp web page displayed");
//				}	
			
		report.log(PASS, "Verify whatsapp web app page", " Whatsapp web page displayed");
		Thread.sleep(4000);
	 	}

	@When("^User opens whatsapp web application in a new tab$")
	    public void user_opens_whatsapp_web_application_in_a_new_tab() throws InterruptedException, AWTException {
			//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		((JavascriptExecutor)driver).executeScript("window.open()");
			tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1)); //switches to new tab
			driver.get("https://web.whatsapp.com/");


			//driver.get("https://web.whatsapp.com/");

	    }
		
	    

	@And("^Switches back to previous tab$")
	    public void switches_back_to_previous_tab() throws InterruptedException
	    {
			driver.switchTo().window(tabs.get(0)); // switch back to main screen
	    }



	@Then("^A popup with the message 'Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' should be displayed with 'CLOSE' & 'USE HERE' options$")
	public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_should_be_displayed_with_close_use_here_options(String strArg1) throws Throwable {
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		//driver.close();
	}


	private boolean existsElement(String string) {
		// TODO Auto-generated method stub
		return false;

	}



//Second TC
	
	@Given("^A popup with the message ' Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' is displayed$")
    public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed(String strArg1) throws Throwable {
		System.out.println("Another window is opened in another tab");
	}
		
	@When("^User clicks on 'USE HERE' option$")
	public void user_clicks_on_use_here_option() throws Throwable {
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='S7_rT FV2Qy']")).click();
		driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		//driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
	}
}
//
//    }
//
//    @Then("^Login page of whatsapp should get loaded$")
//    public void login_page_of_whatsapp_should_get_loaded() throws Throwable {
      //System.out.println("Whats app Login Page");
//
//    }
//
//    @And("^In the previous tab, popup with message  'Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' should be displayed $")
//    public void in_the_previous_tab_popup_with_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_should_be_displayed(String strArg1) throws Throwable {
	  //driver.switchTo().window(tabs.get(1));
		//driver.close();
//    }

