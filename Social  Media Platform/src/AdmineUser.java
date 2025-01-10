public class AdmineUser extends User{
    private String moderationTools;
    public AdmineUser(String userName, String email, String password) {
        super(userName, email, password);
    }

    public AdmineUser(String userName, String email, String password, String moderationTools) {

        super(userName, email, password);
        this.moderationTools = moderationTools;
    }

    public String getModerationTools() {
        return moderationTools;
    }

    public void setModerationTools(String moderationTools) {
        this.moderationTools = moderationTools;
    }

    @Override
    public String toString() {
        return super.toString()+
                "moderationTools='" + moderationTools + '\'' +
                '}';
    }
}
