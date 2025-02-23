package com.ankitrj3.roggers.springsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ankitrj3.roggers.springsecurity.repo.UserRepo;

@Component
public class UserService {
    @Autowired
    private UserRepo userRepo;
    

}
