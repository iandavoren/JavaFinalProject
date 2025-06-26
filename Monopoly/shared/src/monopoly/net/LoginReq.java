package monopoly.net;

public class LoginReq implements Message {
    private final String username;
    private final String password;

    public LoginReq(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
