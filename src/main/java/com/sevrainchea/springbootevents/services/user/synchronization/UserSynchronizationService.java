package com.sevrainchea.springbootevents.services.user.synchronization;

import com.sevrainchea.springbootevents.entities.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserSynchronizationService implements IUserSynchronizationService {

    @Override
    public void synchronizeWithExternalServices(final User user) {

        log.info("Implement your own business logic for synchronization");

    }
}
