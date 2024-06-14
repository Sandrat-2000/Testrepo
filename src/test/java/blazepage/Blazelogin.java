package blazepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazelogin {
		WebDriver driver;
		@FindBy(id="email")
		WebElement logemail;
		
		@FindBy(id="password")
		WebElement logpassword;
		
		@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
		WebElement login;
		
		public Blazelogin(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		public void setvalues(String emaillog,String passwordlog)
		{
			logemail.sendKeys(emaillog);
			logpassword.sendKeys(passwordlog);
			
		}
		public void loginn()	
		{
			login.click();
		}
	


}
