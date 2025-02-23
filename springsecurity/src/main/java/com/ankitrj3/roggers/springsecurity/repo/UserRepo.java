package com.ankitrj3.roggers.springsecurity.repo;

import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.ankitrj3.roggers.springsecurity.entity.Users;

public interface UserRepo extends MongoRepository<Users, ObjectId> {
    User findByUsername(String username);
}
