public class User {
    String username = "Ugochukwu" ;
    String password = "Pass" ;
    String login() {
        if (username.equals("Ugochukwu") && password.equals("Pass")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User Daniel = new User() ;
        System.out.println(daniel.login()) ;
    }
}
