package com.example.userauthenticationservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Session extends BaseModel{
    private String token;

    @ManyToOne
    private User user;
}

// Relation between User and Session

// 1          M
//User    Sessions
// 1           1

//1:M
