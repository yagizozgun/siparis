package com.siparisProject.siparis.webApi.controllers;

import com.siparisProject.siparis.business.OutletManager;
import com.siparisProject.siparis.model.dto.request.CreateOutletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OutletsController {

    private final OutletManager outletManager;

    @PostMapping("/outlet")
    public void createOutlet(@RequestBody CreateOutletRequest outletRequest)
    {
        outletManager.createOutlet(outletRequest);
    }
}
