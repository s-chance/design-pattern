package org.entropy;

public class Application {
    public static void main(String[] args) {
        Factory.getFactory("foods").description();
        Factory.getFactory("drinks").description();
        Factory.getFactory("unknown").description();
    }
}