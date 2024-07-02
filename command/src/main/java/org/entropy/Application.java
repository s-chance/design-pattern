package org.entropy;

public class Application {
    public static void main(String[] args) {
        Command attack = () -> {
            System.out.println("attack");
        };

        Command defend = () -> {
            System.out.println("defend");
        };

        Command save = () -> {
            System.out.println("save");
        };

        Command exit = () -> {
            System.out.println("exit");
        };

        Invoker invoker = new Invoker();
        invoker.addCommand(attack);
        invoker.addCommand(defend);
        invoker.addCommand(save);
        invoker.addCommand(exit);

        invoker.revoke(exit);

        invoker.click();
    }
}
