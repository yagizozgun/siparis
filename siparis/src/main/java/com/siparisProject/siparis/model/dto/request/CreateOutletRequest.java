package com.siparisProject.siparis.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOutletRequest {
    private String outletCode;
    private String address;
    private String signName;
    private double longitude;
    private double latitude;
}
