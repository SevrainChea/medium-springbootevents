package com.sevrainchea.springbootevents.services.user;

import com.sevrainchea.springbootevents.entities.user.User;
import com.sevrainchea.springbootevents.events.newuser.NewUserEvent;
import com.sevrainchea.springbootevents.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void registerUser(final User user) {

        // Write your own business logic
        userRepository.save(user);
        applicationEventPublisher.publishEvent(new NewUserEvent(this, user));

    }
}
