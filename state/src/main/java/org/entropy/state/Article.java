package org.entropy.state;

public class Article {
    private State state;

    public Article() {
        this.state = new DraftedState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
