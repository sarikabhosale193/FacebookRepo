package PopUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPopUp {
	
	@FindBy (xpath ="(//a[@role='button'])[2]")
	private WebElement createbutton;
	
	@FindBy (xpath ="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath ="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy (xpath ="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileNo;
	
	@FindBy (xpath ="(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy (xpath ="//select[@id='day']")
	private WebElement selectDay;
	
	@FindBy (xpath ="//select[@id='month']")
	private WebElement selectMonth;
	
	@FindBy (xpath ="//select[@id='year']")
	private WebElement selectYear;
	
	@FindBy (xpath ="//label[text()='Female']")
	private WebElement selectfemale;
	
	@FindBy (xpath ="(//button[@type='submit'])[2]")
	private WebElement submitbutton;
	
	public  SignUpPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//method for create button
	public void clickOncreatebutton() {
		createbutton.click();
	}
	
	public void firstName() throws InterruptedException {
		Thread.sleep(5000);
		firstName.sendKeys("Sarika");
	}
	
	public void lastName() throws InterruptedException {
		Thread.sleep(5000);
		lastName.sendKeys("Gaikwad");
	}
	
	public void mobileNo() throws InterruptedException {
		Thread.sleep(5000);
		mobileNo.sendKeys("95039");
	}
	
	public void password() throws InterruptedException {
		Thread.sleep(5000);
		password.sendKeys("sara@123");
	}
	
	//method for dropdown
	public void dropdown() throws InterruptedException {
		
		Thread.sleep(5000);
		Select select = new Select(selectDay);
		select.selectByVisibleText("14");
		
		Thread.sleep(5000);
		Select select1 = new Select(selectMonth);
		select1.selectByVisibleText("Jan");
		
		Thread.sleep(5000);
		Select select2 = new Select(selectYear);
		select2.selectByVisibleText("1999");
	}
	
	//method for radio button
	public void radiobutton() throws InterruptedException {
		Thread.sleep(5000);
	        if(!selectfemale.isSelected()) {
			selectfemale.click();
		}
	
	    		submitbutton.click();
	    }
	
}


