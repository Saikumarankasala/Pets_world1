package TestScript;

import org.testng.annotations.Test;

import resuables.BussinessComponent;

public class VerifyapplicationURL  extends BussinessComponent{

	@Test
	public void verifapplicationURL() throws Exception {
		openapplication() ;
		Text_search();
		Login_page_button();
	}
}
