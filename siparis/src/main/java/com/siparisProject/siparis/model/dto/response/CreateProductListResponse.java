package com.siparisProject.siparis.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductListResponse {
    private String productCode;
    private int quantity;
}
