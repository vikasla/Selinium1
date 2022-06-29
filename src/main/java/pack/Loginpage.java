package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="userid")
	private WebElement userIDTextBox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passTextBox;
	
	@FindBy(xpath= "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public  void Logintest1(String pass,String user,String user1) {
		userIDTextBox.sendKeys(user);
		 passTextBox.sendKeys(pass);
		 loginButton.click();
		 pin.sendKeys(user1);
		 button.click();
		}
	}

