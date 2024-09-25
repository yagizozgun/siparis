package com.siparisProject.siparis.dataAccess;

import com.siparisProject.siparis.model.entity.Outlet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OutletRepository extends MongoRepository<Outlet, ObjectId> {
    Outlet findByOutletCode(String outletCode);
}
