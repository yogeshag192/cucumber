package cucumber.cucumber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class StepDefinition {
	
	WebDriver driver;

	@Given("^I will Launch Website$")
	public void i_will_Launch_Website() throws Throwable {
		
		String CHROME_DRIVER_PATH = System.getProperty("user.dir") + System.getProperty("file.separator") + "chromedriver.exe";
		System.out.println("Setting up Chrome Driver.");
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
	    
	}

	@Given("^I will Enter Text in SearchBox$")
	public void i_will_Enter_Text_in_SearchBox() throws Throwable {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed()); 
		WebElement element = driver.findElement(By.name("q"));	 
		element.sendKeys("Guru99");
		System.out.println("Text entered text in search-box");
	}

	@When("^I click on Search Button$")
	public void i_click_on_Search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = driver.findElement(By.name("q"));
		element.submit();
	    Thread.sleep(2000);
	}

	@When("^Results are Displayed$")
	public void results_are_Displayed() throws Throwable {
	 
		
		System.out.println("Results are displayed..");
	    
	}

	@When("^I will Enter Text \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_Enter_Text_name_and(String arg1, String arg2) throws Throwable {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed()); 
		WebElement element = driver.findElement(By.name("q"));	 
		element.sendKeys(arg1);
		element.sendKeys("----" +arg2);
		System.out.println("Text entered text in search-box using scenario outline..");
	    
	}
	
	@Given("^I will Enter DATA in SearchBox$")
	public void i_will_Enter_DATA_in_SearchBox(DataTable table) throws Throwable {
	  List<List<String>> dataList = table.raw();
	  System.out.println(dataList.get(1).get(1)); 
	  System.out.println(dataList.get(2).get(1)); 
	  System.out.println(dataList.get(3).get(1));
	  System.out.println(dataList.get(4).get(1)); 
	  System.out.println(dataList.get(5).get(1)); 
	  
	  Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed()); 
		WebElement element = driver.findElement(By.name("q"));	 
		element.sendKeys(dataList.get(1).get(1));
		element.sendKeys(dataList.get(2).get(1));
		element.sendKeys(dataList.get(3).get(1));
		element.sendKeys(dataList.get(4).get(1));
		element.sendKeys(dataList.get(5).get(1));
		System.out.println("Text entered text in search-box");
	}
	
	@Then("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		driver.quit();
	}

	
	/*
	@Then("^I click on Search Button$")
	public void i_click_on_Search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
}
