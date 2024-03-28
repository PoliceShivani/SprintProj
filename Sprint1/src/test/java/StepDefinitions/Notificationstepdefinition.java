package StepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys(string);
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys(string);
	}

	@When("User enters on signin button")
	public void user_enters_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement Signin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Signin.click();
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
		WebElement Notifications = driver.findElement(By.xpath("//span[@title=\"Notifications\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",Notifications);
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
		WebElement element = driver.findElement(By.xpath("//*[@id='ember8']/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article/div[2]/a"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",element);
	}

	@Then("User Should driected to home by clicking relevant content associated with the notification")
	public void user_should_driected_to_home_by_clicking_relevant_content_associated_with_the_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String url3="//*[@id=\"ember149\"]/div[2]";
		driver.navigate().to(url3);
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
		WebElement viewbox = driver.findElement(By.xpath("//button[@id=\"ember35\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",viewbox);
	}

	@When("User clicks on delete notification")
	public void user_clicks_on_delete_notification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement Delete = driver.findElement(By.xpath("//button[@class=\"nt-card-settings-dropdown-item__button\"]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",Delete);
	}

	@When("user want to undo deleted message")
	public void user_want_to_undo_deleted_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User can also undo deleted message by getting delete message")
	public void user_can_also_undo_deleted_message_by_getting_delete_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement sees = driver.findElement(By.xpath("//*[@id=\"ember8\"]/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article"));
		assert sees.isDisplayed();
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
		WebElement element = driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\"]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",element);
	}

	@When("User  navigate to settings page")
	public void user_navigate_to_settings_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.linkedin.com/mypreferences/d/categories/notifications");

	}

	@Then("User should see a list of notifications displayed")
	public void user_should_see_a_list_of_notifications_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement page = driver.findElement(By.xpath("//html[@class=\"artdeco windows theme--dark-lix\"]"));
		page.isDisplayed();

	}

//	@Given("User Click on notifications")
//	public void user_click_on_notifications() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.get("https://www.linkedin.com/notifications/?filter=all");
//	}

//	@When("User attempts to mark a notifications as read")
//	public void user_attempts_to_mark_a_notifications_as_read() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
	//	WebElement read = driver.findElement(By.xpath("//*[@id=\'ember315\']/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[3]/article"));
		//assert read.isDisplayed();
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
//		driver.get("https://www.linkedin.com/notifications/?filter=all");
//	}
//
//	@When("User navigates to the Manage Notifications settings")
//	public void user_navigates_to_the_manage_notifications_settings() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		((JavascriptExecutor)driver).executeScript("window.open()");
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		driver.get("https://www.linkedin.com/mypreferences/d/categories/notifications");
//	}
//
//	@Then("User should see options to manage their notification preferences")
//	public void user_should_see_options_to_manage_their_notification_preferences(String email, String pushNotifications, String message, String inAppNotifications) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	WebElement emailCheckbox = driver.findElement(By.id("email-notification"));
//	WebElement pushCheckbox = driver.findElement(By.id("push-notification"));
//	WebElement messageCheckbox = driver.findElement(By.id("message-notification"));
//	WebElement inAppCheckbox = driver.findElement(By.id("in-app-notification"));
//	
//	assert emailCheckbox.isDisplayed();
//	assert pushCheckbox.isDisplayed();
//	assert messageCheckbox.isDisplayed();
//	assert inAppCheckbox.isDisplayed();
//
//	}
//
//	@Then("User updates their notification preferences with success, <push_noti fications>, success, and success")
//	public void user_updates_their_notification_preferences_with_success_push_noti_fications_success_and_success(String email, String pushNotifications, String message, String inAppNotifications) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	WebElement emailCheckbox = driver.findElement(By.id("email-notification"));
//	WebElement pushCheckbox = driver.findElement(By.id("push-notification"));
//	WebElement messageCheckbox = driver.findElement(By.id("message-notification"));
//	WebElement inAppCheckbox = driver.findElement(By.id("in-app-notification"));
//	
//	
//	boolean emailValue = Boolean.parseBoolean(email);
//	boolean pushNotificationsValue = Boolean.parseBoolean(pushNotifications);
//	boolean messageValue = Boolean.parseBoolean(message);
//	boolean inAppNotificationsValue = Boolean.parseBoolean(inAppNotifications);
//	if (emailValue) {
//		emailCheckbox.click();
//	}
//	if (pushNotificationsValue) {
//		pushCheckbox.click();
//	}
//	if (messageValue) {
//		messageCheckbox.click();
//	}
//	if (inAppNotificationsValue) {
//		inAppCheckbox.click();
//	}
//	WebElement savebutton = driver.findElement(By.id("save-notification-settings"));
//	savebutton.click();
//}
//
//	@Then("The changes should be saved successfully")
//	public void the_changes_should_be_saved_successfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should receive a confirmation message indicating that the settings have been updated")
//	public void user_should_receive_a_confirmation_message_indicating_that_the_settings_have_been_updated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		WebElement update = driver.findElement(By.xpath("//div[@class='inline-callout-body-container']"));
//		assert update.isDisplayed();
//	}
//
//	@Then("User updates their notification preferences with fail, <push_noti fications>, success, and fail")
//	public void user_updates_their_notification_preferences_with_fail_push_noti_fications_success_and_fail(String email, String push, String message, String inApp) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//			WebElement emailCheckbox = driver.findElement(By.id("email-notification"));
//			WebElement pushCheckbox = driver.findElement(By.id("push-notification"));
//			WebElement messageCheckbox = driver.findElement(By.id("message-notification"));
//			WebElement inAppCheckbox = driver.findElement(By.id("in-app-notification"));
//			
//			emailCheckbox.sendKeys(email);
//			pushCheckbox.sendKeys(push);
//			messageCheckbox.sendKeys(message);
//			inAppCheckbox.sendKeys(inApp);
//			
//			WebElement saveButton = driver.findElement(By.id("save-notification-settings"));
//			saveButton.click();
//			}

	}
