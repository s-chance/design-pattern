package org.entropy;

public class Application {
    public static void main(String[] args) {
        User tom = new User("Tom");
        User jerry = new User("Jerry");

        tom.sendMsg("Jerry, is that you?");
        jerry.sendMsg("That's not me :)");
    }
}
