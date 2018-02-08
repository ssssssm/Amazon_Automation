package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTest {
	
	public static WebDriver driver=null;
	String url="https://www.amazon.in/";
	
	

@Given("^User launches Amazon Application$")
public void user_launches_Amazon_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver=new FirefoxDriver();
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
}

@When("^User is on the Home Page$")
public void user_is_on_the_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
    
}

@Then("^Today's Deal should be displayed$")
public void today_s_Deal_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String Text=driver.findElement(By.xpath("//span[@class='a-color-base']")).getText();
	
	System.out.println(Text);
    if(!Text.isEmpty())
    {
    	assertEquals("Today's Deals", Text);
    	
    }
}

@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Home Page");
//	
//	driver.manage().window().maximize();
//	   
//	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get(url);
//		
    
}

@When("^Clicks on See All Details$")
public void clicks_on_See_All_Details() throws Throwable {
    
	
	System.out.println(driver.findElement(By.partialLinkText("See all deals")).getText());
	
	driver.findElement(By.xpath("//a[contains(text(),'See all deals')]")).click();
	
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@class='a-link-normal'][contains(text(),'See all deals')]")).click();
    
}

@Then("^All Details should be shown on New Tab$")
public void all_Details_should_be_shown_on_New_Tab() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String win1=driver.getWindowHandle();
	
	Set<String> windows=driver.getWindowHandles();

	
	for(String win:windows)
	{
	if(!win1.equals(win))
	{
	driver.switchTo().window(win);
	
	Thread.sleep(3000);
	
	System.out.println("Title of the new Window" +driver.switchTo().window(win).getTitle());
	
	
	
	}
	
	}
	
   
}

@Then("^Click on Category Link$")
public void click_on_Category_Link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement Category=driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	Actions act=new Actions(driver);
	
	act.moveToElement(Category);
	Thread.sleep(2000);
	
	
   
}

@When("^User Select Baby Products and Beauty options$")
public void user_Select_Baby_Products_and_Beauty_options() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Baby Products')]")).click();
	
	driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Beauty')]")).click();
	
	Thread.sleep(3000);
    
}

@Then("^Snapshot should be taken$")
public void snapshot_should_be_taken() throws Throwable {
   
	System.out.println("Screenshot of the Category Selected");	
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("F:/Amazon_Automation/Amazon_Automation/src/test/resources/Screenshots/"+System.currentTimeMillis()+".jpeg"));
	      
	Thread.sleep(3000);	
}

@Given("^User Navigates back to Amazon Home Page$")
public void user_Navigates_back_to_Amazon_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
String win1=driver.getWindowHandle();
	
	Set<String> windows=driver.getWindowHandles();

	
	for(String win:windows)
	{
	if(!win1.equals(win))
	{
	driver.switchTo().window(win);
	
	System.out.println("Title of the new Window" +driver.switchTo().window(win).getTitle());
	
	
	
	}
	
	}
    
}

@When("^User Clicks on Sign In$")
public void user_Clicks_on_Sign_In() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
	
    
}

@When("^Enters valid mobile number \"([^\"]*)\" and password \"([^\"]*)\"$")
public void enters_valid_mobile_number_and_password(String number, String password) throws Throwable {
	
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(number);
    
    driver.findElement(By.xpath("//span[@id='continue']")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(password);
    
    driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
    
    Thread.sleep(3000);
    
}

@Then("^Login should be successful$")
public void login_should_be_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	driver.quit();
    
}


	

}
