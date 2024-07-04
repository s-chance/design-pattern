package org.entropy.state;

public class AuditedState extends State {
    AuditedState(Article article) {
        super(article);
    }

    @Override
    public void commit() {
        System.out.println("already committed");
    }

    @Override
    public void reject() {
        article.changeState(new DraftedState(article));
        System.out.println("reject!");
        System.out.println(this + "-->" + article.getState());
    }

    @Override
    public void accept() {
        article.changeState(new PublishedState(article));
        System.out.println("accept!");
        System.out.println(this + "-->" + article.getState());
    }
}
