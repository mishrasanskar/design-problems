package pubsub.entities;

import java.time.Instant;

public class Message {
    private String payload;
    private Instant timestamp;

    public Message(String payload) {
        this.payload = payload;
        this.timestamp = Instant.now();
    }

    public String getPayload() {
        return payload;
    }
}
