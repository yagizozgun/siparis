package com.siparisProject.siparis.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOutletResponse {
    private String outletCode;
    private String address;
    private String signName;
    private double longitude;
    private double latitude;
}
