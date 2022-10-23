package applicationHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		//System.out.println(sc.getName());
	}
	
	@Before
	public void setup_url() {
		System.out.println("launch url");
	}
	
	
	@After(order = -1)
	public void tearDown_logout(Scenario sc) {
		System.out.println(sc.getStatus());
		System.out.println("logout from application");
	}
	
	@After("@Smoke")
	public void tearDown_close() {
		System.out.println("close the browser");
	}
	
//	@BeforeStep
//	public void takescreenshot() {
//		System.out.println("take the screenshot");
//	}
//	
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("refresh the page");
//	}
}
