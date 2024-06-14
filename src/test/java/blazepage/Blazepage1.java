package blazepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazepage1 {
	WebDriver driver;
	By regname=By.id("name");
	By regcompany=By.id("company");
	By regemail=By.id("email");
	By regpassword=By.id("password");
	By regconfirmpassword=By.xpath("//*[@id=\"password-confirm\"]");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public Blazepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String namereg,String companyreg,String emailreg,String passwordreg,String confirmpasswordreg)
	{
		driver.findElement(regname).sendKeys(namereg);
		driver.findElement(regcompany).sendKeys(companyreg);
		driver.findElement(regemail).sendKeys(emailreg);
		driver.findElement(regpassword).sendKeys(passwordreg);
		driver.findElement(regconfirmpassword).sendKeys(confirmpasswordreg);	
	}
}



