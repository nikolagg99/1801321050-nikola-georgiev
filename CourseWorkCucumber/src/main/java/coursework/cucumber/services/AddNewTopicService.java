package coursework.cucumber.services;

public class AddNewTopicService {

	public static String addNewTopic(String header, String content) {
		if(header == null && content == null) {
			return "Error. You can't add new topic without any header and content";
		}
		if(header == null) {
			return "Error. You can't add new topic without header";
		}
		if(content == null) {
			return "Error. You can't add new topic without content";
		}
		
		return "Successfully added topic";
	}

}
