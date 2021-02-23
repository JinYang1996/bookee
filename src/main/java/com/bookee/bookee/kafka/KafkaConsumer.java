package com.bookee.bookee.kafka;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"testtopic4"},groupId = "group1")
    public void onMessage(ConsumerRecord<?,?> record){
        log.error("接受到消息,{},{},{},{}",record.topic(),record.partition(),record.value(),record.offset());
    }
}
