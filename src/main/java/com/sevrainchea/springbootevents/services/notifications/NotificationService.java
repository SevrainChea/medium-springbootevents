package com.sevrainchea.springbootevents.services.notifications;

import com.sevrainchea.springbootevents.entities.order.Order;
import com.sevrainchea.springbootevents.entities.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService implements INotificationService {

    @Override
    public void sendUserRegisteredNotification(final User user) {
        log.info("Implement your own business logic for sending mail to user");
    }

    @Override
    public void sendNewOrderNotification(final Order order) {

    }
}
