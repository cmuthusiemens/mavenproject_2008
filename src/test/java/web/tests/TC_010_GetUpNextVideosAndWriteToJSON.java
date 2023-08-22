package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_010_GetUpNextVideosAndWriteToJSON extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_010_GetUpNextVideosAndWriteToJSON.class);

	@Test
	public void GetUpNextVideosAndWriteToJSON() throws Exception {
//		HomePage.Launch();
//		HomePage.verifyPageTitle("YouTube");
//		HomePage.searchFor("step-inforum");
//		HomePage.OpenChannel();
//		StepInForumPage.navigateToVideos();
//		StepInForumPage.scrollToElement();
//		StepInForumPage.OpenVideo();
//		StepInForumPage.SkipAdAndChangeQuality();
		LOG.debug("Start !");
		StepInForumPage.GetUpNextVideosAndWriteToJSON();
		LOG.debug("Ends !");
	}

}
