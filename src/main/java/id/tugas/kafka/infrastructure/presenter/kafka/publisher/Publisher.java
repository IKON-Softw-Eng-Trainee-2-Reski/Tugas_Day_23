package id.tugas.kafka.infrastructure.presenter.kafka.publisher;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public Publisher(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void helloKafka() {
        kafkaTemplate.send("hello", "Hello Kafka!");
    }

    public void tea(){
        kafkaTemplate.send("tea", "I enjoy tea");
    }

    public void coffee(){
        kafkaTemplate.send("coffee", "I love coffee");
    }

    public void boba(){
        kafkaTemplate.send("boba", "Wonderfull day to drink boba");
    }
}
