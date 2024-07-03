package org.entropy.web;

public class FaceBook extends WebSite {

    public FaceBook(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    boolean logIn(String username, String password) {
        System.out.println("authenticate...");
        System.out.println("Name: " + this.username);
        System.out.print("Password: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }

        System.out.println("\nlogIn success on Facebook");
        return true;
    }

    @Override
    void sendMsg(byte[] msg) {
        System.out.println("Message: '" + new String(msg) + "' was posted on Facebook");
    }

    @Override
    void logOut() {
        System.out.println("User: '" + username + "' was logged out from Facebook");
    }
}
