package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_008_ClickVideo extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_008_ClickVideo.class);

	@Test
	public void ClickVideo() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
//		StepInForumPage.scrollToElement();
		LOG.debug("Start !");
		StepInForumPage.OpenVideo();
		LOG.debug("Ends !");
	}

}
