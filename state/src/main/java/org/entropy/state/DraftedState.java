package org.entropy.state;

public class DraftedState extends State {
    DraftedState(Article article) {
        super(article);
    }

    @Override
    public void commit() {
        article.changeState(new AuditedState(article));
        System.out.println("committed!");
        System.out.println(this + "-->" + article.getState());
    }

    @Override
    public void reject() {
        System.out.println("not committed");
    }

    @Override
    public void accept() {
        System.out.println("not committed");
    }
}
