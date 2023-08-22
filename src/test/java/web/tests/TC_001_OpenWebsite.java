package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_001_OpenWebsite extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_001_OpenWebsite.class);

	@Test
	public void OpenWebsite() throws Exception {
		LOG.debug("Start !");
		HomePage.Launch();
		HomePage.verifyPageTitle("YouTube");
		LOG.debug("Ends !");
	}

}
