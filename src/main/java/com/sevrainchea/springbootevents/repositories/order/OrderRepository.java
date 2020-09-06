package com.sevrainchea.springbootevents.repositories.order;

import com.sevrainchea.springbootevents.entities.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
