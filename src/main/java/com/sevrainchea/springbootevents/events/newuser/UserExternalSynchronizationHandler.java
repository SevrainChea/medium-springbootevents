package com.sevrainchea.springbootevents.events.newuser;

import com.sevrainchea.springbootevents.services.user.synchronization.IUserSynchronizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserExternalSynchronizationHandler {

    @Autowired
    private IUserSynchronizationService userSynchronizationService;

    @EventListener
    public void handleNewUser(final NewUserEvent newUserEvent) {
        userSynchronizationService.synchronizeWithExternalServices(newUserEvent.getUser());
    }
}
