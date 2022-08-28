package com.hooon.kafkaconsumer.member;

import com.hooon.kafkaconsumer.member.event.MemberEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberKafkaConsumer {

    private final MemberProcessor processor;

    @KafkaListener(
            topics = "${kafka.topic.name}",
            concurrency = "${kafka.topic.thread}"
    )
    public void consume(MemberEvent event) {
        try {
            processor.process(event);
        } catch (RuntimeException e) {
            log.error("error, message: {}", e.getMessage());
        }
    }
}
