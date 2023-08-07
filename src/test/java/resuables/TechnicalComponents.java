package resuables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.BaseClass;

public class TechnicalComponents extends BaseClass {
public static WebDriver driver;

	public  static void NavigateToURL(String url) throws Exception {
		driver= new BaseClass().getDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	 public String getcurrentURl() {
		 String curl=driver.getCurrentUrl();
		 return curl;
	 }
	 
	 public String getText(WebElement element) {
		 String text=element.getText();
		 return text;
	 }
	  public void Click(WebElement element) {
		  element.click();
	  }
	   public static  void highlightElement(WebElement element) {
		   ex=(JavascriptExecutor)driver;
		   ex.executeScript("window.scrollBy(0,150)","");
		   ex.executeScript("arguments[0].style.border='10px solid red'",element);
		   
	   }
	
}
