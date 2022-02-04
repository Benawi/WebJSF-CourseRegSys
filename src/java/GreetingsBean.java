
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *

 */
@ManagedBean
@RequestScoped
public class GreetingsBean {

    private String userName = "";

    /**
     * Creates a new instance of GreetingsBean
     */
    public GreetingsBean() {
        System.out.println("Created GreetingsBean instance...");
    }

    public String getUserName() {
        return this.userName.trim();
    }

    public void setUserName(String userName) {
        this.userName = userName.trim();
    }

    public String greetUser() {
        return "greeting";
    }
}
