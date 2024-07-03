package org.entropy;

import org.entropy.web.FaceBook;
import org.entropy.web.Twitter;

public class Application {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        String msg = "hello world";
        new FaceBook(username, password).postRequest(msg);
        new Twitter(username, password).postRequest(msg);
    }
}
