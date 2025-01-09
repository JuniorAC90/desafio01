package com.devsuperior.desafio01.desafio01.services;

import com.devsuperior.desafio01.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double value = 0;

        if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return value + 12;
        }

        if (order.getBasic() < 100) {
            return value + 20;
        }

        return value;
    }
}
