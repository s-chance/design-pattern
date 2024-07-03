package org.entropy.web;

public abstract class WebSite {
    String username;
    String password;

    WebSite() {
    }

    public void postRequest(String msg) {
        if (logIn(this.username, this.password)) {
            sendMsg(msg.getBytes());
            logOut();
        }
    }

    abstract boolean logIn(String username, String password);

    abstract void sendMsg(byte[] msg);

    abstract void logOut();
}
