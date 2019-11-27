package com.example.hellodocker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;


@Entity(name = "Client")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String lastName;
    private String clientPhone;
    private String clientEmail;

}
