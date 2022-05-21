package builder;

public class Main {
    public static void main(String[] args){
        User user = new UserBuilder().setId("1").setName("Ashik").getUser();
        System.out.println(user.toString());
    }
}
