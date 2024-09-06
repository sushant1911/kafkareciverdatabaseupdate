package com.kafkaReciver.kafkareciverdatabaseupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class KafkareciverdatabaseupdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkareciverdatabaseupdateApplication.class, args);
	}

}
