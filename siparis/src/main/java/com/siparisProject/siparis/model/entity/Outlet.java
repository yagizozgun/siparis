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
@Document(collection = "outlets")
public class Outlet {

    @Id
    @Field(name = "id")
    private ObjectId id;
    @Field(name = "outlet_code")
    private String outletCode;
    @Field(name = "address")
    private String address;
    @Field(name = "sign_name")
    private String signName;
    @Field(name = "longitude")
    private double longitude;
    @Field(name = "latitude")
    private double latitude;

}
