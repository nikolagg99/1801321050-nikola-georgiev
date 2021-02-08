package coursework.cucumber;


/**
 * 
 */
public class Comment {
    private String content;
    public String Attribute2;
    public User user;
    public Subtopic subtopic;
    public Topic topic;

    
    /**
     * Default constructor
     */
    public Comment() {
    }
    
    
    /**
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content 
     * @return
     */
    public void setContent(String content) {
        this.content = content;
    }

}