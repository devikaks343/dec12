package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	@FindBy (name ="email")
	WebElement emailfeild;
	
	@FindBy (name="pass")
	WebElement pswd;
	
	@FindBy (name="login")
	WebElement loginbutton;
	
		
	
	
	public Fbloginpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void loginclick()
	{
	loginbutton.click();
	}

	public void setvalues(String UN,String PWD)
	{
		emailfeild.sendKeys(UN);
		pswd.sendKeys(PWD);
	}
	
	
	
	
	

}
