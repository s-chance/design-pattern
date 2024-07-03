package org.entropy;

import java.util.Base64;

public class EncryptionDecorator extends BaseDecorator {

    public EncryptionDecorator(Email email) {
        super(email);
    }

    @Override
    public void description(String msg) {
        super.description(encode(msg));
    }

    private String encode(String msg) {
        System.out.println("encode msg");
        return msg + "(encoded)";
    }
}
