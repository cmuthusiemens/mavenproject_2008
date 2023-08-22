package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_006_007_ScrollToElement extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_006_007_ScrollToElement.class);

	@Test
	public void ScrollToElement() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
		LOG.debug("Start !");
		StepInForumPage.scrollToElement();
		LOG.debug("Ends !");
	}

}
