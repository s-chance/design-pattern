package org.entropy;

public class CompressionDecorator extends BaseDecorator {
    public CompressionDecorator(Email email) {
        super(email);
    }

    @Override
    public void description(String msg) {
        super.description(compress(msg));
    }

    private String compress(String msg) {
        System.out.println("compress msg");
        return msg + "(compressed)";
    }
}
