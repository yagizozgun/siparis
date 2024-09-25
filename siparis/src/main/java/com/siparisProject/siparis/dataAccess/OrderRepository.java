package com.siparisProject.siparis.dataAccess;

import com.siparisProject.siparis.model.dto.response.CreateOrderResponse;
import com.siparisProject.siparis.model.entity.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {
    List<Order> findByOrderCode(String orderCode);
}
