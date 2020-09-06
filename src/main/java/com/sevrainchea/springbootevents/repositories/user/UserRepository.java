package com.sevrainchea.springbootevents.repositories.user;

import com.sevrainchea.springbootevents.entities.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
