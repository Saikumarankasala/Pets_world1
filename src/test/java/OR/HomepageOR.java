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
	 
//	 @FindBy(xpath="(//div[@class='flex flex-1 justify-end h-full space-x-5 md:space-x-10']/div[@class='h-full hidden md:flex items-center'])[2]/a[@href='/auth/v2']")
//	 public WebElement Login;
//	 
//	 @FindBy(xpath="//input[@placeholder='Mobile Number / Email']")
//	 public WebElement mobilenumber;
//	 
//	 @FindBy(xpath="//button[@type='submit']/div[@class='flex items-center']/div[contains(text(),'Continue')]")
//	 public WebElement submit;
//	 
	 @FindBy(xpath="//*[@id=\"__next\"]/header/div[1]/div/div[2]/div[1]/div[2]/ul/li[1]")
	 public WebElement Search_dogs;
	 
	 @FindBy(xpath="//div[@class='w-full hidden lg:block relative']/nav/ul/li/span[contains(text(),'Shop by Pet')]")
	 public WebElement shopbypet;
	 
	 
	 
	  public void Highlightcard(WebElement element) {
		  highlightElement( element);
	  }
      public void SearchBox(WebElement element,String text) {
	 TechnicalComponents.type(element, text);
}
//      public void Loginpage(WebElement element) {
//    	  TechnicalComponents.Click(element);
//      }
//      public void Enter_mobileNumber(WebElement element,String text) {
//    	  TechnicalComponents.type(element, text);
//      }
//      public void Submit_continue(WebElement element) {
//    	  TechnicalComponents.Click(element);
//      }
      public void Searching(WebElement element) {
    	  TechnicalComponents.Click(element);
      }
      public void Shop_By_Pets(WebElement element) {
    	  TechnicalComponents.Click(element);
    	  }
}
