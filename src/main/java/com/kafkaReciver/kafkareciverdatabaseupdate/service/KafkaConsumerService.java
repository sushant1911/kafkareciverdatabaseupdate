package com.kafkaReciver.kafkareciverdatabaseupdate.service;

import com.kafkaReciver.kafkareciverdatabaseupdate.entity.User;
import com.kafkaReciver.kafkareciverdatabaseupdate.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumerService {
    Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @Autowired
    private UserRepository userRepository;
    @KafkaListener(topics = "add_users", groupId = "add_users_group", containerFactory = "kafkaListenerContainerFactory")
    public void consume(List<User> userList) {
        log.info("Received User List: " + userList);
        try {
            userRepository.saveAll(userList);
            log.info("Users saved successfully.");
        } catch (Exception e) {
            log.error("Error saving users to database: ", e);
        }
    }
}
