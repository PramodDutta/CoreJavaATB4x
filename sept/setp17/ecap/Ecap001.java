package sept.setp17.ecap;

public class Ecap001 {

    public static void main(String[] args) {

        VWOLoginClass vwoLoginClass = new VWOLoginClass("Lucky", "Hacker");
//        vwoLoginClass.password = "admin";
        vwoLoginClass.setPassword("admin");
//        String pass = vwoLoginClass.getPassword();
//        System.out.println(pass);


        // Checking at the backend
        boolean isLoggedIn = vwoLoginClass.isLoggedIn("admin", "admin");
        System.out.println(isLoggedIn);



    }
}


class VWOLoginClass {

    private String username;
    private String password;

    public String getUsername() {
       return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

    VWOLoginClass(String u, String p) {
        this.username = u;
        this.password = p;
    }

    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.equals(password)) {
            System.out.println("Yes You are a valid username");
            return true;
        } else {
            System.out.println("Wrong user");
            return false;
        }

    }


}
