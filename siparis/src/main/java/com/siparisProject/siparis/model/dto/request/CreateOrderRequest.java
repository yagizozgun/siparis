package com.siparisProject.siparis.model.dto.request;

import com.siparisProject.siparis.model.dto.response.CreateProductListResponse;
import com.siparisProject.siparis.model.entity.Outlet;
import com.siparisProject.siparis.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {

    private String orderCode;
    private String outletCode;
    private Product product;
    private Outlet outlet;
    private List<CreateProductListResponse> products;

}
