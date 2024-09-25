package com.siparisProject.siparis.dataAccess;

import com.siparisProject.siparis.model.entity.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {
    Product findByProductCode(String productCode);
}
