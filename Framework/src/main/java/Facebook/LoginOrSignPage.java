package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignPage {
	
	//Variable : WebElement : Login Or Sign Page 
	
		@FindBy(xpath ="//input[@type='text']")private WebElement emailOrPhoneNo;
		
		@FindBy(xpath ="//input[@type='password']")private WebElement password;
		
		@FindBy(xpath ="//button[@name='login']")private WebElement loginButton;
		
		@FindBy(xpath ="//a[text()='Forgotten password?']")private WebElement forgotpasswordButton;
		
		@FindBy(xpath="(//a[@role='button'])[2]")private WebElement createaccountButton;
		

		
		//Constructor : Initialization of WebElement : create your amazon account
		
		public LoginOrSignPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		//Method Action on WebElement : Login or Sign Page 
		
		public void emailOrPhoneNo() {
			
			emailOrPhoneNo.sendKeys("prashant6591@gmail.com");
			
		}

		public void password(){
			
			password.sendKeys("Prashant@11");
			
		}
		
		public void loginButton() {
			
			 loginButton.click();
		}
		
		public void forgotpasswordButton() {
			
			forgotpasswordButton.click();
			
		}
		
		public void createOnAccountButton() {
			
			createaccountButton.click();
		}


}

