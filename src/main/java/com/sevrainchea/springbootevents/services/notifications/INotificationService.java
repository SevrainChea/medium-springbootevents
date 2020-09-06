package com.sevrainchea.springbootevents.services.notifications;

import com.sevrainchea.springbootevents.entities.order.Order;
import com.sevrainchea.springbootevents.entities.user.User;

public interface INotificationService {

    void sendUserRegisteredNotification(User user);

    void sendNewOrderNotification(Order order);

}
