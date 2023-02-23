package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password {
	
	//Variable : WebElement : Password Page 
	
	@FindBy (xpath="//input[@name='password']") 
	private WebElement passwordAmazon;
	
	@FindBy (xpath="(//input[@type='submit'])[1]") 
	private WebElement signInButton;
	

	//Constructor : Initialization of WebElement : entering password
	
	public Password(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Method Action on WebElement : Login or Sign Page 
	
		public void sendEmailorPhoneNo() {
			
			passwordAmazon.sendKeys("india@11");
			
		}
		
		public void clickContine() {
			signInButton.click();
			
		}	 

}
