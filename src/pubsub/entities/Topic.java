package pubsub.entities;

import pubsub.subscriber.Subscriber;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

public class Topic {
    private Set<Subscriber> subscribers;
    private String topic;
    private ExecutorService msgDeliveryExecutor;

    public Topic(String topic, ExecutorService msgDeliveryExecutor) {
        this.topic = topic;
        this.subscribers = new CopyOnWriteArraySet<>();
        this.msgDeliveryExecutor = msgDeliveryExecutor;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void broadcast(Message message) {
        for (Subscriber subscriber : subscribers) {
            msgDeliveryExecutor.submit(() -> {
                subscriber.onMessage(message);
            });
        }
    }

}
