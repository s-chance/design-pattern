package org.entropy;

public abstract class BaseDecorator implements Email {
    private final Email email;

    public BaseDecorator(Email email) {
        this.email = email;
    }

    @Override
    public void description(String msg) {
        email.description(msg);
    }
}
