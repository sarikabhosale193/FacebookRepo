package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PopUpPage.SignUpPopUp;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
		signUpPopUp.clickOncreatebutton(); 
		signUpPopUp.firstName();
		signUpPopUp.lastName();
		signUpPopUp.mobileNo();
		signUpPopUp.password();
		signUpPopUp.dropdown();
		signUpPopUp.radiobutton();
    }
}