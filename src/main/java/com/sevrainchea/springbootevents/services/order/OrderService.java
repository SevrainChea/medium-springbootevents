package com.sevrainchea.springbootevents.services.order;

import com.sevrainchea.springbootevents.repositories.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
}
