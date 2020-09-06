package com.sevrainchea.springbootevents.entities.order;

import com.sevrainchea.springbootevents.entities.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Order {

    @Id
    private String id;

    private User user;
}
