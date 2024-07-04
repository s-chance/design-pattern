package org.entropy.state;

public abstract class State {
    Article article;

    State(Article article) {
        this.article = article;
    }

    public abstract void commit();

    public abstract void reject();

    public abstract void accept();
}
