package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	@FindBy (xpath ="//input[@type='text']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath ="//button[@value='1']")
	private WebElement loginButton;
	
	@FindBy (xpath ="(//a[@role='button'])[2]")
	private WebElement createbutton;
	
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserName() {
		userName.sendKeys("9503921198");
	}

	public void sendpassword() {
		password.sendKeys("sakshay@14");
	}	
	public void clickOnloginButton() {
		loginButton.click();
	}
	
    public void login() {
			userName.sendKeys("sarikabhosale193@gmail.com");
			password.sendKeys("123456789");
			loginButton.click();
			
	}
}
	
	


		
	


		
	

