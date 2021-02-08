package coursework.models;


import coursework.cucumber.services.AddNewTopicService;

public class CreatingTopicModel {

	private String header;
	private String content;
	private String message;
	
	public void navigateToNewTopicForm() {
		System.out.println("Navigated to the form for adding new topic");
		
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void addNewTopicButton() {
		message = AddNewTopicService.addNewTopic(header, content);
	}

	public Object getContentMessage() {
		return message;
	}

}
