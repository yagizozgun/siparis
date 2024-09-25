package com.siparisProject.siparis.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
public class Order {

    @Id
    @Field(name = "id")
    private ObjectId id;
    @Field(name = "order_code")
    private String orderCode;
    @Field(name = "status")
    private Status status;
    @Field(name = "quantity")
    private int quantity;
    @Field(name = "product_id")
    private ObjectId productId;
    @Field(name = "outlet_id")
    private ObjectId outletId;

}
