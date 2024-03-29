package StepDefinitions;

import java.util.ArrayList;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.PFfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Notificationstepdefinition {
	WebDriver driver;
	@Given("User opens Linkedin app")
	public void user_opens_linkedin_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		String url ="https://www.linkedin.com/login";
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement usernameInput = driver.findElement(By.id("username"));
//		usernameInput.sendKeys(string);
		PFfile sce = new PFfile(driver);
		sce.name(string);

		
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement passwordInput = driver.findElement(By.id("password"));
//		passwordInput.sendKeys(string);
		PFfile sce1 = new PFfile(driver);
		sce1.pin(string);

		
	}

	@When("User enters on signin button")
	public void user_enters_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Signin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		Signin.click();
		PFfile sce2 = new PFfile(driver);
		sce2.signsclick();
		
		
	}

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.linkedin.com/feed/");

	}

	@Given("User clicks on notification icon")
	public void user_clicks_on_notification_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Notifications = driver.findElement(By.xpath("//span[@title=\"Notifications\"]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",Notifications);
		PFfile sce3 = new PFfile(driver);
		sce3.bellclick();
	}

	@When("user  navigate to notification page")
	public void user_navigate_to_notification_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.linkedin.com/notifications/?filter=all");
	}

	@When("User click on specific notification")
	public void user_click_on_specific_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Specific = driver.findElement(By.xpath("//*[@id=\"ember8\"]/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article/div[2]/a"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();",Specific);
		PFfile sce4 = new PFfile(driver);
		sce4.specclick();

	}

	@Then("User Should driected to home by clicking relevant content associated with the notification")
	public void user_should_driected_to_home_by_clicking_relevant_content_associated_with_the_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement content = driver.findElement(By.xpath("//body[@class='render-mode-BIGPIPE nav-v2 ember-application icons-loaded boot-complete']"));
//		content.isDisplayed();
		PFfile sce5 = new PFfile(driver);
		sce5.contisDisplayed();
		
	}

	@Given("User clicks on notification")
	public void user_clicks_on_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.linkedin.com/notifications/?filter=all");
	}

	@When("User clicks on notification view box")
	public void user_clicks_on_notification_view_box() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Viewbox = driver.findElement(By.xpath("//button[@id="ember201"]"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();",Viewbox);
		PFfile sce6 = new PFfile(driver);
		sce6.threedotclick();
	}

	@When("User clicks on delete notification")
	public void user_clicks_on_delete_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Deletes = driver.findElement(By.xpath("//div[@id="ember203"]"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();",Deletes);
		PFfile sce7 = new PFfile(driver);
		sce7.delclick();
	}

	@When("User can also gets that message got deleted")
	public void user_can_also_gets_that_message_got_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement sees = driver.findElement(By.xpath("//*[@id="ember8"]/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article"));
//		sees.isDisplayed();
		PFfile sce8 = new PFfile(driver);
		sce8.viewmsgisDisplayed();
		
	}

	@Then("User want to undo deleted message")
	public void user_want_to_undo_deleted_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement Undo = driver.findElement(By.xpath("//*[@id="ember273"]/span"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();",Undo);
		PFfile sce9 = new PFfile(driver);
		sce9.getsmsgclick();
	}

	@Given("User clicks on notifications")
	public void user_clicks_on_notifications() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.linkedin.com/notifications/?filter=all");
	}

	@When("User clicks on manage your notifications")
	public void user_clicks_on_manage_your_notifications() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement manage = driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\"]"));
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].click();",manage);
		PFfile sce10 = new PFfile(driver);
		sce10.viewsettclick();
	}

	@When("User  navigate to settings page")
	public void user_navigate_to_settings_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.linkedin.com/mypreferences/d/categories/notifications");
	}

	@Then("User should see a list of notifications displayed")
	public void user_should_see_a_list_of_notifications_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement page = driver.findElement(By.xpath("//div[@data-test-scaffold-layout=\"sidebar-main-footer\"]"));
//		page.isDisplayed();
		PFfile sce11 = new PFfile(driver);
		sce11.preferlistisDisplayed();
		

	}

//	@Given("User Click on notifications")
//	public void user_click_on_notifications() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.get("https://www.linkedin.com/notifications/?filter=all");
//	}
//
//	@When("User attempts to mark a notifications as read")
//	public void user_attempts_to_mark_a_notifications_as_read() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		WebElement read = driver.findElement(By.xpath("//*[@id=\'ember315\']/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[3]/article"));
//		//assert read.isDisplayed();
//
//	}
//
//	@Then("User should see an error message indicating that the action could not be completed")
//	public void user_should_see_an_error_message_indicating_that_the_action_could_not_be_completed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on the Notifications page")
//	public void user_is_on_the_notifications_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User navigates to the Manage Notifications settings")
//	public void user_navigates_to_the_manage_notifications_settings() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see options to manage their notification preferences")
//	public void user_should_see_options_to_manage_their_notification_preferences() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User updates their notification preferences with success, <push_noti fications>, success, and success")
//	public void user_updates_their_notification_preferences_with_success_push_noti_fications_success_and_success() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The changes should be saved successfully")
//	public void the_changes_should_be_saved_successfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should receive a confirmation message indicating that the settings have been updated")
//	public void user_should_receive_a_confirmation_message_indicating_that_the_settings_have_been_updated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User updates their notification preferences with fail, <push_noti fications>, success, and fail")
//	public void user_updates_their_notification_preferences_with_fail_push_noti_fications_success_and_fail() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
