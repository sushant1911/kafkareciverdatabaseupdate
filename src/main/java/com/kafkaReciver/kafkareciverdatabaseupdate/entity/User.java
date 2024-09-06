package com.kafkaReciver.kafkareciverdatabaseupdate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Email;
@Data
@Entity
@
        NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NonNull

    private String first_name;

    @NonNull
    private String last_name;

    @Email
    private String email;


    private String gender;


    private String city;

    private String mobile_number;
}
