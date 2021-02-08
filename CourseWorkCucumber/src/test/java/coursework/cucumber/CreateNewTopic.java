package coursework.cucumber;

import static org.junit.Assert.assertEquals;

import coursework.models.CreatingTopicModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewTopic {
	
	CreatingTopicModel cretingTopicModel = new CreatingTopicModel();
	
	@Given("^The user open the form for creating new topic$")
	public void openNewTopicForm() throws Throwable {
	    cretingTopicModel.navigateToNewTopicForm();
	}

	@When("^Writing header of the topic \"([^\"]*)\"$")
	public void addHeader(String header) throws Throwable {
	    cretingTopicModel.setHeader(header);
	}

	@When("^Writing the content of the topic \"([^\"]*)\"$")
	public void addContent(String content) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cretingTopicModel.setContent(content);
	}

	@When("^Clicks add topic button$")
	public void clickAddNewTopicButton() throws Throwable {
	    cretingTopicModel.addNewTopicButton();
	}
	
	@Then("^Recieves a message \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
	    assertEquals(message, cretingTopicModel.getContentMessage());
	}

}