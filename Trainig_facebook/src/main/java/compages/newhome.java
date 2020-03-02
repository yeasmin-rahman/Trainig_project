package compages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newhome {
	WebDriver driver;
	@FindBy(name="email")
	WebElement userid;
	@FindBy(name="pass")
	WebElement pssword;
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement loginbutton;
	public newhome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

public void Emailfielf(String enteridmail) {
	userid.sendKeys(enteridmail);
}
public void psswardfield(String enterpassword) {
	pssword.sendKeys(enterpassword);
}
public void loginfield() {
	loginbutton.click();
}
public void forgotfield() {
	
}

}
