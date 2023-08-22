package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_004_NavigateAndChose extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_004_NavigateAndChose.class);

	@Test
	public void NavigateAndChose() throws Exception {
		//HomePage.Launch();
		//HomePage.verifyPageTitle("YouTube");
		//HomePage.searchFor("step-inforum");
		//HomePage.OpenChannel();
		LOG.debug("Start !");
		StepInForumPage.navigateToVideos();
		LOG.debug("Ends !");
	}

}
