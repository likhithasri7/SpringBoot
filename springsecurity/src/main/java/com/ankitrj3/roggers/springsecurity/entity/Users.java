package com.ankitrj3.roggers.springsecurity.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Data
public class Users {
    @Id
    private ObjectId id;
    @NonNull
    @Indexed(unique = true)
    private String username;
    @NonNull
    private String password;
    
}
