package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_003_OpenChannel extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_003_OpenChannel.class);

	@Test
	public void OpenChannel() throws Exception {
		//HomePage.Launch();
		//HomePage.verifyPageTitle("YouTube");
		//HomePage.searchFor("step-inforum");
		LOG.debug("Start !");
		HomePage.OpenChannel();
		LOG.debug("Ends !");
	}

}
