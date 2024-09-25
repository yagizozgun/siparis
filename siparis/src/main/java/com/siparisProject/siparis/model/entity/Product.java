package com.siparisProject.siparis.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {

    @Id
    @Field(name = "id")
    private ObjectId id;
    @Field(name = "product_code")
    private String productCode;
    @Field(name = "name")
    private String name;
    @Field(name = "size")
    private int size;

}
