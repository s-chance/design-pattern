package org.entropy;

public class Application {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        for (int i = 0; i < 5; i++) {
            int id = i;
            Subscriber subscriber = msg -> {
                System.out.println("message to subscriber" + id + ": " + msg);
            };
            publisher.addSubscriber(subscriber);
            if (i == 4) {
                // I want to unsubscribe
                publisher.removeSubscriber(subscriber);
            }
        }

        for (int i = 5; i < 10; i++) {
            int id = i;
            Subscriber newsSubscriber = msg -> {
                System.out.println("message to new subscriber" + id + ": " + msg);
            };
            if (i == 6) {
                // I want to subscribe
                publisher.addSubscriber(newsSubscriber);
            }
        }

        publisher.notify("new article has published!");
    }
}
