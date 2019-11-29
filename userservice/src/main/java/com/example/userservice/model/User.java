package com.example.userservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;


@Entity(name = "client")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name="first_name", length=100, nullable = false)
    private String name;

    @Column(name="last_name", length=100, nullable = false)
    private String lastName;

    @Column(name="client_phone", length=100, nullable = false)
    private String clientPhone;

    @Column(name="client_email", length=100, nullable = false)
    private String clientEmail;

}
