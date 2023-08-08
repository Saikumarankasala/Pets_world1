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
	 
	 @FindBy(xpath="//div[@class='h-12 bg-white w-full max-w-2xl rounded-md relative']/input[@name='search']")
	 public WebElement search;
	 
	 @FindBy(xpath="//*[@id=\'__next\']/header/div[1]/div/div[2]/div[1]/div[2]/ul/li[1]")
	public WebElement Search_text; 
	 
	@FindBy(xpath="//div[@class='w-full hidden lg:block relative']/nav/ul/li/span[contains(text(),'Shop by Pet')]")
	public WebElement MOUSERHOVER_ACTIONS;
	  
	 public void Highlightcard(WebElement element) {
		  highlightElement( element);
	  }
      public void SearchBox(WebElement element,String text) {
	 TechnicalComponents.type(element, text);
}
     public void Text_search(WebElement element) {
    	 TechnicalComponents.Click(element);
     }
     public void Actions_class(WebElement element) {
    	 TechnicalComponents.Click(element);
     }
    	
    }


