package br.com.leonardosr.btgpactual.orderms.controller.dto;

import br.com.leonardosr.btgpactual.orderms.entity.OrderEntity;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getOrderId(),
                entity.getCustomerId(),
                entity.getTotal());
    }
}
