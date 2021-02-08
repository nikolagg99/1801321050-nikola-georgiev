package coursework.cucumber;

import static org.junit.Assert.assertEquals;

import coursework.models.WritingCommentsModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WritingComments {

	WritingCommentsModel writingCommentsModel = new WritingCommentsModel();
	
	@Given("^The user open the writing comments form$")
	public void openCommentForm() throws Throwable {
		writingCommentsModel.navigateToCommentForm();
	}

	@When("^Writing comment \"([^\"]*)\"$")
	public void addComment(String comment) throws Throwable {
		writingCommentsModel.setComment(comment);
	}
	

	@When("^Clicks add comment button$")
	public void clickAddCommentButton() throws Throwable {
		writingCommentsModel.addCommentButton();
	}

	@Then("^Recieve a message \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
		assertEquals(message, writingCommentsModel.getCommentMessage());
	}


	
}
