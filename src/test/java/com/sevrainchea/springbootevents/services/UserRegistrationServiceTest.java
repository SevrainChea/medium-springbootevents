package com.sevrainchea.springbootevents.services;

import com.sevrainchea.springbootevents.entities.user.User;
import com.sevrainchea.springbootevents.repositories.user.UserRepository;
import com.sevrainchea.springbootevents.services.user.UserRegistrationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserRegistrationServiceTest {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {

        final User user = User.builder().userName("myUser").build();
        userRegistrationService.registerUser(user);
        assertEquals(1, userRepository.findAll().size());
    }
}
