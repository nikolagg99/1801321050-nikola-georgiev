package coursework.cucumber;
import java.util.*;

/**
 * 
 */
public class User {
    private String username;
    private String password;
    private String email;
    private Boolean isAdmin;
    public Topic user;
    public Set<Topic> topic;
    private Set<Comment> comment = new HashSet<>();
    
    /**
     * Default constructor
     */
    public User() {
    }
    

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin 
     * @return
     */
    public void setIsAdmin(Boolean isAdmin) {
       this.isAdmin = isAdmin;
    }

    /**
     * @return
     */
    public Set getComment() {
        return comment;
    }

    /**
     * @param comment 
     * @return
     */
    public void setComment(Set comment) {
        this.comment = comment;
    }

    /**
     * @param comment 
     * @return
     */
    public void addComment(Comment comment) {
        this.comment.add(comment);
    }

}