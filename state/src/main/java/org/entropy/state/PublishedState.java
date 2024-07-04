package org.entropy.state;

public class PublishedState extends State {
    PublishedState(Article article) {
        super(article);
    }

    @Override
    public void commit() {
        msg();
    }

    @Override
    public void reject() {
        msg();
    }

    @Override
    public void accept() {
        msg();
    }

    private static void msg() {
        System.out.println("already published");
    }
}
