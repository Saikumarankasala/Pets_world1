package TestScript;

import org.testng.annotations.Test;

import resuables.BussinessComponent;

public class VerifyapplicationURL  extends BussinessComponent{

	@Test
	public void verifapplicationURL() throws Exception {
		openapplication() ;
		Text_search();
//		Login_page_button();
//		Enter_mobile_or_Email();
//		Submit_Continue_Button();
		Search_dogs_1();
		ShopBy_Pets_button();
	}
}
