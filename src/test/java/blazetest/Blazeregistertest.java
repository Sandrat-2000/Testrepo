package blazetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazepage.Blazeregister;



public class Blazeregistertest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
    @BeforeMethod
    public void url()
    {
    	driver.get("https://blazedemo.com/register");
    }
    @Test
    public void testlogin()
    {
    	Blazeregister ob=new Blazeregister(driver);
    	ob.setvalues("Rohit","icc","abc@gmail.com","abcd","abcd");
    	ob.registerr();
    }

}
