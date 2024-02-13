package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    // create topic
    @Bean
    public NewTopic topinc(){


        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)      // topic name
//                .partitions()                             // we can add partions here
//                .replicas();
                .build();
    }
}
