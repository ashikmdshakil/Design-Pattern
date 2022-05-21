package builder;

public class UserBuilder {
    private String id;
    private String name;
    private String mobileNumber;
    private String email;
    private String password;

    public UserBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User getUser(){
        return new User(this.id, this.name, this.mobileNumber, this.email, this.password);
    }
}
