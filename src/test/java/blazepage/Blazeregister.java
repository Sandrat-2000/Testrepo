package blazepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazeregister {
	WebDriver driver;
	@FindBy(id="name")
	WebElement regname;
	
	@FindBy(id="company")
	WebElement regcompany;
	
	@FindBy(id="email")
	WebElement regemail;
	
	@FindBy(id="password")
	WebElement regpassword;
	
	@FindBy(xpath="//*[@id=\"password-confirm\"]")
	WebElement regconfirmpassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement register;
	
	public Blazeregister(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String namereg,String companyreg,String emailreg,String passwordreg,String confirmpasswordreg)
	{
		regname.sendKeys(namereg);
		regcompany.sendKeys(companyreg);
		regemail.sendKeys(emailreg);
		regpassword.sendKeys(passwordreg);
		regconfirmpassword.sendKeys(confirmpasswordreg);
	}
	public void registerr()	
	{
		register.click();
	}
}
