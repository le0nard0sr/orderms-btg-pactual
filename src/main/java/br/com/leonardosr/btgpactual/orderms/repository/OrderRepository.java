package br.com.leonardosr.btgpactual.orderms.repository;

import br.com.leonardosr.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
