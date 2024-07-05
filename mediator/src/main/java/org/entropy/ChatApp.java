package org.entropy;

import java.util.Date;

public class ChatApp {
    public static void showMsg(User user, String msg) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + msg);
    }
}
