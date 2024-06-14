package blazepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazeloginpage1 {
	WebDriver driver;
	By logemail=By.id("email");
	By logpassword=By.id("password");
	By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public Blazeloginpage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String emaillog,String passwordlog)
	{
		driver.findElement(logemail).sendKeys(emaillog);
		driver.findElement(logpassword).sendKeys(passwordlog);
		

}
}