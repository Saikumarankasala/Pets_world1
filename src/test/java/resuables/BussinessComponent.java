package resuables;

import org.openqa.selenium.WebElement;

import OR.HomepageOR;

public class BussinessComponent extends TechnicalComponents {
      HomepageOR or;
	 public void openapplication() throws Exception {
		 TechnicalComponents.NavigateToURL(pro.getProperty("url"));
		 String actualtext= getcurrentURl();
		 if(actualtext.equalsIgnoreCase("https://petsworld.in/")) {
			 System.out.println(" url is verified");
		 }else {
			 System.out.println(" url is not verified");
		 }
		 or= new HomepageOR(driver);
		 String actualtext1=getText(or.mainHeading);
		 if(actualtext1.equalsIgnoreCase("Shop")) {
			 System.out.println(" url is verified");
		 }else {
			 System.out.println(" url is not verified");
		 }
		or. Highlightcard(or.card);
	 }
}
