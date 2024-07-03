package org.entropy;

public class Application {
    public static void main(String[] args) {

        BaseDecorator email = new CompressionDecorator(
                new EncryptionDecorator(
                        System.out::println
                )
        );

        BaseDecorator email2 = new EncryptionDecorator(
                new CompressionDecorator(
                        System.out::println
                )
        );

        email.description("this is an email");
        email2.description("this is the second email");
    }
}

