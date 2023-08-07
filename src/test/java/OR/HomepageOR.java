package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuables.TechnicalComponents;

public class HomepageOR extends TechnicalComponents {

	 public HomepageOR(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//span[@class='font-medium'] [contains(text(),'Shop')]")
	public WebElement mainHeading;
	
	 
	 @FindBy(xpath="//ul[@class='react-multi-carousel-track ']/li")
		public WebElement card;
	 
	  public void Highlightcard(WebElement element) {
		  highlightElement( element);
	  }
}
