package com.siparisProject.siparis.model.dto.response;

import com.siparisProject.siparis.model.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderResponse {
    private String orderCode;
    private String outletCode;
    private Status status;
    private List<CreateProductListResponse> products;
}
