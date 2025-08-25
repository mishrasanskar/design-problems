package pubsub;

import pubsub.entities.Message;
import pubsub.entities.Topic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class PubSubService {

    private Map<String, Topic> topicRegistry;
    private ExecutorService msgDeliveryExecutor;

    public PubSubService() {
        topicRegistry = new ConcurrentHashMap<>();
    }

    public void createTopic(String topicName) {
        topicRegistry.putIfAbsent(topicName, new Topic(topicName, msgDeliveryExecutor));
        System.out.println("Created topic " + topicName);
    }

    public void publish(String topicName, Message message) {
        Topic topic = topicRegistry.get(topicName);
        if (topic == null) {
            System.out.println("Topic " + topicName + " not found");
            return;
        }
        topic.broadcast(message);
    }


}
