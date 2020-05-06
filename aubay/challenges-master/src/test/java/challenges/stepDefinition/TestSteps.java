package challenges.stepDefinition;

import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import challenges.setup.MessageServer;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flow.Engine;
import flow.IAdapter;
import flow.IAgent;
import flow.IApp;
import flow.samples.TextAdapter;
import flow.samples.TextAgent;
import flow.samples.TextApp;

public class TestSteps {

	//protected static MessageServer server;
	private Engine engine;
	 
	@Given("^a User sends an <menssageFirst> message$")
	public void a_User_sends_an_menssageFirst_message() throws Throwable {

	    engine = new Engine(mock(IAgent.class), mock(Map.class), mock(IApp.class));
	    engine.run();
	    
	}

	@When("^the message is converted by the Adapter$")
	public void the_message_is_converted_by_the_Adapter() throws Throwable {

	    engine = new Engine(new TextAgent("hello"), mock(Map.class), mock(IApp.class));
	    engine.run();
	    
	}

	@Then("^the Message server should contain the <messageSecond> message in the queue$")
	public void the_Message_server_should_contain_the_messageSecond_message_in_the_queue(DataTable arg1) throws Throwable {

	    Map<String, IAdapter> adapters = new HashMap();
	    adapters.put("edimilsonestevam@gmail.com", new TextAdapter());
	    engine = new Engine(new TextAgent("hello1", "hello2", "hello3"), adapters, new TextApp());
	    engine.run();
	    TextApp textApp = (TextApp) engine.getApp();
	    Assert.assertEquals("ACK:hello1", textApp.popResponse());
	    Assert.assertEquals("ACK:hello2", textApp.popResponse());
	    Assert.assertEquals("ACK:hello3", textApp.popResponse());
	    
	}

}