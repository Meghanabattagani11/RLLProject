package bankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	@FindBy(id="username")
	private WebElement Username;
	
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="submit")
	private WebElement Signin;
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterusername(String username) {
		Username.sendKeys(username);
	}
	public void enterpassword(String password) {
		Password.sendKeys(password);
	}
	public void clicksignin() {
		Signin.click();
	}
	
}
