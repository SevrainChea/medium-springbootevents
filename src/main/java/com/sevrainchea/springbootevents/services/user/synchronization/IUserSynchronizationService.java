package com.sevrainchea.springbootevents.services.user.synchronization;

import com.sevrainchea.springbootevents.entities.user.User;

public interface IUserSynchronizationService {

    void synchronizeWithExternalServices(User user);
}
