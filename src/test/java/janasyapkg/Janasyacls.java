package janasyapkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasyacls {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	@Test
	public void test()
	{
//click on new
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
//Check the logo is present
		Boolean b1=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a")).isDisplayed();
	    if(b1)
	    {
	    	System.out.println("Logo is present");
	    }
	    else
	    {
	    	System.out.println("Logo is not present");
	    }
//select 15 the option	
		driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span")).click();
//select categories under categories click kurtha	
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	}
//display all the links in the page
	 @Test
	 public void test1()
	 {
		  List<WebElement> li = driver.findElements(By.tagName("a"));
		  System.out.println(li.size());
		  for(WebElement t:li )
		    {
		    	String link=t.getAttribute("href");
		    	String text=t.getText();
		    	System.out.println(link+"---"+text);
		    }	
	 }
//Display all the menus in this page
		 
//under kurthas add a product to wishlist
	 @Test
	 public void test2()
	 {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[4]/ul")));
	    driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div/div/div[1]/div/div[3]/div[1]/button")).click();
//click add to cart option
	    driver.findElement(By.xpath("//*[@id=\"44199301382314\"]")).click();
//click viewcart   
	    driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a")).click();
//click continue shopping         
	    driver.findElement(By.xpath("//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a")).click();
	  }
//select kurtha sets under ethnic
	  @Test
	  public void test3()
	  {
	 	 Actions act=new Actions(driver);
	 	 WebElement electro=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]"));
	 	 act.moveToElement(electro).build().perform();
//click kurtha sets	 			
	 	 driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span")).click();
	  }		
}
	
	





