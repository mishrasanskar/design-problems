package pubsub.subscriber;

import pubsub.entities.Message;

public class NewsSubscriber implements Subscriber {

    private String id;
    public NewsSubscriber(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("News message received: " + message);
    }
}
