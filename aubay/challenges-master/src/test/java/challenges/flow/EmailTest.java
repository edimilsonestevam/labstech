package challenges.flow;

import flow.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;


@RunWith(JUnit4.class)
public class EmailTest {

  @Test
  public void testRun_AdapterIsCompliantWithProtocol_AppHasHelloMessage() throws Exception {
    
	UserAgent user = new UserAgent();
	user.getAgentName("Edimilson Estevam");
    Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
    adapters.put("edimilsonestevam@gmail.com", new EmailAdapter());

    EmailApp app = new EmailApp();
    Engine engine = new Engine(user, adapters, app);
    engine.run();
    Assert.assertEquals("hello", app.popMessage());
    
  }
}