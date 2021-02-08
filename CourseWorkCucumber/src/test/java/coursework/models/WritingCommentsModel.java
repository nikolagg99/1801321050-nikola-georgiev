package coursework.models;

import coursework.cucumber.services.CommentFormService;

public class WritingCommentsModel {

	private String comment;
	private String message;
	
	public void navigateToCommentForm() {
		System.out.println("Navigated to comment form");
		
	}

	public void setComment(String comment) {
		this.comment = comment;
		
	}

	public void addCommentButton() {
		message = CommentFormService.addComment(comment);
		
	}

	public Object getCommentMessage() {
		return message;
	}


	
	
}
