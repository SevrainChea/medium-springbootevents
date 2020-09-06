package com.sevrainchea.springbootevents.events.newuser;

import com.sevrainchea.springbootevents.entities.user.User;
import org.springframework.context.ApplicationEvent;

public class NewUserEvent extends ApplicationEvent {

    private User user;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public NewUserEvent(final Object source, final User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
