package blazetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazepage.Blazelogin;



public class Blazelogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
    @BeforeMethod
    public void url()
    {
    	driver.get("https://blazedemo.com/login");
    }
    @Test
    public void testlogin()
    {
    	Blazelogin obb=new Blazelogin(driver);
    	obb.setvalues("abc@gmail.com","abcd");
    	obb.loginn();

}
}