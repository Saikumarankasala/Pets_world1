package resuables;

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
	 
	public void Text_search() {
		or=new  HomepageOR(driver);
		or.SearchBox(or.search, "The Dogs");
	}
//	public void Login_page_button() {
//		or=new HomepageOR(driver);
//		or.Loginpage(or.Login);
//	}
//	public void Enter_mobile_or_Email() {
//		or=new HomepageOR(driver);
//        or.Enter_mobileNumber(or.mobilenumber, "8977977978");	
//	}
//	public void Submit_Continue_Button() {
//		or=new HomepageOR(driver);
//		or.Submit_continue(or.submit);
//	}
	public void Search_dogs_1() {
		or=new HomepageOR(driver);
        or.Searching(or.Search_dogs);
	}
	public void ShopBy_Pets_button() {
		or=new HomepageOR(driver);
		or.Shop_By_Pets(or.shopbypet);
	}
}
