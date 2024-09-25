package com.siparisProject.siparis.business;

import com.siparisProject.siparis.dataAccess.OutletRepository;
import com.siparisProject.siparis.model.dto.request.CreateOutletRequest;
import com.siparisProject.siparis.model.entity.Outlet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutletManager {

    private final OutletRepository outletRepository;

    public void createOutlet(CreateOutletRequest outletRequest)
    {
        Outlet outlet = new Outlet();
        outlet.setOutletCode(outletRequest.getOutletCode());
        outlet.setAddress(outletRequest.getAddress());
        outlet.setLongitude(outletRequest.getLongitude());
        outlet.setLatitude(outletRequest.getLatitude());
        outlet.setSignName(outletRequest.getSignName());
        outletRepository.save(outlet);
    }

}
