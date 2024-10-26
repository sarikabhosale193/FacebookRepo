package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.LoginOrSignUpPage;
import PopUpPage.SignUpPopUp;

public class Demo {
	
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage= new LoginOrSignUpPage(driver);
		loginOrSignUpPage.senduserName();
		loginOrSignUpPage.sendpassword();
		loginOrSignUpPage.clickOnloginButton();
		}

}
