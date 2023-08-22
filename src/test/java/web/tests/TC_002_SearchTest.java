package web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import web.framework.BaseTest;
@Listeners (web.framework.TestStatusListener.class)
public class TC_002_SearchTest extends BaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(TC_002_SearchTest.class);

	@Test
	public void SearchTest() throws Exception {
		LOG.debug("Start !");
		HomePage.searchFor("step-inforum");
		LOG.debug("Ends !");
	}

}
