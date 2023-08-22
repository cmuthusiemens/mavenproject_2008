package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_009_SkipAdAndChangeQuality extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_009_SkipAdAndChangeQuality.class);

	@Test
	public void SkipAdAndChangeQuality() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
//		StepInForumPage.scrollToElement();
//		StepInForumPage.OpenVideo();
		LOG.debug("Start !");
		StepInForumPage.SkipAdAndChangeQuality();
		LOG.debug("Ends !");
	}

}
