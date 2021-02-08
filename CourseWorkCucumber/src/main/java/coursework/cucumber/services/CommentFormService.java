package coursework.cucumber.services;

public class CommentFormService {

	public static String addComment(String comment) {
		final boolean isEmpty;
		if(comment == "") {
			isEmpty = true;
		}else {
			isEmpty = false;
		}
		return isEmpty ? "Can't upload empty comments" : "Comment uploaded successfully";
	}
	

}
