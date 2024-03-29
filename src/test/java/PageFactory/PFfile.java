package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFfile {
	WebDriver driver;
	public PFfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "username")
	WebElement usernameField;
	
	@FindBy(id = "password")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement signinButton;
	
	@FindBy(xpath = "//span[@title=\"Notifications\"]")
	WebElement notificationIcon;
	
	@FindBy(xpath = "//*[@id=\"ember8\"]/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article/div[2]/a")
	WebElement specificnot;
	
	@FindBy(xpath ="//body[@class='render-mode-BIGPIPE nav-v2 ember-application icons-loaded boot-complete']")
	WebElement relevantcont;
	
	@FindBy(xpath = "//button[@id=\"ember201\"]")
	WebElement viewdots;
	
	@FindBy(xpath = "//div[@id=\"ember203\"]")
	WebElement deletes;
	
	@FindBy(xpath = "//*[@id=\"ember8\"]/div[2]/div/div/main/div/div/section[2]/div/div[1]/div/div[1]/article")
	WebElement msg;
	
	@FindBy(xpath ="//*[@id=\"ember273\"]/span")
	WebElement regetmsg;
	
	@FindBy(xpath = "//a[@rel=\"noopener noreferrer\"]")
	WebElement managesett;
	
	@FindBy(xpath = "//div[@data-test-scaffold-layout=\"sidebar-main-footer\"]")
	WebElement notflist;
	
	public void name(String p) {
		usernameField.sendKeys(p);
	}
	public void pin(String o) {
		passwordField.sendKeys(o);
	}
	public void signsclick(){
		signinButton.click();
	}
	
	public void bellclick() {
		notificationIcon.click();
	}
	public void specclick() {
		specificnot.click();
	}
	public void contisDisplayed(){
		relevantcont.isDisplayed();
	}
	public void threedotclick(){
		viewdots.click();
	}
	public void delclick(){
		deletes.click();
	}
	public void viewmsgisDisplayed(){
		msg.isDisplayed();
	}
	public void getsmsgclick(){
		regetmsg.click();
	}
	public void viewsettclick(){
		managesett.click();
	}
	public void preferlistisDisplayed(){
		notflist.isDisplayed();
	}


	}
	

