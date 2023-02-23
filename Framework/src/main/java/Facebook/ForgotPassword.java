package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	@FindBy(xpath="//div[@class='_9nq2 marginBottom16px']")private WebElement forgotPassword;
	
	@FindBy(xpath="//input[@type='text']")private WebElement emailOrMobileNo;
	
	@FindBy(xpath="(//a[@role='button'])[1]")private WebElement cancelButton;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement searchButton ;
	

	//Constructor : Initialization of WebElement : create your amazon account
	
	public ForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Method Action on WebElement : Login or Sign Page 
	
	public void forgotPassword() {
		String text = forgotPassword.getText();
		System.out.println(text);
	}
	
	public void  emailOrMobileNo() {
		 emailOrMobileNo.sendKeys("8975440496");
	}
	
	public void cancelButton() {
		cancelButton.click();
	}
	
	public void searchButton() {
		
		searchButton.click();
		
	}
}

